import com.sun.corba.se.impl.interceptors.PICurrent;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor(){
        return "red";
    }

    public double calculateArea(){
        return radius * radius * Math.PI;
    }
}
