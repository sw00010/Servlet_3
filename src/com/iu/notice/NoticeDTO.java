package com.iu.notice;

import java.sql.Date;

public class NoticeDTO {
	private int documentNum;
	private String id;
	private String documentName;
	private String documentContents;
	private int documentViews;
	private Date writeDate;
	public int getDocumentNum() {
		return documentNum;
	}
	public void setDocumentNum(int documentNum) {
		this.documentNum = documentNum;
	}
	public String getWriteId() {
		return id;
	}
	public void setWriteId(String id) {
		this.id = id;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentContents() {
		return documentContents;
	}
	public void setDocumentContents(String documentContents) {
		this.documentContents = documentContents;
	}
	public int getDocumentViews() {
		return documentViews;
	}
	public void setDocumentViews(int documentViews) {
		this.documentViews = documentViews;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
}
