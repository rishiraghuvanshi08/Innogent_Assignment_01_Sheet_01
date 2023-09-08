package Assignment_01;

public class Address {
    private int id;
    private int pin_code;
    private String city;
    private int student;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", pin_code=" + pin_code +
                ", city='" + city + '\'' +
                ", student=" + student +
                '}';
    }

    public Address(int id, int pin_code, String city, int student) {
        this.id = id;
        this.pin_code = pin_code;
        this.city = city;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPin_code() {
        return pin_code;
    }

    public void setPin_code(int pin_code) {
        this.pin_code = pin_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }
}
