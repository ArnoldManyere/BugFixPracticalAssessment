/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.epay.business.config.tests.config;

import com.econetwireless.epay.business.integrations.api.ChargingPlatform;
import com.econetwireless.epay.business.services.impl.EnquiriesServiceImpl;
import com.econetwireless.epay.dao.subscriberrequest.api.SubscriberRequestDao;
import com.econetwireless.epay.domain.SubscriberRequest;
import com.econetwireless.utils.pojo.INBalanceResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
/**
 *
 * @author ARNOLD MANYERE
 */
public class EnquiriesServiceImplTest {
    
   private EnquiriesServiceImpl enquiriesServiceImpl;
	@Mock
	private ChargingPlatform chargingPlatform;
	
	SubscriberRequest subscriberRequest;

	INBalanceResponse inBalanceResponse;
	
	@Mock
	private SubscriberRequestDao subscriberRequestDao;
	 
	@Test
	public void testEnquiriesServiceImpl() {
		MockitoAnnotations.initMocks(this);
		inBalanceResponse=new INBalanceResponse();
		enquiriesServiceImpl=new EnquiriesServiceImpl(chargingPlatform, subscriberRequestDao);
	}
}
