/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.supplierconnect.repository;

/**
 * 
 * @author predix -
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ge.supplierconnect.entity.SupplierConnectTbl;

@Repository
public interface ISupplierSearchEntityRepository extends JpaRepository<SupplierConnectTbl, Long>,JpaSpecificationExecutor<SupplierConnectTbl>
{
	
	
}

