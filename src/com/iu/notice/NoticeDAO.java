package com.iu.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnect;

public class NoticeDAO {
	public NoticeDTO noticeSelect(int num) throws Exception {
		NoticeDTO noticeDTO = null;
		Connection con = DBConnect.getConnect();
		String sql = "select * from notice where documentNum=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, num);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			noticeDTO = new NoticeDTO();
			noticeDTO.setDocumentNum(rs.getInt("documentNum"));
			noticeDTO.setDocumentName(rs.getString("documentName"));
			noticeDTO.setDocumentContents(rs.getString("documentContents"));
			noticeDTO.setWriteId(rs.getString("writeId"));
			noticeDTO.setDocumentViews(rs.getInt("documentViews"));
			noticeDTO.setWriteDate(rs.getDate("writeDate"));			
		}
		rs.close();
		st.close();
		con.close();
		return noticeDTO;
	}
	
	
	public ArrayList<NoticeDTO> noticeList() throws Exception {
		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();
		Connection con = DBConnect.getConnect();
		String sql = "select * from notice order by writedate desc";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		
		while(rs.next()) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setDocumentNum(rs.getInt("documentNum"));
			noticeDTO.setDocumentName(rs.getString("documentName"));
			noticeDTO.setDocumentContents(rs.getString("documentContents"));
			noticeDTO.setWriteId(rs.getString("writeId"));
			noticeDTO.setDocumentViews(rs.getInt("documentViews"));
			noticeDTO.setWriteDate(rs.getDate("writeDate"));
			ar.add(noticeDTO);
			
		}
		rs.close();
		st.close();
		con.close();
		return ar;
	}
	public int noticeAdd(NoticeDTO noticeDTO) throws Exception {
		int result = 0;
		Connection con = DBConnect.getConnect();
		String sql = "insert into notice values(notice_seq.nextval,?,?,'admin',0,sysdate)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, noticeDTO.getDocumentName());
		st.setString(2, noticeDTO.getDocumentContents());
		result = st.executeUpdate();
		st.close();
		con.close();
		
		return result;
	}
	
	public int noticeDelete(int num)throws Exception {
		Connection con = DBConnect.getConnect();
		String sql = "delete notice where documentNum=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, num);
		int result = st.executeUpdate();
		st.close();
		con.close();
		return result;
	}
	
	public int noticeUpdate(NoticeDTO noticeDTO) throws Exception {
		int result = 0;
		Connection con = DBConnect.getConnect();
		String sql = "update notice set documentName=?, documentContents=? where documentNum=?";
		PreparedStatement st = con.prepareStatement(sql);
		
		
		st.setString(1, noticeDTO.getDocumentName());
		st.setString(2, noticeDTO.getDocumentContents());
		st.setInt(3, noticeDTO.getDocumentNum());
		result = st.executeUpdate();
		st.close();
		con.close();
		
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	

}
