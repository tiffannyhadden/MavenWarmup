public class Countries {

    public static void main(String[] args) {
        //Create a new Maven project (remember it goes in its own repo and directly under IdeaProjects). Create a `Countries` class and add at least 3 fields to it and then create an instance of that class and use at least 2 of the fields in that instance within the main method.
        //fields
        String country;
        String enemies;
        double population;
        Countries test = new Countries("New Zealand","Tropical birds",900000);
        Countries laura = new Countries();
        laura.getCountry();
    }
}
