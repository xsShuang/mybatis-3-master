package org.apache.study.start;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

/**
 * @author xieshuang
 * @date 2021-04-27 16:57
 */
public interface SysRoleMapper {

  SysRole selectSysRole(Integer id);

  Set<SysRole> LIST();

  @Select(value = "select * from sys_role")
  Set<SysRole> LIST2();
}
