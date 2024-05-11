import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        
        int h=100,f=50,t=20,ten=10, five=5, two=2,one=1, notes;
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        notes=cash/100;
        System.out.println(notes);
        cash=cash%100;
        notes=cash/50;
        System.out.println(notes);
        cash=cash%50;
        notes=cash/20;
        System.out.println(notes);
        cash=cash%20;
        notes=cash/10;
        System.out.println(notes);
        cash=cash%10;
        notes=cash/5;
        System.out.println(notes);
        cash=cash%5;
        notes=cash/2;
        System.out.println(notes);
        cash=cash%2;
        notes=cash/1;
        System.out.println(notes);
        cash=cash%1;
        
    }
    
}
