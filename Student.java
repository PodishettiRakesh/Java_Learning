
public class Student {
    private int student_id;
    private String name;
    String grade;
    int age;
    private float marks;

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
        System.out.println("student age: "+age);
        System.out.println("Student marks: "+marks);
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
   
    public void message(){
        System.out.println("welcome to the student class");
    }

    public String getName(){
        return this.name;
    }
    public static void main(String[] args) {
        Student rakesh = new Student(1,"Rakesh", "A",25,97.2f);
            rakesh.Studentdetails();
            System.out.println("---after updating student details----");
            rakesh.setName("Podishetti Rakesh");
            rakesh.setAge(26);
            rakesh.Studentdetails();
    }
}
