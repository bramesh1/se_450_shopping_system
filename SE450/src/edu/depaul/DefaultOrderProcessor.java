package edu.depaul;

public class DefaultOrderProcessor implements OrderProcessor {

    @Override
    public void placeOrder(Order order) {
    	
        System.out.println("\nYour order summary:\n" + order);
        // Logic to place the order
    }

	/*
	 * @Override public void finalizeOrder(Order order) {
	 * System.out.println("Finalizing order: " + order); // Logic to finalize the
	 * order }
	 */
}