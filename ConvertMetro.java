// exercicio de conversão de metros para centimetros


package convertmetro;

import java.util.Scanner;


public class ConvertMetro {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        int metro = 100;
        System.out.println("Digite uma metragem: ");
        int resp = tec.nextInt();
        int resu = resp * metro;
        System.out.println("Transformamos " + resp + " metro(s) em centimetros e o resuultado é: " + resu + " centimetros!");
          
    }
    
}
