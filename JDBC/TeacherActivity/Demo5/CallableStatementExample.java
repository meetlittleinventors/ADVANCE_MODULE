import java.sql.*;

public class CallableStatementExample {
    static final String DB_URL = "jdbc:mysql://localhost/testdb";
    static final String USER = "your_username";
    static final String PASS = "your_password";
    static final String SQL_CALL = "{CALL get_employee_name(?, ?)}";

    // Assuming a stored procedure 'get_employee_name' exists in the database:
    // DELIMITER //
    // CREATE PROCEDURE get_employee_name(
    //     IN empId INT,
    //     OUT empName VARCHAR(255)
    // )
    // BEGIN
    //     SELECT name INTO empName FROM employees WHERE id = empId;
    // END //
    // DELIMITER ;

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             CallableStatement cstmt = conn.prepareCall(SQL_CALL)) {
            
            // Set the input parameter
            cstmt.setInt(1, 101);
            
            // Register the output parameter
            cstmt.registerOutParameter(2, Types.VARCHAR);
            
            // Execute the stored procedure
            cstmt.execute();
            
            // Retrieve the output parameter value
            String employeeName = cstmt.getString(2);
            
            System.out.println("Employee name from stored procedure: " + employeeName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
