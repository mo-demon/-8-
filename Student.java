package ex8;

public class Student implements Comparable<Student>{
	private Integer num;
	private String name;
	private Integer age;
	//ʡ��getter��setter����
	//ʡ�Թ��췽��
	public int compareTo(Student stu) {
		return this.age-stu.age;
	}
	public String toString() {
		return "Student [age=" + age + ", name=" + name + 
", num=" + num + "]";
	}
}