package com.jasper.ankit.jasper.esearch;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;



/**
 * Title: ECommUserDataBean Description: Information needed in the process of
 * dsending an ecomm
 * 
 * Copyright: Copyright (c) 2006.
 *
 * @author Telefonica Soluciones
 * @author Altia Consultores
 * @version 1.0
 * @version 1.1
 */
public class ECommUserDataBeanVO implements Serializable {

	/**
	 * Default serial version UID
	 */
	private static final long serialVersionUID = 1L;

	/** User's name */
	private String username;

	/** Column idctmuser from table pebcuser */
	private Long mailboxOwnerId;

	/** Name of the mailbox's owner */
	private String mailboxOwnerName;

	/** Mailbox owner user type */
	private Short mailboxOwnerUserType;

	
	/**
	 * Return the list of properties for hashCode() and equals()
	 * @return a list of properties.
	 */
	private Object[] getProperties() {
		return new Object[]{username, mailboxOwnerId, mailboxOwnerName, mailboxOwnerUserType};
	}
	
	
	/**
	 * @return Returns the mailboxOwnerId.
	 */
	public Long getMailboxOwnerId() {
		return mailboxOwnerId;
	}

	/**
	 * @param mailboxOwnerId
	 *            The mailboxOwnerId to set.
	 */
	public void setMailboxOwnerId(Long mailboxOwnerId) {
		this.mailboxOwnerId = mailboxOwnerId;
	}

	/**
	 * @return Returns the mailboxOwnerName.
	 */
	public String getMailboxOwnerName() {
		return mailboxOwnerName;
	}

	/**
	 * @param mailboxOwnerName
	 *            The mailboxOwnerName to set.
	 */
	public void setMailboxOwnerName(String mailboxOwnerName) {
		this.mailboxOwnerName = mailboxOwnerName;
	}

	/**
	 * @return Returns the mailboxOwnerUserType.
	 */
	public Short getMailboxOwnerUserType() {
		return mailboxOwnerUserType;
	}

	/**
	 * @param mailboxOwnerUserType
	 *            The mailboxOwnerUserType to set.
	 */
	public void setMailboxOwnerUserType(Short mailboxOwnerUserType) {
		this.mailboxOwnerUserType = mailboxOwnerUserType;
	}

	/**
	 * @return Returns the userName.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param userName
	 *            The userName to set.
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	
}
