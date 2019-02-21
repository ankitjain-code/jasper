package com.jasper.ankit.jasper.home;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Service;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class JaperCompilation {

	public void compile() throws JRException, IOException {
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(FactoryClass.fillData());
		InputStream inputStream = this.getClass().getResourceAsStream("/jasper/home.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);
		//JRPdfExporter exporter = new JRPdfExporter();
		File pdf = new File("E:\\SOPRA STERIA\\java\\euipo\\jasper\\src\\main\\resources\\jasper\\ankitReport.pdf");
		JasperExportManager.exportReportToPdfStream(jasperPrint, new FileOutputStream(pdf));

	/*	exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput("E:\\SOPRA STERIA\\java\\euipo\\jasper\\src\\main\\resources\\jasper\\employeeReport.pdf"));

		SimplePdfReportConfiguration reportConfig = new SimplePdfReportConfiguration();
		reportConfig.setSizePageToContent(true);
		reportConfig.setForceLineBreakPolicy(false);

		SimplePdfExporterConfiguration exportConfig = new SimplePdfExporterConfiguration();
		exportConfig.setMetadataAuthor("baeldung");
		exportConfig.setEncrypted(true);
		exportConfig.setAllowedPermissionsHint("PRINTING");

		exporter.setConfiguration(reportConfig);
		exporter.setConfiguration(exportConfig);

		exporter.exportReport();*/
	}

}
