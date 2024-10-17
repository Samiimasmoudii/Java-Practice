// Java code​​​​​​‌​‌‌‌‌‌‌​​‌​‌​​‌‌​​‌​‌‌‌‌ below
/*****************************************************
Write your answer here, and then test your code.
Update Shirt class to implement the Product interface.
******************************************************/ 
class Answer {

    /***************************************************
    Change these boolean values to control whether you see
    the expected result and/or hints.
    ****************************************************/ 
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Do not change this method
    static Shirt buyShirt(String name, double price, String size, String color) {
        return new Shirt(name, price, size, color);
    }
}

// Do not change this interface
interface Product {
    String getName();
    void setName(String name);
    double getPrice();
    void setPrice(double price);
}

/**********************************************************
TODO: Update this class to implement the Product interface.
***********************************************************/ 
class Shirt implements Product{
    private String size;
    private String color;
    private String name;
    private double price;

    public Shirt(String name, double price, String size, String color){
        setSize(size);
        setColor(color);
        setName(name);
        setPrice(price);
    }

    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
	public String getName() {
		return this.name;
	}
	public double getPrice() {
        return this.price;
	} 
    public void setName(String newName) {
		this.name=newName;
	}
	public void setPrice(double newPrice) {
        this.price=newPrice;
	} 
}