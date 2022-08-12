public class Lesson20 {
    public static void main(String[] args) {
        Human1 human1 = new Human1();
    }
}

class Human1 {
    private String name;
    private int age;

    public Human1(){
        this.name = "Имя по молчанию";
        this.age = 0;
    }

    public Human1(String name, int age) {
        System.out.println("Привет из третьего констрктора");
        this.name = name;
        this.age = age;
    }

    public Human1(String name){
        System.out.println("Привет из второго контстрктора");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
