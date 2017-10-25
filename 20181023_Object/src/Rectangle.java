public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        this.setWidth(1.0);
        setLength(1.0);
    }
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
    public Rectangle(double side){
        setLength(side);
        setWidth(side);
    }

    public void setLength(double length_IN){
        length = Math.abs(length_IN);
        if(length == 0.0)
            length = 1;
    }

    public void setWidth(double width){
        this.width = Math.abs(width);
        if (this.width == 0)
            this.width = 1.0;
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    @Override
    public String toString(){
        String result = String.format("Length: %f, Width: %f", this.length, width);
        return result;
    }

}
