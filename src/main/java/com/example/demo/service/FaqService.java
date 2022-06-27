package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FaqDAO;
import com.example.demo.vo.Faq;

@Service
public class FaqService {
	@Autowired
	private FaqDAO dao;
	
	public List<Faq> findAll(){
		return dao.findAll();
	}
}
