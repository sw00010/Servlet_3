package com.iu.point;

import java.util.ArrayList;

public class PointService {
	private PointDAO pointDAO;
	public PointService(){
		pointDAO = new PointDAO();
		
	}
	
	//1. List
	public ArrayList<PointDTO> pointList() throws Exception {
		
		return pointDAO.pointList();
	}
	
	//2. SelectOne
	public PointDTO pointSelect(int num) throws Exception {
		return pointDAO.pointSelect(num);
		
		
	}
	//3. Delete
	public int pointDelete(int num) throws Exception {
		return pointDAO.pointDelete(num);
	}
	//4. Insert
	public int pointAdd(PointDTO pointDTO) throws Exception {
		pointDTO.setTotal(pointDTO.getEng()+pointDTO.getKor()+pointDTO.getMath());
		pointDTO.setAvg(pointDTO.getTotal()/3.0);
		return pointDAO.pointAdd(pointDTO);
	}
	
	
	
}
