package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.stu.service.StudentService;

import com.alibaba.dubbo.config.annotation.Reference;

//@ResponseBody
//@Controller
@RestController
@RequestMapping("controller")
public class StudentController {
	@Reference
	private StudentService stuService;
	
	@RequestMapping("rpcServer")
	public String rpcServer(){
		String result = stuService.server("zhangsan");
		return result;
	}
	
}
