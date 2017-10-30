public class Person {
    private String name;
    private double height;

    public Person(String name, double height) {
        setHeight(height);
        setName(name);
    }
    public Person(String name){
        this(name,0.0);   //note lack of a period.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return (height == 0.0) ? Double.NaN : height;
    }

    public void setHeight(double height) {
        this.height =(height < 0.0)? 0.0 : height;
    }
    public boolean hasHeight(){
        return (height > 0.0);
    }

    @Override
    public String toString() {
        String result = name;
        if(this.hasHeight()){
            result = String.format("%s (%1.1f inches)", name, height);
        }
        return result;
    }
    public int compareTo(Person other){
            int result = this.name.compareTo(other.name);
            if(result == 0){
                result = (int)( (this.height - other.height)*10);
            }
            return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (Double.compare(person.height, height) != 0) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
