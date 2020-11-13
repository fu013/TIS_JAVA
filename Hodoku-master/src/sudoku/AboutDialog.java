/*
 * Copyright (C) 2008-12  Bernhard Hobiger
 *
 * This file is part of HoDoKu.
 *
 * HoDoKu is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * HoDoKu is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with HoDoKu. If not, see <http://www.gnu.org/licenses/>.
 */
package sudoku;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author hobiwan
 */
public class AboutDialog extends javax.swing.JDialog {
	
	private static final long serialVersionUID = 1L;
	
	private javax.swing.JButton closeButton;
	private javax.swing.JLabel copyleftLabel;
	private javax.swing.JLabel copyrightLabel;
	private javax.swing.JLabel logoLabel;
	private javax.swing.JLabel versionLabel;

	/**
	 * Creates new form AboutDialog
	 * 
	 * @param parent
	 * @param modal
	 */
	public AboutDialog(java.awt.Frame parent, boolean modal) {
		
		super(parent, modal);
		initComponents();

		versionLabel.setText(MainFrame.VERSION);
		getRootPane().setDefaultButton(closeButton);

		KeyStroke escapeKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false);
		Action escapeAction = new AbstractAction() {
			private static final long serialVersionUID = 1L;
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		};
		
		getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(escapeKeyStroke, "ESCAPE");
		getRootPane().getActionMap().put("ESCAPE", escapeAction);
	}

	private void initComponents() {

		versionLabel = new javax.swing.JLabel();
		copyrightLabel = new javax.swing.JLabel();
		copyleftLabel = new javax.swing.JLabel();
		logoLabel = new javax.swing.JLabel();
		closeButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("intl/AboutDialog");
		setTitle(bundle.getString("AboutDialog.title"));

		versionLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
		versionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		versionLabel.setText("Hodoku v1.0");

		copyrightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		copyrightLabel.setText(bundle.getString("AboutDialog.copyrightLabel.text"));

		copyleftLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		copyleftLabel.setText(bundle.getString("AboutDialog.copyleftLabel.text"));

		logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gplv3-127x51.png")));

		closeButton.setMnemonic(java.util.ResourceBundle.getBundle("intl/AboutDialog")
				.getString("AboutDialog.closeButton.mnemonic").charAt(0));
		closeButton.setText(bundle.getString("AboutDialog.closeButton.text"));
		closeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				closeButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
								.addComponent(copyrightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 375,
										Short.MAX_VALUE)
								.addComponent(versionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
								.addComponent(copyleftLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 375,
										Short.MAX_VALUE)))
						.addGroup(layout.createSequentialGroup().addGap(147, 147, 147).addComponent(closeButton,
								javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(versionLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(copyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(copyleftLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(logoLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
						.addComponent(closeButton).addContainerGap()));

		pack();
	}

	private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
	}

	/**
	 * @param args the command line arguments
	 */
	/*
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				AboutDialog dialog = new AboutDialog(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}*/
}
