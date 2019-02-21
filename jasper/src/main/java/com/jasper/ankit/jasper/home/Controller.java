package com.jasper.ankit.jasper.home;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sf.jasperreports.engine.JRException;

@RestController
public class Controller {
	
	@Autowired
	JaperCompilation jc;

	@RequestMapping(value = "/getpdf", method = RequestMethod.POST)
	public ResponseEntity<byte[]> getPDF(@RequestBody String json) {
		// convert JSON to Employee
		// Employee emp = convertSomehow(json);

		// generate the file
		// PdfUtil.showHelp(emp);

		// retrieve contents of "C:/tmp/report.pdf" that were written in showHelp
		byte[] contents = null;

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.parseMediaType("application/pdf"));
		// Here you have to set the actual filename of your pdf
		String filename = "ankit.pdf";
		headers.setContentDispositionFormData(filename, filename);
		headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
		ResponseEntity<byte[]> response = new ResponseEntity<>(contents, headers, HttpStatus.OK);
		return response;
	}

	@RequestMapping(value = "/user/{userId}/invoices", method = RequestMethod.GET)
	public void listUsersInvoices(@PathVariable("userId") int user,
			@RequestParam(value = "name", required = false) String name) throws JRException, IOException {
		
		System.out.println("Testing controller");
		System.out.println("\n userId="+user+"\tname ="+name);
		jc.compile();

	}
	
	public static void main(String[] args) throws JRException, IOException {
		
		JaperCompilation jcr=new JaperCompilation();
		jcr.compile();
	}

}
