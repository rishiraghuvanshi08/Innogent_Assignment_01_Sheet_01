package Assignment_01;

public class Student {
    private int id;
    private String name;
    private int class_id;
    private float marks;
    private String gender;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", class_id=" + class_id +
                ", marks=" + marks +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(int id, String name, int class_id, float marks, String gender, int age) {
        this.id = id;
        this.name = name;
        this.class_id = class_id;
        this.marks = marks;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
