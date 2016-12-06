/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.supplierconnect.specification;

/**
 * 
 * @author predix -
 */
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.ge.supplierconnect.entity.SupplierConnectTbl;

public class SupplierSearchSpecification implements Specification<SupplierConnectTbl> {
	
	private SupplierConnectTbl filter;
	
	//private ScpDemandId filter1;
	
	public SupplierSearchSpecification(SupplierConnectTbl filter){
		super();
		this.filter = filter;
		//this.filter1 = filter1;
	}
	
	
	@Override
	public Predicate toPredicate(Root<SupplierConnectTbl> root, CriteriaQuery<?> query,
			CriteriaBuilder cb) {
			Predicate p = cb.disjunction();
			
			List<Predicate> predicates = new ArrayList<>();
			if (null != filter.getApprovalStatus() && "" != filter.getApprovalStatus()) {
				predicates.add(cb.equal(root.get("approvalStatus"),
						filter.getApprovalStatus()));
			}
			if ((null != filter.getDueDt() && "" != filter.getDueDt())) {
				predicates.add(cb.and(cb.equal(root.get("dueDt"),
						filter.getDueDt())));
			}
			if (null != filter.getInvoiceAmount() && "" != filter.getInvoiceAmount()) {
				predicates.add(cb.and(cb.equal(root.get("invoiceAmount"),
						filter.getInvoiceAmount())));
			}
			if (filter.getInvoiceSubmitDt() != null && "" != filter.getInvoiceSubmitDt()) {
				predicates.add(cb.and(cb.equal(root.get("invoiceSubmitDt"),
						filter.getInvoiceSubmitDt())));
			}
			if (filter.getPaymentTerm() != null
					&& "" != filter.getPaymentTerm()) {
				predicates.add(cb.and(cb.equal(root.get("paymentTerm"),
						filter.getPaymentTerm())));
			}
			if (filter.getPoExpiryDt() != null
					&& "" != filter.getPoExpiryDt()) {
				predicates.add(cb.and(cb.equal(root.get("poExpiryDt"),
						filter.getPoExpiryDt())));
			}
			if (filter.getPoNumber() != null
					&& "" != filter.getPoNumber()) {
				predicates.add(cb.and(cb.equal(root.get("poNumber"),
						filter.getPoNumber())));
			}
			if (filter.getInvoiceNumber() != null
					&& "" != filter.getInvoiceNumber()) {
				predicates.add(cb.and(cb.equal(root.get("invoiceNumber"),
						filter.getInvoiceNumber())));
			}
				
		
			/*List<Predicate> predicates = new ArrayList<>();
		 	CriteriaQuery<ScpDemandId> criteriaLogin = cb.createQuery(ScpDemandId.class);
			Root<ScpDemandId> rootLoginVO = criteriaLogin.from(ScpDemandId.class);
			Root<GetsDemand> rootStatusVO = criteriaLogin.from(GetsDemand.class);
			
			Predicate predicateJoin = cb.equal(rootLoginVO
					.get("id"),
					rootStatusVO.get("scpDemandId").ge);
			predicates.add(predicateJoin);
			*/

		
		 //cb.isTrue(owner.get(attributeName)));
		
		/*if (null!= filter.getFirstName() && ""!= filter.getFirstName()) {
			predicates.add(cb.equal(root.get("firstName"),
					filter.getFirstName()));
		}  if ((null!= filter.getLastName() && ""!=  filter.getLastName())) {
			predicates.add(cb.and(cb.equal(root.get("lastName"),
					filter.getLastName())));
		}  if( null!=  filter.getAge()) {
			predicates.add(cb.and(cb.equal(root.get("age"), filter.getAge())));
		}  if (filter.getDepartment() != null && ""!= filter.getDepartment()) {
			predicates.add(cb.and(cb.equal(root.get("department"),
					filter.getDepartment())));
		}*/
		
		/*predicates.add(cb.and(arg0));

		 if (filter.getFirstName() != null && filter.getLastName() != null && filter.getAge()!=null && filter.getDepartment()!=null ) {
	            p.getExpressions().add(
	                    cb.and(cb.equal(root.get("firstName"), filter.getFirstName()),
	                            cb.equal(root.get("age"), filter.getAge())));
	        }
*/
		return andTogether(predicates, cb);
	}
	
	private Predicate andTogether(List<Predicate> predicates, CriteriaBuilder cb) {
	    return cb.and(predicates.toArray(new Predicate[0]));
	  }
	

	

}