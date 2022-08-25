/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.controller;

/**
 *
 * @author Diego Segura Vega
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.function.Supplier;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import static org.hibernate.annotations.common.util.impl.LoggerFactory.logger;
import static org.hibernate.internal.CoreLogging.logger;
import static org.hibernate.internal.HEMLogging.logger;

/**
 *
 * @author Diego Segura Vega
 */
@WebServlet(name = "Reporte", urlPatterns = {"/Reporte1"})
public class ImprimeServlet extends HttpServlet {

    String dbName = "jdbc:mysql://localhost:3306/rentthecarg7?serverTimezone=UTC";
    String dbDriver = "com.mysql.cj.jdbc.Driver";
    String userName = "root";
    String userPassword = "Diego1820";
    private String dbDataBase = "rentthecarG7";

    
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response){
        try {
            Class.forName (dbDriver);
            Connection con = DriverManager.getConnection(dbName + dbDataBase, userName, userPassword);               

            Map<String, Object> parametros = new java.util.HashMap();
            InputStream file = getClass().getResourceAsStream("invoice.jrxml");
            JasperPrint impresion = null;
            JasperDesign disenio = JRXmlLoader.load(file);
            JasperReport reporte = JasperCompileManager.compileReport(disenio);
            impresion = JasperFillManager.fillReport(reporte, parametros, con);
            JRPdfExporter pdfExporter = new JRPdfExporter();
            pdfExporter.setExporterInput (new SimpleExporterInput(impresion));
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
            //logger.info("Completed Successfully");



        }catch (JRException | ClassNotFoundException | SQLException | IOException ex){
            Logger.getLogger(ImprimeServlet.class.getName()).log(null, (Supplier<String>) ex);
        }
    }
}
