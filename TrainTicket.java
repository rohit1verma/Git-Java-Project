import java.util.*;
import java.text.*;
class Train{
    String name;
    char G; //G:gendar
    int age; 
    private String source,dest,stime,etime,seatNO,date,day;
    private int dist,trainNo,speed;
    double price;
    public Train(String name,char G,int age,String source,String dest,String stime,String etime,int dist,double price,int trainNo,int speed,String seatNO,String date,String day){
        this.name=name;
        this.G=G;
        this.age=age;
        this.source=source;
        this.dest=dest;
        this.stime=stime;
        this.etime=etime;
        this.dist=dist;
        this.price=price;
        this.trainNo=trainNo;
        this.speed=speed;
        this.seatNO=seatNO;
        this.date=date;
        this.day=day;
    }
    public String getSeat(){
        return seatNO;
    }
    public String getDate(){
        return date;
    }
    public int getTrainNo(){
        return trainNo;
    }
    public void showRep(int pin){ //Method to print Receipt
        System.out.println("*-----------------------------------------------------------*");
        System.out.println("\t\t\tINDIAN RAILWAY\t\t\t");
        System.out.println("\t*******************************\t");
        System.out.println("\t\t---Passenge Info---\t\t");
        System.out.print("Name:"+name);
        System.out.print("\tGender:"+G);
        System.out.println("\tAge:"+age);
        System.out.println();
        System.out.println("\t\t---Train Info---\t\t");
        System.out.println("PIN:"+pin+"\t\tDate: "+date+"  Day: "+day);
        System.out.println("Train Number:"+trainNo+"\t"+"Seat:"+seatNO+"\t"+"TotalPrice:"+(float)price+" Rs");
        System.out.println("Source:"+source+"\t"+"Arrival Time:"+stime);
        System.out.println("Destination:"+dest+"\t"+"Reaching Time:"+etime);
        System.out.println("Distance:"+dist+"km"+"\tAvg.speed:"+speed+"Km/h");
        System.out.println("*-----------------------------------------------------------*");
    }
    public void showList(int sn){ 
        System.out.println(sn+"\t"+name+"\t"+age+"-"+G+"\t"+source+"-"+dest+"\t\t"+trainNo+"\t"+seatNO+"\t"+stime+"-"+etime);
    }
}
