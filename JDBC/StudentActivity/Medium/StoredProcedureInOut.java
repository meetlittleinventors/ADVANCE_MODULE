import java.sql.*;

public class StoredProcedureInOut {
    static final String DB_URL = "jdbc:mysql://localhost/testdb";
    static final String USER = "your_username";
    static final String PASS = "your_password";

    // Assuming a stored procedure 'calculate_salary_bonus' exists:
    // DELIMITER //
    // CREATE PROCEDURE calculate_salary_bonus(
    //     IN baseSalary DECIMAL(10, 2),
    //     OUT bonusAmount DECIMAL(10, 2)
    // )
    // BEGIN
    //     SET bonusAmount = baseSalary * 0.10;
    // END //
    // DELIMITER ;

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             CallableStatement cstmt = conn.prepareCall("{call calculate_salary_bonus(?, ?)}")) {

            double baseSalary = 50000.00;

            // Set the IN parameter
            cstmt.setDouble(1, baseSalary);

            // Register the OUT parameter
            cstmt.registerOutParameter(2, Types.DECIMAL);

            // Execute the procedure
            cstmt.execute();

            // Retrieve the OUT parameter
            double bonus = cstmt.getDouble(2);

            System.out.println("Base Salary: $" + baseSalary);
            System.out.println("Calculated Bonus: $" + bonus);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
