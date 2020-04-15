public class AgilityMain {

    public static void main(String[] args) {

        //Handler creation test

        Handler jaco = new Handler("Jaco","Fourie","jaco@fourie.com","13/04/1986",
                "my home","KZN","none",'m',28,
                12345435,000135,false);

        Handler bot = new Handler();

        System.out.println(jaco.getName());
        System.out.println(bot.getName());

        Dog loki = new Dog("Loki", "Loki the avenger", "staffie x", "brindle", 'm', 4, 123123, 000123, false, 'm', 1,
                'm', 1, 'm', 1);

        Dog africanus = new Dog();

        loki.toString();

    }
}
