package br.com.felippeneves.decorator.coffee_shop.model.decorators;

import br.com.felippeneves.decorator.coffee_shop.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}