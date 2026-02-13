class Box {
    double width;
    double height;
    double depth;

    // Default constructor
    Box() {
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }

    // Parameterized constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

// Derived class
class Boxweight extends Box {
    double weight;

    // Constructor for Boxweight
    Boxweight(double w, double h, double d, double m) {
        super(w, h, d);   // Calls parent constructor
        weight = m;
    }
}

// Main class
class simple_multi {
    public static void main(String[] args) {

        // Creating Boxweight object
        Boxweight mybox1 = new Boxweight(2, 3, 5.0, 7.5);

        double vol;
        vol = mybox1.volume();

        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
    }
}
