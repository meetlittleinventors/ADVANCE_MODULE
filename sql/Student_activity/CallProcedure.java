import java.sql.*;

public class CallProcedure {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb", "root", "password");
        CallableStatement cs = con.prepareCall("{call calculatesalarybonus(?, ?)}");
        cs.setDouble(1, 50000);
        cs.registerOutParameter(2, Types.DOUBLE);
        cs.execute();
        double bonus = cs.getDouble(2);
        System.out.println("Calculated Bonus: " + bonus);
        con.close();
    }
}
