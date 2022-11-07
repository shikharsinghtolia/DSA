package OOPs;

public class intro {

     static class Student{
        int  roll ;
        String name ;
        float marks ;

        Student(Float marks,String name,int roll){
            this.marks =marks;
            this.roll =roll;
            this.name =name;
        }

    }
    public static void main(String[] args) {
        
        //declaring a object

        Student shikhar = new Student(87.4f,"Shikhar",12);
        // Student sumit = new Student();
        // sumit.marks = 45.6f;

        //allocation of data to ojbect
        // shikhar.marks =(float) 94.9;
        // shikhar.roll =9;
        // shikhar.name ="Shikhar";
        System.out.println(shikhar.roll);
        System.out.println(shikhar.name);
        System.out.println(shikhar.marks);
        // System.out.println(sumit.roll);
        // System.out.println(sumit.name);
        // System.out.println(sumit.marks);
        
        // System.out.println(Shikhar.name  );
    }
    
}
