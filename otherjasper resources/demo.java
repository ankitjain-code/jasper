package eu.ohim.communication.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eu.ohim.communication.domain.EntityType;
import eu.ohim.communication.domain.custom.ECommDataBeanVO;
import eu.ohim.communication.domain.custom.ECommDataVO;
import eu.ohim.communication.domain.custom.ECommTemplate;
import eu.ohim.communication.domain.custom.ECommUserDataBeanVO;
import eu.ohim.communication.domain.custom.ReimbursementInfo;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class demo {
	public static void main(String[] args) {

		if (ECommTemplate.REIMBURSEMENT.toString().equals("REIMBURSEMENT")) {
			System.out.println("hello");
		}
		PdfReportServiceImpl pdfReportServiceImpl = new PdfReportServiceImpl();
		
		
		PaymentServiceImpl paymentServiceImpl = new PaymentServiceImpl();
		try {
			ECommDataBeanVO eCommDataBeanVO = new ECommDataBeanVO();

			ReimbursementInfo reimbursementInfo = new ReimbursementInfo();
			reimbursementInfo.setAccountHolder("Tester accounter");
			reimbursementInfo.setBankName("Test BANK account");
			reimbursementInfo.setBankAddress("xyz street");
			reimbursementInfo.setBicSwiftCode("BBVAESMM32");
			reimbursementInfo.setIbanCode("ES9121000418450200051332");
			reimbursementInfo.setHolderDeclaration(true);
			reimbursementInfo.setIdPayment("100234");
			reimbursementInfo.setIdReimbursement("42537");

			reimbursementInfo.setReplyOption("updateBankDetails");
			ECommDataVO eCommDataVO = new ECommDataVO();
			eCommDataVO.setSignature("signature");
			eCommDataVO.setEntityType(EntityType.PAYMENT);
			eCommDataVO.setLetterId("12345");
			eCommDataVO.setReimbursementInfo(reimbursementInfo);
			eCommDataBeanVO.setCommonData(eCommDataVO);
			ECommUserDataBeanVO eCommUserDataBeanVO = new ECommUserDataBeanVO();
			eCommUserDataBeanVO.setMailboxOwnerId(0000002315L);
			eCommDataBeanVO.setUserData(eCommUserDataBeanVO);
			pdfReportServiceImpl.buildPDF(eCommDataBeanVO, false, false);
			
			//paymentServiceImpl.updateBankDetails(eCommDataBeanVO);
			// eCommUserDataBeanVO.setUsername("Ashima Bhola");
			eCommDataBeanVO.setUserData(eCommUserDataBeanVO);
			String sourceFile = "D:/reimbursement/Pdf/esearch/communication/communication-webservices/src/main/resources/jasperreports/IncomingLetter/reimbursement.pdf";
			String fileName = "D:/reimbursement/Pdf/esearch/communication/communication-webservices/src/main/resources/jasperreports/IncomingLetter/reimbursementPDF.jrxml";
			String sourceJasper = "D:/reimbursement/Pdf/esearch/communication/communication-webservices/src/main/resources/jasperreports/IncomingLetter/reimbursementPDF.jasper";
			JasperCompileManager.compileReportToFile(fileName);

			List<ECommDataBeanVO> lForm = new ArrayList<ECommDataBeanVO>();
			String printFileName="";
			lForm.add(eCommDataBeanVO);
			JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(lForm);
			Map<String, Object> parameters = new HashMap<String, Object>();
			Boolean bankdetails = false;
			parameters.put("bankdetails", bankdetails);
			parameters.put("feeDetails", true);
			printFileName = JasperFillManager.fillReportToFile(sourceJasper, parameters, beanColDataSource);
			if (printFileName != null) {
				JasperExportManager.exportReportToPdfFile(printFileName, sourceFile);
			}

			// return addWatermarkDraft(sourceFile);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
