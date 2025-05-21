package gr.aueb.cf.oopProgramming.ch1.model;

public class Main {

    public static void main(String[] args) {
        User newUser = new User(1L, "William", "Johnson");

        System.out.println("{ " + newUser.getId() + ", " + newUser.getFirstname() + ", " + newUser.getLastname() + " }");

    }
}
