
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//sub class
public class AboutMe extends HomePage {

	private JLabel MyWorks;

	/**
	 * Create the application.
	 */
	public AboutMe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(248, 248, 255));
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 776, 665);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel border1 = new JPanel();
		border1.setBackground(Color.BLACK);
		border1.setBounds(74, 43, 868, 276);
		frame.getContentPane().add(border1);
		border1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(367, 11, 4, 253);
		border1.add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 884, 253);
		border1.add(panel_2);
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		
		JLabel myPic = new JLabel("myPic");
		myPic.setIcon(new ImageIcon("C:\\Users\\admin\\OneDrive - National University\\3rd Term (1st yr)\\OOP\\iconsforOOP\\myPic.png"));
		myPic.setBounds(417, 5, 200, 174);
		panel_2.add(myPic);
		
		JLabel myName = new JLabel("JUSTIN R. CRISTAL");
		myName.setBackground(Color.BLACK);
		myName.setForeground(Color.BLACK);
		myName.setFont(new Font("Arial", Font.BOLD, 27));
		myName.setBounds(386, 181, 263, 49);
		panel_2.add(myName);
		
		JLabel callNumber = new JLabel("callNumber");
		callNumber.setIcon(new ImageIcon("C:\\Users\\admin\\OneDrive - National University\\3rd Term (1st yr)\\OOP\\iconsforOOP\\phoneIcon.png"));
		callNumber.setForeground(Color.WHITE);
		callNumber.setBounds(10, 51, 27, 20);
		panel_2.add(callNumber);
		
		JLabel myHomeadd = new JLabel("homeAdd");
		myHomeadd.setIcon(new ImageIcon("C:\\Users\\admin\\OneDrive - National University\\3rd Term (1st yr)\\OOP\\iconsforOOP\\homeIcon.png"));
		myHomeadd.setForeground(Color.WHITE);
		myHomeadd.setBounds(10, 113, 27, 20);
		panel_2.add(myHomeadd);
		
		JLabel emailAdd = new JLabel("emailAdd");
		emailAdd.setIcon(new ImageIcon("C:\\Users\\admin\\OneDrive - National University\\3rd Term (1st yr)\\OOP\\iconsforOOP\\emailicon.png"));
		emailAdd.setForeground(Color.WHITE);
		emailAdd.setBounds(10, 82, 27, 20);
		panel_2.add(emailAdd);
		
		JLabel myCourse = new JLabel("Information Technology");
		myCourse.setFont(new Font("Tahoma", Font.BOLD, 16));
		myCourse.setBounds(417, 216, 200, 26);
		panel_2.add(myCourse);
		
		JLabel contactsAndAdresses = new JLabel("Contacts and Address");
		contactsAndAdresses.setForeground(new Color(0, 0, 205));
		contactsAndAdresses.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		contactsAndAdresses.setBounds(10, 11, 282, 29);
		panel_2.add(contactsAndAdresses);
		
		JLabel myAccounts = new JLabel("Accounts");
		myAccounts.setForeground(new Color(0, 0, 205));
		myAccounts.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		myAccounts.setBounds(10, 144, 123, 29);
		panel_2.add(myAccounts);
		
		JLabel myPhoneNum = new JLabel("09959668438");
		myPhoneNum.setFont(new Font("Tahoma", Font.BOLD, 12));
		myPhoneNum.setBounds(47, 53, 156, 14);
		panel_2.add(myPhoneNum);
		
		JLabel myEmail = new JLabel("cristaljr@students.national-u.edu.ph");
		myEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		myEmail.setBounds(47, 84, 289, 14);
		panel_2.add(myEmail);
		
		JLabel myAddress = new JLabel("4 C Benitez St. District IV, Cubao, Quezon City.");
		myAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		myAddress.setBounds(47, 115, 289, 14);
		panel_2.add(myAddress);
		
		JLabel fbLogo = new JLabel("fbLogo");
		fbLogo.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.facebook.com/Crystaaaaal1/").toURI());
				}
				catch (Exception e1) {
					
				}
			}
		});
		fbLogo.setIcon(new ImageIcon("C:\\Users\\admin\\OneDrive - National University\\3rd Term (1st yr)\\OOP\\iconsforOOP\\fbLogo.png"));
		fbLogo.setBounds(34, 181, 97, 61);
		panel_2.add(fbLogo);
		
		JLabel gitHubLogo = new JLabel("githubLogo");
		gitHubLogo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://github.com/JCristal30").toURI());
				}
				catch (Exception e1) {
					
				}
			}
		});
		gitHubLogo.setIcon(new ImageIcon("C:\\Users\\admin\\OneDrive - National University\\3rd Term (1st yr)\\OOP\\iconsforOOP\\githubLogo.png"));
		gitHubLogo.setBounds(195, 181, 97, 61);
		panel_2.add(gitHubLogo);
		
		JPanel border3 = new JPanel();
		border3.setBackground(new Color(0, 0, 0));
		border3.setBounds(874, -11, 10, 541);
		frame.getContentPane().add(border3);
		
		JTextArea Description = new JTextArea();
		Description.setForeground(Color.BLACK);
		Description.setBackground(Color.WHITE);
		Description.setEditable(false);
		Description.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		Description.setLineWrap(true);
		Description.setWrapStyleWord(true);
		Description.setText("Hello, my name is Justin Cristal, and I am currently a first-year student pursuing a degree in Information Technology. I have a passion for technology and an interest in programming, which led me to choose this field of study. I am still learning and developing my skills, but I am eager to explore new areas of technology and continue to grow as a developer. ");
		Description.setBounds(301, 330, 449, 228);
		frame.getContentPane().add(Description);
		
		JPanel border2 = new JPanel();
		border2.setBackground(new Color(0, 0, 0));
		border2.setBounds(0, 0, 291, 740);
		frame.getContentPane().add(border2);
		border2.setLayout(null);
		
		JLabel birthDate = new JLabel("Date of birth");
		birthDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		birthDate.setForeground(new Color(255, 255, 255));
		birthDate.setBounds(28, 393, 98, 14);
		border2.add(birthDate);
		
		JLabel aboutMe = new JLabel("Personal Details");
		aboutMe.setBackground(new Color(0, 0, 255));
		aboutMe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		aboutMe.setBounds(40, 340, 214, 42);
		aboutMe.setForeground(new Color(100, 149, 237));
		border2.add(aboutMe);
		
		JLabel birthDate2 = new JLabel("April 30, 2003");
		birthDate2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		birthDate2.setForeground(Color.WHITE);
		birthDate2.setBounds(28, 407, 98, 14);
		border2.add(birthDate2);
		
		JLabel placeOfBirth = new JLabel("Place of birth");
		placeOfBirth.setForeground(Color.WHITE);
		placeOfBirth.setFont(new Font("Tahoma", Font.BOLD, 13));
		placeOfBirth.setBounds(28, 432, 98, 14);
		border2.add(placeOfBirth);
		
		JLabel placeOfBirth2 = new JLabel("Quezon City");
		placeOfBirth2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		placeOfBirth2.setForeground(Color.WHITE);
		placeOfBirth2.setBounds(28, 444, 98, 14);
		border2.add(placeOfBirth2);
		
		JLabel myGender = new JLabel("Gender");
		myGender.setForeground(Color.WHITE);
		myGender.setFont(new Font("Tahoma", Font.BOLD, 13));
		myGender.setBounds(28, 469, 98, 14);
		border2.add(myGender);
		
		JLabel myGender2 = new JLabel("Male");
		myGender2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		myGender2.setForeground(Color.WHITE);
		myGender2.setBounds(28, 481, 98, 14);
		border2.add(myGender2);
		
		JLabel myNationality = new JLabel("Nationality");
		myNationality.setForeground(Color.WHITE);
		myNationality.setFont(new Font("Tahoma", Font.BOLD, 13));
		myNationality.setBounds(28, 506, 98, 14);
		border2.add(myNationality);
		
		JLabel myNationality2 = new JLabel("Filipino");
		myNationality2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		myNationality2.setForeground(Color.WHITE);
		myNationality2.setBounds(28, 519, 98, 14);
		border2.add(myNationality2);
		
		JLabel CivilStatus = new JLabel("Civil Status");
		CivilStatus.setForeground(Color.WHITE);
		CivilStatus.setFont(new Font("Tahoma", Font.BOLD, 13));
		CivilStatus.setBounds(28, 543, 98, 14);
		border2.add(CivilStatus);
		
		JLabel CivilStatus2 = new JLabel("Single");
		CivilStatus2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		CivilStatus2.setForeground(Color.WHITE);
		CivilStatus2.setBounds(28, 556, 98, 14);
		border2.add(CivilStatus2);
		
		JLabel myHome = new JLabel("HOME");
		myHome.setForeground(new Color(0, 0, 0));
		myHome.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				HomePage window = new HomePage();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		myHome.setFont(new Font("Stencil", Font.BOLD, 25));
		myHome.setBounds(324, 11, 78, 42);
		frame.getContentPane().add(myHome);
		
		JLabel AboutMe = new JLabel("ABOUT ME");
		AboutMe.setFont(new Font("Stencil", Font.BOLD, 25));
		AboutMe.setBounds(456, 11, 126, 42);
		frame.getContentPane().add(AboutMe);
		
		MyWorks = new JLabel("WORKS");
		MyWorks.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MyWorks window = new MyWorks();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		MyWorks.setFont(new Font("Stencil", Font.BOLD, 25));
		MyWorks.setBounds(632, 11, 90, 42);
		frame.getContentPane().add(MyWorks);
		
		JButton NextBtn = new JButton("Next");
		NextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutMe2 window = new AboutMe2();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		NextBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		NextBtn.setBounds(469, 581, 89, 34);
		frame.getContentPane().add(NextBtn);
	}
}
