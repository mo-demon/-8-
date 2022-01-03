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
		// ����ѧ����Ϣ��TreeSet���϶���
		Set<Test2> stuSet = new TreeSet<Test2>();
		while (true) {
			// ������ʾ
			System.out.println("������ѧ����Ϣ:(ѧ��#����#����)");
			String inputData = input.nextLine();
			// �ж��Ƿ��˳� inputData.equals("exit")
			if ("exit".equals(inputData)) {
				break;
			}
			// ���û������ѧ����Ϣ�ָ�ΪString[]
			@SuppressWarnings("unused")
			String[] info = inputData.split("#");
			// ��������Ϣ��װ��Student������
			Test2 stu = 
new Test2();
			// ��ѧ��������뼯��
			stuSet.add(stu);
		}
		return stuSet;
	}
	private static void outputInfo(Set<Test2> stuSet) {
		File file = new File("e:/student.txt");
		// �����ļ����������
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			Iterator<Test2> it = stuSet.iterator();
			while (it.hasNext()) {
				String info = it.next().toString();
				// ��info�ַ�����д����±�
				fw.write(info);
				// ��ɻ��й���
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