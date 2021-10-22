package br.com.felippeneves.facade.call_center.isolated.facade;

import java.util.List;

import br.com.felippeneves.facade.call_center.isolated.model.Card;
import br.com.felippeneves.facade.call_center.isolated.model.Register;
import br.com.felippeneves.facade.call_center.isolated.services.CardService;
import br.com.felippeneves.facade.call_center.isolated.services.RegisterService;
import br.com.felippeneves.facade.call_center.isolated.services.ReportService;
import br.com.felippeneves.facade.call_center.isolated.services.SecurityService;

public class CallCenterNewCardFacade {
	CardService cardService;
	RegisterService registerService;
	ReportService reportService;
	SecurityService securityService;
	
	public CallCenterNewCardFacade() {
		cardService = new CardService();
		registerService = new RegisterService();
		reportService = new ReportService(registerService);
		securityService = new SecurityService(cardService, registerService);
	}
	
	public void cancelLastRegister(Long user) {
		Card card = cardService.getCardByUser(user);
		List<Register> registers = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, registers.size() - 1);
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 33445566L);
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSumary(newCard);
	}
	
	public void orderNewCard(Long user) {
		Card card = cardService.getCardByUser(user);
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 99887766L);
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSumary(newCard);
	}
}