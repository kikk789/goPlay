package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MatchBoardService;
import com.example.demo.vo.MatchBoard;

import lombok.Setter;


@RestController
@Setter
public class MatchBoardController {
	@Autowired
	private MatchBoardService ms;
	
	@GetMapping("/listMatchBoard")
	public List<MatchBoard> listMatchBoard(){
		return ms.listMatchboard();
	}
	
	@GetMapping("/findMatchBoard")
	public List<MatchBoard> findBy(){
		return ms.findMatchBoardByMbStat("종료");
	}
	
	@GetMapping("/findMatch")
	public List<MatchBoard> find(){
		return ms.findMatchBoard("종료", "축구");
	}
}
