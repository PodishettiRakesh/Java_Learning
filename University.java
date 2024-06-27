public class University {
    private String name;
    public University(String name){
        this.name=name;
    }

    public class Department{
        private String name;
        public Department(String naam){
            this.name=naam;
        }

        public void studentDetails(){
            System.out.println("studnet University: "+this.name);
            System.out.println("studnet DEpartment: "+this.name);
        }
    }

    public static void main(String[] args) {
        University univer=new University(("IIIT-H"));
        Department depart= univer.new Department("MSIT");
        depart.studentDetails();
        Student s1=new Student(03, "ramudu", "A", 36, 53.5f);
        System.out.println(s1.getName());
        
    }
}
