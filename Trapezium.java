
class Trapezium{
    public static void main(String[] args) {
        int n=4;
        int left=0;
        int right=n*n+1;
        for(int i=n;i>0;i--){
            for(int j=1;j<=n;j++){
                if((i+j) <= n){
                    System.out.print("--");
                }
                else{
                    System.out.print(++left +"*");
                }
            }
            

            for(int k=n+1;k<= n+i;k++){
                
                System.out.print(right +"*");
                right++;
                if(k== n+i){
                    right= right-(2*i -1);
                }
            }

            System.out.println();
        }
    }
}