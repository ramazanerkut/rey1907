package JDBC;

import org.testng.annotations.Test;
import utilities.DBUtilities;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _06_GetAllDataFromARow extends DBUtilities {
    @Test
    void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount = rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        rs.next();
        for (int i = 1; i <= columnCount ; i++) {

            String columnType = rsmd.getColumnTypeName(i);
            System.out.print("columnType = " + columnType);

            String columnName = rsmd.getColumnName(i);
            System.out.println(" columnName = " + columnName);

            String value = rs.getString(i);
            System.out.print(" value = " + value);
            System.out.println();

        }


    }
}
