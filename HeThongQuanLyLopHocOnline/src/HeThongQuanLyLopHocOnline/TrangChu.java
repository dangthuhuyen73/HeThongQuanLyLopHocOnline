package QuanLyLopHoc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrangChu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChu frame = new TrangChu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TrangChu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		setLocationRelativeTo(null);//Đưa JFrame ra giữa màn hình
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 121));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);


		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 0));
		panel.setBounds(0, 0, 76, 700);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton TrangChu_Button = new JButton("");
		// Load ảnh gốc
		ImageIcon originalIcon = new ImageIcon(TrangChu.class.getResource("/ICON/house.png"));
		// Resize ảnh theo kích thước của JButton
		Image resizedImage = originalIcon.getImage().getScaledInstance(56, 47, Image.SCALE_SMOOTH);
		// Gán ảnh đã resize vào JButton
		TrangChu_Button.setIcon(new ImageIcon(resizedImage));
		TrangChu_Button.setBounds(0, 79, 76, 76);
		TrangChu_Button.setOpaque(false);  // Ẩn màu nền
		TrangChu_Button.setContentAreaFilled(false);  // Ẩn khu vực nền của nút
		TrangChu_Button.setBorderPainted(false);  // Ẩn viền của nút
		panel.add(TrangChu_Button);
		
		JButton Student_Button = new JButton("");
		Student_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student studentFrame =new Student();
				studentFrame.setVisible(true);
				 dispose();
			}
		});
		ImageIcon originalIcon1 = new ImageIcon(TrangChu.class.getResource("/ICON/student.png"));
		// Resize ảnh theo kích thước của JButton
		Image resizedImage1 = originalIcon1.getImage().getScaledInstance(56, 47, Image.SCALE_SMOOTH);
		// Gán ảnh đã resize vào JButton
	    Student_Button.setIcon(new ImageIcon(resizedImage1));
		Student_Button.setOpaque(false);
		Student_Button.setContentAreaFilled(false);
		Student_Button.setBorderPainted(false);
		Student_Button.setBounds(0, 147, 76, 76);
		panel.add(Student_Button);
		
		
		JButton Teach_Button = new JButton("");
		Teach_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ImageIcon originalIcon2 = new ImageIcon(TrangChu.class.getResource("/ICON/teach.png"));
		// Resize ảnh theo kích thước của JButton
		Image resizedImage2 = originalIcon2.getImage().getScaledInstance(56, 47, Image.SCALE_SMOOTH);
		// Gán ảnh đã resize vào JButton
	    Teach_Button.setIcon(new ImageIcon(resizedImage2));
		Teach_Button.setOpaque(false);
		Teach_Button.setContentAreaFilled(false);
		Teach_Button.setBorderPainted(false);
		Teach_Button.setBounds(0, 232, 76, 76);
		panel.add(Teach_Button);
		
		JButton Manage_Button = new JButton("");
		ImageIcon originalIcon3 = new ImageIcon(TrangChu.class.getResource("/ICON/manager.png"));
		// Resize ảnh theo kích thước của JButton
		Image resizedImage3 = originalIcon3.getImage().getScaledInstance(56, 47, Image.SCALE_SMOOTH);
		// Gán ảnh đã resize vào JButton
	    Manage_Button.setIcon(new ImageIcon(resizedImage3));
		Manage_Button.setOpaque(false);
		Manage_Button.setContentAreaFilled(false);
		Manage_Button.setBorderPainted(false);
		Manage_Button.setBounds(0, 307, 76, 76);
		panel.add(Manage_Button);
		
		JButton BaiTap_Button = new JButton("");
		ImageIcon originalIcon4 = new ImageIcon(TrangChu.class.getResource("/ICON/BaiTap.png"));
		// Resize ảnh theo kích thước của JButton
		Image resizedImage4 = originalIcon4.getImage().getScaledInstance(56, 47, Image.SCALE_SMOOTH);
		// Gán ảnh đã resize vào JButton
	    BaiTap_Button.setIcon(new ImageIcon(resizedImage4));
		BaiTap_Button.setOpaque(false);
		BaiTap_Button.setContentAreaFilled(false);
		BaiTap_Button.setBorderPainted(false);
		BaiTap_Button.setBounds(0, 385, 76, 76);
		panel.add(BaiTap_Button);
		
		JButton Exit_Button = new JButton("");
		ImageIcon originalIcon5 = new ImageIcon(TrangChu.class.getResource("/ICON/EXIT.png"));
		// Resize ảnh theo kích thước của JButton
		Image resizedImage5 = originalIcon5.getImage().getScaledInstance(56, 47, Image.SCALE_SMOOTH);
		// Gán ảnh đã resize vào JButton
	    Exit_Button.setIcon(new ImageIcon(resizedImage5));
		Exit_Button.setOpaque(false);
		Exit_Button.setContentAreaFilled(false);
		Exit_Button.setBorderPainted(false);
		Exit_Button.setBounds(0, 586, 76, 76);
		panel.add(Exit_Button);

		Exit_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(
					TrangChu.this,
					"Bạn có chắc chắn muốn thoát không?",
					"Xác nhận thoát",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE
				);
				if (confirm == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		JLabel logo = new JLabel("New label");
		logo.setBounds(5, 22, 69, 69);
		panel.add(logo);
		
		JLabel TrangChu = new JLabel("Trang Chủ");
		TrangChu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		TrangChu.setForeground(new Color(255, 255, 255));
		TrangChu.setBounds(103, 39, 121, 43);
		contentPane.add(TrangChu);
		
		JPanel TrangChinh = new JPanel();
		TrangChinh.setBounds(81, 11, 895, 652);
		TrangChinh.setBackground(new Color(0, 0, 121));
		contentPane.add(TrangChinh);
		TrangChinh.setLayout(null); // để tự do đặt vị trí các thành phần bên trong
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 109, 443, 267); // vị trí tùy chỉnh trong TrangChinh
		TrangChinh.add(panel_1); // Thêm panel_1 vào bên trong TrangChinh
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 387, 875, 254);
		TrangChinh.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(468, 109, 417, 267);
		TrangChinh.add(panel_1_2);
		
		
	}
}
