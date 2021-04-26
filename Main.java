package main;

public final class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Csharp + Angular kampı");
		Course course2 = new Course(2, "Java + React kampı");
		
		
		Course[] courses = {course1, course2};
		for(Course course : courses) {
			System.out.println(course.courseName);
		}
		
		Member m1 = new Member(1, "kadir", 22);
		Member m2 = new Member(2, "engin", 20);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(m1, course1);
		courseManager.addToCourse(m2, course2);
		
		
		courseManager.deleteFromCourse(m1, course1);
		
		
		
	}

}
