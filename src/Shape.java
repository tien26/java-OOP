public class Shape {
    int getCorner(){
        return 0;
    }
}

/**
 * Rectangel extends Shape
 */
class Rectangel extends Shape {

    int getCorner(){
        return 4;
    }
    
    int getParentCorner(){
        return super.getCorner();
    }
    
}
