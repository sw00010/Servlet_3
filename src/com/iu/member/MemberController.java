package com.iu.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService memberService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberController() {
		super();
		memberService = new MemberService();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String command = request.getPathInfo();
		boolean check = true;
		String method = request.getMethod();
		String path = "";

		try {
			if (command.equals("/memberJoin")) {
				if(method.equals("POST")) {
					MemberDTO memberDTO = new MemberDTO();
					memberDTO.setAge(Integer.parseInt(request.getParameter("age")));
					memberDTO.setEmail(request.getParameter("email"));
					memberDTO.setName(request.getParameter("name"));
					memberDTO.setId(request.getParameter("id"));
					memberDTO.setPhone(request.getParameter("phone"));
					memberDTO.setPw(request.getParameter("pw"));
					int result = memberService.memberAdd(memberDTO);
					check = false;
					path = "../";
					
				} else {
					check = true;
					path = "../WEB-INF/views/member/memberJoin.jsp";
				}

			} else if (command.equals("/memberLogin")) {
				if(method.equals("POST")) {
					
				} else {
					check = true;
					path = "../WEB-INF/views/member/memberLogin.jsp";
				}
					

			} else if (command.equals("/memberPage")) {

			} else if (command.equals("/memberUpdate")) {

			} else if (command.equals("/memberDelete")) {

			} else {
				System.out.println("ETC");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		if (check) {
			RequestDispatcher view = request.getRequestDispatcher(path);
			view.forward(request, response);
		} else {
			response.sendRedirect(path);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
