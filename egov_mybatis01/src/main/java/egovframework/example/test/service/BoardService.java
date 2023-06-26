package egovframework.example.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import egovframework.example.test.dto.BoardSaveDTO;
import egovframework.example.test.service.impl.BoardMapper;
import egovframework.example.test.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Service
public class BoardService {

	private final BoardMapper boardMapper;
	
	/**
	 * 글 저장한다
	 * @param dto 저장할 정보가 담긴 dto
	 * @return
	 */
	public int boardWriteSave(BoardSaveDTO dto) {
		log.info("boardWriteSave(dto = {})", dto);
		
		int result = boardMapper.boardWriteSave(dto);
		log.info("result = {}", result);
		
		return result;
	}

	/**
	 * 글 목록을 출력한다.
	 */
	public List<BoardVO> boardList() {
		log.info("boardList()");
		
		List<BoardVO> list = boardMapper.selectBoardList();
		log.info("list = {}", list);
		
		return list;
	}

	/**
	 * 글 상세 페이지 보여준다.
	 * @param no
	 * @return
	 */
	public BoardVO boardDetail(int no) {
		log.info("boardDetail(no = {})", no);
		
		BoardVO vo = boardMapper.selectBoardByNo(no);
		log.info("vo = {}", vo);
		
		return vo;
	}

	/**
	 * 글 수정한다.
	 * @param no 수정할 no
	 * @return
	 */
	public int boardModifySave(BoardVO vo) {
		log.info("boardModifySave(vo = {})", vo);
		
		int result = boardMapper.boardModifyByNo(vo);
		log.info("result = {}", result);
		
		return result;
	}

	/**
	 * 글 삭제한다
	 * @param no 글 삭제한다 no
	 * @return
	 */
	public int boardDeleteByNo(int no) {
		log.info("boardDeleteByNo(no = {})", no);
		
		int result = boardMapper.boardDeleteByNo(no);
		log.info("result = {}", result);
		
		return result;
	}
	
	
}
