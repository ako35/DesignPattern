package CreationalDP.FactoryDP;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        Shape circle1=new Circle();
        circle1.draw();

        Shape square1=new Square();
        square1.draw();

        Shape rectangle1=new Rectangle();
        rectangle1.draw();

        System.out.println();

        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("DAIRE");
        Shape shape2=shapeFactory.getShape("DIKDORTGEN");
        Shape shape3=shapeFactory.getShape("KARE");

        shape1.draw();
        shape2.draw();
        shape3.draw();

    }

}
