package com.iu.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnect;

public class MemberDAO {
	public int memberAdd(MemberDTO memberDTO) throws Exception {
		int result=0;
		Connection con = DBConnect.getConnect();
		String sql = "insert into member values(?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, memberDTO.getName());
		st.setInt(2, memberDTO.getAge());
		st.setString(3, memberDTO.getId());
		st.setString(4, memberDTO.getPw());
		st.setString(5, memberDTO.getEmail());
		st.setString(6, memberDTO.getPhone());
		result = st.executeUpdate();
		st.close();
		con.close();
		return result;
		
	}
	
	
	
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		Connection con = DBConnect.getConnect();
		String sql = "select * from member where id=? and pw=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			memberDTO.setAge(rs.getInt("age"));
			memberDTO.setEmail(rs.getString("email"));
			memberDTO.setName(rs.getString("name"));
			memberDTO.setPhone(rs.getString("phone"));
		} else {
			memberDTO = null;
		}
		
		rs.close();
		st.close();
		con.close();
		return memberDTO;
	}
	
	
}
