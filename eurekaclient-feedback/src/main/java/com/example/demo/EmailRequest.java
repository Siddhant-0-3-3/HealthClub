package com.example.demo;

public class EmailRequest {

	private String msgBody;
	private String subject;
	private String attachment;
	private String recipient;
	public EmailRequest(String msgBody, String subject, String attachment, String recipient) {
		super();
		this.msgBody = msgBody;
		this.subject = subject;
		this.attachment = attachment;
		this.recipient = recipient;
	}
	public EmailRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmailRequest [msgBody=" + msgBody + ", subject=" + subject + ", attachment=" + attachment
				+ ", recipient=" + recipient + "]";
	}
	public String getMsgBody() {
		return msgBody;
	}
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
}
