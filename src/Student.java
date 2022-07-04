public class Student {

    private String name;
    private String surname;
    private int age;
    private String phoneNo;
    private String email;


    public Student() {
    }

    public Student(String name, String surname, int age, String phoneNo, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

