package Basics.practice1;

import Basics.practice1.Student;
import Basics.practice1.User;
import Basics.practice1.Mentor;

public class Client {
    public static void main(String[] args) {
        User u = new User();
//        u.userId = 1;
        u.userName="new User";
        u.email = "binitshrest16@gmail.com";
        u.doSomething(12);
//        u.doSomething2(12);
        Student s = new Student();
        s.marks = 50;
        s.department = "Computer science";
        System.out.println("Student marks: " + s.marks + " Department is: "+ s.department);
        System.out.println(u.email);

        User um = new Mentor();
        um.userName="binit shrest";
        um.email="binitshrest16@gmail.com";
//        Mentor x = (Mentor)um;



    }


}
