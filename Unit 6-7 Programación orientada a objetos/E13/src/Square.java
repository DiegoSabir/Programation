public class Square extends Figure{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor(){
        return "yellow";
    }

    public double calculateArea(){
        return side * side;
    }
}
