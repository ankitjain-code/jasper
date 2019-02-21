package com.jasper.ankit.jasper.esearch;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;



/**
 * Title: ECommDataBean Description: Information needed in the process of
 * dsending an ecomm
 * 
 * Copyright: Copyright (c) 2006.
 *
 * @author Telefonica Soluciones
 * @version 1.0
 */
public class ECommDataBeanVO implements Serializable {
	/** Required when implementing Serializable interface */
	private static final long serialVersionUID = 1L;
	
	/** The template. */
	private ECommTemplate template = ECommTemplate.DEFAULT;

	/** Data to generate PDF file and to be shown in eComms forms */
	private ECommUserDataBeanVO userData;

	/** Data to be inserted in table DECOM */
	private ECommDataVO commonData;

	/** Data to be received by an eComm form that is not in DECOM table */
	private ECommFormExtraDataBeanVO extraData;

	/**
	 * Return the list of properties for hashCode() and equals()
	 * @return a list of properties.
	 */
	private Object[] getProperties() {
		return new Object[]{userData, commonData, extraData, template};
	}
	
	
	/**
	 * @return Returns the extraData.
	 */
	public ECommFormExtraDataBeanVO getExtraData() {
		return extraData;
	}

	/**
	 * @param extraData
	 *            The extraData to set.
	 */
	public void setExtraData(ECommFormExtraDataBeanVO extraData) {
		this.extraData = extraData;
	}

	/**
	 * @return Returns the userData.
	 */
	public ECommUserDataBeanVO getUserData() {
		return userData;
	}

	/**
	 * @param userData
	 *            The userData to set.
	 */
	public void setUserData(ECommUserDataBeanVO userData) {
		this.userData = userData;
	}

	/**
	 * Gets the common data.
	 *
	 * @return the common data
	 */
	public ECommDataVO getCommonData() {
		return commonData;
	}

	/**
	 * Sets the common data.
	 *
	 * @param commonData the new common data
	 */
	public void setCommonData(ECommDataVO commonData) {
		this.commonData = commonData;
	}
	
	/**
	 * Gets the template.
	 *
	 * @return the template
	 */
	public ECommTemplate getTemplate() {
		return template;
	}

	/**
	 * Sets the template.
	 *
	 * @param template the new template
	 */
	public void setTemplate(ECommTemplate template) {
		this.template = template;
	}
	
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}	





	
	
}
