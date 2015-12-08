package com.hanains.email.http.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.email.dao.EmailListDao;
import com.hanains.email.vo.EmailVo;
import com.hanains.http.httpUtil;
import com.hanains.http.action.Action;

public class IndexAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		EmailListDao dao = new EmailListDao();
		List<EmailVo> list = dao.getList();

		request.setAttribute("list",list);

		//forwarding
		httpUtil.forwarding(request, response, "/WEB-INF/views/index.jsp");
		//RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/index.jsp");
		//rd.forward(request, response);
	}

	
	
}
