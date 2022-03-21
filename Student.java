package by.it_academy.simpleclass.student;

public class Student {

	private String family;
	private int number;
	private int[] grade;

	public Student() {
		family = "";
		number = 0;
		grade = new int[5];
	}

	public Student(String _family, int _number, int[] _grade) {
		family = _family;
		number = _number;
		grade = _grade;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String _family) {
		family = _family;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int _number) {
		number = _number;
	}

	public int[] getGrade() {
		return grade;
	}

	public void setGrade(int[] _grade) {
		grade = _grade;
	}

	public int getLengthGrade() {
		return grade.length;
	}

}
