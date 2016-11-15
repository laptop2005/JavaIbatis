package com.test.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.test.conf.MyAppSqlMapConfig;
import com.test.vo.TestVO;

public class TestDAO {
	@SuppressWarnings("unchecked")
	public List<TestVO> selectTest(HashMap<String, String> paramMap) throws SQLException {
		SqlMapClient sqlMap = MyAppSqlMapConfig.getSqlMapInstance();
		List<TestVO> testList = (List<TestVO>) sqlMap.queryForList("test.selectTest", paramMap);
		return testList;
	}

}
