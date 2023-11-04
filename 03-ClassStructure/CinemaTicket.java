public class CinemaTicket {
    
    static String cinemaName;
    String filmTitle;
    int row;
    int seat;
    double price;
    
   
    
    public CinemaTicket(String f, int r, int s){
        filmTitle = f;
        row = r;
        seat = s;
        if (r<=2){
            price = 10;
        } else {
            price = 25;
        }
    };
    public void display() {
        System.out.println(cinemaName +", " + filmTitle +", row " + row + ", seat "+seat+", price: "+price);
    };
    public static void main(String[] args){
        CinemaTicket.cinemaName = "Impression Cinema";
        CinemaTicket t1 = new CinemaTicket("Gladiator",2,20);
        CinemaTicket t2 = new CinemaTicket("Gladiator",7,30);
        
        t1.display();
        t2.display();
    };
}