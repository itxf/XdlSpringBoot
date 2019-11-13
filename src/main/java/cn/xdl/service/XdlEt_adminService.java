package cn.xdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.bean.et_admin;
import cn.xdl.mapper.et_adminDao;
@Service("adminService")
public class XdlEt_adminService {
	@Autowired
	private et_adminDao dao;
	
	public et_admin login(String name,String password) {
		return dao.findByNameandPassword(name, password);
	}
}
