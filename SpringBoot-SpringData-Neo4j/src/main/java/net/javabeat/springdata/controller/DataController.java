package net.javabeat.springdata.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataController {
	
    @RequestMapping(value="/execute", method=RequestMethod.GET,params="query")
    public String execute(@RequestParam ("query")String query,HttpServletRequest request, HttpServletResponse response) {
    	try {
    		response.getWriter().write("<h1>Spring Boot Tutorials</h1>");
    		response.getWriter().write("<h2>Neo4j + REST + Spring Boot WAR Application</h2>");
			URL url = new URL("http", "localhost",8080,"/JavaBeat-Neo4j-REST/"+request.getParameter("query"));
			HttpURLConnection c = (HttpURLConnection)url.openConnection();
		        c.setRequestProperty("Content-length", "0");
		        c.setUseCaches(false);
		        c.setAllowUserInteraction(false);
		        c.connect();
		        int status = c.getResponseCode();

		        switch (status) {
		            case 200:
		            case 201:
		                BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
		                String line;
		                while ((line = br.readLine()) != null) {
		                    response.getWriter().append(line+"\n");
		                }
		                br.close();
		                response.flushBuffer();
		                return "resultTemplate";
		        }

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return "resultTemplate";
    }
    
    @RequestMapping(value="/query", method=RequestMethod.GET)
    public String query(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.getWriter().write("<h1>Spring Boott Tutorials</h1>");
			response.getWriter().write("<h2>Neo4j + REST + Spring Boot WAR Application</h2>");
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return "queryTemplate";
    }    
    
}
