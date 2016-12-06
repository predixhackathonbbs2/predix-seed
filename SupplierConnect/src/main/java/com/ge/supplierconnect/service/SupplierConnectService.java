package com.ge.supplierconnect.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ge.supplierconnect.dto.SupplierConnectSearchVO;
import com.ge.supplierconnect.entity.SupplierConnectTbl;
import com.ge.supplierconnect.repository.ISupplierSearchEntityRepository;
import com.ge.supplierconnect.specification.SupplierSearchSpecification;

@RestController
public class SupplierConnectService {

	@Autowired
	private ISupplierSearchEntityRepository supplierSearchEntityRepository;
	
	 @RequestMapping(value = "/view/getsupplierconnectWithFilter", method = RequestMethod.POST, produces="application/json")
		public @ResponseBody List<SupplierConnectSearchVO> getsupplierconnectWithFilter(@RequestBody  @Valid final SupplierConnectTbl supplierconnect) {
			List<SupplierConnectSearchVO> supplierVos = new ArrayList<SupplierConnectSearchVO>();
			 SupplierConnectSearchVO connectVo = null;
			try {
							
				SupplierSearchSpecification supplierSearchSpecification = new SupplierSearchSpecification(supplierconnect);
				List<SupplierConnectTbl> demandList = supplierSearchEntityRepository.findAll(supplierSearchSpecification);
				for(SupplierConnectTbl supply : demandList){
					connectVo = new SupplierConnectSearchVO();
					connectVo.setApprovalStatus(supply.getApprovalStatus());
					connectVo.setDueDt(supply.getDueDt());
					connectVo.setId(supply.getId());
					connectVo.setInvoiceAmount(supply.getInvoiceAmount());
					connectVo.setInvoiceNumber(supply.getInvoiceNumber());
					connectVo.setInvoiceSubmitDt(supply.getInvoiceSubmitDt());
					connectVo.setOrganizationName(supply.getOrganizationName());
					connectVo.setOrgId(supply.getOrgId());
					connectVo.setPaymentTerm(supply.getPaymentTerm());
					connectVo.setPoExpiryDt(supply.getPoExpiryDt());
					connectVo.setPoNumber(supply.getPoNumber());
					supplierVos.add(connectVo);
				}
				
				
				}


			 catch (Exception e) {
				System.out.println("HospitalAlarmService.getsupplierconnectWithFilter()" + e);
			}
			return supplierVos;

		}
	    
	    
	    @RequestMapping(value = "/view/getsupplierconnectWithoutFilter", method = RequestMethod.GET, produces="application/json")
		public @ResponseBody List<SupplierConnectSearchVO> getsupplierconnectWithFilter() {
			List<SupplierConnectSearchVO> supplierVos = new ArrayList<SupplierConnectSearchVO>();
			 SupplierConnectSearchVO connectVo = null;
			try {
							
			//	SupplierSearchSpecification supplierSearchSpecification = new SupplierSearchSpecification(supplierconnect);
				List<SupplierConnectTbl> demandList = supplierSearchEntityRepository.findAll();
				for(SupplierConnectTbl supply : demandList){
					connectVo = new SupplierConnectSearchVO();
					connectVo.setApprovalStatus(supply.getApprovalStatus());
					connectVo.setDueDt(supply.getDueDt());
					connectVo.setId(supply.getId());
					connectVo.setInvoiceAmount(supply.getInvoiceAmount());
					connectVo.setInvoiceNumber(supply.getInvoiceNumber());
					connectVo.setInvoiceSubmitDt(supply.getInvoiceSubmitDt());
					connectVo.setOrganizationName(supply.getOrganizationName());
					connectVo.setOrgId(supply.getOrgId());
					connectVo.setPaymentTerm(supply.getPaymentTerm());
					connectVo.setPoExpiryDt(supply.getPoExpiryDt());
					connectVo.setPoNumber(supply.getPoNumber());
					supplierVos.add(connectVo);
				}
				
				
				}


			 catch (Exception e) {
				System.out.println("HospitalAlarmService.getsupplierconnectWithFilter()" + e);
			}
			return supplierVos;

		}
	
}
