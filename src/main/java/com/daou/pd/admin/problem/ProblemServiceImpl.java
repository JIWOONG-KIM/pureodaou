package com.daou.pd.admin.problem;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component("problemService")
public class ProblemServiceImpl implements ProblemService {
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	private ProblemMapper problemMapper;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public ProblemVO test() {
		problemMapper = sqlSession.getMapper(ProblemMapper.class);
		return problemMapper.test();
	}
}
