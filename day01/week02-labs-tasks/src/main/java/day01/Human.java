package day01;

public class Human {
    String name;
    int age;

    public Human(String name, int age){
        this.name=name;
        this.age=age;


    }
    public String introduce(){
        return "Hello az en nevem "+this.name;
    }
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
