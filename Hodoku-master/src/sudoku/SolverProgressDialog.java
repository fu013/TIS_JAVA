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

import java.awt.EventQueue;
import solver.SudokuSolver;

/**
 *
 * @author hobiwan
 */
public class SolverProgressDialog extends javax.swing.JDialog implements Runnable {
	private static final long serialVersionUID = 1L;

	private SudokuSolver solver = null;
	private Thread thread = null;
	private boolean solved = false;

	/**
	 * Creates new form SolverProgressDialog
	 * 
	 * @param parent
	 * @param modal
	 * @param solver
	 */
	public SolverProgressDialog(java.awt.Frame parent, boolean modal, SudokuSolver solver) {
		super(parent, modal);
		this.solver = solver;

		initComponents();
		candsProgressBar.setValue(0);

		thread = new Thread(this);
		thread.start();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		unsolvedCellsLabel = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		unsolvedCandsLabel = new javax.swing.JLabel();
		candsProgressBar = new javax.swing.JProgressBar();

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("intl/SolverProgressDialog"); // NOI18N
		setTitle(bundle.getString("SolverProgressDialog.title")); // NOI18N
		setModal(true);

		jLabel1.setText(bundle.getString("SolverProgressDialog.jLabel1.text")); // NOI18N

		unsolvedCellsLabel.setText("81"); // NOI18N

		jLabel3.setText(bundle.getString("SolverProgressDialog.jLabel3.text")); // NOI18N

		unsolvedCandsLabel.setText("729"); // NOI18N

		candsProgressBar.setMaximum(729);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(candsProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup().addComponent(jLabel1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(unsolvedCellsLabel).addGap(18, 18, 18).addComponent(jLabel3)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(unsolvedCandsLabel)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
						.addComponent(unsolvedCellsLabel).addComponent(jLabel3).addComponent(unsolvedCandsLabel))
				.addGap(18, 18, 18)
				.addComponent(candsProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	@Override
	public void run() {
		solved = solver.solve(Options.getInstance().getDifficultyLevels()[DifficultyType.EXTREME.ordinal()], null,
				false, this);

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				setVisible(false);
			}
		});
	}

	public void initializeProgressState(final int unsolvedCandidates) {
		int dummy = candsProgressBar.getMaximum() - unsolvedCandidates;
		candsProgressBar.setMinimum(dummy);
		candsProgressBar.setValue(dummy);
	}

	public void setProgressState(final int unsolvedCells, final int unsolvedCandidates) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				unsolvedCellsLabel.setText(Integer.toString(unsolvedCells));
				unsolvedCandsLabel.setText(Integer.toString(unsolvedCandidates));
				candsProgressBar.setValue(candsProgressBar.getMaximum() - unsolvedCandidates);
			}
		});
	}

	/**
	 * @param args the command line arguments
	 */
	/*
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				SolverProgressDialog dialog = new SolverProgressDialog(new javax.swing.JFrame(), true, null);
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

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JProgressBar candsProgressBar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel unsolvedCandsLabel;
	private javax.swing.JLabel unsolvedCellsLabel;
	// End of variables declaration//GEN-END:variables

	public Thread getThread() {
		return thread;
	}

	public boolean isSolved() {
		return solved;
	}
}