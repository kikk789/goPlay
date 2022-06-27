package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberDAO;
import com.example.demo.vo.Member;

@Service
public class MemberService {
	@Autowired
	private MemberDAO dao;
	
	public List<Member> findAll(){
		return dao.findAll();
	}
}
