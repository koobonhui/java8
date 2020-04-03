package Day16;

import java.util.Arrays;

public class WildCardEx {

		public static void registerCourse(Course<?> course) {
			System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents())); // 배열을 문자열로 변형하는게 arrays.tostring
		}
		
		public static void registerCourseStudent(Course<? extends Student> course) {
			System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
		}
		
		public static void registerCourseWorker(Course<? super Worker> course) {
			System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
		}
		
		public static void main(String[] args) {
			
			Person person = new Person("일반인");
			Worker worker = new Worker("직장인");
			Student student = new Student("학생");
			HighStudent highStudent = new HighStudent("고딩");
			
			Course<Person> personCourse = new Course<>("일반인코스", 5);
			
			personCourse.add(person);
			personCourse.add(worker);
			personCourse.add(student);
			personCourse.add(highStudent);
			
			registerCourse(personCourse);
//			registerCourseStudent(personCourse);  // 학생을 최상위로 해야해서 안됨
			registerCourseWorker(personCourse);
			
			System.out.println("====================");
			
			Course<Student> studentCourse = new Course<Student>("학생코스", 5);
			
//			studentCourse.add(person); 
//			studentCourse.add(worker);
			studentCourse.add(student);
			studentCourse.add(highStudent);
			
			registerCourse(studentCourse);
			registerCourseStudent(studentCourse);
//			registerCourseWorker(studentCourse);
			
			System.out.println("====================");
			
			Course<Worker> workerCourse = new Course<Worker>("직장인코스", 5);
			
//			workerCourse.add(person);
			workerCourse.add(worker);
//			workerCourse.add(student);
//			workerCourse.add(highStudent);
			
			registerCourse(workerCourse);
//			registerCourseStudent(workerCourse);
			registerCourseWorker(workerCourse);
		}
}
