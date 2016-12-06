/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.supplierconnect.dto;

/**
 * 
 * @author predix -
 */
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SupplierConnectSearchVO {
	
	private long id;
	
	private String approvalStatus;
	
	private String dueDt;

	private String invoiceAmount;

	private String invoiceNumber;

	private String invoiceSubmitDt;

	private String orgId;

	private String organizationName;

	private String paymentTerm;

	private String poExpiryDt;

	private String poNumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getDueDt() {
		return dueDt;
	}

	public void setDueDt(String dueDt) {
		this.dueDt = dueDt;
	}

	public String getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoiceSubmitDt() {
		return invoiceSubmitDt;
	}

	public void setInvoiceSubmitDt(String invoiceSubmitDt) {
		this.invoiceSubmitDt = invoiceSubmitDt;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getPaymentTerm() {
		return paymentTerm;
	}

	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public String getPoExpiryDt() {
		return poExpiryDt;
	}

	public void setPoExpiryDt(String poExpiryDt) {
		this.poExpiryDt = poExpiryDt;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

}
