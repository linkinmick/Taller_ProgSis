import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JToolBar;


public class Ventana {

  private JFrame frmPrctica;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frmPrctica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrctica = new JFrame();
		frmPrctica.setTitle("Pr\u00E1ctica");
		frmPrctica.setBounds(100, 100, 588, 400);
		frmPrctica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrctica.getContentPane().setLayout(new GridLayout(2, 1, 10, 10));
		
		JScrollPane scrollPane = new JScrollPane();
		frmPrctica.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JToolBar toolBar_1 = new JToolBar();
		toolBar_1.setEnabled(false);
		scrollPane.setRowHeaderView(toolBar_1);
		
		JPanel panel_1 = new JPanel();
		frmPrctica.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("Resultado(s)", null, scrollPane_1, null);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
			}
	

}

