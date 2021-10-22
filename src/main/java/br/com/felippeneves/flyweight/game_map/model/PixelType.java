package br.com.felippeneves.flyweight.game_map.model;

public class PixelType {

	private Character character;
	private Integer treasureReward;

	public PixelType(Character character, Integer treasureReward) {
		this.character = character;
		this.treasureReward = treasureReward;
	}

	public Character getCharacter() {
		return character;
	}
	
	public Integer getTreasureReward() {
		return treasureReward;
	}
}