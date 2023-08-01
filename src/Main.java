// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle("white",true,3);

        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        System.out.println(c1.toSting());


        Rectangle r1 = new Rectangle("white",false,3,3);
        System.out.println(r1.toSting());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());


        Square s1 = new Square(10);
        System.out.println(s1.getSide());
        s1.setSide(100);
        System.out.println(s1.getSide());

    }
}