package com.test.cmd;

import java.util.HashMap;
import java.util.List;

import com.test.biz.TestBiz;
import com.test.vo.TestVO;

public class TestCmd {
	public void selectTest(){
		HashMap<String, String> paramMap = new HashMap<>();
		paramMap.put("testId", "0000000001");
		
		TestBiz biz = new TestBiz();
		List<TestVO> resultList = biz.selectTest(paramMap);
		
		for(TestVO vo:resultList){
			System.out.println(vo.getTestId());
			System.out.println(vo.getTestName());
			System.out.println(vo.getTestDate());
		}
	}
	
	public static void main(String[] args) {
		TestCmd obj = new TestCmd();
		obj.selectTest();
	}
}
