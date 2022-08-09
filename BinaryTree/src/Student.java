public class Student extends Person {
    int rollNo;
    String className;



//    public Student(Integer id,String name,String address,int rollNo){
//        super(id,name,address);
//        System.out.println("THIS IS DERIVED CHILD CONSTRUCTOR");
//        this.rollNo = rollNo;
//       // super(id,name,address);
//
//    }
//
//    public Student(Integer id){
//        //this.id = id;
//        this(id,"UNKNOWN","UNKNOWN",12);
//        System.out.println("THIS IS ONE ARG CHILD CONSTRUCTOR");
//
//    }
//
    public Student(int id, String name, String address, int rollNo, String className) {
        super(id, name, address);
        this.rollNo = rollNo;
        this.className = className;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rollNo=" + rollNo +
                ", className='" + className + '\'' +
                '}';
    }
}
