package domain;
/*
 * @Author Gezamenlijk gemaakt
 */
public interface ServiceInterface {

	public void plaatsSchip(Richting richting, SchipType schip, Position positie);
	
	public Board getBoard();
	
	public Board getBoardOpponent();
	
	public void attackSchip(Position position);
	
	public Spel getSpel();
	

}
