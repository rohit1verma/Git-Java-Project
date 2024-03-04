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
