package Rakesh;

public class Students {
    int student_id;
    String name;
    String college;


    public Students(int student_id,String name,String college){
        this.student_id=student_id;
        this.name=name;
        this.college=college;
    }

     public void displaydetails(){
        System.out.println("student id is: "+ student_id);
        System.out.println("student name: "+name);
        System.out.println("college name is: "+college);
    }
}

