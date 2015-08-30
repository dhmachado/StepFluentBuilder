package ar.com.example;

public class Main {

	public static void main(String[] args) {
		Panino solePanino = PaninoStepBuilder.newBuilder()
				.paninoCalled("Sole panino")
				.breadType("baguette")
				.fish("sole")
				.addVegetable("tomato")
				.addVegetable("lettece")
				.noMoreVegetablesPlease()
				.build();

		Panino hamPanino = PaninoStepBuilder.newBuilder()
				.paninoCalled("Ham panino")
				.breadType("baguette")
				.meat("ham")
				.withCheese("cheddar")
				.noVegetablesPlease()
				.build();

		System.out.println(solePanino.toString());
		System.out.println("\n\n\n");
		System.out.println(hamPanino.toString());

	}

}