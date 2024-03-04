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

}
