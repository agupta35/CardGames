package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserInterface {
	
	//Main method which runs the GUI
	public static void main(String[] args){
		new UserInterface();
	}
	
	//The class constructor sets up the GUI, all code regarding creation and set up of the GUI goes here 
	public UserInterface(){
		JFrame.setDefaultLookAndFeelDecorated(true); //For looks, not necessary
		JFrame frame = new JFrame("Card Game"); //Creates workspace(frame) for graphics 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sets default close operation for frame
		frame.setSize(500, 450); 
		frame.setLocationRelativeTo(null); //Sets up size of frame and location relative to computer screen
		BoxLayout frameLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS); //Layout style for the frame
		frame.setLayout(frameLayout); // Sets layout style for components going into frame
		
		JPanel menuScreen = new JPanel(); //First panel created, this is the opening screen
		
		JButton newGameButton = new JButton("New Game"); // "New Game" button created
		menuScreen.add(newGameButton); //"New Game" button added to first panel
		
		frame.add(menuScreen); // First panel added to frame- buttons need only be added to the panels in which they belong. Add to frame only if button is constant
		menuScreen.setVisible(true);// First panel added to frame and set to visible so we can actually see it
		
		JPanel optionsScreen = new JPanel(); //Second panel created, this is the screen which lets us choose which games to play
		
		JButton freecellButton = new JButton("Play Freecell");
		JButton bakersButton = new JButton("Play Bakers Dozen");
		JButton exitButton = new JButton("Exit"); // Three new buttons created and added to the second panel optionsScreen
		optionsScreen.add(freecellButton);
		optionsScreen.add(bakersButton);
		optionsScreen.add(exitButton);
		
		frame.add(optionsScreen); // Second panel added to frame...
		optionsScreen.setVisible(false);// ...but only one can be visible at a time so its visibility is set to false for now
		
		/*Action listeners must be added to buttons if there must be something done when button is clicked
		Anonymous inner class's are created for the action listeners to give instructions on what must be done once button is clicked
		Override is added because we're overriding the method in the Action Listeners super class */
		
		newGameButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				menuScreen.setVisible(!menuScreen.isVisible());// Makes first panel, menuScreen, invisible  if visible, and visible if invisible and...
				optionsScreen.setVisible(!optionsScreen.isVisible());//... the same for this line
			}
		});// This is still a statement so add semi-colon
		
		exitButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				menuScreen.setVisible(!menuScreen.isVisible());
				optionsScreen.setVisible(!optionsScreen.isVisible());
			}
		});
		
		frame.setVisible(true);// Set frame to visible so we can see all the graphics set up in above code
		}

}
