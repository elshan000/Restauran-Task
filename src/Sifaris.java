public class Sifaris {
    private String customerName;
    private Food[] meals;
    private double totalPrice;

    public Sifaris(String customerName){
        this.customerName=customerName;
        this.meals = new Food[0];
        this.totalPrice=0.0;
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public String  getCustomerName(){
        return this.customerName;
    }

    public Food[] getMeals(){
        return this.meals;
    }

}
