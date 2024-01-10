import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *4. Escreva um programa que verifique a validade de uma senha fornecida pelo
usuário. A senha válida é “Ifms@123”. Devem ser impressas as seguintes
mensagens: - ACESSO PERMITIDO caso a senha seja válida. - ACESSO NEGADO caso a */
        Scanner scanner = new Scanner(System.in);
        String senhaAcesso = "Ifms@123";
        String senhaUsuario;
        System.out.println("Digite uma senha válida:  ");
        do {
            senhaUsuario = scanner.next();
            if (senhaUsuario.equals(senhaAcesso)){
                System.out.println("ACESSO PERMITIDO");
            }
            else {
                System.out.println("ACESSO NEGADO");
            }

        }while (!senhaUsuario.equals(senhaAcesso));
    }
}