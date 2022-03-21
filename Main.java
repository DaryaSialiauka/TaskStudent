package by.it_academy.simpleclass.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static Student init(String _family, int _number, int[] _grade) {

		Student s = new Student(_family,_number,_grade);

		/*
		 * s.setFamily(_family); s.setNumber(_number); s.setGrade(_grade);
		 */

		return s;
	}

	private static List<String> initlist() {

		List<String> strings = new ArrayList<String>();
		try {
			File file = new File("/source.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				strings.add(scanner.nextLine());
			}
			scanner.close();
		} catch (

		FileNotFoundException e) {

			e.printStackTrace();

		}

		return strings;
	}

	public static void findstudent(Student[] s) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Выедите оценку:");
		int g = sc.nextInt();

		for (int i = 0; i < s.length; i++) {
			boolean b = true;
			int[] _grade = s[i].getGrade();
			for (int j = 0; j < s[i].getLengthGrade(); j++) {
				if (_grade[j] < g) {
					b = false;
				}
			}
			if (b) {
				printstudent(s[i]);
			}
		}
	}

	public static void printstudent(Student s) {
		String g = "";

		for (int i : s.getGrade()) {
			g = g + i + " ";
		}

		System.out.println(s.getFamily() + ", № группы: " + s.getNumber() + " оценки: " + g);
	}

	public static void main(String[] args) {

		Student[] s = new Student[10];
		Random r = new Random();

		List<String> str = initlist();

		for (int i = 0; i < s.length; i++) {

			int _grade[] = new int[5];
			for (int j = 0; j < 5; j++) {
				_grade[j] = r.nextInt(5, 11);
			}

			s[i] = init(str.get(i).toString(), r.nextInt(1, 10), _grade);
		}

		while (true) {
			findstudent(s);
		}
	}
	
}
