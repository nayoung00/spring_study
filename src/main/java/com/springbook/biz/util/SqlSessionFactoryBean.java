package com.springbook.biz.util;
// SqlSessionFactory 객체를 생성하는 유틸리티 클래스

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryBean {

  private static SqlSessionFactory sessionFactory = null;
  static {
    try {
      if (sessionFactory == null) {
        // sql-map-config.xml 파일로부터 설정 정보를 읽어 들이기 위한 입력 스트림 생성
        Reader reader = Resources.getResourceAsReader("sql-map-config.xml");
        // 스트림을 통해 sql-map-config.xml 파일을 읽어 SqlSessionFactory 객체 생
        sessionFactory = new SqlSessionFactoryBuilder().build(reader);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static SqlSession getSqlSessionInstance() {
    return sessionFactory.openSession();
  }
}
