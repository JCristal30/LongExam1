import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

//sub class
public class MyWorks extends HomePage {

	/**
	 * Create the application.
	 */
	
	public MyWorks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 770, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 100, 0));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 754, 53);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel myWorks = new JLabel("WORKS");
		myWorks.setFont(new Font("Tahoma", Font.BOLD, 21));
		myWorks.setForeground(new Color(255, 255, 255));
		myWorks.setBounds(514, 11, 91, 31);
		panel.add(myWorks);
		
		JLabel AboutMe = new JLabel("ABOUT ME");
		AboutMe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutMe window = new AboutMe();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		AboutMe.setForeground(Color.WHITE);
		AboutMe.setFont(new Font("Tahoma", Font.BOLD, 21));
		AboutMe.setBounds(316, 11, 124, 31);
		panel.add(AboutMe);
		
		JLabel Home = new JLabel("HOME");
		Home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomePage window = new HomePage();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		Home.setForeground(Color.WHITE);
		Home.setFont(new Font("Tahoma", Font.BOLD, 21));
		Home.setBounds(167, 11, 81, 31);
		panel.add(Home);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 0, 0));
		panel_1.setBounds(10, 122, 221, 270);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel work1 = new JLabel("progressBar");
		work1.setIcon(new ImageIcon("C:\\Users\\admin\\OneDrive - National University\\3rd Term (1st yr)\\OOP\\iconsforOOP\\progressBar.png"));
		work1.setBounds(10, 11, 201, 248);
		panel_1.add(work1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(128, 0, 0));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(269, 122, 221, 270);
		frame.getContentPane().add(panel_1_1);
		
		JLabel work2 = new JLabel("calculator");
		work2.setIcon(new ImageIcon("C:\\Users\\admin\\OneDrive - National University\\3rd Term (1st yr)\\OOP\\iconsforOOP\\Calculator.png"));
		work2.setBounds(10, 11, 201, 248);
		panel_1_1.add(work2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(128, 0, 0));
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(523, 122, 221, 270);
		frame.getContentPane().add(panel_1_2);
		
		JLabel work3 = new JLabel("Snakegame");
		work3.setIcon(new ImageIcon("C:\\Users\\admin\\OneDrive - National University\\3rd Term (1st yr)\\OOP\\iconsforOOP\\SnakeGame.png"));
		work3.setBounds(10, 11, 201, 248);
		panel_1_2.add(work3);
		
		JLabel MyWorks = new JLabel("MY WORKS");
		MyWorks.setForeground(Color.BLACK);
		MyWorks.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
		MyWorks.setBounds(285, 66, 180, 45);
		frame.getContentPane().add(MyWorks);
	}
	

}
