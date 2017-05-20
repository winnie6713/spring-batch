package com;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.util.CvsHandler;
import com.wyy.dao.PatentDao;

public class UpdateDataBase {
	
	public static final String url = "http://120.27.234.14/patent/";
	public static final String path = "C:/Users/Administrator/Desktop/patent.txt";
	public static String dir = "C:/Users/Administrator/Desktop/发明授权";
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/batch/config/applicationContext.xml");
		PatentDao patentDao = (PatentDao) context.getBean("patentdao");
		Map<String, String> urlMap = new HashMap<>();
		try {
			urlMap = CvsHandler.readFile(dir);
			for(Entry<String, String> entry : urlMap.entrySet()) {
				String id = entry.getKey();
				String pictures = entry.getValue();
				int status = patentDao.updatePatent(id, pictures);
				System.out.println(status);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
