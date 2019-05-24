import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DialKeyPad extends JFrame {
	private static final long serialVersionUID = 1L;

	public DialKeyPad(String title)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 250);
		setTitle(title);
		
		setLayout(new BorderLayout());
		JPanel np = new JPanel(new GridLayout(2, 1));
		JPanel np2 = new JPanel(new GridLayout(1, 4));
		JTextField tf = new JTextField();
		tf.setText(" ");
		np.add(np2); np.add(tf);
		np2.add(new JButton("키패드")); np2.add(new JButton("최근기록")); np2.add(new JButton("즐겨찾기")); np2.add(new JButton("연락처"));
		add(np, BorderLayout.NORTH);
		
		// 5번 문제
		JPanel sp = new JPanel(new GridLayout(1, 2));
		JPanel sp2 = new JPanel(new GridLayout(1, 2));
		sp.add(new JButton("전화걸기")); sp.add(sp2);
		sp2.add(new JButton("이전")); sp2.add(new JButton("지우기"));
		add(sp, BorderLayout.SOUTH);
		
		JPanel cp = new JPanel(new GridLayout(4, 3, 10, 5));
		cp.add(new JButton("1")); cp.add(new JButton("2")); cp.add(new JButton("3"));
		cp.add(new JButton("4")); cp.add(new JButton("5")); cp.add(new JButton("6"));
		cp.add(new JButton("7")); cp.add(new JButton("8")); cp.add(new JButton("9"));
		cp.add(new JButton("*")); cp.add(new JButton("0")); cp.add(new JButton("#"));
		add(cp, BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		DialKeyPad dial = new DialKeyPad("Dial Pad");

	}

}
