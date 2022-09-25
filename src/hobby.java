public class hobby {
    private String name;
    private String hobby;
    private int days;

    // constructor
    public hobby (String personName, String personHobby, int persondays) {
        name = personName;
        hobby = personHobby;
        days = persondays;
    }

    // method that prints Cat info
    public void printhobbyInfo() {
        System.out.println("Hello! My name is " + name + ".");
        System.out.println("One of my hobbies is " + hobby + ".");
        System.out.println("I like to complete my hobby for " + days + " days per week.");
    }
}

