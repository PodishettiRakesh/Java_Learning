public class Student {
    int student_id;
    String name;
    String grade;
    int age;
    float marks;

    public Student(int id,String name,String grade,int age,float marks){
        this.student_id=id;
        this.name=name;
        this.grade=grade;
        this.age=age;
        this.marks=marks;
    }


    public void Studentdetails(){
        System.out.println("student id is: "+ student_id);
        System.out.println("student name: "+name);
        System.out.println("student grade: "+grade);
    }

   
    public static void main(String[] args) {
        Student rakesh = new Student(1,"Rakesh", "A");
            rakesh.Studentdetails();

        
    }
}
