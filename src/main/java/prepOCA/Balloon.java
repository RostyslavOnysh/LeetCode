package prepOCA;

public class Balloon {
    private String colour;
    private float price;

    private static int noOfBalloonsCreated;
    private static float sumOfPrices;
    private static float averagePrice;

    public Balloon(String colour, float price){
        noOfBalloonsCreated++;
        sumOfPrices+=price;
    }

    public Balloon(){
        this("not specified",0.0f);
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice(){
        return price;
    }

    public static int getNoOfBalloonsCreated(){
        return noOfBalloonsCreated;
    }

    public static float getAveragePrice(){
        return sumOfPrices / noOfBalloonsCreated;
    }
}
