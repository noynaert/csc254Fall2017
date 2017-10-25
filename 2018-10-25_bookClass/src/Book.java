public class Book {
    private String title;
    private double price;
    private String isbn;

    public Book(String title, String isbn, double price){
        setTitle(title);
        setIsbn(isbn);
        setPrice(price);
    }
    public Book(){
        this("~no-name","Not_yet_assigned", 0);
    }
    public Book(String title){
        this(title,"~Not yet assigned",0.0);
    }

    public void setTitle(String title) {
        title = title.toUpperCase();
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = (price < 0.0) ? 0.0 : price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn.replace("-", "");
        this.isbn = this.isbn.replace(" ", "");
        //this.isbn = isbn.replace("-", "").replace(" ", "")
    }
    public String getIsbn(){
        return prettyIsbn();
    }
    private String prettyIsbn(){
        String s = isbn.substring(0,3) + "-" + isbn.substring(3);
        return s;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        String s = String.format("%s ISBN: %s,$%1.2f",title, prettyIsbn(),price);
        return s;
    }


}
