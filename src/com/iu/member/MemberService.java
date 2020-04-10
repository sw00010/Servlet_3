package com.iu.member;

public class MemberService {
	private MemberDAO memberDAO;
	public MemberService() {
		memberDAO = new MemberDAO();
	}

	public int memberAdd(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberAdd(memberDTO);
	}
	
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberLogin(memberDTO);
	}
	public int memberDelete(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberDelete(memberDTO);
	}
	public MemberDTO memberUpdate(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberUpdate(memberDTO);
	}
}
