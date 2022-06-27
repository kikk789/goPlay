package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FaqService;
import com.example.demo.service.MemberService;
import com.example.demo.vo.Faq;
import com.example.demo.vo.Member;

import lombok.Setter;

@RestController
@Setter
public class FaqController {
	@Autowired
	private FaqService fs;
	
	@GetMapping("/listFaq")
	public List<Faq> listMember(){
		return fs.findAll();
	}
}
