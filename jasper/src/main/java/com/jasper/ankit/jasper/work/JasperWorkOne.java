package com.jasper.ankit.jasper.work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class JasperWorkOne {

	public static void main(String[] args) {
		String reportSource = "D:\\EUIPO\\ERI_code\\JASPER\\jrxx\\jasper\\src\\main\\resources\\JasperWorkOne\\Blank_A4.jrxml";
		String reportDest = "D:\\EUIPO\\ERI_code\\JASPER\\jrxx\\jasper\\src\\main\\resources\\JasperWorkOne\\BorrowedBooks.pdf";

		Map<String, Object> params = new HashMap<String, Object>();

		params.put("reportTitle", "AnkitWorkOne Books");
		params.put("author", "Ankit");
		params.put("startDate", (new java.util.Date()).toString());
		try {
			JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);

			ReimbursementBean form=new ReimbursementBean();
            List<ReimbursementBean> lForm = new ArrayList<ReimbursementBean>();
            lForm.add(form);
            // Define data source from a collection
            //JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lform);
            JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(FactoryClassWorkOne.fillData());

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, ds);

			JasperExportManager.exportReportToPdfFile(jasperPrint, reportDest);

			JasperViewer.viewReport(jasperPrint);
		} catch (JRException ex) {
			ex.printStackTrace();
		}

	}

}
