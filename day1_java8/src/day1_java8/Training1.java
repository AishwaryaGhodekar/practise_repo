package day1_java8;

public class Training1 {
	String name;
	int course_id;
	
	
	
	public Training1(String name, int course_id) {
		super();
		this.name = name;
		this.course_id = course_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	@Override
	public String toString() {
		return "Training1 [name=" + name + ", course_id=" + course_id + "]";
	}

}
