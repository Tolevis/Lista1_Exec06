import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        double raio, area;
        
        System.out.println("Digite o Raio do Circulo");
        raio = teclado.nextDouble();

        area = (raio*2);

        System.out.println("A Area do Circulo é: "+ area);

        teclado.close();
    }
}
