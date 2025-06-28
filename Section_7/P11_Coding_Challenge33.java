/* 
////////Point Class and Distance Calculation//////
You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.

Write the following methods (instance methods):
Method named getX without any parameters, it needs to return the value of x field.
Method named getY without any parameters, it needs to return the value of y field.
Method named setX with one parameter of type int, it needs to set the value of the x field.
Method named setY with one parameter of type int, it needs to set the value of the y field.
Method named distance without any parameters, it needs to return the distance between this Point and Point (0, 0) as a double.
Method named distance with parameter of type Point, it needs to return the distance between this Point and the parameter Point as a double.
Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x, y as a double.
*/
 
//----------------------------------------------------------------------------------------------------------//

package Section_7;

public class P11_Coding_Challenge33 {
    public static void main(String[] args) {
        
    }
    private int x;
    private int y;
    
    public P11_Coding_Challenge33() {   // 1st Constructor
        
    }
    public P11_Coding_Challenge33(int x, int y) {   // 2nd Constructor
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public double distance() {    // Method
        return distance(0, 0);
    }
    public double distance(P11_Coding_Challenge33 a){    // Method
        return distance(a.x, a.y);
    }
    public double distance(int x, int y){   // Method
        int xDiff = this.x-x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    
}
