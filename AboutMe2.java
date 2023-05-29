import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

//sub class
public class AboutMe2 extends HomePage {
	
	/**
	 * Create the application.
	 */
	public AboutMe2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 667, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel separatorDesign5 = new JPanel();
		separatorDesign5.setBackground(new Color(0, 0, 0));
		separatorDesign5.setBounds(448, 0, 4, 371);
		frame.getContentPane().add(separatorDesign5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 651, 53);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel aboutMe = new JLabel("ABOUT ME");
		aboutMe.setFont(new Font("Tahoma", Font.BOLD, 19));
		aboutMe.setBounds(277, 11, 102, 29);
		aboutMe.setForeground(new Color(255, 255, 255));
		panel_1.add(aboutMe);
		
		JLabel myEducation = new JLabel("Education");
		myEducation.setForeground(new Color(0, 0, 205));
		myEducation.setFont(new Font("Tahoma", Font.BOLD, 20));
		myEducation.setBounds(10, 64, 120, 33);
		frame.getContentPane().add(myEducation);
		
		JLabel Elementary = new JLabel("Elementary");
		Elementary.setFont(new Font("Tahoma", Font.BOLD, 13));
		Elementary.setBounds(20, 101, 85, 19);
		frame.getContentPane().add(Elementary);
		
		JLabel elemSchool = new JLabel("Manuel L. Quezon Elementary School");
		elemSchool.setFont(new Font("Tahoma", Font.PLAIN, 13));
		elemSchool.setBounds(20, 121, 225, 19);
		frame.getContentPane().add(elemSchool);
		
		JLabel elemDate = new JLabel("Jun 2009 - Mar 2015");
		elemDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		elemDate.setBounds(293, 101, 145, 19);
		frame.getContentPane().add(elemDate);
		
		JLabel HighSchool = new JLabel("High School");
		HighSchool.setFont(new Font("Tahoma", Font.BOLD, 13));
		HighSchool.setBounds(20, 145, 85, 19);
		frame.getContentPane().add(HighSchool);
		
		JLabel hsSchool = new JLabel("Ponciano Bernardo High School ");
		hsSchool.setFont(new Font("Tahoma", Font.PLAIN, 13));
		hsSchool.setBounds(20, 165, 225, 19);
		frame.getContentPane().add(hsSchool);
		
		JLabel hsDate = new JLabel("Jun 2015 - Mar 2020");
		hsDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		hsDate.setBounds(293, 145, 145, 19);
		frame.getContentPane().add(hsDate);
		
		JLabel SHS = new JLabel("Senior High School");
		SHS.setFont(new Font("Tahoma", Font.BOLD, 13));
		SHS.setBounds(20, 189, 120, 19);
		frame.getContentPane().add(SHS);
		
		JLabel ShsSchool = new JLabel("Systems Plus Computer College");
		ShsSchool.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ShsSchool.setBounds(20, 209, 225, 19);
		frame.getContentPane().add(ShsSchool);
		
		JLabel ShsDate = new JLabel("Sep 2020 - Jul 2022");
		ShsDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		ShsDate.setBounds(293, 189, 145, 19);
		frame.getContentPane().add(ShsDate);
		
		JLabel College = new JLabel("College");
		College.setFont(new Font("Tahoma", Font.BOLD, 13));
		College.setBounds(20, 233, 120, 19);
		frame.getContentPane().add(College);
		
		JLabel collegeSchool = new JLabel("National University");
		collegeSchool.setFont(new Font("Tahoma", Font.PLAIN, 13));
		collegeSchool.setBounds(20, 253, 225, 19);
		frame.getContentPane().add(collegeSchool);
		
		JLabel mySkills = new JLabel("Skills");
		mySkills.setForeground(new Color(0, 0, 205));
		mySkills.setFont(new Font("Tahoma", Font.BOLD, 17));
		mySkills.setBounds(462, 64, 120, 33);
		frame.getContentPane().add(mySkills);
		
		JLabel date = new JLabel("Aug 2022 - Present");
		date.setFont(new Font("Tahoma", Font.BOLD, 13));
		date.setBounds(293, 233, 145, 19);
		frame.getContentPane().add(date);
		
		JLabel editing = new JLabel("Video Editing");
		editing.setFont(new Font("Tahoma", Font.BOLD, 13));
		editing.setBounds(462, 104, 85, 19);
		frame.getContentPane().add(editing);
		
		JLabel java = new JLabel("Java");
		java.setFont(new Font("Tahoma", Font.BOLD, 13));
		java.setBounds(462, 121, 85, 19);
		frame.getContentPane().add(java);
		
		JPanel separatorDesign1 = new JPanel();
		separatorDesign1.setLayout(null);
		separatorDesign1.setBackground(Color.BLACK);
		separatorDesign1.setBounds(0, 283, 651, 4);
		frame.getContentPane().add(separatorDesign1);
		
		JLabel myCourses = new JLabel("Courses");
		myCourses.setForeground(new Color(0, 0, 205));
		myCourses.setFont(new Font("Tahoma", Font.BOLD, 20));
		myCourses.setBounds(10, 298, 120, 33);
		frame.getContentPane().add(myCourses);
		
		JLabel myCourse = new JLabel("Information Technology");
		myCourse.setFont(new Font("Tahoma", Font.BOLD, 13));
		myCourse.setBounds(20, 334, 179, 19);
		frame.getContentPane().add(myCourse);
		
		JLabel present = new JLabel("Present");
		present.setFont(new Font("Tahoma", Font.BOLD, 13));
		present.setBounds(293, 337, 145, 19);
		frame.getContentPane().add(present);
		
		JPanel separatorDesign2 = new JPanel();
		separatorDesign2.setLayout(null);
		separatorDesign2.setBackground(Color.BLACK);
		separatorDesign2.setBounds(0, 367, 651, 4);
		frame.getContentPane().add(separatorDesign2);
		
		JLabel myHobbies = new JLabel("Hobbies");
		myHobbies.setForeground(new Color(0, 0, 205));
		myHobbies.setFont(new Font("Tahoma", Font.BOLD, 17));
		myHobbies.setBounds(462, 298, 120, 33);
		frame.getContentPane().add(myHobbies);
		
		JLabel movies = new JLabel("Watch movies and anime");
		movies.setFont(new Font("Tahoma", Font.BOLD, 13));
		movies.setBounds(462, 334, 179, 19);
		frame.getContentPane().add(movies);
		
		JLabel language = new JLabel("Language");
		language.setForeground(new Color(0, 0, 205));
		language.setFont(new Font("Tahoma", Font.BOLD, 17));
		language.setBounds(462, 180, 120, 33);
		frame.getContentPane().add(language);
		
		JLabel language2 = new JLabel("Filipino");
		language2.setFont(new Font("Tahoma", Font.BOLD, 13));
		language2.setBounds(462, 212, 85, 19);
		frame.getContentPane().add(language2);
		
		JLabel language3 = new JLabel("English");
		language3.setFont(new Font("Tahoma", Font.BOLD, 13));
		language3.setBounds(462, 236, 85, 19);
		frame.getContentPane().add(language3);
		
		JPanel separatorDesign3 = new JPanel();
		separatorDesign3.setBackground(new Color(0, 0, 0));
		separatorDesign3.setBounds(452, 160, 197, 4);
		frame.getContentPane().add(separatorDesign3);
		
		JLabel Certificates = new JLabel("Achievements");
		Certificates.setForeground(new Color(0, 0, 205));
		Certificates.setFont(new Font("Tahoma", Font.BOLD, 20));
		Certificates.setBounds(13, 384, 186, 33);
		frame.getContentPane().add(Certificates);
		
		JLabel Certificates2 = new JLabel("Certificate of Excellence");
		Certificates2.setFont(new Font("Tahoma", Font.BOLD, 13));
		Certificates2.setBounds(20, 418, 179, 19);
		frame.getContentPane().add(Certificates2);
		
		JLabel Certificates3 = new JLabel("Graduated with Honor in High School and Senior High");
		Certificates3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Certificates3.setBounds(23, 437, 315, 19);
		frame.getContentPane().add(Certificates3);
		
		JPanel separatorDesign4 = new JPanel();
		separatorDesign4.setLayout(null);
		separatorDesign4.setBackground(Color.BLACK);
		separatorDesign4.setBounds(0, 467, 651, 4);
		frame.getContentPane().add(separatorDesign4);
		
		JButton PrevBtn = new JButton("Previous");
		PrevBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutMe window = new AboutMe();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		PrevBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		PrevBtn.setBounds(264, 481, 107, 34);
		frame.getContentPane().add(PrevBtn);
	}
	
}
