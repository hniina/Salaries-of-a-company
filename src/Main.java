


import java.util.ArrayList;

// Class to store Worker details
class Worker {
    public String name;
    public double baseSalary;
    public double complement;

    // Constructor to initialize a Worker
    public Worker(String name, double baseSalary, double complement) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.complement = complement;
    }

    // Method to
    public double getTotalSalary() {
        return baseSalary + complement;
    }

    // Method to display worker information
    public void displayWorker() {
        System.out.println("Name: " + name + ", Base Salary: " + baseSalary +
                ", Complement: " + complement + ", Total Salary: " + getTotalSalary());
    }
}

// Manager class to handle multiple workers
class WorkerManager {
    private ArrayList<Worker> workers;  // List to store workers

    // Constructor to initialize worker manager
    public WorkerManager() {
        workers = new ArrayList<>();  // Initialize list
    }

    // Method to add a worker
    public void addWorker(String name, double baseSalary, double complement) {
        Worker worker = new Worker(name, baseSalary, complement);
        workers.add(worker);
    }

    // Method to calculate total global salary
    public double calculateGlobalTotalSalary() {
        double globalTotal = 0;
        for (Worker worker : workers) {
            globalTotal += worker.getTotalSalary();  // Sum total salaries
        }
        return globalTotal;
    }

    //  display all workers
    public void displayAllWorkers() {
        for (Worker worker : workers) {
            worker.displayWorker();  // Show details of each worker
        }
    }
}

public class Main {
    public static void main(String[] args) {
        WorkerManager manager = new WorkerManager();  // Create manager

        // Adding some workers
        manager.addWorker("Alice", 3000, 500);
        manager.addWorker("Niina", 3200, 400);
        manager.addWorker("Jack", 3500, 600);

        // Display all workers
        manager.displayAllWorkers();

        // Calculate and display global total salary
        System.out.println("Global Total Salary: " + manager.calculateGlobalTotalSalary());
    }
}
