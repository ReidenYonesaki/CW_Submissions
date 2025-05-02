
public class PuppyDog extends Dog {
    // Instance variable to keep track of whether the puppy has been fed.
    protected boolean isFed;

    // Constructor for creating a new PuppyDog object.
    // It initializes the PuppyDog's age, name, adoption status, and feeding status.
    // It also calls the parent class (Dog) constructor to initialize age, name, and adoption status.
    public PuppyDog(int a, String n, boolean ad, boolean f) {
    	// Call the parent class (Dog) constructor to initialize inherited properties.
        super(a, n, ad);  
     // Initialize the puppy's feeding status.
        isFed = f;        
    }

    // Override the stateAge method to print the puppy's age in months instead of years.
    public void stateAge() {
        // Print the puppy's name and age in months.
        System.out.print(name + " is " + age + " months old.");
    }

    // Method to feed the puppy.
    // This method sets the isFed variable to true, indicating the puppy has been fed.
    public void feedDog() {
    	// Mark the puppy as fed.
        isFed = true;  
    }

    // Similar to feedDog(), this method also marks the puppy as fed.
    public void feedPup() {
    	// Mark the puppy as fed.
        isFed = true;  
    }

    // Override the increaseAge method from the Dog class.
    // It increments the puppy's age and resets the feeding status.
    public void increaseAge() {
    	// Call the parent class (Dog) method to increase the puppy's age.
        super.increaseAge();  
     // After increasing the age, reset the feeding status to false (puppy needs to be fed again).
        isFed = false;        
    }

    // Override the toString method to provide a customized string representation for PuppyDog.
    public String toString() {
        // If the puppy is fed, append "I am fed" to the string returned by the superclass's toString method.
        if (isFed) {
        	// Print a newline for formatting.
            System.out.println();  
            // Return the string from the parent class and add feeding status.
            return super.toString() + "\n " + "I am fed"; 
        }
        // If the puppy is not fed, append "I need to be fed" to the string returned by the superclass's toString method.
        return super.toString() + "\n" + "I need to be fed"; 
    }

    // Override the equals method to compare two PuppyDog objects based on age, name, adoption status, and feeding status.
    public boolean equals(PuppyDog lilDoggy) {
        // Compare the attributes of the current PuppyDog object with another PuppyDog object (lilDoggy).
        if (super.equals(lilDoggy) && this.isFed == lilDoggy.isFed) {
        	// Return true if both PuppyDog objects have the same attributes.
            return true;  
        }
     // Return false if the objects have different attributes.
        return false;  
    }
}
