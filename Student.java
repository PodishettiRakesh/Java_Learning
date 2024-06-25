public class Student {
    int student_id;
    String name;
    char grade;

    public Student(int id,String name,char grade){
        this.student_id=id;
        this.name=name;
        this.grade=grade;
    }

    public void Studentdetails(){
        System.out.println("student id is: "+ student_id);
        System.out.println("student name: "+name);
        System.out.println("student grade: "+grade);
    }


}
