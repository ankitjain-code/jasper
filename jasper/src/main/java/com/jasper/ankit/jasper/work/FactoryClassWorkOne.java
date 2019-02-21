package com.jasper.ankit.jasper.work;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FactoryClassWorkOne {

	public static List<ReimbursementBean> fillData() {

		List<ReimbursementBean> list = new ArrayList<>();
		ReimbursementBean reimbursementBean = new ReimbursementBean();
		Requester requester=new Requester();
		requester.setPostCode("110085");
		
		reimbursementBean.setIdReimbursement("12345");
		reimbursementBean.setAmountToReimbursed("1000");
		reimbursementBean.setPaymentMethod("credit card");
		reimbursementBean.setPaymentDate(new Date());
		reimbursementBean.setPaymentDateForm("54321");
		reimbursementBean.setRequester(requester);
		list.add(reimbursementBean);
		return list;

	}

}
