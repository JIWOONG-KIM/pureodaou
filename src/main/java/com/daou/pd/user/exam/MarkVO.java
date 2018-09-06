package com.daou.pd.user.exam;

public class MarkVO {
	private String problem;
	private String answer;

	public MarkVO() {
	}

	public MarkVO(String problem, String answer) {
		super();
		this.problem = problem;
		this.answer = answer;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "MarkVO [problem=" + problem + ", answer=" + answer + "]";
	}

}
