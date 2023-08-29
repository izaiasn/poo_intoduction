package br.senai.sp.poo_introduction.Model;

import java.util.Scanner;

public class Register {
    boolean flag = true;
    //        Instacia objeto Student
    Student objStudent = new  Student();
    //        Instacia objeto Teacher
    Teacher objTeacher = new Teacher();

    Output print = new Output();




    public void RegisterSdudent(){
        Scanner teclado = new Scanner(System.in);




        System.out.println("------------------------------------");
        System.out.print("Hello Student , whats your Name: ");
        objStudent.name = teclado.next();
        System.out.print("How old are you: ");
        objStudent.age = teclado.nextInt();
        System.out.print("Whats your email: ");
        objStudent.email = teclado.next();
        System.out.print("Whats your Frequency: ");
        objStudent.frequency = teclado.nextInt();
        System.out.print("Say me your Phone number: ");
        objStudent.email = teclado.next();
        System.out.print("Say me your grade 1: ");
        objStudent.grade1= teclado.nextInt();
        System.out.print("Say me your grade 2: ");
        objStudent.grade2 = teclado.nextInt();
        System.out.println("-------------------------------------");
        if (flag ){
            print.PrintStudent(objStudent);
        }


    }
    public void RegisterTeacher(){
        Scanner teclado = new Scanner(System.in);
//        Instacia objeto Print



        System.out.println("------------------------------------");
        System.out.print("Hello objTeacher , whats your Name: ");
        objTeacher.name = teclado.nextLine();
        System.out.print("How old are you: ");
        objTeacher.age = teclado.nextInt();
        System.out.print("Whats your email: ");
        objTeacher.email = teclado.next();
        System.out.print("Whats your Specialist: ");
        objTeacher.specalist = teclado.next();
        System.out.print("Say me your Phone number: ");
        objTeacher.phoneNumber = teclado.nextInt();
        System.out.println("-------------------------------------");
        //**como flag já é verdadeira não precisa comparar igualdade */
        if (flag ){
            print.PrintTeacher(objTeacher);
        }


    }

    public void RegisterBoth(){
        flag = false;
        RegisterTeacher();
        RegisterSdudent();
        print.PrintStudent(objStudent);
        print.PrintTeacher(objTeacher);


    }
}
