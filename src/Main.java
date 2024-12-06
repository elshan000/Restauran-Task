import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String accountMenu = "1.Admin \n" +
                    "2.Musteri \n";
            System.out.println(accountMenu);
            int a = sc.nextInt();
            switch (a) {
                case 1 -> {
                    System.out.println("kodu girin-");
                    String kod = sc.next();
                    if (kod.equals(Account.admin)) {
                        while (true) {
                            String adminMenu = "1.Yemek elave etmek \n" +
                                    "2.Silmek \n" +
                                    "3.Yemekleri gostermek \n" +
                                    "4.Axtaris \n" +
                                    "5.Esas sehifeye qayit \n" +
                                    "6.Proqrami sonlandir \n";
                            System.out.println(adminMenu);
                            int number1 = sc.nextInt();
                            sc.nextLine();
                            if (number1 == 5) {
                                break;
                            }

                            switch (number1) {
                                case 1 -> {
                                    System.out.println("name ");
                                    String name = sc.next();
                                    System.out.println("price ");
                                    double price = sc.nextDouble();
                                    System.out.println("category ");
                                    String category = sc.next();

                                    Food food = new Food();
                                    food.name = name;
                                    food.price = price;
                                    food.category = category;
                                    FoodUtil.addFood(food);
                                }
                                case 2->{
                                    System.out.println("Silmek istediyiniz yemeyin adini daxil edin");
                                    String name = sc.next();
                                    Food food = FoodUtil.removeFood(name);
                                }
                                case 4-> {
                                    System.out.println("yemeyin adini daxil edin");
                                    String name=sc.next();
                                    Food food = FoodUtil.searchFood(name);
                                    System.out.println(food);
                                }
                                case 3 -> FoodUtil.printFoods();
                                case 6 -> System.exit(0);
                            }
                        }
                    } else {
                        System.out.println("Daxil edilen kod sehvdir");
                    }
                }
                case 2 -> {
                    String musteriMenu = "1.Menyunu goster \n" +
                            "2.Sifaris elave et \n" +
                            "3.Axtaris \n" +
                            "4.Esas sehifeye qayit \n" +
                            "5.Proqrami sonlandir \n";

                    System.out.println(musteriMenu);
                    int number2 = sc.nextInt();
                    sc.nextLine();
                    if (number2 == 4) {
                        break;
                    }

                    switch (number2) {
                        case 1 -> FoodUtil.printFoods();
                        case 3->{
                            System.out.println("yemeyin adini daxil edin");
                            String name=sc.next();
                            Food food = FoodUtil.searchFood(name);
                            System.out.println("yemek-"+food);
                        }
                        case 5 -> System.exit(0);
                    }
                }
            }
        }
    }
}

