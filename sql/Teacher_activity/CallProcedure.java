import java.sql.*;

public class CallProcedure {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        CallableStatement cs = conn.prepareCall("{call calculatesalarybonus(?, ?)}");
        cs.setDouble(1, 60000.0); // IN parameter: salary
        cs.registerOutParameter(2, Types.DOUBLE); // OUT parameter: bonus
        cs.execute();
        System.out.println("Calculated Bonus: " + cs.getDouble(2));
        conn.close();
    }
}
