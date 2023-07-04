package com.exam.spring_board01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.exam.spring_board01.dto.BoardSelectDTO;
import com.exam.spring_board01.dto.BoardUpdateDTO;
import com.exam.spring_board01.dto.BoardWriteDTO;
import com.exam.spring_board01.vo.BoardVO;

public interface BoardMapper {
	/**
	 * 게시판 테이블에 글을 추가한다.
	 * @param dto
	 * @return 성공시 1을 반환.
	 */
	public int insert(BoardVO vo);
	
	/**
	 * 게시판 테이블 전체 조회한다.
	 * @return List<BoardVO>
	 */
	public List<BoardSelectDTO> selectAll();

	/**
	 * 게시판 테이블을 조회한다.
	 * @param no 조회할 글 no
	 * @return BoardSelectDTO
	 */
	public BoardSelectDTO selectByNo(int no);

	/**
	 * 글을 수정한다.
	 * @param dto 수정할 정보가 담긴 dto
	 * @return 성공시 1
	 */
	public int update(BoardUpdateDTO dto);
	
	
	
}
