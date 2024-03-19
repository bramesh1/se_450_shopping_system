package edu.depaul;
public interface Product {

    String getName();
    public double getPrice();

    // Removed getPrice() from the interface as it's already implemented in the AbstractProduct class
    // This ensures consistency and avoids redundancy.

    String toString(); // Retained for consistent product representation
}