class Person {
    private String name;
    private int age;

    public void setName(String username){
        if (username.isEmpty()){
            System.out.println("Ты ввёл пyстое имя");
        } else{
        name = username;}
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("Возраст должен быть положительным");
        } else {
        age = userAge;}
    }
    public int getAge(){
        return age;
    }
    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for(int i = 0; i<3; i++){
            System.out.println("Меня зовут "+ name +",мне "+ age+"лет");}
    }
    void sayHello(){
        System.out.println("Привет!");
    }
}
