package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        //List<String> students = new ArrayList<>();

        names.add("Meisam");
        names.add("Sarah");
  //      System.out.println(names.get(0));
//        System.out.println(names.size());
//        names.remove("Meisam");
//        System.out.println(names.get(0));
//        System.out.println(names.isEmpty());

//        //System.out.println(names.indexOf("Prad"));
//
//        for ( int i=0; i< names.size(); i++) {
//            System.out.println(names.get(i));
//        }

        Map<String,String> emailList = new HashMap<>();
        emailList.put("Meisam", "meisam@gmail.com");
        emailList.put("Myself","myself@gmail.com");
        System.out.println(emailList.get("Meisam"));

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("meisam", 78));
        students.add(new Student("Sarah", 43));

        for (Student s: students) {
            System.out.println(s.getName());
        }
    }
}
