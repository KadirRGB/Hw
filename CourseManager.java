package main;

public class CourseManager {

	public void addToCourse(Member member, Course course) {
		System.out.println(member.name + " is added to "+ course.courseName);
	}
	public void deleteFromCourse(Member member, Course course) {
		System.out.println(member.name + " is deleted from "+ course.courseName);
	}

}
