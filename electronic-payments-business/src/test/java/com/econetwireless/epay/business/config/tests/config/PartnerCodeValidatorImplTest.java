/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.epay.business.config.tests.config;

import com.econetwireless.epay.business.services.impl.PartnerCodeValidatorImpl;
import com.econetwireless.epay.dao.requestpartner.api.RequestPartnerDao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import org.mockito.MockitoAnnotations;
/**
 *
 * @author ARNOLD MANYERE
 */
public class PartnerCodeValidatorImplTest {
    
    public PartnerCodeValidatorImplTest() {
    }
    
    
	@Mock
	private RequestPartnerDao requestPartnerDao;

	private String partnerCode="hot-recharge";
	@Before
	public void intiMocks() {
		MockitoAnnotations.initMocks(this);
		PartnerCodeValidatorImpl partnerCodeValidatorImpl=new PartnerCodeValidatorImpl(requestPartnerDao);
	}

	
	public void testValidatePartnerCode() {
		verify(requestPartnerDao, atLeastOnce()).findByCode(partnerCode);
	}
}
