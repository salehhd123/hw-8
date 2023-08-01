public class Square extends Rectangle{


    public Square() {
    }

    public Square(double side) {
        super.setLength(side);
    }


    public Square(String color, boolean filled, double side) {
        super(color,filled,side);
    }

    public void setSide(double side){
        super.setLength(side);
    }

    public double getSide(){
        return super.getLength();
    }

    @Override
    public String toSting() {
        return "A Square with side= "+ getSide()+", which is a subclass of Rectangle"+ super.toSting();
    }
}
