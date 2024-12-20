//Person class with properties (name and age)
public class Person {

    String name;
    int age;

    Person(){
        this.name = "Karthik";
        this.age = 18;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
        public static void main(String[] args){

        Person myPerson = new Person();
        System.out.println("Person's Name is:"+myPerson.getName());
        System.out.println("Person's Age is:"+myPerson.getAge());
    }

    }

