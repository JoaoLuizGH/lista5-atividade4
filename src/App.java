import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner (System.in);
        System.out.print("Por favor informe um número: ");
        int num = tc.nextInt();
        tc.close();
        confere(num);
    }
    
    public static void confere(int num){
        if(num<=0){
            System.out.println("N");
        }else{
            System.out.println("P");
        }
    }
}