class Rsequence{
    public static void main(String[] args) {
        String s="oracle error rohit tomcat tree er ###";

        String[] str=s.split(" ");
        System.out.print(str[0]+" ");
        for(int i=0;i<str.length-1;i++){
            int n= str[i].length()-1;
            if(str[i].charAt(n) == str[i+1].charAt(0)){
                System.out.print(str[i+1]+ " ");
            }
            else{
                break;
            }
        }

    }
}