package oopHw;

public class Lesson {
	
	
	public Lesson() {
		System.out.println("Constructor  bos yapisi calisti");
	}
	
	public Lesson (int id, String nameLesson, String nameTeacher,double percentage) {
		this.id=id;
		this.nameLesson=nameLesson;
		this.nameTeacher=nameTeacher;
		this.percentage=percentage;
	}
	
	
	int id; 
	String nameLesson;
	String nameTeacher;
	double percentage;

}
