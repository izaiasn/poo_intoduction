import br.senai.sp.poo_introduction.Model.Register;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1 para cadastrar Teacher ou 2 Para cadastrar Student  3 Cadastra Ambos: ");
        opcao = teclado.nextInt();

        if (opcao ==1) {
            Register objRegisterTeacher = new Register();
            objRegisterTeacher.RegisterTeacher();
        }else if (opcao ==2){
                Register objRegisterStudent = new Register();
                objRegisterStudent.RegisterSdudent();


        }else if (opcao == 3) {
            Register objBoth = new Register();
            objBoth.RegisterBoth();
        }
    }
}
