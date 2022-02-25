package engday17.main;

import model.Student;

//import model.Student;

public class Main {
	public static void main(String[] args) {

		
		Student s1 = new Student("pera", "aca");
		Student s2 = new Student("aca", "pera");
		
		s1.sendMessage(s1.sayHello(), s2);
		System.out.println(s2.getRecievedMessage());
		
		s2.sendMessage("gde si druze", s1);
		System.out.println(s1.getRecievedMessage());
		
		System.out.println(s1.equals(s1));
		System.out.println(s1.equals(s2));
		

	}

}
