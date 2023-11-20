package CAT;

import CAT.interfaces.RadioTv;

public class Car implements RadioTv {
    String color;
    int numberOfSeats;
    int minHeight;
    int maxHeight;
    

    public  Car(String color, int numberOfSeats, int minHeight,int maxHeight) {
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public int getminHeight() {
        return minHeight;
    }

    /**
     * @param address the minHeight to set
     */
    public void setminHeight(int minHeight) {
        this.minHeight = minHeight;
    }

      public int getmaxHeight() {
        return minHeight;
    }

    /**
     * @param address the maxHeight to set
     */
    public void setmaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    
    

    


    
}
