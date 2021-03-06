/**
 * @author Ian Nara
 * @author Andrew Taylor
 */
public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return name + " " + score;
	}
	
	//compare by string alphabetically
	@Override
	public int compareTo(Student arg0) {
		return name.compareTo(arg0.name);
	}
	
}
