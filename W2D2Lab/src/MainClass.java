import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass extends JFrame implements ActionListener, LayoutManager {

	private static final long serialVersionUID = 1L;

	// ----------------------------------
	//	    Data Members
	// ----------------------------------

	/**
	 * Default frame width
	 */
	private static final int FRAME_WIDTH = 600;

	/**
	 * Default frame height
	 */
	private static final int FRAME_HEIGHT = 300;

	/**
	 * X coordinate of the frame default origin point
	 */
	private static final int FRAME_X_ORIGIN = 150;

	/**
	 * Y coordinate of the frame default origin point
	 */
	private static final int FRAME_Y_ORIGIN = 250;

	


    /**
     * The Swing button for Submit
     */
    private JButton submitButton;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField txName_1;
    private JTextField txStreet_1;
    private JTextField txCity_1;
    private JTextField txState_1;
    private JTextField txZip_1;

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass mClass = new MainClass();
		mClass.setVisible(true);

	}

	/**
	 * Default constructor
	 */
	public MainClass() {

		Container contentPane = getContentPane( );
		// set the frame default properties
		setTitle("My First Subclass");
		setSize(669, 300);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

		// register 'Exit upon closing' as a default close operation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//set the content pane properties
        contentPane.setLayout( null );
        contentPane.setBackground( Color.LIGHT_GRAY );

        //create and place two buttons on the frame's content pane
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		System.out.println(txName_1.getText());
        		System.out.println(txCity_1.getText());
        		System.out.println(txState_1.getText() + ", " + txState_1.getText()+ " " + txZip_1.getText());
        	}
        });

        submitButton.setBounds(293, 189, 100, 25);
        contentPane.add(submitButton);

        
    	JLabel laName = new JLabel("Name");
    	laName.setBounds(35,34,100,25);
		JLabel laStreet = new JLabel("Street");
		laStreet.setBounds(251,34,100,25);
		JLabel laCity = new JLabel("City");
		laCity.setBounds(443,34,100,25);
		JLabel laState = new JLabel("State");
		laState.setBounds(155,105,100,25);
		
		
		JTextField txName = new JTextField("Name");
		
		JTextField txStreet = new JTextField("Street");
		
		JTextField txCity = new JTextField("City");
		
		JTextField txState = new JTextField("State");
		
		JTextField txZip = new JTextField("Zip");
		
		contentPane.add(laName);
		contentPane.add(txName);
		contentPane.add(laStreet);
		contentPane.add(txStreet);
		contentPane.add(laCity);
		contentPane.add(txCity);
		contentPane.add(laState);
		contentPane.add(txState);
		JLabel laZip = new JLabel("Zip");
		laZip.setBounds(850,10,100,25);
		laZip.setBounds(120,10,100,25);
		laZip.setBounds(240,10,100,25);
		laZip.setBounds(530,10,100,25);
		laZip.setBounds(750,10,100,25);
		laZip.setBounds(950,10,100,25);
		contentPane.add(laZip);
		contentPane.add(txZip);
		
		JLabel label = new JLabel("Zip");
		label.setBounds(345, 105, 100, 25);
		getContentPane().add(label);
		
		textField = new JTextField("Name");
		textField.setBounds(80, 142, 0, 0);
		getContentPane().add(textField);
		
		textField_1 = new JTextField("Street");
		textField_1.setBounds(80, 142, 0, 0);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField("City");
		textField_2.setBounds(80, 142, 0, 0);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField("State");
		textField_3.setBounds(80, 142, 0, 0);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField("Zip");
		textField_4.setBounds(80, 142, 0, 0);
		getContentPane().add(textField_4);
		
		txName_1 = new JTextField();
		txName_1.setBounds(35, 59, 146, 26);
		getContentPane().add(txName_1);
		txName_1.setColumns(10);
		
		txStreet_1 = new JTextField();
		txStreet_1.setBounds(251, 59, 120, 26);
		getContentPane().add(txStreet_1);
		txStreet_1.setColumns(10);
		
		txCity_1 = new JTextField();
		txCity_1.setColumns(10);
		txCity_1.setBounds(443, 59, 120, 26);
		getContentPane().add(txCity_1);
		
		txState_1 = new JTextField();
		txState_1.setColumns(10);
		txState_1.setBounds(153, 127, 120, 26);
		getContentPane().add(txState_1);
		
		txZip_1 = new JTextField();
		txZip_1.setColumns(10);
		txZip_1.setBounds(345, 127, 120, 26);
		getContentPane().add(txZip_1);

	}

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void layoutContainer(Container parent) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
