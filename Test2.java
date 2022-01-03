package ex8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
	public static void main(String[] args) {
		Set<Test2> stuSet = saveStudentInfo();
		outputInfo(stuSet);
	}
	private static Set<Test2> saveStudentInfo() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		// 保存学生信息的TreeSet集合对象
		Set<Test2> stuSet = new TreeSet<Test2>();
		while (true) {
			// 输入提示
			System.out.println("请输入学生信息:(学号#姓名#年龄)");
			String inputData = input.nextLine();
			// 判断是否退出 inputData.equals("exit")
			if ("exit".equals(inputData)) {
				break;
			}
			// 将用户输入的学生信息分割为String[]
			@SuppressWarnings("unused")
			String[] info = inputData.split("#");
			// 将输入信息封装到Student对象中
			Test2 stu = 
new Test2();
			// 将学生对象加入集合
			stuSet.add(stu);
		}
		return stuSet;
	}
	private static void outputInfo(Set<Test2> stuSet) {
		File file = new File("e:/student.txt");
		// 创建文件输出流对象
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			Iterator<Test2> it = stuSet.iterator();
			while (it.hasNext()) {
				String info = it.next().toString();
				// 将info字符串，写入记事本
				fw.write(info);
				// 完成换行功能
				fw.write("\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}