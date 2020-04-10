package com.iu.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

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
					MemberDTO memberDTO = new MemberDTO();
					memberDTO.setId(request.getParameter("id"));
					memberDTO.setPw(request.getParameter("pw"));
					
					memberDTO = memberService.memberLogin(memberDTO);
					
					if(memberDTO !=null) {
						HttpSession session = request.getSession();
						session.setAttribute("member", memberDTO);
						check = false;
						path = "../";
						
					} else {
						
						request.setAttribute("path", "./memberLogin");
						request.setAttribute("result", "Login Fail");
						path = "../WEB-INF/views/common/result.jsp";
					}
					
				} else {
					check = true;
					path = "../WEB-INF/views/member/memberLogin.jsp";
				}
					

			} else if (command.equals("/memberPage")) {
				check=true;
				path = "../WEB-INF/views/member/memberPage.jsp";
				
				

			} else if (command.equals("/memberUpdate")) {
				if(method.equals("POST")) {
					MemberDTO memberDTO = new MemberDTO();
					HttpSession session = request.getSession();
					memberDTO.setAge(Integer.parseInt(request.getParameter("age")));
					memberDTO.setEmail(request.getParameter("email"));
					memberDTO.setName(request.getParameter("name"));
					memberDTO.setId(request.getParameter("id"));
					memberDTO.setPhone(request.getParameter("phone"));
					int result = memberService.memberUpdate(memberDTO);
					String msg="회원정보 수정이 실패했습니다.";
					if(result>0) {
						session.setAttribute("member", memberDTO);
						msg = "회원정보 수정이 되었습니다.";
					}
					
					request.setAttribute("result", msg);
					request.setAttribute("path", "./memberPage");
					path = "../WEB-INF/views/common/result.jsp";
				}
				else {
					path = "../WEB-INF/views/member/memberUpdate.jsp";
				}
				

			} else if (command.equals("/memberDelete")) {
				MemberDTO memberDTO = new MemberDTO();
				HttpSession session = request.getSession();
				memberDTO = (MemberDTO)session.getAttribute("member");
				int result = memberService.memberDelete(memberDTO);
				String msg="";
				if(result>0) {
					session.invalidate();
					msg = "탈퇴되었습니다.";
					
				}
				request.setAttribute("result", msg);
				request.setAttribute("path", "../");
				path = "../WEB-INF/views/common/result.jsp";

			} else if (command.equals("/memberLogout")){
				HttpSession session = request.getSession();
//				session.removeAttribute("member");
				session.invalidate();
				check = false;
				path = "../";
			}
			else {
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
