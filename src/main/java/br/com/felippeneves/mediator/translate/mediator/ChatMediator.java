package br.com.felippeneves.mediator.translate.mediator;

import br.com.felippeneves.mediator.translate.model.User;

public class ChatMediator extends Mediator {

	public String getMessage(String message, User to, User from) {
		return message;
	}
}