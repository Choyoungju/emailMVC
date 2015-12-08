package com.hananins.emaillist.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.email.dao.EmailListDao;
import com.hanains.email.http.action.EmailListActionFactory;
import com.hanains.email.vo.EmailVo;
import com.hanains.http.httpUtil;
import com.hanains.http.action.Action;
import com.hanains.http.action.ActionFactory;

/**
 * Servlet implementation class EmailListServlet
 */
@WebServlet("/el")
public class EmailListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		doGet(request,response);
	}




	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		ActionFactory actionFactory = new EmailListActionFactory();
	
		String actionName = request.getParameter("a");
	
		Action action = actionFactory.getAction(actionName);
	
		action.execute(request, response);

		
		
		
		
		
		
//		if("form".equals(actionName)){
//			httpUtil.forwarding(request, response, "/WEB-INF/views/form.jsp");
//
//
//		}else if("insert".equals(actionName)){
//			request.setCharacterEncoding("UTF-8");
//			String firstName = request.getParameter("fn");
//			String lastName = request.getParameter("ln");
//			String email = request.getParameter("email");
//
//			EmailVo vo = new EmailVo();
//			vo.setLastName(lastName);
//			vo.setEmail(email);
//			vo.setFirstName(firstName);
//
//			EmailListDao dao = new EmailListDao();
//			dao.insert(vo);
//
//			response.sendRedirect("/emailList2/el");
//
//			
//			
//
//
//		}else { // index(default action)
//			EmailListDao dao = new EmailListDao();
//			List<EmailVo> list = dao.getList();
//
//			request.setAttribute("list",list);
//
//			//forwarding
//			httpUtil.forwarding(request, response, "/WEB-INF/views/index.jsp");
//			//RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/index.jsp");
//			//rd.forward(request, response);
//
//
//		}
	}

}
