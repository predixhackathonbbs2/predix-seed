/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.supplierconnect.entity;

/**
 * 
 * @author predix -
 */
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SUPPLIER_CONNECT_TBL database table.
 * 
 */
@Entity
@Table(name="SUPPLIER_CONNECT_TBL")
@NamedQuery(name="SupplierConnectTbl.findAll", query="SELECT s FROM SupplierConnectTbl s")
public class SupplierConnectTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SUPPLIER_CONNECT_TBL_ID_GENERATOR", sequenceName="SUP_CNCT")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SUPPLIER_CONNECT_TBL_ID_GENERATOR")
	private long id;

	@Column(name="APPROVAL_STATUS")
	private String approvalStatus;

	@Column(name="DUE_DT")
	private String dueDt;

	@Column(name="INVOICE_AMOUNT")
	private String invoiceAmount;

	@Column(name="INVOICE_NUMBER")
	private String invoiceNumber;

	@Column(name="INVOICE_SUBMIT_DT")
	private String invoiceSubmitDt;

	@Column(name="ORG_ID")
	private String orgId;

	@Column(name="ORGANIZATION_NAME")
	private String organizationName;

	@Column(name="PAYMENT_TERM")
	private String paymentTerm;

	@Column(name="PO_EXPIRY_DT")
	private String poExpiryDt;

	@Column(name="PO_NUMBER")
	private String poNumber;

	public SupplierConnectTbl() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getApprovalStatus() {
		return this.approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getDueDt() {
		return this.dueDt;
	}

	public void setDueDt(String dueDt) {
		this.dueDt = dueDt;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoiceSubmitDt() {
		return this.invoiceSubmitDt;
	}

	public void setInvoiceSubmitDt(String invoiceSubmitDt) {
		this.invoiceSubmitDt = invoiceSubmitDt;
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getPaymentTerm() {
		return this.paymentTerm;
	}

	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public String getPoExpiryDt() {
		return this.poExpiryDt;
	}

	public void setPoExpiryDt(String poExpiryDt) {
		this.poExpiryDt = poExpiryDt;
	}

	public String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

}
