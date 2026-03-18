import java.util.*;
class StringFrequency{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Any Word: ");
        String input= in.nextLine().toLowerCase();

        int[] freq=new int[26];
        for(int i=0;i<input.length();i++){
            char ch= input.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }

        for(int i=0;i<26;i++){
            if(freq[i] >0){
                System.out.println((char) (i + 'a') + " Count: "+ freq[i]);
            }
        }
    }
}
