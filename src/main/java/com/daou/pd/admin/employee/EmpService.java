package com.daou.pd.admin.employee;

import java.util.List;
import java.util.Map;

public interface EmpService {

	public int selectAdmin(EmpVO evo);

	public int selectUser(EmpVO evo);

	public List<EmpVO> memberList(EmpVO evo);

	public void insertMember(EmpVO evo) throws Exception;

	public int deleteMember(String e_id) throws Exception;

	public EmpVO memberView(EmpVO evo);

	public List<EmpVO> deptList();

	public void updateMember(EmpVO evo) throws Exception;
}
