package com.daou.pd.admin.board;


import javax.annotation.Resource;

import java.util.List;

import org.springframework.stereotype.Component;
import org.apache.ibatis.session.SqlSession;
import com.daou.pd.user.exam.ExamVO;

@Component("boardService")
public class BoardServiceImpl implements BoardService {

	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	private BoardMapper boardMapper;
	
	/*@Autowired
	private BoardDAO boardDAO;*/

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<BoardVO> degreeList() {
		boardMapper = sqlSession.getMapper(BoardMapper.class);
		return boardMapper.degreeList();
	}
	
	@Override
	public List<BoardVO> deptList() {
		boardMapper = sqlSession.getMapper(BoardMapper.class);
		return boardMapper.deptList();
	}
	
	@Override
	public List<BoardVO> gradeList() {
		boardMapper = sqlSession.getMapper(BoardMapper.class);
		return boardMapper.gradeList();
	}
	
	@Override
	public int selectTarget(ExamVO exvo) {
		boardMapper = sqlSession.getMapper(BoardMapper.class);
		return boardMapper.selectTarget(exvo);
	}
	
	@Override
	public int selectTargetDo(ExamVO exvo) {
		boardMapper = sqlSession.getMapper(BoardMapper.class);
		return boardMapper.selectTargetDo(exvo);
	}
	
	@Override
	public int selectPass(ExamVO exvo) {
		boardMapper = sqlSession.getMapper(BoardMapper.class);
		return boardMapper.selectPass(exvo);
	}
	
	@Override
	public int selectSetCount(ExamVO exvo) {
		boardMapper = sqlSession.getMapper(BoardMapper.class);
		return boardMapper.selectSetCount(exvo);
	}
	

	
	/*public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}
 
	@Override
	public List<List<Map<Object, Object>>> getCanvasjsChartData() {
		return boardDAO.getCanvasjsChartData();
	}*/

}
