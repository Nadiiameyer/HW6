class Book{
    private  String title;
    private String author;
    private String color;
    private double price;


    public Book(String title, String author, String color, double price){
        this.title=title;
        this.author=author;
        this.color=color;
        this.price=price;
    }
    public String getColor(){
        return color;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return"Book: "+title+" (Author: "+author+", Color: "+color+", Price: "+price+")";
    }
}





