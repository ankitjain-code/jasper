package com.jasper.ankit.jasper.esearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class Snippet {
	public void generateReimbursementFormReport(ECommDataBeanVO form, Locale locale)  {
		/* LOGGER.debug(GENERATE_REPORT); */
		String printFileName = "";
		try {
			/*
			 * String sourceJasper =
			 * esearchProperties.getProperty(Constants.REPORT_SOURCE_REIMBURSEMENT_PDF_PATH)
			 * ; String sourceFile = esearchProperties.getProperty(Constants.
			 * REPORT_DESTINATION_REIMBURSEMENT_PDF_PATH); String fileName =
			 * esearchProperties.getProperty(Constants.REPORT_CREATE_REIMBURSEMENT_JASPER);
			 */
			String sourceFile = "D:/reimbursement/WorkspacePdf/esearch/copla/src/main/resources/jasperreports/reimbursement.pdf";
			String fileName = "D:/reimbursement/WorkspacePdf/esearch/copla/src/main/resources/jasperreports/reimbursementPDF.jrxml";
			String sourceJasper = "D:\\reimbursement\\WorkspacePdf\\esearch\\copla\\src\\main\\resources\\jasperreports\\reimbursementPDF.jasper";
			JasperCompileManager.compileReportToFile(fileName);

			List<ECommDataBeanVO> lForm = new ArrayList<ECommDataBeanVO>();

			lForm.add(form);
			JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(lForm);
			Map<String, Object> parameters = new HashMap<String, Object>();
			/*
			 * parameters.put(JRParameter.REPORT_LOCALE, locale);
			 * parameters.put(JRParameter.REPORT_RESOURCE_BUNDLE, new
			 * MessageSourceResourceBundle(messageSource, locale));
			 */
			printFileName = JasperFillManager.fillReportToFile(sourceJasper, parameters, beanColDataSource);
			if (printFileName != null) {
				JasperExportManager.exportReportToPdfFile(printFileName, sourceFile);
			}

			// return addWatermarkDraft(sourceFile);

		} catch (JRException e) {
			// Print JRException in the log
			// LOGGER.error(EXCEPTION_ERROR + e.getMessage() + "]", e);
			// Throw the PdfGenerationException
			// throw new
			// PdfGenerationException(esearchProperties.getProperty(Constants.LABEL_ERROR_PDF_GENERATE),
			// e);
		}

	}

}
