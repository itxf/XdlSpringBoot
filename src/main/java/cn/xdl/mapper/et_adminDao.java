package cn.xdl.mapper;

import org.apache.ibatis.annotations.Param;


import cn.xdl.bean.et_admin;

public interface et_adminDao {
	et_admin findByNameandPassword(@Param("name")String name,@Param("password")String password);
}
