import java.util.Scanner;

public class Extrachar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j;
        String str1= sc.next();
        String str2=sc.next();
        char ch;
        int l1=str1.length();
        int l2= str2.length();
        for(i=0;i<l1;i++)
        {
            for(j=0;j<l2;j++)
            {
                if(str1.charAt(i)==str2.charAt(j)){
                break;
                }
            }
            if(j == l2)
            {
                ch= str1.charAt(i);
            }
        }
        ch= str2.charAt(l2-1);
    }
}
