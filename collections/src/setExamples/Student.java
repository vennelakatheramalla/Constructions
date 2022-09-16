package setExamples;

import java.util.HashSet;
import java.util.Iterator;

public class Student {
	
		private int id;
		private String name;

		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}

//		@Override
//		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + id;
//			result = prime * result + ((name == null) ? 0 : name.hashCode());
//			return result;
//		}

		public static void main(String[] args) {
			Student s1 = new Student(1, "anil");
			System.out.println(s1.hashCode());
			Student s2 = new Student(1, "anil");
			System.out.println(s2.hashCode());
			Student s3 = new Student(1, "anil");
			System.out.println(s3.hashCode());
			Student s4 = new Student(2, "anil");
			System.out.println(s4.hashCode());

			HashSet<Student> students = new HashSet<Student>();
			students.add(s1);
			students.add(s2);
			students.add(s3);
			students.add(s4);

			Iterator<Student> itr = students.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
//			Student s5 =s1;
		}

		// add all, removeall, retain all, containsall
		// contains, containsall, get, 
		// add, addelement, push, offer, element
		// set, replace, replaceall
		// iterator, for each, list iterator, foreach method in java 8

//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Student other = (Student) obj;
//			if (id != other.id)
//				return false;
//			if (name == null) {
//				if (other.name != null)
//					return false;
//			} else if (!name.equals(other.name))
//				return false;
//			return true;
//		}
	}

//}

