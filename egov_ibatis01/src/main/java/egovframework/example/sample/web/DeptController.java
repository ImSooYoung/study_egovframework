package egovframework.example.sample.web;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class DeptController {

//	@Resource(name = " deptService")
	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value = "/deptWrite.do")
	public String deptWrite() {
		log.info("deptWrite()");
		
		return "dept/deptWrite";
	}
	
	/**
	 * 글을 등록한다
	 * @param vo 등록할 글의 정보를 담은 DeptVO 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/deptWriteSave.do")
	public String deptWriteSave(DeptVO vo) throws Exception {
		log.info("deptWriteSave(vo = {})", vo);
		
		log.info("번호 = " + vo.getDeptno());
		log.info("이름 = " + vo.getDname());
		log.info("위치 = " + vo.getLoc());
		
		String result =  deptService.insertDept(vo);

		if(result == null) {
			log.info("result = {} 저장완료", result);
		} else {
			log.info("result = {} 저장실패", result);
		}
		
		return "redirect:deptList.do";
	}
	
	/**
	 * 등록된 글 리스트를 출력한다
	 * @param vo 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/deptList.do")
	public String selectDeptList(DeptVO vo, ModelMap model) throws Exception {
		log.info("selectDeptList(vo = {})", vo);
		
		List<?> list = deptService.selectDeptList(vo); 
		log.info("list = {}", list);

		model.addAttribute("resultList", list);
		
		return "dept/deptList";
	}
	
	/**
	 * 글 조회한다
	 * @param deptno 조회할 글의 번호
	 * @return
	 */
	@RequestMapping(value = "/deptDetail.do")
	public String selectDeptDetail(int deptno, ModelMap model) throws Exception {
		log.info("selectDeptDetail(deptno = {})", deptno);
		
		DeptVO result = deptService.selectDeptDetail(deptno);
		log.info("result = {}", result);
		
		model.addAttribute("deptVO", result);
		
		return "dept/deptDetail";
	}
	
	@RequestMapping(value = "deptDelete.do")
	public String deleteDept(int deptno) throws Exception {
		log.info("deleteDept(deptno = {})", deptno);
		
		int result = deptService.deleteDept(deptno);
		if(result == 1) {
			log.info("삭제완료");
		} else {
			log.info("삭제실패");
		}
		
		return "redirect:deptList.do";
	}
	
	
	/**
	 * 글 수정페이지 
	 * @param deptno 수정할 글의 번호
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "deptModifyWrite.do")
	public String selectDeptModify(int deptno, ModelMap model) throws Exception {
		log.info("selectDeptModify(deptno = {})", deptno);
		
		DeptVO vo = deptService.selectDeptDetail(deptno);
		log.info("vo = {}", vo);
		
		model.addAttribute("vo", vo);
		
		return "dept/deptModifyWrite";
	}
	
	/**
	 * 글 수정한다
	 * @param vo 수정한 글의 정보를 담은 vo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "deptModifySave.do")
	public String updateModifySave(DeptVO vo) throws Exception {
		log.info("deptModifySave(vo = {})", vo);
		
		int result = deptService.updateDept(vo);
		if(result == 1) {
			log.info("수정완료");
		} else {
			log.info("수정실패");
		}
		
		return "redirect:deptList.do";
	}
	
}
