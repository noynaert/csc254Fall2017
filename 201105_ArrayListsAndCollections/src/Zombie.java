public class Zombie implements Comparable<Zombie> {
    private String name;
    private double health;

    public Zombie(String name, double health) {
        setName(name);
        setHealth(health);
    }
    public Zombie(String name) {
       this(name, 50.0);
    }
    public Zombie(){
        this("shuffler");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
    @Override
    public String toString() {
        return "Zombie{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
    @Override
    public int compareTo(Zombie other){
        int result = 0;
        result = this.name.compareToIgnoreCase(other.name);

        if(result == 0) {
            double difference = this.health - other.health;
            result = (int) (difference * 100.0);
        }

        return result;
    }
}
