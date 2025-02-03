<<<<<<< HEAD
import java.io.Serializable;
import java.util.ArrayList;

public class Diagnostic implements Serializable {
    private ArrayList<Trouble> troubles;

    public Diagnostic() {
        this.troubles = new ArrayList<>();
    }

    public void ajouterTrouble(Trouble trouble) {
        troubles.add(trouble);
    }

    // Autres getters et setters

    public ArrayList<Trouble> getTroubles() {
        return troubles;
    }

    public void setTroubles(ArrayList<Trouble> troubles) {
        this.troubles = troubles;
    }
}
=======
import java.util.Arrays;

public class Diagnostic {
    private Trouble[] troubles;
    private int count; // To keep track of the number of troubles added

    // Constructor to initialize the troubles array
    public Diagnostic(int initialCapacity) {
        this.troubles = new Trouble[initialCapacity];
        this.count = 0;
    }

    // Method to add a new Trouble
    public void ajouterTrouble(Trouble trouble) {
        if (count == troubles.length) {
            // Expand the array if it is full
            expandArray();
        }
        troubles[count] = trouble;
        count++;
    }

    // Helper method to expand the troubles array
    private void expandArray() {
        int newCapacity = troubles.length * 2;
        troubles = Arrays.copyOf(troubles, newCapacity);
    }

    // Method to get all troubles
    public Trouble[] getTroubles() {
        return Arrays.copyOf(troubles, count); // Return a copy of the array with only valid elements
    }

    // Method to get the number of troubles added
    public int getCount() {
        return count;
    }
}

>>>>>>> 650116fcc5fd3d945970ae3151d206b64ea48573
