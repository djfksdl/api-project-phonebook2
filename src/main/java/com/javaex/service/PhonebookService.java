package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookDao;
import com.javaex.vo.PhonebookVo;

@Service
public class PhonebookService {
	
	@Autowired
	private PhonebookDao phonebookDao;
	
	//리스트 불러오기
	public List<PhonebookVo> exeList() {
		System.out.println("PhonebookService.exeList");
		
		List<PhonebookVo> pList = phonebookDao.selectList();
		
		return pList;
	}

}
