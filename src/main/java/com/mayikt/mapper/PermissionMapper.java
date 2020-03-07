package com.mayikt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mayikt.entity.Permission;

public interface PermissionMapper {

	// 查询苏所有权限
	@Select(" select * from sys_permission ")
	List<Permission> findAllPermission();

}
