package br.com.felippeneves.decorator.coffee_shop.model.decorators;

import br.com.felippeneves.decorator.coffee_shop.model.Drink;

public class DoubleDrink extends DrinkDecorator {

	public DoubleDrink(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		drink.serve();
	}

	@Override
	public Double getPrice() {
		return drink.getPrice() * 1.75d;
	}
}