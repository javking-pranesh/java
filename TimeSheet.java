class TimeSheet{
    public static void main(String[] args){
        int[] days={0,8,8,8,10,6,0};
        double[] salary= new double[7];

        for(int i=0;i<7;i++){
            if(i==0){
                salary[i]= (days[i]*100) + (days[i] * 100 * 0.5);
            }
            else if(i==6){
                salary[i]= (days[i]*100) + (days[i] * 100 * 0.25);
            }
            else{
                if(days[i]<=8){
                    salary[i]= days[i]*100;
                }
                else{
                    salary[i]= days[i]*100 + ((days[i] - 8) * 15);
                }
            }

        }
        int sum=0;
        for(int i=0;i<7;i++){
            sum+= salary[i];
        }
        System.out.println("Total Salary: "+ sum);
    }
}