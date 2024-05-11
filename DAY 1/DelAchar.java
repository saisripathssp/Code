public class DelAchar {
    public static void main(String[] args) {
       
        String str ="Hello, have a good day";
        char ch[] = str.toCharArray();
        char ch1[] = new char[100];
        char ch2[] = new char[100];
        for(int i =0;i<str.length();i++)
        {
            
            if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z'))
            {
              
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
                {
                  ch1[i]=ch[i];  
                }
                else{
                  ch2[i]=ch[i]; 
                    
                }
            }
            System.out.print(ch2[i]);
            
        }
        System.out.print("\n");
    }
}
