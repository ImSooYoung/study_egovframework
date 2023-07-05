package com.exam.spring_board01.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.spring_board01.dto.BoardSearchDTO;
import com.exam.spring_board01.dto.BoardSelectDTO;
import com.exam.spring_board01.dto.BoardUpdateDTO;
import com.exam.spring_board01.dto.BoardWriteDTO;
import com.exam.spring_board01.mapper.BoardMapper;
import com.exam.spring_board01.mapper.MemberMapper;
import com.exam.spring_board01.vo.BoardVO;
import com.exam.spring_board01.vo.MemberVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Service
public class BoardService {
	
	private final MemberMapper memberMapper;
	private final BoardMapper boardMapper;
	
	/**
	 * 회원테이블의 no를 조회함
	 * @param no 
	 * @return MemberVO
	 */
	public MemberVO selectByNo(int no) {
		log.info("selectByNo(no = {})", no);
		
		MemberVO memberVO = memberMapper.selectByNo(no);
		log.info("memberVO = {}", memberVO);
		
		return memberVO;
	}

	/**
	 * 글 작성한다.
	 * @param dto 저장할 정보가 담긴 dto
	 * @return 성공하면 1을 반환.
	 */
	public int create(BoardWriteDTO dto) {
		log.info("create(dto = {})", dto);
		
		int result = boardMapper.insert(dto.toEntity());
		log.info("result = {}", result);
		
		return result;
	}

	/**
	 * 게시판 테이블을 조회한다
	 * @return List<BoardVO>
	 */
	public List<BoardSelectDTO> selectAll() {
		log.info("selectAll()");
		
		List<BoardSelectDTO> list = boardMapper.selectAll();
		log.info("list = {}", list);
		
		return list;
	}

	/**
	 * 디테일 페이지의 게시판 정보를 조회한다.
	 * @param no
	 * @return BoardSelectDTO
	 */
	public BoardSelectDTO selectByBoardNo(int no) {
		log.info("selectByBoardNo(no = {})", no);
		
		BoardSelectDTO result = boardMapper.selectByNo(no);
		log.info("result = {}", result);
		
		return result;
	}

	/**
	 * 글 수정한다.
	 * @return 성공시 1
	 */
	public int update(BoardUpdateDTO dto) {
		log.info("update(dto = {}", dto);
		
		int result = boardMapper.update(dto);
		log.info("result = {}", result);
		
		return result;
	}

	/**
	 * 글 삭제한다.
	 * @param no 삭제할 글 번호
	 * @return 성공시 1 반환.
	 */
	public int delete(int no) {
		log.info("delete(no = {})", no);
		
		int result = boardMapper.delete(no);
		log.info("result = {}", result);
		
		return result;
	}

	/**
	 * 검색한다.
	 * @param dto
	 * @return List<BoardSelectDTO>
	 */	
	public List<BoardSelectDTO> search(BoardSearchDTO dto) {
		log.info("search(dto = {})", dto);
		
//		dto.setKeyword("'%" + dto.getKeyword() + "%'");
//		log.info("dto = {}", dto);
		
		List<BoardSelectDTO> list = boardMapper.search(dto);
		log.info("list = {}", list);
		
		return list;
	}
	
	
	
}
