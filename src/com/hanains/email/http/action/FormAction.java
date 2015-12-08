package com.hanains.email.http.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.http.httpUtil;
import com.hanains.http.action.Action;

public class FormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		httpUtil.forwarding(request, response, "/WEB-INF/views/form.jsp");
		
	}

	
}
