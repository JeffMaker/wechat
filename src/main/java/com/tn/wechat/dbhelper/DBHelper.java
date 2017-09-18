package com.tn.wechat.dbhelper;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Get sqlsession function
 */
public class DBHelper{
	public SqlSession getSqlSession() throws IOException{
		//ͨ�������ļ���ȡ���ݿ�����
		Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
		//��ȡsqlsessionfactory
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		//ͨ��sqlsessionfactory��һ��session
		SqlSession sqlSession = ssf.openSession();
		return sqlSession;
	}
}
