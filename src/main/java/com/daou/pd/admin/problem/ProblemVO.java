package com.daou.pd.admin.problem;

import java.sql.Date;
import java.util.List;

public class ProblemVO {
//	problem_seq int primary key auto_increment,
//	problem text,
//	type varchar(100),
//	reg_id varchar(100),
//	reg_date datetime,
//	upt_id varchar(100),
//	upt_date datetime,
//	delete_yn varchar(1),
//	foreign key (reg_id) references employee(e_id)
	private int problem_seq;
	private String problem;
	private String type;
	private String reg_id;
	private Date reg_date;
	private String upt_id;
	private Date upt_date;
	private String delete_yn;
	private List<OptionVO> ovo;

	ProblemVO() {
	}

	public ProblemVO(int problem_seq, String problem, String type, String reg_id, Date reg_date, String upt_id,
			Date upt_date, String delete_yn, List<OptionVO> ovo) {
		super();
		this.problem_seq = problem_seq;
		this.problem = problem;
		this.type = type;
		this.reg_id = reg_id;
		this.reg_date = reg_date;
		this.upt_id = upt_id;
		this.upt_date = upt_date;
		this.delete_yn = delete_yn;
		this.ovo = ovo;
	}

	public int getProblem_seq() {
		return problem_seq;
	}

	public void setProblem_seq(int problem_seq) {
		this.problem_seq = problem_seq;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getDelete_yn() {
		return delete_yn;
	}

	public void setDelete_yn(String delete_yn) {
		this.delete_yn = delete_yn;
	}

	public List<OptionVO> getOvo() {
		return ovo;
	}

	public void setOvo(List<OptionVO> ovo) {
		this.ovo = ovo;
	}

	@Override
	public String toString() {
		return "ProblemVO [problem_seq=" + problem_seq + ", problem=" + problem + ", type=" + type + ", reg_id="
				+ reg_id + ", reg_date=" + reg_date + ", upt_id=" + upt_id + ", upt_date=" + upt_date + ", delete_yn="
				+ delete_yn + ", ovo=" + ovo + "]";
	}

}
