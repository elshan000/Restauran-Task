public class FoodUtil {
    public static void addFood(Food food) {
        Array.foods[Array.foodsCount++]=food;
    }

    public static void printFoods() {
        for (int i = 0; i < Array.foodsCount; i++) {
            Food food = Array.foods[i];
            System.out.println(i + "-ci yemek" + Array.foods[i]);
        }
    }

    public static Food removeFood(String name){
        for(int i=0; i<Array.foodsCount;i++){
            Food food = Array.foods[i];
            if(food.name.equals(name)){
                Array.foods[i]=null;
            }
        }
        return null;
    }



    public static Food searchFood(String name) {
        for (int i = 0; i < Array.foodsCount; i++) {
            Food food = Array.foods[i];
            if(food.name.equals(name)){
                return food;
            }
        }
        return null;
    }
}
