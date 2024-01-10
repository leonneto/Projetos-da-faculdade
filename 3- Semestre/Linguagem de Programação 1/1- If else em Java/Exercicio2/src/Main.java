import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//    As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e
//    R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o
//    número de maçãs compradas, calcule e escreva o

    double calc;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de maças: ");
    int qnt = scanner.nextInt();

    if(qnt < 12){
        calc = qnt * 0.30;
    }
    else{
        calc = qnt * 0.25;

    }
    System.out.println("Valor total da compra: R$ " + calc);
    scanner.close();
}
}