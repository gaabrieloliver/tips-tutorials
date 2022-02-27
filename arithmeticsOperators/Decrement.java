import java.util.Scanner;
public class Decrement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        int num = 10;
        
        int valor = 4 + --num; 
        /* PRÉ-DECREMENTO
         * 1ªpasso : 4 + 9 = 13
         * 2ªpasso: (10 - 1) = 9
         * 
         * -- 1ª passo: Ou seja, antes de fazer a operação de soma 
         *       ele vai tirar -1 do número 10, isso fica 9, depois vai
         *       fazer 4 + 9, isso vai dar 13. 
         * -- 2ª passo: Depois ele vai tirar -1 do número 10, isso fica 9.
         */
        
        int valor = 4 + num--;
        /* DECREMENTO
         * 1ªpasso : 4 + 10 = 14
         * 2ªpasso: (10 - 1) = 9
        
         * -- 1ªpasso: Ou seja, ele vai fazer 4 + 10 e 
         *             isso vai dar 14. 
         * -- 2ªpasso: Depois ele vai tirar -1
         *             do número 10.
         */
        
        System.out.println(valor);
        System.out.println(num);
    }
    
}
