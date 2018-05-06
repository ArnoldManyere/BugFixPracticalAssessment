/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.epay.business.config.tests.config;

import com.econetwireless.epay.business.integrations.impl.ChargingPlatformImpl;
import com.econetwireless.in.webservice.IntelligentNetworkService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.econetwireless.epay.business.integrations.impl.ChargingPlatformImpl;
/**
 *
 * @author ARNOLD MANYERE
 */
public class ChargingPlatformImplTest {
   private ChargingPlatformImpl chargingPlatformImpl;
	
	@Mock
	IntelligentNetworkService intelligentNetworkService;
	
	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
		chargingPlatformImpl=new ChargingPlatformImpl(intelligentNetworkService);
		
	}
        @Test
	public void test() {
		chargingPlatformImpl=new ChargingPlatformImpl(intelligentNetworkService);
		//assertNotNull(context);
	}
}
