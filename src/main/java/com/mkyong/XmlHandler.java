package com.mkyong;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class XmlHandler {
	
	public static final String url = "http://120.27.234.14/patent/";
	public static final String path = "C:/Users/Administrator/Desktop/patent.txt";
	public static void main(String[] args) throws IOException {
		String dir = "C:/Users/Administrator/Desktop/发明授权";
		readFile(dir);

	}

	private static void readFile(String dir) throws IOException {
		List<File> fileList = new ArrayList<>();
		File file = new File(dir);
		File[] files = file.listFiles();
		if (files == null) {
			return;
		}
		List<String> fileName = new ArrayList<String>();
		try {
			for (File file2 : files) {
				if (file2.isDirectory()) {
					String id = file2.getName();
					File f2 = new File(file2.getAbsolutePath());
					File[] file2s = f2.listFiles();
					if (file2s == null) {
						return;
					}
//					StringBuilder stringBuilder = new StringBuilder();
					for(File file3 : file2s) {
						if (file3.getName().endsWith(".TIF")) {
							String urlName = url + id + "/" + file3.getName();
//							stringBuilder.append(urlName + ";");
							fileName.add(urlName);
//							fileList.add(file3);
							
//							BufferedReader reader = new BufferedReader(new FileReader(file3));
//							BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
//							String temp = null;
//							temp = reader.readLine();
//							while (temp != null) {
//								writer.write(temp + "/r/n"); // 只适用Windows系统
//								temp = reader.readLine();
//							}
//							
//							writer.close();
//							reader.close();
						} 
						
					}
				}

			}

		} catch (Exception e) {
		}

		StringBuilder builder = new StringBuilder();
		for (String name : fileName) {
			builder.append(name + "\r\n");
			File newFile = new File(path);
			if (!newFile.exists()) {
				newFile.createNewFile();
			}
			PrintStream ps = new PrintStream(new FileOutputStream(newFile));
			ps.append(builder.toString());// 在已有的基础上添加字符串
			System.out.println(name);
		}
		System.err.println(fileName.size());

	}
}
