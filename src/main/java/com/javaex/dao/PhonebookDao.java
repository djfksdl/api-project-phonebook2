package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PhonebookVo;

@Repository
public class PhonebookDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//리스트 불러오기
	public List<PhonebookVo> selectList() {
		System.out.println("PhonebookDao.selectList");
		
		List<PhonebookVo> pList = sqlSession.selectList("phone.getList");
		
		return pList;
		
	}

}
