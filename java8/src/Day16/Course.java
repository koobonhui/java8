package Day16;

public class Course<T> {        // 와일드카드 타입
	
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {           //생성자
		this.name = name;
		students = (T[])(new Object[capacity]);
	}   // 타입 파라미터로 배열을 생성하려면 new T[n] 형태로 배열 생성 못하고
	    // (T[])(new Object[n]) 으로 생성해야함
	
	public String getName() {
		return name;
	}
	
	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for(int i = 0; i < students.length; i++)
		{
			if(students[i] == null)
			{
				students[i] = t;
				break;
			}
		}
	}
}
