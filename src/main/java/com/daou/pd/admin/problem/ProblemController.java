package com.daou.pd.admin.problem;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProblemController {
	@Autowired
	@Resource(name = "problemService")
	private ProblemService problemService;

	@RequestMapping(value = "admin/problem.do")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("admin/problem/problem");
		mav.addObject("test", problemService.test());
		return mav;
	}
}
