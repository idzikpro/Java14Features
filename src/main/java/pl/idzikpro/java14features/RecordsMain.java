package pl.idzikpro.java14features;

public class RecordsMain {
    public static void main(String[] args) {
        Person person = new Person("Tomek", "Jacek");
        person.setAge(23);
        System.out.println(person);
        System.out.println(person.getAge());
    }
}
