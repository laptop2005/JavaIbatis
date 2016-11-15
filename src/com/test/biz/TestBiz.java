package com.test.biz;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.test.dao.TestDAO;
import com.test.vo.TestVO;

public class TestBiz {
	public List<TestVO> selectTest(HashMap<String,String> paramMap){
		List<TestVO> resultList = null;
		TestDAO obj = new TestDAO();
		try {
			resultList = obj.selectTest(paramMap);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultList;
	}
}
