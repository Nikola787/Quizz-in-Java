package gui.controller;

import gui.frame.ResultWindow;
import session.Session;

public class ResultWindowController {
	
	private ResultWindow frame;
	
	public void showResultWindow(int points) {
		if(frame == null) {
			frame = new ResultWindow();
		}
		showPoints(points);
		this.frame.getBtnPlayAgain().addActionListener(e -> showMainWindow());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	private void showPoints(int points) {
		String username = Session.getInstance().username;
		this.frame.getLabelResult().setText("Congratulations "+ username +"!You won "+points+" points!");
	}
	
	private void showMainWindow(){
		new MainWindowController().showMainWindow();
		this.frame.dispose();
	}
}
