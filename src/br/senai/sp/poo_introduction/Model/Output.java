package br.senai.sp.poo_introduction.Model;

public class Output {
    public void PrintTeacher (Teacher teacher){

        System.out.println("your data are: " + " name: "+ teacher.name + " Email: " + teacher.email
                + " Phone Number: " + teacher.phoneNumber + " Specialist: " + teacher.specalist + " Age: "+ teacher.age );

    }
    public  void PrintStudent(Student objStudent){

        System.out.println("your data: " + " name: "+ objStudent.name + " Email: " + objStudent.email +"Your Age: " +objStudent.age+
                " Frequency: " + objStudent.frequency+ " Grade 1: " + objStudent.grade1 + " Grade 2 "+  objStudent.grade2  );

    }

}
