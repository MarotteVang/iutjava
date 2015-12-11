package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import edu.iut.app.Agenda;
import edu.iut.app.ApplicationSession;
import edu.iut.app.ExamEvent;
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
	public Agenda agenda;
	
	protected void setupUI() {
		
		agenda = new Agenda();//création agenda
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
		JMenu file;		
		JMenuItem load;
		JMenuItem save;
		JMenuItem quit;
		
		/* File Menu */
		/** EX4 : MENU : UTILISER L'AIDE FOURNIE DANS LE TP**/	
		//ajout de file et arborescence
		file = new JMenu("File");
		menuBar.add(file);
		load =new JMenuItem("Load");
		file.add(load);
		save =new JMenuItem("Save");
		file.add(save);
		quit =new JMenuItem("Quit");
		file.add(quit);
		//ajout de Edit et arborescence
		JMenu edit;		
		JMenu view;
		JMenuItem week;
		JMenuItem month;
		JMenuItem day;
	
		edit = new JMenu("Edit");
		menuBar.add(edit);
		view =new JMenu("View");
		edit.add(view);
		month =new JMenuItem("Month");
		view.add(month);
		week =new JMenuItem("Week");
		view.add(week);
		day =new JMenuItem("Day");
		view.add(day);
		//ajout de Help et arborescence
		JMenu help;		
		JMenuItem display;
		JMenuItem about;
		
		help = new JMenu("Help");
		menuBar.add(help);
		display =new JMenuItem("Display");
		help.add(display);
		about =new JMenuItem("About");
		help.add(about);

		//ajout de mois
		JComboBox<String> comboboxmonth =new JComboBox<String>();
		comboboxmonth.addItem(ApplicationSession.instance().getString("january"));
		comboboxmonth.addItem(ApplicationSession.instance().getString("february"));
		comboboxmonth.addItem(ApplicationSession.instance().getString("march"));
		comboboxmonth.addItem(ApplicationSession.instance().getString("april"));
		comboboxmonth.addItem(ApplicationSession.instance().getString("may"));
		comboboxmonth.addItem(ApplicationSession.instance().getString("june"));
		comboboxmonth.addItem(ApplicationSession.instance().getString("july"));
		comboboxmonth.addItem(ApplicationSession.instance().getString("august"));
		comboboxmonth.addItem(ApplicationSession.instance().getString("september"));
		comboboxmonth.addItem(ApplicationSession.instance().getString("october"));
		comboboxmonth.addItem(ApplicationSession.instance().getString("november"));
		comboboxmonth.addItem(ApplicationSession.instance().getString("december"));
		//ajout de combobox jour
		JComboBox<String> comboboxday = new JComboBox<String>();
		comboboxday.addItem(ApplicationSession.instance().getString("monday"));
		comboboxday.addItem(ApplicationSession.instance().getString("tuesday"));
		comboboxday.addItem(ApplicationSession.instance().getString("wednesday"));
		comboboxday.addItem(ApplicationSession.instance().getString("thursday"));
		comboboxday.addItem(ApplicationSession.instance().getString("friday"));
		comboboxday.addItem(ApplicationSession.instance().getString("saturday"));
		comboboxday.addItem(ApplicationSession.instance().getString("sunday"));
		
		//création action listener

		comboboxmonth.addActionListener(new ActionListener(){
	             //@Override
	         public void actionPerformed(ActionEvent e) {
	          JComboBox b = (JComboBox) e.getSource();
	         layerLayout.show(contentPane,ActiveView.MONTH_VIEW.name() );
	          
	}
	});
		comboboxday.addActionListener(new ActionListener(){
            //@Override
        public void actionPerformed(ActionEvent e) {
         JComboBox b = (JComboBox) e.getSource();
        layerLayout.show(contentPane,ActiveView.DAY_VIEW.name() );
         
}
});
		month.addActionListener(new ActionListener(){
            //@Override
        public void actionPerformed(ActionEvent e) {
        	JMenuItem b = (JMenuItem) e.getSource();
        layerLayout.show(contentPane,ActiveView.MONTH_VIEW.name() );
         
}
});
	day.addActionListener(new ActionListener(){
       //@Override
   public void actionPerformed(ActionEvent e) {
    JMenuItem b = (JMenuItem) e.getSource();
   layerLayout.show(contentPane,ActiveView.DAY_VIEW.name() );
    
}
});
	week.addActionListener(new ActionListener(){
	       //@Override
	   public void actionPerformed(ActionEvent e) {
		   	    JMenuItem b = (JMenuItem) e.getSource();		   	 
	   layerLayout.show(contentPane,ActiveView.WEEK_VIEW.name() );	
	    
	}
	});
	ActionListener erreur = new ActionListener(){
		   public void actionPerformed(ActionEvent e) {	
			   JFrame frame = new JFrame();
			   JOptionPane.showMessageDialog(frame, "Pas Implémenté", "Erreur", JOptionPane.WARNING_MESSAGE);
			    
			}
	};	
	//ajout de spinner de 2010 à 2020
	JSpinner spinner;
	SpinnerModel model=new SpinnerNumberModel(2015,2010,2020,1);
	spinner =new JSpinner(model);	
	spinner.addChangeListener(new ChangeListener(){
		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			JSpinner spinner= (JSpinner) e.getSource();
			layerLayout.show(contentPane,ActiveView.MONTH_VIEW.name());
			System.out.println(spinner.getValue());					
		}
	});
	//widget pour ajout supp et modif d'examevent
	JButton ajoutExamEvent=new JButton("Ajout Examen");
	JButton suppExamEvent=new JButton("Supprimer Examen");
	JButton modifExamEvent=new JButton("Modifier Examen");//pas d'action listener car on ne sait pas comment il est possbile de modifier un exam event  car on a deja add et supp
	//actionListener pour les boutons
	ajoutExamEvent.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e) {
			    JButton b = (JButton) e.getSource();
			    Date date =new Date(Integer.parseInt(spinner.getValue().toString()),comboboxmonth.getSelectedIndex(),comboboxday.getSelectedIndex());
			    ExamEvent examen =new ExamEvent(date);
			    agenda.addCheckedEvent(examen);			    
			}
	});
	suppExamEvent.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e) {
			    JButton b = (JButton) e.getSource();
			    int i=0;
			    Date date =new Date(Integer.parseInt(spinner.getValue().toString()),comboboxmonth.getSelectedIndex(),comboboxday.getSelectedIndex());
			    agenda.suppCheckedEvent(date);	//permet de supprimer un ExamEvent d'agenda		    			    
			}
	});

	load.addActionListener(erreur);
	save.addActionListener(erreur);
	quit.addActionListener(erreur);
	display.addActionListener(erreur);
	about.addActionListener(erreur);
	Calendar c =Calendar.getInstance();
	Date date=c.getTime();

		comboboxmonth.setSelectedIndex(date.getMonth());
		comboboxday.setSelectedIndex(date.getDay()-1);
		agendaViewPanel.add(spinner);
		agendaViewPanel.add(comboboxmonth);
		agendaViewPanel.add(comboboxday);
		agendaViewPanel.add(ajoutExamEvent);
		agendaViewPanel.add(suppExamEvent);
		agendaViewPanel.add(modifExamEvent);	
		
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
