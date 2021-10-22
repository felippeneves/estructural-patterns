package br.com.felippeneves.facade.call_center.normal;

import br.com.felippeneves.facade.call_center.normal.facade.CallCenterFacade;
import br.com.felippeneves.facade.call_center.normal.model.Card;

public class Client {

	public static void main(String[] args) {
		CallCenterFacade facade = new CallCenterFacade();
		
		Card card = facade.getCardByUser(123456L);
		System.out.println(card);
		
		facade.getSumary(card);
		
		facade.getPaymentInfoByCard(card);
		
		facade.cancelLastRegister(card);
		
		Card newCard = facade.getCardByUser(123456L);
		System.out.println(newCard);
	}
}