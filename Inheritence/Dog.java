public class Dog {
    // Instance variables to store the dog's adoption status, age, and name.
    protected boolean isAdopted;
    protected int age;
    protected String name;

    // Constructor to initialize the dog's age, name, and adoption status.
    public Dog(int a, String name, boolean ad) {
        age = a;            // Set the age of the dog
        this.name = name;   // Set the name of the dog
        isAdopted = ad;     // Set the adoption status of the dog
    }

    // Method to get the dog's adoption status.
    public boolean getAdoptionStatus() {
        return isAdopted;  // Return whether the dog is adopted or not.
    }

    // Method to print the dog's age.
    public void stateAge() {
    	 // Print the dog's name and age.
        System.out.print(name + " is " + age + " years old."); 
    }

    // Method to increase the dog's age by 1.
    public void increaseAge() {
    	// Increase the dog's age by one year.
        age++;  
    }

    // Method to return a string representation of the dog.
    public String toString() {
    	// Print the dog's age first using the stateAge method.
        stateAge();  
        
        // Check if the dog is adopted and return appropriate message.
        if (isAdopted) {
            System.out.println();  
         // If adopted, the dog is happy to have a home.
            return ("I am finally chosen");  
        }
     // If not adopted, the dog is still waiting.
        return ("I haven't found a home yet");  
    }

    // Method to compare if two Dog objects are the same.
    public boolean equals(Dog doggy) {
        // Check if all the fields (age, name, and adoption status) of the two dogs are the same.
        if (this.age == doggy.age && this.name.equals(doggy.name) && this.isAdopted == doggy.isAdopted) {
            return true;  
        }
     // Return false if any if it does not match up
        return false;  
    }
}
