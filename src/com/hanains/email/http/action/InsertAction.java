package com.hanains.email.http.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.email.dao.EmailListDao;
import com.hanains.email.vo.EmailVo;
import com.hanains.http.action.Action;

public class InsertAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		String firstName = request.getParameter("fn");
		String lastName = request.getParameter("ln");
		String email = request.getParameter("email");

		EmailVo vo = new EmailVo();
		vo.setLastName(lastName);
		vo.setEmail(email);
		vo.setFirstName(firstName);

		EmailListDao dao = new EmailListDao();
		dao.insert(vo);

		response.sendRedirect("/emailList2/el?a=show");
	}

	
}
