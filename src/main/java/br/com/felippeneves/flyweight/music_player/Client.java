package br.com.felippeneves.flyweight.music_player;

import br.com.felippeneves.flyweight.music_player.service.MusicService;

public class Client {

	public static void main(String[] args) {
		MusicService player = new MusicService();
		player.listenMusic("User A", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User A", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User A", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User A", "Be Yourself;Audioslave;200");
		player.listenMusic("User B", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User B", "Be Yourself;Audioslave;200");
		
		player.report();
	}
}