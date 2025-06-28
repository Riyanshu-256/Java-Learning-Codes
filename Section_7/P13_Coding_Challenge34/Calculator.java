package Section_7.P13_Coding_Challenge34;

public class Calculator {
    private Floor floor;
    private Carpet carpet;
    
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
