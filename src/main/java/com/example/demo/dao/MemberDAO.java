package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.vo.Member;

public interface MemberDAO extends JpaRepository<Member, String>{

}
