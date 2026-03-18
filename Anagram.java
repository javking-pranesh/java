import java.util.*;
class Anagram{

    static boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2 = t.charAt(i);
            freq[ch1 - 'a']++;
            freq[ch2 - 'a']--;
        }
        boolean isAnagram=true;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                isAnagram=false;
                break;
            }
        }
        return isAnagram;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s= in.nextLine().toLowerCase();
        System.out.println("Enter String 2: ");
        String t= in.nextLine().toLowerCase();
        if(isAnagram(s,t)){
            System.out.println(s+" and "+ t +" are Anagram");
        }
        else{
            System.out.println(s+" and "+ t +" are Not an Anagram");
        }


    }
}