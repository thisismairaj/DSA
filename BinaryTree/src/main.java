public class main {

    public static void main(String[] args) {

//        Student s1=new Student(1,"rahim","b-65",11,"Senoir");
//        Teacher t1= new Teacher(2,"Sarim","johar","Senoir Teacher",10000,"Student Academy");
//
//        s1.identification(s1);
//    t1.identification(t1);
//
//    MountainBike m1 = new MountainBike(20,1,"Red");
//        m1.applyBreak(15);
//        System.out.println(m1);
////        System.out.println(m1);
////        m1.gearUp();
////        System.out.println(m1);
////        m1.applyBrake();
////        System.out.println(m1);
////
////
////        SportsBike sb1 = new SportsBike(20,1,"Red");
////        sb1.gearUp();
////        System.out.println(sb1);
////        sb1.applyBrake();
////        System.out.println(sb1);
////
////        NormalBike nb1 = new NormalBike(20,1,"Red");
////        nb1.gearUp();
////        System.out.println(nb1);
//
//
//    }

        BinaryTree theTree = new BinaryTree();

        theTree.addNode(50, "a");

        theTree.addNode(25, "b");

        theTree.addNode(15, "c");

        theTree.addNode(30, "d");

        theTree.addNode(75, "e");

        theTree.addNode(85, "f");

        // Different ways to traverse binary trees

        theTree.inOrderTraverseTree(theTree.root);

         theTree.preorderTraverseTree(theTree.root);

         theTree.postOrderTraverseTree(theTree.root);

        // Find the node with key 75

        System.out.println("\nNode with the key 75");
        System.out.println(theTree.root);


    }
}
