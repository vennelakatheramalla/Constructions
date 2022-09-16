package setExamples;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemoWithStudent {
	public static void main(String[] args) {
//		TreeSet<Student> colors = new TreeSet <>();
//		colors.add("white");
//		colors.add("black");
//		colors.add("blue");
//		colors.add("red");
//		colors.add("green");
//		colors.add("yellow");
//		colors.add(1245);
//		Iterator<String> itr = colors.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		Student s1 = new Student(1, "vani");
		Student s2 = new Student(2, "balu");
		Student s3 = new Student(3, "anil");
		Student s4 = new Student(1, "vani");
		TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		Iterator<Student> itr = students.iterator();
		while (itr.hasNext()) {
			Student student = itr.next();
			System.out.println(student);
		}

	}

}


