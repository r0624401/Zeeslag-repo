package domain;

import view.BordPanel;

public class Service implements ServiceInterface {
	
	private BordPanel bord;

	public void plaatsSchip(Richting richting, Schip schip, Positie positie) {
		bord.plaatsSchip(richting, schip, positie);
	}

	public BordPanel getBord() {
		return bord;
	}
	
}
