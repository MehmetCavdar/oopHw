package oopHw;


public class LessonManager {
	
	public void addToCart(Lesson lesson) {
		
		System.out.println("Sepete "+ lesson.nameLesson+"  �r�n icin ekleme kodu cagirildi");
	}
	
	public void deleteFromCart(Lesson lesson) {
		
		System.out.println("Sepetten "+ lesson.nameLesson+"  �r�n silindi");
	}

}
