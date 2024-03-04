class TrainRev{
    final int TotalTrain=5; 
    String source;
    String dest;
    String date,day;
   // int speed=70;
    private int T[]; //temp array store total time
    public TrainRev(String S,String D,String d,String da){
        source=S;
        dest=D;
        date=d;
        day=da;
    }
    public int Distance(){
        return (source.length()*100+dest.length());
    }
    private int[] TrainNo(){ //Generate train no
        int speed=70;
         int N[]=new int[3];
         T=new int[3];
         for(int j=0;j<3;j++){
            N[j]=(source.charAt(0)+dest.charAt(j))*speed;
            int t1=Distance()/speed;
            double temp=(Distance()/(double)speed-t1)*100;
            int t2=(int)temp;
            T[j]=t1*100+t2;
            speed=speed+10;
         }
         return N; 
    }
private int Stime(int ind){ //Generate arrival time
        int dc=day.charAt(0)-'A'; 
        int dec=dest.charAt(ind)-'a';
        double hour=(((dc+dec)/2+1)*55/60.0)*100;
        return (int)hour;
    } 
    private String[][] Time(){ //get array of time cooresponds to trainno
        String time[][]=new String[3][2];
        int temp[]=new int[2];
        for(int j=0;j<3;j++){
            temp[0]=Stime(j);temp[1]=T[j]+Stime(j);
            for(int k=0;k<2;k++){
                int t1=temp[k]/100;
                int t2=temp[k]%100;
                if(t2>60){
                    t2=t2%60;
                    t1++;
                }
                if(t1>23) t1=t1-23;
                time[j][k]=t1+":"+t2;
            }
        }
        return time;
    }
    public void showTrain(){
        System.out.println("List of Trains:");
        System.out.println("\tTrain No   \tArr Time\tDeparch Time");
        for(int j=0;j<3;j++) System.out.println((j+1)+".    \t"+TrainNo()[j]+"    \t"+Time()[j][0]+"    \t"+Time()[j][1]);
    }
    public int getNo(int c){
        return TrainNo()[c];
    }
    public String[] getTime(int c){
        return Time()[c];
    }
}
