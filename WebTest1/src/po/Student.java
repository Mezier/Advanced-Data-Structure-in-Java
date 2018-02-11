package po;

public class Student {
	private int id;
	private String stuName;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int id, String stuName, int age) {
		super();
		this.id = id;
		this.stuName = stuName;
		this.age = age;
	}
  public Student(){}
	@Override
	public String toString() {
		return "StudentDao [id=" + id + ", stuName=" + stuName + ", age=" + age + "]";
	}
}
