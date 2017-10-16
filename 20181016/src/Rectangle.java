public class Rectangle {
    private double length;
    private double width;

    public void setWidth(double in_width){
        width = (in_width <= 0) ? 1.0 : in_width;
    }
    public  void setLength(double in_length){
        length = in_length > 0 ? in_length : 1.0;
    }

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return length * width;
    }
}
