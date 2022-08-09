public class Teacher extends Person{

    String role;
    int Salary;
    String schoolName;

    public Teacher(int id, String name, String address, String role, int salary, String schoolName) {
        super(id, name, address);
        this.role = role;
        Salary = salary;
        this.schoolName = schoolName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getSchool() {
        return schoolName;
    }

    public void setSchool(String school) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                ", Salary=" + Salary +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
