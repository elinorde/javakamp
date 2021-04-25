package hw1;

public class Main {

	public static void main(String[] args) {
		
	 Course course1=new Course(1, "Yazılım geliştirici yetiştirici kampı (C# & Angular", "Engin Demiroğ", "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.");
	Course course2=new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (JAVA & REACT)", "Engin Demiroğ", "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.");
	Course course3=new Course(3, "Programlamaya giriş için temel kurs", "Engin Demiroğ", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.");
	
		
	  Course[] courses= { course1, course2, course3 };

	 
	  
	  for(Course course: courses) {
		  System.out.println(course.name);
		  
	  }
	  
	  System.out.println("Dizinin uzunluğu:  "+ courses.length);
	  
	  
	  
	  //Metotlar
	  Manager openCourse=new Manager();
	  openCourse.OpenCourse(course1);
	  
	  Manager joinCourse=new Manager();
	  joinCourse.JoinCourse(course3);
	  
	}


}