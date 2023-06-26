package egovframework.example.test.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.test.dto.BoardSaveDTO;
import egovframework.example.test.vo.BoardVO;

@Mapper
public interface BoardMapper {

	int boardWriteSave(BoardSaveDTO dto);
	
	List<BoardVO> selectBoardList();

	BoardVO selectBoardByNo(int no);

	int boardModifyByNo(BoardVO vo);
	
	int boardDeleteByNo(int no);

	
}
