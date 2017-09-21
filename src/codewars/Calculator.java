package codewars;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    public double getTotalArea(){
        return 0;
    }


    public double getTotalArea(Triangle triangle){

        BigDecimal rounded = new BigDecimal(triangle.triangleHeight*triangle.triangleBase/2).setScale(2, RoundingMode.HALF_EVEN);

        return rounded.doubleValue();
    }

    public double getTotalArea(Square square){

         BigDecimal rounded = new BigDecimal(Math.pow(square.side,2)).setScale(2, RoundingMode.HALF_EVEN);

        return rounded.doubleValue();


    }

    public double getTotalArea(Circle circle){

        BigDecimal rounded = new BigDecimal(Math.PI*Math.pow(circle.radius,2)).setScale(2, RoundingMode.HALF_EVEN);

        return rounded.doubleValue();
    }

    public double getTotalArea(Rectangle rectangle){

        BigDecimal rounded = new BigDecimal(rectangle.width * rectangle.height).setScale(2, RoundingMode.HALF_EVEN);
            return rounded.doubleValue();


    }

    public double getTotalArea(Object... shapes){

        double totalSum = 0;

        for(Object o : shapes){
            if(o instanceof Triangle){
                totalSum += (((Triangle) o).triangleBase * ((Triangle) o).triangleHeight/2);
            }
            if(o instanceof Square){
                totalSum += ((Square) o).side*((Square) o).side;
            }
            if(o instanceof Circle){
                totalSum += Math.PI*((Circle) o).radius*((Circle) o).radius;
            }
            if(o instanceof Rectangle){
                totalSum += ((Rectangle) o).height*((Rectangle) o).width;
            }
        }
        BigDecimal rounded = new BigDecimal(totalSum).setScale(2, RoundingMode.HALF_EVEN);

        return rounded.doubleValue();
    }


}

class Triangle{
    double triangleBase;
    double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight){
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }
}

class Square{

    double side;

    public Square(double side){
        this.side = side;
    }

}

class Rectangle{

    double height;
    double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

}

class Circle{

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

}