/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.controller;

import com.rentaCar.service.UserService;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Diego Segura Vega
 */
@Controller
public class InvoiceController {
    
    @GetMapping("/pdf")
    public String generatePdf() throws FileNotFoundException, JRException{
        
        //JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource (UserService.generateUserList());
        //JasperCompileManager.compileReport(new FileInputStream("scr/main/resources/invoice.jrxml"));
        
        JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("scr/main/resources/invoice.jrxml"));
        
        HashMap<String, Object> map= new HashMap<>();
        //JasperFillManager.fillReport(compileReport, null, beanCollectionDataSource);
        JasperPrint report = JasperFillManager.fillReport(compileReport, map);
        JasperExportManager.exportReportToPdfFile(report, ("invoice.pdf"));
        
      return "generated";  
    }
    
}
