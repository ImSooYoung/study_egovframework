package com.exam.spring_board01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.spring_board01.dto.MemberJoinDTO;
import com.exam.spring_board01.service.MemberService;
import com.exam.spring_board01.vo.MemberVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService;
	
	/**
	 * 회원가입 페이지로 이동한다.
	 * @return
	 */
	@GetMapping("/joinWrite")
	public String joinWrite() {
		log.info("joinWrite()");
		
		return "member/joinWrite";
	}
	
	/**
	 * 회원가입 한다
	 * @param dto 가입 정보를 담은 dto
	 * @return
	 */
	@PostMapping("/join") 
	public String join(MemberJoinDTO dto) {
		log.info("join(dto = {})", dto);
		
		int result = memberService.join(dto);
		log.info("result = {}", result);
		
		if(result == 1) {
			log.info("성공");
		} else {
			log.info("실패");
		}
		
		return "/home";
	}
	
	/**
	 * 로그인 한다
	 * @param id
	 * @param pw
	 * @return
	 */
	@PostMapping("/login")
	public String login(String id, String pw) {
		log.info("login(id = {}, pw = {})", id, pw);
		
		MemberVO memberVO = memberService.login(id, pw);
		log.info("memberVO = {}", memberVO);
		
		if(memberVO == null) {
			return "redirect:/";
		}
		
		return "redirect:/board/boardList?no=" + memberVO.getNo();
	}
	
}
