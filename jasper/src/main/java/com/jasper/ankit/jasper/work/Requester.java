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

public class Requester {

	private String postCode;
	private String town;
	private String street;
	private String countryDescription;
	private String country;
	
	private String telephoneContactInfo;
	private String firstName;
	private String organization;
	private String fullName;
	private String lastName;
	
	private String correspondenceAddress;
	
	private String telephone;
	private String fax;
	private String email;
	private String legalForm;
	private String ebcUserSubtype;

	private String userId;
	private String number;
	private int type;
	


	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	/**
	 * @return the number
	 */
	public String getNumber() {
		if (number==null){
			// if number is null return empty
			return "";
		}else{
			// if number is not null return the object
			return number;
		}
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param lastName the lastname to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the lastname
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	/**
	 * @return the organization
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}
	
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 
	 * @param countryDescription
	 */
	public void setCountryDescription(String countryDescription) {
		this.countryDescription = countryDescription;
	}
	
	/**
	 * 
	 * @return the countryDescription
	 */
	public String getCountryDescription() {
		return countryDescription;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param correspondenceAddress the correspondenceAddress to set
	 */
	public void setCorrespondenceAddress(String correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	/**
	 * @return the correspondenceAddress
	 */
	public String getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	/**
	 * @param telephoneContactInfo the telephoneContactInfo to set
	 */
	public void setTelephoneContactInfo(String telephoneContactInfo) {
		this.telephoneContactInfo = telephoneContactInfo;
	}

	/**
	 * @return the telephoneContactInfo
	 */
	public String getTelephoneContactInfo() {
		return telephoneContactInfo;
	}

	/**
	 * @param legalForm the legalForm to set 
	 */
	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}

	/**
	 * @return the legalForm
	 */
	public String getLegalForm() {
		return legalForm;
	}

	/**
	 * @param ebcUserSubtype the ebcUserSubtype to set
	 */
	public void setEbcUserSubtype(String ebcUserSubtype) {
		this.ebcUserSubtype = ebcUserSubtype;
	}
	
	/**
	 * @return the ebcUserSubtype
	 */
	public String getEbcUserSubtype() {
		return ebcUserSubtype;
	}
}
