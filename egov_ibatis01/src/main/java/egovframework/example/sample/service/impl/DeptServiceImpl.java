package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;
import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("deptService")
public class DeptServiceImpl extends EgovSampleServiceImpl implements DeptService{

	@Resource(name = "deptDAO")
	private DeptDAO deptDAO;
	
	/**
	 * 글을 등록한다
	 * @param vo 등록할 글의 정보
	 */
	@Override
	public String insertDept(DeptVO vo) throws Exception {
		log.info("insertDept(vo =  {})", vo);
		
		return deptDAO.insertDept(vo);
	}

	/**
	 * 글 목록을 출력한다
	 */
	@Override
	public List<?> selectDeptList(DeptVO vo) throws Exception {
		log.info("selectDeptList(vo = {})", vo);
		
		return deptDAO.selectDeptList(vo);
	}

	/**
	 * 글을 조회한다.
	 * @param deptno 조회할 글의 번호
	 */
	@Override
	public DeptVO selectDeptDetail(int deptno) throws Exception {
		log.info("selectDeptDetail(deptno = {})", deptno);
		
		return deptDAO.selectDeptDetail(deptno);
	}

	/**
	 * 글을 삭제한다
	 * @param deptno 삭제할 글의 번호
	 */
	@Override
	public int deleteDept(int deptno) throws Exception {
		log.info("deleteDept(deptno = {})", deptno);
		
		return deptDAO.deleteDept(deptno);
	}

	/**
	 * 글을 수정한다
	 */
	@Override
	public int updateDept(DeptVO vo) throws Exception {
		log.info("updateDept(vo = {})", vo);
		
		return deptDAO.updateDept(vo);
	}
	
}
