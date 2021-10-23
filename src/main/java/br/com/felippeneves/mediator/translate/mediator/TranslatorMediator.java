package br.com.felippeneves.mediator.translate.mediator;

import br.com.felippeneves.mediator.translate.model.User;
import br.com.felippeneves.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator {

	private Translator translator = new Translator();

	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
}