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
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpStatus;

public class MyServlet extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
 
        resp.setStatus(HttpStatus.OK_200);
        resp.getWriter().println("EmbeddedJetty");
    }}

