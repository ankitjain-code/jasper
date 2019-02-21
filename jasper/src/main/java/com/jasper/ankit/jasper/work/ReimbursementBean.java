package com.jasper.ankit.jasper.work;
/**
 *  Created by gomemjo on 24/10/2018
 *       . * .
 *     * RRRR  *    Copyright (c) 2016 EUIPO: European Union Intellectual
 *   .   RR  R   .  Property Office (trade marks and designs)
 *   *   RRR     *
 *    .  RR RR  .   ALL RIGHTS RESERVED
 *     * . _ . *
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Pattern;

import org.apache.commons.lang.StringUtils;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

/**
 * Class ReimbursementBean
 */
@SuppressWarnings("deprecation")
public class ReimbursementBean {
    private String idReimbursement;
    
    private Date paymentDate;
    @NotBlank(message = "{field.required}")
    private String paymentDateForm;
    private String entityType;
    private String entityNumber;

    @NotBlank(message = "{field.required}")
    @Pattern(regexp="^\\s*([^\\s]\\s*){0,255}$",message="{error.max.number.characters.255}")
    private String bankTransferConcept;
    
    @NotBlank(message = "{field.required}")  
    @Pattern(regexp="^([0-9]{1,9})((\\.|\\,)([0-9]{1,2}))?$",message="{error.invalid.number}")
    private String amountPaid;
    
    @NotBlank(message = "{field.required}")
    private String paymentMethod;

    @NotBlank(message = "{field.required}")
    @Pattern(regexp="^([0-9]{1,9})((\\.|\\,)([0-9]{1,2}))?$",message="{error.invalid.number}")
    private String amountToReimbursed;
    
   
	@NotBlank(message = "{field.required}")
    private String reasonForReimbursed;
    private String paidToBankAccount;
    private String currentAccount;

    @NotBlank(message = "{field.required}")
    @Length(max = 100, message = "{error.max.number.characters.100}")
    private String signature;
    
    private String ccDigits;
    private List<Attachment> attachments;
    private Attachment bankAttachment;
    private List<MultipartFile> otherAttachments;
    private MultipartFile bankAttachmentTemp;
    private List<String> attachmentsFilenames;
    
    private BankAccountInfo bankAccountInfo;

    private Requester requester;

    
	/**
     * @return the paymentDateForm
     */
    public String getPaymentDateForm() {
		return paymentDateForm;
	}

	/**
     * @return the paymentDateForm
     */
	public void setPaymentDateForm(String paymentDateForm) {
		this.paymentDateForm = paymentDateForm;
	}

	/**
     * @return the paymentDate
     */
    public Date getPaymentDate() {
    	// if paymentDate is not null, the object is cloned
		return (paymentDate != null) ? (Date) paymentDate.clone() : null;
    }

	/**
     * @param paymentDate to set
     */
    public void setPaymentDate(Date paymentDate) {
    	// if paymentDate is not null, the object is cloned
        this.paymentDate = (paymentDate != null) ? (Date) paymentDate.clone() : null;
    }

    /**
     * @return the entityType
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * @param entityType to set
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * @return the entityNumber
     */
    public String getEntityNumber() {
        return entityNumber;
    }

    /**
     * @param entityNumber to set
     */
    public void setEntityNumber(String entityNumber) {
        this.entityNumber = entityNumber;
    }

    /**
     * @return amountPaid
     */
	public String getAmountPaid() {
		return amountPaid;
	}

	/**
	 * @param amountPaid to set
	 */
	public void setAmountPaid(String amountPaid) {
		// Replace "," by "."
		this.amountPaid = StringUtils.replaceChars(amountPaid, ",", ".");
	}

	/**
	 * @return amountToReimbursed
	 */
	public String getAmountToReimbursed() {
		return amountToReimbursed;
	}

	/**
	 * @param amountToReimbursed to set
	 */
	public void setAmountToReimbursed(String amountToReimbursed) {
		// Replace "," by "."
		this.amountToReimbursed = StringUtils.replaceChars(amountToReimbursed, ",", ".");
	}

	/**
     * @return the bankTransferConcept
     */
    public String getBankTransferConcept() {
        return bankTransferConcept;
    }

	/**
     * @param bankTransferConcept to set
     */
    public void setBankTransferConcept(String bankTransferConcept) {
        this.bankTransferConcept = bankTransferConcept;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the reasonForReimbursed
     */
    public String getReasonForReimbursed() {
        return reasonForReimbursed;
    }

    /**
     * @param reasonForReimbursed to set
     */
    public void setReasonForReimbursed(String reasonForReimbursed) {
        this.reasonForReimbursed = reasonForReimbursed;
    }

    /**
     * @return the paidToBankAccount
     */
    public String getPaidToBankAccount() {
        return paidToBankAccount;
    }

    /**
     * @param paidToBankAccount to set
     */
    public void setPaidToBankAccount(String paidToBankAccount) {
        this.paidToBankAccount = paidToBankAccount;
    }

    /**
     * @return the currentAccount
     */
    public String getCurrentAccount() {
        return currentAccount;
    }

    /**
     * @param currentAccount to set
     */
    public void setCurrentAccount(String currentAccount) {
        this.currentAccount = currentAccount;
    }

    /**
     * @return the signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * @param signature to set
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * @return the ccDigits
     */
    public String getCcDigits() {
        return ccDigits;
    }

    /**
     * @param ccDigits to set
     */
    public void setCcDigits(String ccDigits) {
        this.ccDigits = ccDigits;
    }

    /**
     * @return the attachments
     */
    public List<Attachment> getAttachments() {
        return (attachments != null) ? new ArrayList<Attachment>(attachments) : null;
    }

    /**
     * @param attachments to set
     */
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = (attachments != null) ? new ArrayList<Attachment>(attachments) : null;
    }

    /**
     * @return the requester
     */
    public Requester getRequester() {
        return requester;
    }

    /**
     * @param requester to set
     */
    public void setRequester(Requester requester) {
        this.requester = requester;
    }

    /**
     * @return the bankAccountInfo
     */
    public BankAccountInfo getBankAccountInfo() {
        return bankAccountInfo;
    }

    /**
     * @param bankAccountInfo to set
     */
    public void setBankAccountInfo(BankAccountInfo bankAccountInfo) {
        this.bankAccountInfo = bankAccountInfo;
    }

    /**
     * @return the idReimbursement
     */
    public String getIdReimbursement() {
        return idReimbursement;
    }

    /**
     * @param idReimbursement to set
     */
    public void setIdReimbursement(String idReimbursement) {
        this.idReimbursement = idReimbursement;
    }

    /**
     * @return the bankAttachment
     */
    public Attachment getBankAttachment() {
        return bankAttachment;
    }

    /**
     * @param bankAttachment to set
     */
    public void setBankAttachment(Attachment bankAttachment) {
        this.bankAttachment = bankAttachment;
    }

    /**
     * @return the otherAttachments
     */
    public List<MultipartFile> getOtherAttachments() {
    	//  if otherAttachments is not null, return the object
        return (otherAttachments != null) ? new ArrayList<MultipartFile>(otherAttachments) : null;
    }

    /**
     * @param otherAttachments to set
     */
    public void setOtherAttachments(List<MultipartFile> otherAttachments) {
    	// if otherAttachments is not null, the object is cloned
        this.otherAttachments = (otherAttachments != null) ? new ArrayList<MultipartFile>(otherAttachments) : null;
    }

    /**
     * @return the bankAttachmentTemp
     */
    public MultipartFile getBankAttachmentTemp() {
        return bankAttachmentTemp;
    }

    /**
     * @param bankAttachmentTemp to set
     */
    public void setBankAttachmentTemp(MultipartFile bankAttachmentTemp) {
        this.bankAttachmentTemp = bankAttachmentTemp;
    }

    /**
     * @return the attachmentsFilenames
     */
	public List<String> getAttachmentsFilenames() {
		//  if attachmentsFilenames is not null, return the object
		return (attachmentsFilenames != null) ? new ArrayList<String>(attachmentsFilenames) : null;
	}

	/**
	 * @param attachmentsFilenames to set
	 */
	public void setAttachmentsFilenames(List<String> attachmentsFilenames) {
		// if attachmentsFilenames is not null, the object is cloned
		this.attachmentsFilenames = (attachmentsFilenames != null) ? new ArrayList<String>(attachmentsFilenames) : null;
	}
}
