package com.daou.pd.admin.employee;

import java.util.List;

public interface EmpMapper {
	public int selectAdmin(EmpVO evo);

	public List<EmpVO> memberList();

	public int selectUser(EmpVO evo);

	public void insertMember(EmpVO evo) throws Exception;

	public int deleteMember(String e_id);

	public EmpVO memberView(EmpVO evo);

	public List<EmpVO> deptList();

	public void updateMember(EmpVO evo) throws Exception;
}
