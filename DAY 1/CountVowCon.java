import java.util.Scanner;

public class CountVowCon {
    public static void main(String[] args) {
        int vowels=0; int consonents=0; int digits=0; int wSpaces=0;
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if((ch>='a' &&ch<='z')||(ch>='A'&&ch<='Z'))
            {
                ch = Character.toLowerCase(ch); 
                if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u')
                {
                    vowels++;
                }
                else{
                    consonents++;
                }

            }
            else if(ch>='0' && ch<='9')
            {
                digits++;
            }
            else{
                wSpaces++;
            }
        }
        System.out.println("vowels are : "+vowels);
        System.out.println("consonents are : "+consonents);
        System.out.println("digits are : "+digits);
        System.out.println("wSpaces are : "+wSpaces);
    }
}
