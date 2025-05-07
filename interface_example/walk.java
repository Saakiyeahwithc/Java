package interface_example;

interface Run {
    public void run();
}

interface Walk {
    public void walk();
}

class Childclass implements Run, Walk {
    public void run() {
        System.out.println("Running");
    }

    public void walk() {
        System.out.println("Walking");
    }
}

class Main {
    public static void main(String[] args) {
        Childclass obj = new Childclass();
        obj.run(); // Calling the run method
        obj.walk(); // Calling the walk method
    }
}