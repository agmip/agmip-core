package org.agmip.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class FileUtil {
	/**
	 * This utility changes 
	 * 
	 * @param file
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public static LinkedHashMap read(File file) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String json = "";
		while(br.ready()){
			String s = br.readLine();
			json = s.isEmpty() ? json : json + s ;
		}
			return JSONAdapter.fromJSON(json);
	}

}
