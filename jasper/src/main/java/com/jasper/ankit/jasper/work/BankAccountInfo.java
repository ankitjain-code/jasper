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

public class BankAccountInfo {

    private String accountHolder;
    private String bankName;
    private String bankAddress;
    private String ibanCode;
    private String bicSwiftCode;
    private boolean accountOwnerStatus;
    private boolean holderAccount;

    /**
     * @param bicSwiftCode to set
     */
    public void setBicSwiftCode(String bicSwiftCode) {
        this.bicSwiftCode = bicSwiftCode;
    }
    
    /**
     * @return the bicSwiftCode
     */
    public String getBicSwiftCode() {
        return bicSwiftCode;
    }
    
    /**
     * @param accountHolder to set
     */
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    
    /**
     * @return the accountHolder
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * @param bankAddress to set
     */
    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }
    
    /**
     * @return the bankAddress
     */
    public String getBankAddress() {
        return bankAddress;
    }
    
    /**
     * @return the accountOwnerStatus
     */
    public boolean isAccountOwnerStatus() {
        return accountOwnerStatus;
    }

    /**
     * @param accountOwnerStatus to set
     */
    public void setAccountOwnerStatus(boolean accountOwnerStatus) {
        this.accountOwnerStatus = accountOwnerStatus;
    }

    
    /**
     * @return the holderAccount
     */
	public boolean isHolderAccount() {
		return holderAccount;
	}

	/**
	 * @param holderAccount to set
	 */
	public void setHolderAccount(boolean holderAccount) {
		this.holderAccount = holderAccount;
	}
    
    /**
     * @param bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    /**
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }
    
    /**
     * @param ibanCode to set
     */
    public void setIbanCode(String ibanCode) {
        this.ibanCode = ibanCode;
    }
    
    /**
     * @return the ibanCode
     */
    public String getIbanCode() {
        return ibanCode;
    }
}
