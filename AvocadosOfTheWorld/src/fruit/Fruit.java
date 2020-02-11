/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */

package fruit;

/***
 * An Abstract class upon which we will build fruits
 * 
 * @author nicomp
 *
 */
public abstract class Fruit {
	private float cost;
	private int weight;
	/***
	 * Constructor
	 * @param weight of the fruit
	 * @param cost of the fruit
	 */
	public Fruit(int weight, float cost)	{
		setWeight(weight);
		setCost(cost);
	}

	/**
	 * get the cost of the fruit
	 * 
	 * @return
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * set the cost of the fruit
	 * 
	 * @param cost
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}

	/**
	 * get the weight of the fruit
	 * 
	 * @return
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * sets the weight of the fruit
	 * 
	 * @param weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/**
	 * return a string of a fruit's STATS.
	 */
	public String toString() {
		return ("Weight = " + weight + ", Cost = " + cost);
	}
	
	
}
