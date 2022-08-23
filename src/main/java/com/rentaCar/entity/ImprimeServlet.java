/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.entity;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
            JasperDesign disenio = JRXmlLoader.load(file);
            JasperReport reporte = JasperCompileManager.compileReport(disenio);
            impresion = JasperFillManager.fillReport(reporte, parametros, con);
            JRPdfExporter pdfExporter = new JRPdfExporter();
            JRPdfExporter.setExporterInput (new SimpleExporterInput(impresion));
            ByteArrayOutputStream pdfReportStream = new ByteArrayOutputStream();
            pdfExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(pdfReportStream));
            pdfExporter.exportReport();
            
            response.setContentType("application/pdf");
            response.setHeader("Content-Legth", String.valueOf(pdfReportStream.size()));
            response.addHeader("Content-Disposition", "inline; filename=reporte.pdf");
            
            OutputStream responseOutputStream = response.getOutputStream();
            responseOutputStream.write(pdfReportStream.toByteArray());
            responseOutputStream.close();
            pdfReportStream.close();
            logger.info("Completed Successfully");
            
            
            
        }catch (JRException ex){
            Logger.getLogger(ImprimeServlet.class.getName().log(Level.SERVERE, null, ex));
        } catch(ClassNotFoundException ex){
             Logger.getLogger(ImprimeServlet.class.getName().log(Level.SERVERE, null, ex));
        }catch(SQLException ex){
             Logger.getLogger(ImprimeServlet.class.getName().log(Level.SERVERE, null, ex));
        }catch(IOException ex){
             Logger.getLogger(ImprimeServlet.class.getName().log(Level.SERVERE, null, ex));
        }
    }
    
    
}
