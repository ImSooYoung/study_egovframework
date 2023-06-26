package egovframework.example.sample.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractDAO;
import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.DeptVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository("deptDAO")
public class DeptDAO extends EgovAbstractDAO {
	
	/**
	 * 글을 등록한다
	 * @param vo 등록할 정보가 담긴 DeptVO
	 * @return
	 * @throws Exception
	 */
	public String insertDept(DeptVO vo) {
		log.info("insertDept(vo = {})", vo);
		
		return (String) insert("deptDAO.insertDept", vo);
	}

	/**
	 * 글 목록을 출력
	 * @param vo 
	 * @return
	 * @throws Exception
	 */
	public List<?> selectDeptList(DeptVO vo) {
		log.info("selectDeptList(vo = {})", vo);
		
		return (List<?>) list("deptDAO.selectDeptList", vo);
	}
	
	/**
	 * 글 조회한다
	 * @param deptno 조회할 글의 번호
	 * @return
	 */
	public DeptVO selectDeptDetail(int deptno) {
		log.info("selectDeptDetail(deptno = {})", deptno);
		
		return (DeptVO) select("deptDAO.selectDeptDetail", deptno);
	}

	/**
	 * 글을 삭제한다
	 * @param deptno 삭제할 글의 번호
	 * @return
	 */
	public int deleteDept(int deptno) {
		log.info("deleteDept(deptno ={})", deptno);
		
		return (int) delete("deptDAO.deleteDept", deptno);
	}

	/**
	 * 글을 수정한다
	 * @param vo
	 * @return 
	 */
	public int updateDept(DeptVO vo) {
		log.info("updateDept(vo = {})", vo);
		
		return update("deptDAO.updateDept", vo);
	}

}
