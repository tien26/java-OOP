public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner());
        
        var rectangel = new Rectangel();
        System.out.println(rectangel.getCorner());
        System.out.println(rectangel.getParentCorner());
    }
}
