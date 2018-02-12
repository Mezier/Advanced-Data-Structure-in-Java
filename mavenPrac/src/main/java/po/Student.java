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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", age=" + age +
                '}';
    }
    public Student(){

    }
    public Student(int id, String stuName, int age) {
        this.id = id;
        this.stuName = stuName;
        this.age = age;

    }

}
