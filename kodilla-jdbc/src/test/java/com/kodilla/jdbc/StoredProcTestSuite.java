package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sql = "UPDATE readers SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sql);

        //When
        String sqlProc = "CALL UpdateVipLevels()";
        statement.executeUpdate(sqlProc);

        //Then
        String sqlCheck = "SELECT COUNT(*) AS HOW_MANY FROM readers WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheck);
        int howMany = -1;
        if(rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0,howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sql = "UPDATE BOOKS SET BESTSELLER=0";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sql);

        //When
        String sqlProc = "CALL UpdateBestsellers()";
        statement.executeUpdate(sqlProc);

        //Then
        String sqlCheck = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=0";
        ResultSet rs = statement.executeQuery(sqlCheck);
        int howMany = -1;
        if(rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertNotEquals(0,howMany);
    }

}
