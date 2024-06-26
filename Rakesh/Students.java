package Rakesh;

public class Students {
    int student_id;
    String name;
    static String college;


    public Students(int student_id,String name){
        this.student_id=student_id;
        this.name=name;
        Students.college="IITH";
    }

     public void Studentdetails(){
        System.out.println("student id is: "+ student_id);
        System.out.println("student name: "+name);
        System.out.println("college name is: "+Students.college);
    }
}

