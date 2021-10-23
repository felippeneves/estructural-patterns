package br.com.felippeneves.mediator.swing.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import br.com.felippeneves.mediator.swing.mediator.Mediator;

public class ResetButton extends JButton {
	private static final long serialVersionUID = -6170178595314483794L;
	
	public ResetButton(Mediator mediator) {
		super("Reset");
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mediator.reset();
			}
		});
	}
}