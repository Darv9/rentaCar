/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.controller;

import com.rentaCar.service.UserService;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.http.HttpHeaders;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import static org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import static org.springframework.web.servlet.function.RequestPredicates.headers;

/**
 *
 * @author Diego Segura Vega
 */
@Controller
public class InvoiceController {
    
    @GetMapping("/pdf")
    public ResponseEntity<byte[]> generatePdf() throws FileNotFoundException, JRException{
        
        //JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource (UserService.generateUserList());
        //JasperCompileManager.compileReport(new FileInputStream("scr/main/resources/invoice.jrxml"));
        
        JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("sr/main/resources/invoice.jrxml"));
        
        HashMap<String, Object> map= new HashMap<>();
        //JasperFillManager.fillReport(compileReport, null, beanCollectionDataSource);
        JasperPrint report = JasperFillManager.fillReport(compileReport, map);
        JasperExportManager.exportReportToPdfFile(report, ("invoice.pdf"));
        
       //byte [] data = JasperExportManager.exportToPdf(report);
        //HttpHeaders headers= new HttpHeaders();
        //headers.set(HttpHeaders.CONTENT_DISPOSITION, "inline;filename=invoice.pdf");
        
        //return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
        return null;
    }
    
}
