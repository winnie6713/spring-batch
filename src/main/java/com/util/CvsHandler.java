package com.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CvsHandler {

	public static final String url = "http://120.27.234.14/patent/";
	public static final String path = "C:/Users/Administrator/Desktop/patent.txt";
	public static String dir = "C:/Users/Administrator/Desktop/发明授权";

	public static Map<String, String> readFile(String dir) throws IOException {
		Map<String, String> map = new HashMap<>();
		File file = new File(dir);
		File[] files = file.listFiles();
		if (files == null) {
			return new HashMap<>();
		}
		List<String> fileName = new ArrayList<String>();
		try {
			for (File file2 : files) {
				if (file2.isDirectory()) {
					String id = file2.getName();
					File f2 = new File(file2.getAbsolutePath());
					File[] file2s = f2.listFiles();
					if (file2s == null) {
						continue;
					}
					StringBuilder builder = new StringBuilder();
					for (File file3 : file2s) {
						if (file3.getName().endsWith(".TIF")) {
							String urlName = url + id + "/" + file3.getName();
							builder.append(urlName + ";");
						}
					}
					fileName.add(builder.toString());
					String string = builder.toString();
					String url = "";
					if (!string.isEmpty()) {
						url = string.substring(0, string.lastIndexOf(";"));
					}
					map.put(id, url);
					builder.setLength(0);
				}

			}

		} catch (Exception e) {
		}

		// StringBuilder builder = new StringBuilder();
		// for (String name : fileName) {
		// builder.append(name + "\r\n");
		// File newFile = new File(path);
		// if (!newFile.exists()) {
		// newFile.createNewFile();
		// }
		// PrintStream ps = new PrintStream(new FileOutputStream(newFile));
		// ps.append(builder.toString());// 在已有的基础上添加字符串
		// }
		return map;
	}

}
