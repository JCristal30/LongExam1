import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// parent class
public class HomePage {
	
	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 667, 607);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel nameBorder = new JPanel();
		nameBorder.setBackground(Color.BLACK);
		nameBorder.setBounds(97, 343, 237, 58);
		frame.getContentPane().add(nameBorder);
		nameBorder.setLayout(null);
		
		JLabel myName = new JLabel("Justin R. Cristal");
		myName.setForeground(Color.WHITE);
		myName.setBackground(new Color(0, 255, 255));
		myName.setFont(new Font("Arial", Font.BOLD, 27));
		myName.setBounds(10, 11, 217, 36);
		nameBorder.add(myName);
		
		JLabel myPic1 = new JLabel("myPic1");
		myPic1.setIcon(new ImageIcon("C:\\Users\\admin\\OneDrive - National University\\3rd Term (1st yr)\\OOP\\iconsforOOP\\myPic1.png"));
		myPic1.setBounds(307, 163, 252, 301);
		frame.getContentPane().add(myPic1);
		
		JPanel separatorDesign = new JPanel();
		separatorDesign.setBackground(Color.BLACK);
		separatorDesign.setBounds(432, 0, 219, 568);
		frame.getContentPane().add(separatorDesign);
		separatorDesign.setLayout(null);
		
		JLabel design1 = new JLabel("***");
		design1.setForeground(Color.WHITE);
		design1.setFont(new Font("Tahoma", Font.BOLD, 48));
		design1.setBounds(116, 11, 93, 31);
		separatorDesign.add(design1);
		
		JLabel welcome = new JLabel("Welcome");
		welcome.setForeground(new Color(0, 0, 0));
		welcome.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
		welcome.setBounds(27, 127, 207, 50);
		frame.getContentPane().add(welcome);
		
		JLabel tomy = new JLabel("TO MY");
		tomy.setFont(new Font("Tahoma", Font.BOLD, 40));
		tomy.setBounds(30, 170, 155, 58);
		frame.getContentPane().add(tomy);
		
		JLabel portfolio = new JLabel("PORTFOLIO");
		portfolio.setFont(new Font("Tahoma", Font.BOLD, 40));
		portfolio.setBounds(34, 226, 249, 50);
		frame.getContentPane().add(portfolio);
		
		JLabel design2 = new JLabel("***");
		design2.setForeground(Color.BLACK);
		design2.setFont(new Font("Tahoma", Font.BOLD, 48));
		design2.setBounds(10, 526, 130, 31);
		frame.getContentPane().add(design2);
		
		JLabel home = new JLabel("HOME");
		home.setBackground(Color.BLACK);
		home.setFont(new Font("Stencil", Font.BOLD, 25));
		home.setBounds(27, 11, 73, 31);
		frame.getContentPane().add(home);
		
		JLabel aboutMe = new JLabel("ABOUT ME");
		aboutMe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutMe window = new AboutMe();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		aboutMe.setFont(new Font("Stencil", Font.BOLD, 25));
		aboutMe.setBounds(139, 11, 130, 31);
		frame.getContentPane().add(aboutMe);
		
		JLabel myWorks = new JLabel("WORKS");
		myWorks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyWorks window = new MyWorks();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		myWorks.setFont(new Font("Stencil", Font.BOLD, 25));
		myWorks.setBounds(303, 11, 90, 31);
		frame.getContentPane().add(myWorks);
	}
}
