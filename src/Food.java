public class Food {
    public String name;
    public double price;
    public String category;

    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setCategory(String category){
        this.category=category;
    }

    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public String getCategory(){
        return this.category;
    }
    public Food(){
        this.name=name;
        this.price=price;
        this.category=category;
    }
    @Override
    public String toString(){
        return  name+"\n"+
                "price="+price+"\n"+
                "category="+category+"\n";
    }
}
