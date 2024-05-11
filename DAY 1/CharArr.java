import java.util.Scanner;
public class CharArr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch[]={'a','b','c','d'};
        char c= sc.nextChar();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==c)
            {
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
    
}
