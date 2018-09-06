package com.daou.pd.admin.problem;

import java.sql.Date;

public class OptionVO {
//	option_seq int primary key auto_increment,
//	problem_seq int,
//	option_contents varchar(500),
//	answer_yn varchar(100),
//	reg_id varchar(100),
//	reg_date date,
//	upt_id varchar(100),
//	upt_date date,
//	foreign key (problem_seq) references problem_info(problem_seq),
//	foreign key (reg_id) references employee(e_id)

	private int option_seq;
	private int problem_seq;
	private String option_contents;
	private String answer_yn;
	private String reg_id;
	private Date reg_date;
	private String upt_id;
	private Date upt_date;

	public OptionVO() {
	}

	public OptionVO(int option_seq, int problem_seq, String option_contents, String answer_yn, String reg_id,
			Date reg_date, String upt_id, Date upt_date) {
		super();
		this.option_seq = option_seq;
		this.problem_seq = problem_seq;
		this.option_contents = option_contents;
		this.answer_yn = answer_yn;
		this.reg_id = reg_id;
		this.reg_date = reg_date;
		this.upt_id = upt_id;
		this.upt_date = upt_date;
	}

	public int getOption_seq() {
		return option_seq;
	}

	public void setOption_seq(int option_seq) {
		this.option_seq = option_seq;
	}

	public int getProblem_seq() {
		return problem_seq;
	}

	public void setProblem_seq(int problem_seq) {
		this.problem_seq = problem_seq;
	}

	public String getOption_contents() {
		return option_contents;
	}

	public void setOption_contents(String option_contents) {
		this.option_contents = option_contents;
	}

	public String getAnswer_yn() {
		return answer_yn;
	}

	public void setAnswer_yn(String answer_yn) {
		this.answer_yn = answer_yn;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public String getUpt_id() {
		return upt_id;
	}

	public void setUpt_id(String upt_id) {
		this.upt_id = upt_id;
	}

	public Date getUpt_date() {
		return upt_date;
	}

	public void setUpt_date(Date upt_date) {
		this.upt_date = upt_date;
	}

	@Override
	public String toString() {
		return "OptionVO [option_seq=" + option_seq + ", problem_seq=" + problem_seq + ", option_contents="
				+ option_contents + ", answer_yn=" + answer_yn + ", reg_id=" + reg_id + ", reg_date=" + reg_date
				+ ", upt_id=" + upt_id + ", upt_date=" + upt_date + "]";
	}

}
