package gui.controller;

import java.io.IOException;

import javax.swing.JOptionPane;

import gui.frame.MainWindow;
import session.Session;

public class MainWindowController {
	
	private MainWindow frame;
	
	public void showMainWindow() {
		if(frame == null) {
			frame = new MainWindow();
		}
		this.frame.getBtnPlay().addActionListener(e -> showGameWindow());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void showGameWindow() {
		if(frame.getTextField().getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please enter username to play: ", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		try {
			Session.getInstance().username = frame.getTextField().getText().trim();
			new GameWindowController().showGameWindow();
			frame.dispose();
		} 
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, "It is not possible to play game at the moment, please try again later.", "Error", JOptionPane.ERROR_MESSAGE);
		}		
	}

}
