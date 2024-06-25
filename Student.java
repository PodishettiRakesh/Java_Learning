public class Student {
    int student_id;
    String name;
    String grade;

    public Student(int id,String name,String grade){
        this.student_id=id;
        this.name=name;
        this.grade=grade;
    }


    public void Studentdetails(){
        System.out.println("student id is: "+ student_id);
        System.out.println("student name: "+name);
        System.out.println("student grade: "+grade);
    }

    public static void main(String[] args) {
        Student rakesh = new Student(01,"Rakesh","A"){
            x=rakesh.Studentdetails();

        }
    }


}
