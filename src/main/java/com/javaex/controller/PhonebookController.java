package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PhonebookVo;

@RestController
public class PhonebookController {

	@Autowired
	private PhonebookService phonebookService;
	
	//리스트 불러오기
	@GetMapping("/api/getlist")
	public JsonResult getList() {
		System.out.println("PhonebookController.getList");
		
		List<PhonebookVo> pList = phonebookService.exeList();
		
		return JsonResult.success(pList );
	}
}
