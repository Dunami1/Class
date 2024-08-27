package app;

class Person {
    String name;
    int age;
    String profession;

    Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    void updateProfession(String newProfession) {
        this.profession = newProfession;
    }

    void printPersonInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }
}

public class Main {
    public static void main(String[] args) {

        Person john = new Person("John", 30, "Інженер");
        Person mary = new Person("Mary", 25, "Вчитель");
        Person bob = new Person("Bob", 35, "Лікар");

        john.printPersonInfo();
        mary.printPersonInfo();
        bob.printPersonInfo();

        Person alice = new Person("Alice", 28, "Архітектор");
        alice.printPersonInfo();

        alice.updateProfession("Дизайнер");
        System.out.println("(Після оновлення професії)");
        alice.printPersonInfo();
    }
}
