package br.com.nab.mvc.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestLogic implements Logic{
	public String runs(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        System.out.println("Running the logic ...");
        
        System.out.println("Returning the name of the JSP page ...");
        return "test-logic.jsp";

    }
}
