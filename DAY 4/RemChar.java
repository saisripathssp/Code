import java.util.Arrays;

public class RemChar {
    public static void main(String[] args) {
        String s = "abrambabasc";
        System.out.println("given" + s);
        System.out.print("After ");
       
        removeSetofCharacters(s, "ac", "b");
    }
       public static void removeSetofCharacters(String s, String ptn1, String ptn2) {
        int n = s.length(), i;
        int ptr = 0;
        char[] arr1 = s.toCharArray();
        for (i = 0; i < n; ++i) {
             if (arr1[i] == 'b') {
                continue; 
            } else if (i + 1 < n && arr1[i] == 'a' && arr1[i + 1] == 'c') {
                ++i; 
            } else {
                arr1[ptr++] = arr1[i]; 
             }
        }

       
        char[] c = Arrays.copyOfRange(arr1, 0, ptr);
        System.out.println(new String(c));
    }

}
