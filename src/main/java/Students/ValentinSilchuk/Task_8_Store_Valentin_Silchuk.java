package Students.ValentinSilchuk;

/**
 * Задача 8. Магазин.
 * Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 * Создать класс Basket, содержащий массив купленных товаров.
 * Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User..
 */
public class Task_8_Store_Valentin_Silchuk {
    public static void main(String[] args) {
        Good milk = new Good();
        Good bread = new Good();
        Good t_shirt = new Good();
        Good jacket = new Good();
        Category food = new Category("Food", new Good[]{milk, bread});
        Good Clothes[] = {t_shirt, jacket};
        Category clothes = new Category("Clothes", Clothes);
        Basket basket1 = new Basket();
        basket1.purchased = new Good[]{t_shirt, milk};
        User user1 = new User("Vasya", "1234", basket1);
        User user2 = new User("Kolya", "4321", new Basket(new Good[]{bread, jacket}));
    }
}

class Good {
    String name;
    float price;
    int rank;
}

class Category {
    String name;
    Good[] goods;

    public Category(String name, Good[] goods) {
        this.name = name;
        this.goods = goods;
    }
}

class Basket {
    Good[] purchased;

    public Basket(Good[] purchased) {
        this.purchased = purchased;
    }

    public Basket() {
    }
}

class User {
    String login;
    String password;
    Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }
}

