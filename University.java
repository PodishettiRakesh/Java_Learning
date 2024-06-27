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
        }

    }
}
