package ar.com.example;

import java.util.ArrayList;
import java.util.List;

public class Panino {

	private String name;
	private String breadType;
	private String fish;
	private String cheese;
	private String meat;
	private List<String> vegetables;

	public Panino() {
	}

	public Panino(String name) {
		this.name = name;
	}

	public String getBreadType() {
		return breadType;
	}

	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}

	public String getFish() {
		return fish;
	}

	public void setFish(String fish) {
		this.fish = fish;
	}

	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public List<String> getVegetables() {
		if (vegetables == null) {
			vegetables = new ArrayList<String>();
		}
		return vegetables;
	}

	public void setVegetables(List<String> vegetables) {
		this.vegetables = vegetables;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		String enter = "\n";
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Panino: ");
		strBuilder.append(enter);
		strBuilder.append("Name: ");
		strBuilder.append(getName());
		strBuilder.append(enter);
		strBuilder.append("Bread: ");
		strBuilder.append(getBreadType());
		strBuilder.append(enter);
		if (getFish() != null) {
			strBuilder.append("Fish: ");
			strBuilder.append(getFish());
			strBuilder.append(enter);
		}
		if (getMeat() != null) {
			strBuilder.append("Meat: ");
			strBuilder.append(getMeat());
			strBuilder.append(enter);

			strBuilder.append("Cheese: ");
			strBuilder.append(getCheese());
			strBuilder.append(enter);
		}

		if (getVegetables().size() > 0) {
			strBuilder.append("Vegetables: ");
			strBuilder.append(enter);
			for (String vegetable : getVegetables()) {
				strBuilder.append("     - ");
				strBuilder.append(vegetable);
				strBuilder.append(enter);
			}
		}

		return strBuilder.toString();
	}

}
