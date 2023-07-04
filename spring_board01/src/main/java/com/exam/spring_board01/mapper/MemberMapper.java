package com.exam.spring_board01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.exam.spring_board01.dto.MemberJoinDTO;
import com.exam.spring_board01.vo.MemberVO;

public interface MemberMapper {
	
	/**
	 * 회원 테이블에 insert
 	 * @param insert할 정보를 담은 객체
	 * @return 성공할 시 1을 반환
	 */
	public int insert(MemberJoinDTO dto);

	/**
	 * 회원 테이블의 id pw 조회한다.
	 * @param id
	 * @param pw
	 * @return MemberVO를 반환.
	 */
	public MemberVO selectByIdAndPw(@Param("id") String id, @Param("pw") String pw);
	
	/**
	 * 회원 테이블의 no를 조회한다.
	 * @param no 
	 * @return MemberVO 반환.
	 */
	public MemberVO selectByNo(@Param("no") int no);
		
}