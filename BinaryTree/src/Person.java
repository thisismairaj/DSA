public class Person {
    int id;
    String name;
    String address;

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void identification(Person p){
        System.out.println(p);

    }


//    Person(){
//        System.out.println("This is Parent Empty Constructor");
//    }
//
//    public Person(int id, String name, String address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//        System.out.println("THIS IS PARENT ARGS CONSTRUCTOR");
//    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

