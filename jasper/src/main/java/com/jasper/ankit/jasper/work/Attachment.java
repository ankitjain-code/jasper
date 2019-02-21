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

import org.springframework.web.multipart.MultipartFile;

/**
 * Class for Attachment
 */
public class Attachment {
	private String filename;
	private String contentType;
	private byte[] body;
	private MultipartFile file;
	private String attachDraftId;
	
	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @return the file
	 */
	public MultipartFile getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(MultipartFile file) {
		this.file = file;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(byte[] body) {
		this.body = body.clone();
	}
	
	/**
	 * @return the body
	 */
	public byte[] getBody() {
		return (body!=null?body.clone():new byte[0]);
	}
	
	/**
	 * @return the attachDraftId
	 */
	public String getAttachDraftId() {
		return attachDraftId;
	}

	/**
	 * @param attachDraftId the attachDraftId to set
	 */
	public void setAttachDraftId(String attachDraftId) {
		this.attachDraftId = attachDraftId;
	}
	
	/**
	 * @param contentType the contentType to set
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}
}
