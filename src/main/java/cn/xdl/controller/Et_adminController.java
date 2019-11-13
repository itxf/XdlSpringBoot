package cn.xdl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xdl.bean.et_admin;
import cn.xdl.service.XdlEt_adminService;

@Controller
public class Et_adminController {
	
	@Autowired
	private XdlEt_adminService banketadminService;
	
	
	
	@RequestMapping("/toLogin.do")
	public String tologin() {
		return "login";
	}
	@RequestMapping("/toMain.do")
	public String toMain() {
		return "toMain";
	}
	
	@RequestMapping("/login.do")
	public String login(String name,String password,HttpServletRequest request) {
	et_admin admin=banketadminService.login(name, password);
	if(admin!=null) {
		request.getSession().setAttribute("admin", admin);
		return "redirect:toMain.do";
	}
	return "login";
	}
}
