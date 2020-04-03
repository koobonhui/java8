package Day16;

public class Course<T> {        // ���ϵ�ī�� Ÿ��
	
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {           //������
		this.name = name;
		students = (T[])(new Object[capacity]);
	}   // Ÿ�� �Ķ���ͷ� �迭�� �����Ϸ��� new T[n] ���·� �迭 ���� ���ϰ�
	    // (T[])(new Object[n]) ���� �����ؾ���
	
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
