class Price{
    int d,c;
    public Price(int d,int c){
        this.d=d;
        this.c=c;
    }
    //Calculate the price according to seat type and distance
    private double priceCal(){ 
        double price;
        if(c==0) price=2*d;
        else if(c==1) price=0.5*d;
        else price=0.3*d;
        return price;
    }
    //method to get price calculated
    public double getPrice(int a){
        if(c==0){
            if(a<5) return 0;
            else return priceCal()*0.05;
        }
        else{
            if(a<5) return 0;
            else if(a<12) return priceCal()/2;
            else return priceCal();
        }
    }
}
