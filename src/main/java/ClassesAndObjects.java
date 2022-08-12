public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Роман",20);
        String s1 = "Вова";
        Person person2 = new Person();
        person2.setNameAndAge(s1,30);
        //person2.age = 20;
        person1.speak();
        person2.speak();
        Person person3 = new Person();
        person3.setName("");
        person3.setAge(-4);
        System.out.println("Выводим значение в main методе: "+person3.getName());
        System.out.println("Выводим значение в main методе: "+person3.getAge());
        person3.speak();
    }
}
