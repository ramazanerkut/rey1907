package JDBC;

import org.testng.annotations.Test;
import utilities.DBUtilities;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_FirstAndLastGetRow extends DBUtilities {
    @Test
    void Test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select city_id, city, country_id from city");

        rs.last();

        String cityName = rs.getString("city");
        System.out.println("cityName = " + cityName);

        int numberOfLastRow = rs.getRow();
        System.out.println("numberOfLastRow = " + numberOfLastRow);

        int cityID = rs.getInt("city_id");
        System.out.println("cityID = " + cityID);

        String cityIDStr = rs.getString("city_id");
        System.out.println("cityIDStr = " + cityIDStr);

        rs.first();
        cityName = rs.getString("city");
        System.out.println("cityName = " + cityName);

    }
}
