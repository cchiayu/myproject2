package com.tom.f;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File dir = new File("C:\\AppServ");//學校資料夾的路徑
		if (dir.exists() && dir.isDirectory()) {
			File[]files = dir.listFiles();
			//String[] files = dir.list();//列出資料夾內的全部檔案
			for(File f : files) {
				System.out.println(f.getName());
			}
		}
		System.out.println(dir.mkdirs());//建立資料夾, 錯誤因為已存在
		File dd = new File(dir,"aaa");//設一新資料夾
		System.out.println(dd.mkdirs());//建立資料夾
		System.out.println(dd.delete());//刪除資料夾(僅能刪除裡面沒東西的資料夾)
			
		}
}

	/*	//FileReader fr = new FileReader("aa.txt");
		File file = new File("aa.txt");
		System.out.println(file.exists());//是否存在
		System.out.println(file.canExecute());//是否可執行
		System.out.println(file.isDirectory());//是否為一個資料夾
		System.out.println(file.length());//顯示file的大小
		System.out.println(file.getAbsoluteFile());//顯示file的全部路徑	*/