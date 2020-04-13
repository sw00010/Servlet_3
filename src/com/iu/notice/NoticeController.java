package com.iu.notice;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NoticeController
 */
@WebServlet("/NoticeController")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NoticeService noticeService;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NoticeController() {
		super();
		noticeService = new NoticeService();
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
		String method = request.getMethod();
		boolean check = true;
		String path = "";

		try {
			if (command.equals("/noticeList")) {
				ArrayList<NoticeDTO> ar = noticeService.noticeList();
				request.setAttribute("nlist", ar);
				
				
				path="../WEB-INF/views/notice/noticeList.jsp";
				
			

			} else if (command.equals("/noticeAdd")) {
				if(method.equals("POST")) {
					NoticeDTO noticeDTO = new NoticeDTO();
					String documentName = request.getParameter("documentName");
					String documentContents = request.getParameter("documentContents");
					String writeId = request.getParameter("writeId");
					System.out.println(writeId);
					noticeDTO.setDocumentContents(documentContents);
					noticeDTO.setDocumentName(documentName);
					noticeDTO.setWriteId(writeId);
					int result = noticeService.noticeAdd(noticeDTO);
					String msg = "글 등록 실패";
					if(result>0) {
						msg = "글 작성 성공";
					}
					request.setAttribute("result", msg);
					request.setAttribute("path", "./noticeList");
					path = "../WEB-INF/views/common/result.jsp";
				}
				else {
					check = true;
					path = "../WEB-INF/views/notice/noticeAdd.jsp";
				}

			} else if (command.equals("/noticeUpdate")) {
				if(method.equals("POST")) {
					int num = Integer.parseInt(request.getParameter("documentNum"));
					NoticeDTO noticeDTO = new NoticeDTO();
					noticeDTO.setDocumentName(request.getParameter("documentName"));
					noticeDTO.setDocumentContents(request.getParameter("documentContents"));
					noticeDTO.setDocumentNum(num);
					System.out.println("check");
					int result = noticeService.noticeUpdate(noticeDTO);
					String msg = "글 수정 실패";
					if(result>0) {
						msg = "글 수정 성공";
						request.setAttribute("path", "./noticeSelect?documentNum="+num);
					}
					else {
						request.setAttribute("path", "./noticeList");
					}
					request.setAttribute("result", msg);
					path = "../WEB-INF/views/common/result.jsp";
				} else {
					int num = Integer.parseInt(request.getParameter("documentNum"));
					NoticeDTO noticeDTO = noticeService.noticeSelect(num);
					request.setAttribute("ndto", noticeDTO);
					check = true;
					path = "../WEB-INF/views/notice/noticeUpdate.jsp";
				}

			} else if (command.equals("/noticeDelete")) {
				int num = Integer.parseInt(request.getParameter("documentNum"));
				int result = noticeService.noticeDelete(num);
				check = false;
				path = "./noticeList";

			} else if (command.equals("/noticeSelect")) {
				int num = Integer.parseInt(request.getParameter("documentNum"));
				NoticeDTO noticeDTO = noticeService.noticeSelect(num);
				noticeService.noticeViewUpdate(num);
				request.setAttribute("ndto", noticeDTO);
				
				path = "../WEB-INF/views/notice/noticeSelect.jsp";

			} else {
				System.out.println("ETC");
			}

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		if(check) {
			RequestDispatcher view = request.getRequestDispatcher(path);
			view.forward(request, response);
		}
		else {
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
