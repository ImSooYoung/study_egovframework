package egovframework.example.test.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.test.dto.BoardSaveDTO;
import egovframework.example.test.service.BoardService;
import egovframework.example.test.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Controller
public class BoardController {

	private final BoardService boardService;
	
	/**
	 * 글 목록 보여준다
	 * @return
	 */
	@RequestMapping(value = "boardList.do")
	public String boardList(Model model) {
		log.info("boardList()");
		
		List<BoardVO> list = boardService.boardList();
		log.info("list = {}", list);
		
		model.addAttribute("result", list);
		
		return "test/boardList";
	}
	
	
	/**
	 * 글 작성 페이지
	 * @return
	 */
	@RequestMapping(value = "boardWrite.do")
	public String boardWrite() {
		log.info("boardWrite()");
		
		return "test/boardWrite";
	}
	
	/**
	 * 글 저장한다.
	 * @return
	 */
	@RequestMapping(value = "boardWriteSave.do")
	public String boardWriteSave(BoardSaveDTO dto) {
		log.info("boardWriteSave(dto = {}, {}, {})", dto.getTitle(), dto.getName(), dto.getContent());
		
		int result = boardService.boardWriteSave(dto);
		log.info("result = {}", result);
		
		return "redirect:boardList.do";
	}
	
	/**
	 * 글 상세 페이지 보여준다.
	 * @param no 해당 no
	 * @return
	 */
	@RequestMapping(value = "boardDetail.do")
	public String boardDetail(int no, Model model) {
		log.info("boardDetail(no = {})", no);
		
		BoardVO vo = boardService.boardDetail(no); 
		log.info("vo = {}", vo);
		
		model.addAttribute("result", vo);
		
		return "test/boardDetail";
	}
	
	/**
	 *  글 수정 페이지로 이동한다.
	 * @param no 수정할 no
	 * @return
	 */
	@RequestMapping(value = "boardModify.do")
	public String boardModify(int no, Model model) {
		log.info("boardModify(no = {})", no);
		
		BoardVO vo = boardService.boardDetail(no);
		log.info("vo = {}", vo);
		
		model.addAttribute("result", vo);
		
		return "test/boardModify";
	}
	
	/**
	 * 글 수정한다
	 * @param dto
	 * @return
	 */
	@RequestMapping(value = "boardModifySave.do")
	public String boardModifySave(BoardVO vo) {
		log.info("boardModifySave(vo = {})", vo);
		
		int result = boardService.boardModifySave(vo);
		log.info("result", result);
		
		return "redirect:boardDetail.do?no="+vo.getNo();
	}
	
	/**
	 * 글 삭제한다
	 * @param no 삭제할 글 no
	 * @return
	 */
	@RequestMapping(value = "boardDelete.do")
	public String boardDelete(int no) {
		log.info("boardDelete(no = {})", no);
		
		int result = boardService.boardDeleteByNo(no);
		log.info("result = {}", result);
		
		return "redirect:boardList.do";
	}
	
}
