package br.com.felippeneves.decorator.coffee_shop.model;

public class Expresso implements Drink {

	@Override
	public void serve() {
		System.out.println("- Adding 50ml of expresso");
	}

	@Override
	public Double getPrice() {
		return 1.5d;
	}
}