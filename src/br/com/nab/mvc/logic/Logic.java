package br.com.nab.mvc.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logic {
	String runs(HttpServletRequest req,
            HttpServletResponse res) throws Exception;
}
