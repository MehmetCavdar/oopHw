package oopHw;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lesson lesson1 = new Lesson(1,"c#", "Engin Demirog", 95 ); // örnek, referans, instance olusturma
		
		Lesson lesson2 = new Lesson(1,"Java", "Engin Demirog", 25 );
		
		Lesson lesson3 = new Lesson(1,"Programlamaya giris", "Engin Demirog", 0 );
		
		Lesson lesson4 = new Lesson();

		
		//Dizi tanimlama ssss
		Lesson[] lessons = {lesson1, lesson2, lesson3, lesson4};  //ürünleri diziye ekledik
		
		System.out.println("Dersler:");
		for (Lesson lesson : lessons) {
			System.out.println(lesson.nameLesson);
		}
		
		System.out.println("ders sayisi " + lessons.length);
		System.out.println("-------------------" );
		
		LessonManager lessonManager = new LessonManager() ;  // IS classini newledik
		lessonManager.addToCart(lesson1);  //tanimlanan Class icinden istenen metodu cagirma
		lessonManager.addToCart(lesson2);  
		
		

	}

}
