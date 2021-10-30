package gui.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnPlay;
	private JLabel lblSsQuiz;
	private JTextField textField;
	private JLabel lblUsername;

	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnPlay = new JButton("Play");
		btnPlay.setBounds(168, 197, 117, 25);
		contentPane.add(btnPlay);
		
		lblSsQuiz = new JLabel("S2S 2020 QUIZ");
		lblSsQuiz.setFont(new Font("Liberation Sans", Font.BOLD, 24));
		lblSsQuiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblSsQuiz.setBounds(97, 50, 239, 45);
		contentPane.add(lblSsQuiz);
		
		textField = new JTextField();
		textField.setBounds(107, 152, 239, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setBounds(105, 125, 127, 15);
		contentPane.add(lblUsername);
	}

	public JButton getBtnPlay() {
		return btnPlay;
	}

	public JTextField getTextField() {
		return textField;
	}
	
	
}
