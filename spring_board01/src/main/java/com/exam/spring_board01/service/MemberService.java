package com.exam.spring_board01.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.spring_board01.dto.MemberJoinDTO;
import com.exam.spring_board01.mapper.MemberMapper;
import com.exam.spring_board01.vo.MemberVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberMapper memberMapper;
	
	/**
	 * 회원가입을 한다.
	 * @param dto 가입 정보를 담은 dto
	 * @return 성공할 시 1을 반환
	 */
	public int join(MemberJoinDTO dto) {
		log.info("join(dto = {})", dto);
		
		int result = memberMapper.insert(dto);
		log.info("result = {}", result);
		
		return result;
	}

	/**
	 * 로그인 한다.
	 * @param id
	 * @param pw
	 * @return memberVO 타입을 반환
	 */
	public MemberVO login(String id, String pw) {
		log.info("login(id = {}, pw = {})", id, pw);
		
		MemberVO memberVO = memberMapper.selectByIdAndPw(id, pw);
		log.info("result = {}", memberVO);
		
		return memberVO;
	}
	
	
}
