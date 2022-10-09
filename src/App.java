import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
        int a;
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        sc.close();

        System.out.println("O número informado foi: " +a);
    }
}
