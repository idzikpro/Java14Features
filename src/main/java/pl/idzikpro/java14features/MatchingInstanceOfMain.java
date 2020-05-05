package pl.idzikpro.java14features;

public class MatchingInstanceOfMain {
    public static void main(String[] args) {
        Object person = new Person("Jacek","Tomasz");
        if (person instanceof Person newPerson){
            System.out.println(newPerson);
        }
    }
}
