package pr16;

public class Test {
    public static void main(String[] ar) {
        OrderManager orderManager = new OrderManager();
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        InternetOrder internetOrder = new InternetOrder();

        try {
            Drink cap = new Drink("Фанта", "2", 70);
            Drink wine = new Drink("Сыр", "Французский, с плесенью", 15000);
            Drink coffee = new Drink("Капучино", "0.5", 110);
            Dish roast = new Dish("Ребра на огне", "Свежезажаренные ребра на открытом огне", 3000);
            Dish dumplings = new Dish("Салат Цезарь", "Салат с курицей, специальный сосус, капуста, помидорки черри. подается вместе с сухариками", 200);
            Dish smoothie = new Dish("Доширак", "Лапша быстрого приготовления", 40);

            restaurantOrder.add(cap);
            restaurantOrder.add(coffee);

            internetOrder.add(roast);
            internetOrder.add(wine);
            internetOrder.add(smoothie);

            restaurantOrder.add(dumplings);
            restaurantOrder.add(dumplings);
            restaurantOrder.add(roast);

            orderManager.add(1, restaurantOrder);
            orderManager.add(4, restaurantOrder);
            orderManager.add("Москва", internetOrder);

            System.out.println(restaurantOrder.priceTotal());
            System.out.println(orderManager.RestaurantOrdersCostSummary());
            System.out.println(restaurantOrder.dishQuantity());
            System.out.println(restaurantOrder.dishQuantity("Салат Цезарь"));
            System.out.println(internetOrder.getCount());
            System.out.println(internetOrder.priceTotal());

            internetOrder.remove("Салат Цезарь");

            System.out.println(internetOrder.getCount());
            System.out.println(internetOrder.priceTotal());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}