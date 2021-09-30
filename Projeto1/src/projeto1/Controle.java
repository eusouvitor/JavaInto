
package projeto1;


public class Controle {
    public static  float v1,v2;
    public void leDados(){
        
        System.out.println("Insira um valor ");
        v1 = Projeto1.ler.nextFloat();
        System.out.println("Insira um novo valor ");
        v2 = Projeto1.ler.nextFloat();
       
    }
    public void soma(){
        leDados();
        System.out.println("Soma :" + (v1 + v2));
    }
    
    public void subtracao(){
        leDados();
        System.out.println("subtração :" + (v1 - v2));
    }
    public void multiplica(){
        leDados();
        System.out.println("subtração :" + (v1 * v2));
    }
    public void divisao(){
        leDados();
        System.out.println("subtração :" + (v1 / v2));
    }
}
