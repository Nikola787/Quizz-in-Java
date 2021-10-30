package gui.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ResultWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel labelResult;
	private JButton btnPlayAgain;

	public ResultWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelResult = new JLabel("");
		labelResult.setHorizontalAlignment(SwingConstants.CENTER);
		labelResult.setBounds(26, 64, 388, 37);
		contentPane.add(labelResult);
		
		btnPlayAgain = new JButton("Play again");
		btnPlayAgain.setBounds(160, 171, 117, 25);
		contentPane.add(btnPlayAgain);
	}

	public JLabel getLabelResult() {
		return labelResult;
	}

	public JButton getBtnPlayAgain() {
		return btnPlayAgain;
	}
	
	

}
