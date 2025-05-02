public class Adoption_Main {

    public static void main(String[] args) {
        // Creating an instance of the Dog class named Jayson, age 2, adopted status as true
        Dog Jayson = new Dog(2, "Jayson", true);

        // Creating an instance of the PuppyDog class named Tatum, age 2, adopted status as true, and additional puppy-related trait as true
        PuppyDog Tatum = new PuppyDog(2, "Tatum", true, true);

        // Creating another instance of Dog class named Jaylen with the same age and adopted status as Jayson
        Dog Jaylen = new Dog(2, "Jayson", true);

        // Creating another instance of PuppyDog class named Brown with the same traits as Tatum
        PuppyDog Brown = new PuppyDog(2, "Tatum", true, true);

        // Printing the adoption status of Jayson and Tatum by calling the getAdoptionStatus() method
        System.out.println(Jayson.getAdoptionStatus());
        System.out.println(Tatum.getAdoptionStatus());

        // Calling the stateAge() method for Jayson to print its age
        Jayson.stateAge();

      
        System.out.println();

        // Calling the stateAge() method for Tatum to print its age
        Tatum.stateAge();

        // Calling the increaseAge() method for Jayson and Tatum to increase their age by 1
        Jayson.increaseAge();
        Tatum.increaseAge();

       
        System.out.println();

        // Printing the updated age of Jayson after increase
        Jayson.stateAge();
        System.out.println();

        // Printing the updated age of Tatum after increase
        Tatum.stateAge();

        // Calling the toString() method on Jayson and Tatum
        System.out.println(Jayson.toString());
        System.out.println(Tatum.toString());

       
        System.out.println();
        System.out.println();

        // Comparing Jayson and Jaylen using the equals method to see if they are equal
        System.out.println(Jayson.equals(Jaylen));

        // Comparing Tatum and Brown using the equals method to see if they are equal
        System.out.println(Tatum.equals(Brown));
    }
}
