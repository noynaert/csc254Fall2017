public class Zip {
    String city;
    String state;
    String zip;

    public Zip(String city, String state, String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Zip{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
