package main.java.com.csbl.sms.util;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class ReportUtil
{

    public static void exportReport(String fileSource, Connection connection, Map parameters){
        try
        {
            //File reportFile = new File(fileSource);
            //JasperDesign jasperDesign = JRXmlLoader.load(fileSource);
            //JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            /*JasperReport jasperReport = (JasperReport) JRLoader.loadObject(fileSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
            JasperViewer.viewReport(jasperPrint);*/
            /*JasperPrint print = JasperFillManager.fillReport(fileSource,parameters, connection);
            JRExporter exporter = new net.sf.jasperreports.engine.export.JRPdfExporter();
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, "c:/test.pdf");
            exporter.setParameter(JRExporterParameter.JASPER_PRINT,print);
            exporter.exportReport();*/
            
            InputStream fis = ReportUtil.class.getClassLoader().getResourceAsStream(fileSource);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(bufferedInputStream);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
            JasperViewer.viewReport(jasperPrint, false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void exportReportJavaBean(String fileSource, Connection connection, Map parameters, List list){
        try
        {
            InputStream fis = ReportUtil.class.getClassLoader().getResourceAsStream(fileSource);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(bufferedInputStream);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JRBeanCollectionDataSource(list));
            JasperViewer.viewReport(jasperPrint, false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}
