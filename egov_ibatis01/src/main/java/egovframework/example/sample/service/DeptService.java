package egovframework.example.sample.service;

import java.util.List;

public interface DeptService {
	
	/**
	 * 글을 등록한다
	 * @param vo 등록할 정보
	 * @return 
	 * @throws Exception
	 */
	public String insertDept(DeptVO vo) throws Exception;
	
	/**
	 * 글의 목록을 조회한다
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public List<?> selectDeptList(DeptVO vo) throws Exception;
	
	/**
	 * 글을 조회한다 
	 * @param deptno 조회할 글의 번호
	 * @return DeptVo 타입을 반환
	 * @throws Exception
	 */
	public DeptVO selectDeptDetail(int deptno) throws Exception;
	
	/**
	 * 글을 삭제한다
	 * @param deptno 삭제할 글의 번호
	 * @return
	 * @throws Exception
	 */
	public int deleteDept(int deptno) throws Exception;
	
	/**
	 * 글 수저한다
	 * @param vo 수정할 글의 정보를 담은 vo
	 * @return
	 * @throws Exception
	 */
	public int updateDept(DeptVO vo) throws Exception;
	
}
