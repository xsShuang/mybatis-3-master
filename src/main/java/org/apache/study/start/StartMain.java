package org.apache.study.start;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 根据官方文档快速开始的例子
 * @author xieshuang
 * @date 2021-04-27 17:00
 */
public class StartMain {

  public static void main(String[] args) throws IOException {
    String resource = "org/apache/study/start/SqlSessionFactory.xml";
    // 从文件中获取SqlSessionFactory
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    // SqlSessionFactory 创建 SqlSession
    try (SqlSession session = sqlSessionFactory.openSession()) {
      // 不建议使用的方法，旧版本中的
      SysRole sysRole = session.selectOne("org.apache.study.start.SysRoleMapper.selectSysRole", 1);
      System.out.println(sysRole);

      // 建议使用的方法
      SysRoleMapper mapper = session.getMapper(SysRoleMapper.class);
      SysRole sysRole1 = mapper.selectSysRole(2);
      System.out.println(sysRole1);
    }
  }
}
