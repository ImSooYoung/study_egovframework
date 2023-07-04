package com.exam.spring_board01.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.spring_board01.dto.BoardSelectDTO;
import com.exam.spring_board01.dto.BoardUpdateDTO;
import com.exam.spring_board01.dto.BoardWriteDTO;
import com.exam.spring_board01.service.BoardService;
import com.exam.spring_board01.vo.BoardVO;
import com.exam.spring_board01.vo.MemberVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RequestMapping("/board")
@Slf4j
@Controller
public class BoardController {
	
	private final BoardService boardService;
	
	/**
	 * 로그인 후 게시판 리스트를 출력한다.
	 * @param no 로그인한 사용자의 no
	 * @return
	 */
	@GetMapping("/boardList")
	public String boardList(int no, Model model) {
		log.info("boardList(no = {})", no);
		
		MemberVO memberVO = boardService.selectByNo(no);
		log.info("MemberVO = {}", memberVO);
		
		List<BoardSelectDTO> list = boardService.selectAll();
		log.info("list = {}", list);
		
		model.addAttribute("memberVO", memberVO);
		model.addAttribute("boardVO", list);
		
		return "/board/boardList";
	}
	
	/**
	 * 글 작성페이지로 이동한다
	 * @param no
	 * @return 
	 */
	@GetMapping("/boardWrite")
	public String boardWrite(int no, Model model) {
		log.info("boardWrite(no = {})", no);
		
		model.addAttribute("no", no);
		
		return "/board/boardWrite";
	}
	
	/**
	 * 글 작성한다.
	 * @param dto
	 * @return
	 */
	@GetMapping("/boardCreate") 
	public String boardCreate(BoardWriteDTO dto) {
		log.info("boardCreate(dto = {})", dto);
		 
		int result = boardService.create(dto); 
		log.info("result = {}", result);
		 
		return "redirect:/board/boardList?no=" + dto.getMemberNo(); 
	}
	
	/**
	 * 디테일 페이지로 이동한다.
	 * @param no
	 * @return
	 */
	@GetMapping("/boardDetail")
	public String boardDetail(int no, Model model) {
		log.info("boardDetail(no = {})", no);
		
		BoardSelectDTO result = boardService.selectByBoardNo(no);
		log.info("result = {}", result);
		
		model.addAttribute("result", result);
		
		return "/board/boardDetail";
	}
	
	/**
	 * 글 수정 페이지로 이동
	 * @param no
	 * @param model
	 * @return
	 */
	@GetMapping("/boardModified")
	public String boardModified(int no, Model model) {
		log.info("boardModified(no = {})", no);
		
		BoardSelectDTO result = boardService.selectByBoardNo(no);
		log.info("result = {}", result);
		
		model.addAttribute("result", result);
		
		return "/board/boardModified";
	}
	
	/**
	 * 글 수정한다.
	 * @param dto 
	 * @return list페이지로 이동
	 */
	@GetMapping("/boardModifiedSave")
	public String boardModifiedSave(BoardUpdateDTO dto) {
		log.info("boardModifiedSave(dto = {})", dto);
		
		int result = boardService.update(dto);
		log.info("result = {}", result);
		
		return "redirect:/board/boardDetail?no=" + dto.getNo();
	}
	
}
