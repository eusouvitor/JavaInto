package projeto1;

import java.util.Scanner;

/**
 *
 * @author vnimschofsky
 */
public class Projeto1 {

   
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int op, v1, v2;
        Controle c = new Controle();
        System.out.println("-----MENU-----");
        System.out.println("1- Soma ");
        System.out.println("2- Subtracao ");
        System.out.println("3- Multipicacao ");
        System.out.println("4- Divisao ");

        op = ler.nextInt();
        switch(op){
            case 1: c.soma(); break;
            case 2: c.subtracao(); break;
            case 3: c.multiplica(); break;
            case 4: c.divisao(); break;
            default: System.out.println("Insira uma opção valida");
        }
        
    }

}
