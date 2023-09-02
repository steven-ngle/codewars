public class WelcomeToTheCity {

    public String sayHello(String [] name, String city, String state){

        if (name.length == 2) {
            return "Hello, " + name[0] + " " + name[1] + "! Welcome to " + city + ", " + state + "!";
        } else {
            return "Hello, " + name[0] + " " + name[1] + " " + name[2] + "! Welcome to " + city + ", " + state + "!";
        }
    }
}
