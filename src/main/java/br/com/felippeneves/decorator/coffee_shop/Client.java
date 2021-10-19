package br.com.felippeneves.decorator.coffee_shop;

import br.com.felippeneves.decorator.coffee_shop.model.Drink;
import br.com.felippeneves.decorator.coffee_shop.model.Expresso;
import br.com.felippeneves.decorator.coffee_shop.model.Tea;
import br.com.felippeneves.decorator.coffee_shop.model.decorators.DoubleDrink;
import br.com.felippeneves.decorator.coffee_shop.model.decorators.Milk;

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());
		order("Lungo", new DoubleDrink(new Expresso()));
		order("Cafe Au Lait", new Milk(new Expresso()));
		order("English Tea", new Milk(new Tea()));
	}
}