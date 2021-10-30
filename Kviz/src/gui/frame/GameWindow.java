package gui.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class GameWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtAreaQuestionText;
	private JButton btnAnswer1;
	private JButton btnAnswer2;
	private JButton btnAnswer3;
	private JButton btnAnswer4;

	public GameWindow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAreaQuestionText = new JTextArea();
		txtAreaQuestionText.setWrapStyleWord(true);
		txtAreaQuestionText.setLineWrap(true);
		txtAreaQuestionText.setEditable(false);
		txtAreaQuestionText.setBounds(87, 27, 285, 80);
		contentPane.add(txtAreaQuestionText);
		
		btnAnswer1 = new JButton("");
		btnAnswer1.setBounds(87, 119, 285, 25);
		contentPane.add(btnAnswer1);
		
		btnAnswer2 = new JButton("");
		btnAnswer2.setBounds(87, 153, 285, 25);
		contentPane.add(btnAnswer2);
		
		btnAnswer3 = new JButton("");
		btnAnswer3.setBounds(87, 190, 285, 25);
		contentPane.add(btnAnswer3);
		
		btnAnswer4 = new JButton("");
		btnAnswer4.setBounds(87, 227, 285, 25);
		contentPane.add(btnAnswer4);
	}

	public JTextArea getTxtAreaQuestionText() {
		return txtAreaQuestionText;
	}

	public JButton getBtnAnswer1() {
		return btnAnswer1;
	}

	public JButton getBtnAnswer2() {
		return btnAnswer2;
	}

	public JButton getBtnAnswer3() {
		return btnAnswer3;
	}

	public JButton getBtnAnswer4() {
		return btnAnswer4;
	}
}
