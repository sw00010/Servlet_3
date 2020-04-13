package com.iu.notice;

import java.util.ArrayList;

public class NoticeService {
	private NoticeDAO noticeDAO;
	public NoticeService() {
		noticeDAO = new NoticeDAO();
	}
	
	public ArrayList<NoticeDTO> noticeList() throws Exception {
		return noticeDAO.noticeList();
	}
	
	public int noticeAdd(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.noticeAdd(noticeDTO);
	}
	public NoticeDTO noticeSelect(int num) throws Exception {
		return noticeDAO.noticeSelect(num);
	}
	public int noticeDelete(int num) throws Exception {
		return noticeDAO.noticeDelete(num);
	}
	public int noticeUpdate(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.noticeUpdate(noticeDTO);
	}
	public int noticeViewUpdate(int num) throws Exception {
		return noticeDAO.noticeViewUpdate(num);
	}
	
}
