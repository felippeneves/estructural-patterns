package br.com.felippeneves.adapter.tv_port.devices;

import br.com.felippeneves.adapter.tv_port.intefaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}
	
}
