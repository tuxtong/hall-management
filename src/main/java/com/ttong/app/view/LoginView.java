package com.ttong.app.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginView {
	private JFrame 					frame;
	private JLabel 					lblLoginId;
	private JLabel 					lblLoginPassword;
	private JTextField 			txtLoginId;
	private JPasswordField 	txtLoginPassword;
	private JButton 				btnLogin;
	private JPanel 					pnlMain;
	private GridBagConstraints c;

	public LoginView() {
		initUI();
	}

	/*
	 * Initialise the Login form.
	 */
	private void initUI() {
		lblLoginId 				= new JLabel("Login ID:");
		lblLoginPassword 	= new JLabel("Password:");
		txtLoginId 				= new JTextField();
		txtLoginPassword 	= new JPasswordField();
		btnLogin 					= new JButton("Login!");
		pnlMain 					= new JPanel(new GridBagLayout());
		frame 						= new JFrame("Hall Management System Login");
		c 								= new GridBagConstraints();

		frame.getContentPane().add(pnlMain);
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		c.insets = new Insets(0, 0, 20, 20);
		c.anchor = GridBagConstraints.EAST;
		c.gridx  = 0;
		c.gridy  = 0;
		pnlMain.add(lblLoginId, c);

		c.anchor = GridBagConstraints.EAST;
		c.gridx  = 0;
		c.gridy  = 1;
		pnlMain.add(lblLoginPassword, c);

		c.ipadx  = 60;
		c.ipady  = 5;
		c.fill 	 = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.WEST;
		c.gridx  = 1;
		c.gridy  = 0;
		pnlMain.add(txtLoginId, c);

		c.anchor = GridBagConstraints.WEST;
		c.gridx  = 1;
		c.gridy  = 1;
		pnlMain.add(txtLoginPassword, c);

		c.anchor = GridBagConstraints.WEST;
		c.gridx  = 1;
		c.gridy  = 2;
		pnlMain.add(btnLogin, c);
	}

	public void addLoginListener(ActionListener listener) {
		btnLogin.addActionListener(listener);
		txtLoginPassword.addActionListener(listener);
		txtLoginId.addActionListener(listener);
	}

	public void dispose() {
		this.frame.dispose();
	}

	public String getLoginId() {
		return txtLoginId.getText();
	}

	public char[] getLoginPassword() {
		return txtLoginPassword.getPassword();
	}

	public void popMessage(String msg) {
		JOptionPane.showMessageDialog(frame, msg);
	}

}
