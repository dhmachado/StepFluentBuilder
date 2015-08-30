package ar.com.example;

public class PaninoStepBuilder {

	public static FirstNameStep newBuilder() {
		return new Steps();
	}

	private PaninoStepBuilder() {
	}

	/**
	 * First Builder Step in charge of the Panino name. Next Step available :
	 * BreadTypeStep
	 */
	public static interface FirstNameStep {
		BreadTypeStep paninoCalled(String name);
	}

	/**
	 * This step is in charge of the BreadType. Next Step available :
	 * MainFillingStep
	 */
	public static interface BreadTypeStep {
		MainFillingStep breadType(String breadType);
	}

	/**
	 * This step is in charge of setting the main filling (meat or fish). Meat
	 * choice : Next Step available : CheeseStep Fish choice : Next Step
	 * available : VegetableStep
	 */
	public static interface MainFillingStep {
		CheeseStep meat(String meat);

		VegetableStep fish(String fish);
	}

	/**
	 * This step is in charge of the cheese. Next Step available : VegetableStep
	 */
	public static interface CheeseStep {
		VegetableStep noCheesePlease();

		VegetableStep withCheese(String cheese);
	}

	/**
	 * This step is in charge of vegetables. Next Step available : BuildStep
	 */
	public static interface VegetableStep {
		BuildStep noMoreVegetablesPlease();

		BuildStep noVegetablesPlease();

		VegetableStep addVegetable(String vegetable);
	}

	/**
	 * This is the final step in charge of building the Panino Object.
	 * Validation should be here.
	 */
	public static interface BuildStep {
		Panino build();
	}

	private static class Steps implements FirstNameStep, BreadTypeStep,
			MainFillingStep, CheeseStep, VegetableStep, BuildStep {

		private Panino panino = new Panino();

		public BreadTypeStep paninoCalled(String name) {
			panino.setName(name);
			return this;
		}

		public MainFillingStep breadType(String breadType) {
			panino.setBreadType(breadType);
			return this;
		}

		public CheeseStep meat(String meat) {
			panino.setMeat(meat);
			return this;
		}

		public VegetableStep fish(String fish) {
			panino.setFish(fish);
			return this;
		}

		public BuildStep noMoreVegetablesPlease() {
			return this;
		}

		public BuildStep noVegetablesPlease() {
			return this;
		}

		public VegetableStep addVegetable(String vegetable) {
			panino.getVegetables().add(vegetable);
			return this;
		}

		public VegetableStep noCheesePlease() {
			return this;
		}

		public VegetableStep withCheese(String cheese) {
			panino.setCheese(cheese);
			return this;
		}

		public Panino build() {
			return panino;
		}

	}
}