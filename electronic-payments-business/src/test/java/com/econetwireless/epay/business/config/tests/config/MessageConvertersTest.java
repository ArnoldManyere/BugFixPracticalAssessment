/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.epay.business.config.tests.config;

import com.econetwireless.epay.business.utils.MessageConverters;
import com.econetwireless.in.webservice.BalanceResponse;
import com.econetwireless.in.webservice.CreditRequest;
import com.econetwireless.in.webservice.CreditResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.mockito.MockitoAnnotations;
import com.econetwireless.utils.pojo.*;
/**
 *
 * @author ARNOLD MANYERE
 */
public class MessageConvertersTest {
    
    public MessageConvertersTest() {
    }
    
   @Mock
	private CreditResponse creditResponse;
	
	@Mock
	private INCreditResponse increditResponse;
	
	@Mock
	private BalanceResponse balanceResponse;
	
	@Mock
	private INBalanceResponse inbalanceResponse;

	MessageConverters messageConverters;
	
	@Mock
	private INCreditRequest inCreditRequest;

	@Mock
	private CreditRequest creditRequest;
	
	@Before
	public void intMocks() throws ClassNotFoundException{
		MockitoAnnotations.initMocks(this);			
	}
	
	@Test
	public void testConvertCreditResponse() {
		creditResponse=new CreditResponse();
		assertNotNull(messageConverters.convert(creditResponse));
		creditResponse=null;
		assertNull(messageConverters.convert(creditResponse));
	}

	@Test
	public void testConvertINBalanceResponse() {
		inbalanceResponse=new INBalanceResponse();
		assertNotNull(messageConverters.convert(inbalanceResponse));
		inbalanceResponse=null;
		assertNull(messageConverters.convert(inbalanceResponse));
	}


	@Test
	public void testConvertBalanceResponse() {
		balanceResponse=new BalanceResponse();
		assertNotNull(messageConverters.convert(balanceResponse));
		balanceResponse=null;
		assertNull(messageConverters.convert(balanceResponse));
	}
	@Test
	public void testConvertINCreditRequest() {
		inCreditRequest=new INCreditRequest();
		assertNotNull(messageConverters.convert(inCreditRequest));
		inCreditRequest=null;
		assertNull(messageConverters.convert(inCreditRequest));
		
	}

	@Test
	public void testConvertCreditRequest() {
		creditRequest=new CreditRequest();
		assertNotNull(messageConverters.convert(creditRequest));
		creditRequest=null;
		assertNull(messageConverters.convert(creditRequest));
	}

	@Test
	public void testConvertINCreditResponse() {	
		increditResponse=new INCreditResponse();
		assertNotNull(messageConverters.convert(increditResponse));
		increditResponse=null;
		assertNull(messageConverters.convert(increditResponse));
	}
}
