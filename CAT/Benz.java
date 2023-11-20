package CAT;

import CAT.interfaces.AirConditioner;

public class Benz extends Car implements AirConditioner {


    public Benz(String color, int numberOfSeats, int minHeight, int maxHeight) {
        super(color, numberOfSeats, minHeight, maxHeight);
        //TODO Auto-generated constructor stub
    }
    
    void setMaxAndMin(){
        minHeight=200;
        maxHeight=500;
     this.setmaxHeight(maxHeight);
     this.setminHeight(minHeight);
    }
      
}
