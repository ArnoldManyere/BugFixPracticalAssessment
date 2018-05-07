/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.econetwireless.epay.jettyserver;

/**
 *
 * @author ARNOLD MANYERE
 */
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
//import com.javacodegeeks.snippets.enterprise.embeddedjetty.servlet.ExampleServlet;
import com.econetwireless.epay.api.webinitialisers.EpayApiWebAppInitializer;
 

public class EmbeddedJetty {
       Server server = new Server(7070);
        ServletContextHandler handler = new ServletContextHandler(server, "/econetwireless");
        
}

