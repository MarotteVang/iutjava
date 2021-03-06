package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import edu.iut.gui.widget.agenda.AgendaPanelFactory;
import edu.iut.gui.widget.agenda.ControlAgendaViewPanel;
import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;


public class SchedulerFrame extends JFrame {
	JPanel contentPane;
	CardLayout layerLayout;
	AgendaPanelFactory agendaPanelFactory;	
	JPanel dayView;
	JPanel weekView;
	JPanel monthView;
	
	protected void setupUI() {
		
		contentPane = new JPanel();
		layerLayout = new CardLayout();
		contentPane.setLayout(layerLayout);
		ControlAgendaViewPanel agendaViewPanel = new ControlAgendaViewPanel(layerLayout,contentPane);
		agendaPanelFactory = new AgendaPanelFactory();
		dayView = agendaPanelFactory.getAgendaView(ActiveView.DAY_VIEW);
		weekView = agendaPanelFactory.getAgendaView(ActiveView.WEEK_VIEW);
		monthView = agendaPanelFactory.getAgendaView(ActiveView.MONTH_VIEW);
		
		contentPane.add(dayView,ActiveView.DAY_VIEW.name());
		contentPane.add(weekView,ActiveView.WEEK_VIEW.name());
		contentPane.add(monthView,ActiveView.MONTH_VIEW.name());
	
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,agendaViewPanel, contentPane);
		this.setContentPane(splitPane);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu;
		JMenu file;		
		JMenuItem menuItem;
		JMenuItem load;
		JMenuItem save;
		JMenuItem quit;
		JMenu edit;
		JMenu view;
		JMenuItem month;
		JMenuItem week;
		JMenuItem day;
		JMenu help;
		JMenuItem display;
		JMenuItem about;
		int currentYear = 2015;
		
		SpinnerModel model1 = new SpinnerNumberModel(currentYear, currentYear - 15, currentYear + 5, 1);
		JSpinner model = new JSpinner(model1);

		
		file = new JMenu("File");
		menuBar.add(file);
		load = new JMenuItem("Load", KeyEvent.VK_T);
		file.add(load);
		save = new JMenuItem("Save", KeyEvent.VK_T);
		file.add(save);
		quit = new JMenuItem("Quit", KeyEvent.VK_T);
		file.add(quit);
		
		edit = new JMenu("Edit");
		menuBar.add(edit);
		view = new JMenu("View");
		edit.add(view);
		month = new JMenuItem("Month", KeyEvent.VK_T);
		view.add(month);
		week = new JMenuItem("Week", KeyEvent.VK_T);
		view.add(week);
		day = new JMenuItem("Day", KeyEvent.VK_T);
		view.add(day);
		
		help = new JMenu("Help");
		menuBar.add(help);
		display = new JMenuItem("Display", KeyEvent.VK_T);
		help.add(display);
		about = new JMenuItem("About", KeyEvent.VK_T);
		help.add(about);
		
				
		this.add(model);
		this.setJMenuBar(menuBar);
		this.pack();
		layerLayout.next(contentPane);
	}
	
	public SchedulerFrame() {
		super();
		
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		contentPane = null;
		dayView = null;
		weekView = null;
		monthView = null;
		agendaPanelFactory = null;
		setupUI();

	}
	public SchedulerFrame(String title) {
		super(title);
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		setupUI();
	}
	
}
