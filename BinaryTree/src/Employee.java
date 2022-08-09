public class Employee extends Person{

    String designation;
    String company;
    int salaray;

    public Employee(int id, String name, String address, String designation, String company, int salaray) {
        super(id, name, address);
        this.designation = designation;
        this.company = company;
        this.salaray = salaray;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalaray() {
        return salaray;
    }

    public void setSalaray(int salaray) {
        this.salaray = salaray;
    }
}
