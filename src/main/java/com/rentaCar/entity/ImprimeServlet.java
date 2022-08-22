/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.entity;

import java.io.InputStream;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Reporte", urlPatterns = {"/Reporte1"})
public class ImprimeServlet extends HttpServlet {
    
    String dbName = "";
    String dbDriver = "";
    String dbDataBase = "";
    String userName = "";
    String userPassword = "";
    
    protected void doGet (HttpServletRequest request, HttpServletResponse response){
        try {
            Class.forName (dbDriver);
            Connection con = DriverManager.getConnection(dbName + dbDataBase, userName, userPassword);    
            
            Map<String, Object> parametros = new java.util.HashMap();
            InputStream file = getClass().getResourceAsStream("test.jrxml");
            JasperPrint impresion = null;
            
            
        }catch (JRException ex){
            Logger.getLogger(ImprimeServlet.class.getName().log(Level.SERVERE, null, ex));
        }
    }
    
    
}
