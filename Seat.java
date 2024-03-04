class Seat{
    private final int MAX=10;
    public int TRD[][][]; //trace the seat booked
    public int TN[][]; //trace the train booked
    private int n,t,s;
    public String dateList[],Date;
    public Seat(){
        TRD=new int[20][3][MAX];
        TN=new int[20][2];
        dateList=new String[20];
        //init();
    }
    public int dateInd(String Date){ //Track dateList
        this.Date=Date;
        for(int i=0;i<dateList.length;i++){
            if(dateList[i]==null || dateList[i].equals(Date)) return i;
        }
        return 0;
    }

    public int returnInd(int n,String d){ //return index of train if seats are booked in train
        this.n=n;
        for(int i=0;i<TN.length;i++){
            if((TN[i][0]==n && TN[i][1]==dateInd(d)) || TN[i][0]==0) return i;
        }
        return 0;
    }
    public void showSeat(int t){
        this.t=t;
        int f=returnInd(n,Date);
        for(int j=0;j<MAX;j++){
            if(TRD[f][t][j]==1) continue;
            System.out.print((j+1)+"\t");
        }
        System.out.println();
    }
}
