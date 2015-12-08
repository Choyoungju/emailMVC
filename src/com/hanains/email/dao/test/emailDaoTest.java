package com.hanains.email.dao.test;

import java.util.List;

import com.hanains.email.dao.EmailListDao;
import com.hanains.email.vo.EmailVo;

public class emailDaoTest {

	public static void main(String[] args){
		InsertTest();
		getListTest();
	}
	
	public static void getListTest(){
		EmailListDao dao = new EmailListDao(); 

		List<EmailVo> list = dao.getList();
		
		for(EmailVo vo : list){
			System.out.println(vo);
		}
	}
	
	public static void InsertTest(){
		EmailListDao dao = new EmailListDao();
		EmailVo vo = new EmailVo();
		
		vo.setFirstName("확인");
		vo.setLastName("됨");
		vo.setEmail("ㅋㅋㅋㅋ메일");
		dao.insert(vo);
	}
	
}
