package com.pf.olympic.view;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class PayView extends JFrame {
	public JButton bt_home, bt_match, bt_reservation, bt_cart, bt_mypage;
	public JPanel bg_panel;
	public ImageIcon bg_img;
	public ImageIcon icon_home, icon_match, icon_reserve, icon_cart, icon_mypage;
	public ImageIcon icon_home_mouse, icon_match_mouse, icon_reserve_mouse, icon_cart_mouse, icon_mypage_mouse;
	public JTable table;
	public JScrollPane scrol_table;
	public DefaultTableModel dtm;
	DefaultTableCellRenderer dctr;
	TableColumnModel tcm;
	public JLabel la_name, la_email, la_phone, la_addr;
	public JTextField tf_name, tf_email, tf_phone1, tf_phone2, tf_phone3,tf_addr1, tf_addr2;
	public JLabel la_hyphen1, la_hyphen2;
	public JLabel la_total_price, la_ticket_price, la_delivery_price;
	public JRadioButton rbt_direct, rbt_delivery;
	public JRadioButton rbt_bank, rbt_card;
	public ButtonGroup bg1, bg2;
	public ImageIcon icon_return, icon_pay;
	public JButton bt_return, bt_pay;
	
	public PayView() {
		setTitle("MainView");
		setLayout(null);

		// �������, ���, ����, �¼���ȣ, ����
		Object[][] data = new Object[0][5];
		Object[] columnNames = { "경기정보", "등급", "좌석번호", "수량", "가격" };
		dtm = new DefaultTableModel(data, columnNames);
		table = new JTable(dtm);
		scrol_table = new JScrollPane(table);
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm);
		table.setRowSorter(sorter);
		table.getColumnModel().getColumn(0).setPreferredWidth(600);
		table.getColumnModel().getColumn(1).setPreferredWidth(50);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(50);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.setRowHeight(50);
		table.setFont(new Font("돋움", Font.BOLD, 20));
		
		dctr = new DefaultTableCellRenderer();
		dctr.setHorizontalAlignment(SwingConstants.CENTER);
		tcm = table.getColumnModel();
		for (int i = 0; i < columnNames.length; i++) {
			tcm.getColumn(i).setCellRenderer(dctr);
		}
		
		table.setFont(new Font("돋움", Font.BOLD, 20));

		setContentPane(new JLabel(new ImageIcon("img/view_img/PayView3.jpg")));

		icon_home = new ImageIcon("img/img_icon/icon_home.jpg");
		icon_match = new ImageIcon("img/img_icon/icon_match.jpg");
		icon_reserve = new ImageIcon("img/img_icon/icon_reserve.jpg");
		icon_cart = new ImageIcon("img/img_icon/icon_cart.jpg");
		icon_mypage = new ImageIcon("img/img_icon/icon_mypage.jpg");

		icon_home_mouse = new ImageIcon("img/img_icon/icon_home_mouse.png");
		icon_match_mouse = new ImageIcon("img/img_icon/icon_match_mouse.png");
		icon_reserve_mouse = new ImageIcon("img/img_icon/icon_reserve_mouse.png");
		icon_cart_mouse = new ImageIcon("img/img_icon/icon_cart_mouse.png");
		icon_mypage_mouse = new ImageIcon("img/img_icon/icon_mypage_mouse.png");

		bt_home = new JButton(icon_home);
		bt_match = new JButton(icon_match);
		bt_reservation = new JButton(icon_reserve);
		bt_cart = new JButton(icon_cart);
		bt_mypage = new JButton(icon_mypage);

		bt_home.setRolloverIcon(icon_home_mouse);
		bt_match.setRolloverIcon(icon_match_mouse);
		bt_reservation.setRolloverIcon(icon_reserve_mouse);
		bt_cart.setRolloverIcon(icon_cart_mouse);
		bt_mypage.setRolloverIcon(icon_mypage_mouse);

		// ��ư�� �ܰ����� �����־���.
		/*
		 * bt_home.setBorderPainted(false); bt_match.setBorderPainted(false);
		 * bt_reservation.setBorderPainted(false); bt_cart.setBorderPainted(false);
		 * bt_mypage.setBorderPainted(false);
		 */

		la_name = new JLabel("주문자명");
		la_email = new JLabel("이메일");
		la_phone = new JLabel("휴대폰번호");
		la_hyphen1 = new JLabel("-");
		la_hyphen2 = new JLabel("-");
		la_addr = new JLabel("주소");
		
		tf_name = new JTextField(10);
		tf_email = new JTextField(10);
		tf_phone1 = new JTextField(10);
		tf_phone2 = new JTextField(10);
		tf_phone3 = new JTextField(10);
		tf_addr1 = new JTextField(10);
		tf_addr2 = new JTextField(10);
		
		tf_name.setDocument(new JTextFieldLimit(10));
		tf_email.setDocument(new JTextFieldLimit(18));
		tf_phone1.setDocument(new JTextFieldLimit(4));
		tf_phone2.setDocument(new JTextFieldLimit(4));
		tf_phone3.setDocument(new JTextFieldLimit(4));
		tf_addr1.setDocument(new JTextFieldLimit(18));
		tf_addr2.setDocument(new JTextFieldLimit(18));
		
		
		la_name.setFont(new Font("돋움", Font.BOLD, 20));
		la_email.setFont(new Font("돋움", Font.BOLD, 20));
		la_phone.setFont(new Font("돋움", Font.BOLD, 20));
		la_hyphen1.setFont(new Font("돋움", Font.BOLD, 20));
		la_hyphen2.setFont(new Font("돋움", Font.BOLD, 20));
		la_addr.setFont(new Font("돋움", Font.BOLD, 20));
		
		tf_name.setFont(new Font("돋움", Font.BOLD, 20));
		tf_email.setFont(new Font("돋움", Font.BOLD, 20));
		tf_phone1.setFont(new Font("돋움", Font.BOLD, 20));
		tf_phone2.setFont(new Font("돋움", Font.BOLD, 20));
		tf_phone3.setFont(new Font("돋움", Font.BOLD, 20));
		tf_addr1.setFont(new Font("돋움", Font.BOLD, 20));
		tf_addr2.setFont(new Font("돋움", Font.BOLD, 20));
		
		
		
		rbt_direct = new JRadioButton("현장 수령(무료)");
		rbt_delivery = new JRadioButton("일반 배송(2500원)");
		bg1=new ButtonGroup();
		bg1.add(rbt_direct);
		bg1.add(rbt_delivery);
		
		rbt_direct.setFont(new Font("돋움", Font.BOLD, 18));
		rbt_delivery.setFont(new Font("돋움", Font.BOLD, 18));
		
		rbt_bank = new JRadioButton("무통장 입금");
		rbt_card = new JRadioButton("신용/체크카드");
		bg2=new ButtonGroup();
		bg2.add(rbt_bank);
		bg2.add(rbt_card);
		
		rbt_bank.setFont(new Font("돋움", Font.BOLD, 18));
		rbt_card.setFont(new Font("돋움", Font.BOLD, 18));
		
		la_total_price = new JLabel("6000000");
		la_ticket_price = new JLabel("6000000");
		la_delivery_price = new JLabel("2500");
		
		la_total_price.setFont(new Font("돋움", Font.BOLD, 40));
		la_ticket_price.setFont(new Font("돋움", Font.BOLD, 35));
		la_delivery_price.setFont(new Font("돋움", Font.BOLD, 35));
		
		icon_return = new ImageIcon("img/img_icon/icon_return.png");
		icon_pay = new ImageIcon("img/img_icon/icon_pay.png");
		
		bt_return = new JButton(icon_return);
		bt_pay = new JButton(icon_pay);
		
		bg_panel = new JPanel();
		bt_home.setBounds(0, 184, 213, 54);
		bt_match.setBounds(221, 184, 213, 54);
		bt_reservation.setBounds(442, 184, 213, 54);
		bt_cart.setBounds(665, 184, 213, 54);
		bt_mypage.setBounds(886, 184, 300, 54);

		scrol_table.setBounds(25, 300, 1147, 200);
		
		la_name.setBounds(70, 595, 170, 50);
		la_email.setBounds(75, 625, 170, 50);
		la_phone.setBounds(60, 655, 170, 50);
		la_addr.setBounds(80, 685, 170, 50);
		
		tf_name.setBounds(200, 605, 240, 27);
		tf_email.setBounds(200, 635, 240, 27);
		tf_phone1.setBounds(200, 665, 60, 27);
		la_hyphen1.setBounds(270, 665, 20, 27);
		tf_phone2.setBounds(290, 665, 60, 27);
		la_hyphen2.setBounds(360, 665, 20, 27);
		tf_phone3.setBounds(380, 665, 60, 27);
		tf_addr1.setBounds(200, 695, 300, 27);
		tf_addr2.setBounds(200, 725, 300, 27);
		
		rbt_direct.setBounds(200, 782, 160, 30);
		rbt_delivery.setBounds(360, 782, 190, 30);
		
		la_total_price.setBounds(920, 590, 240, 40);
		la_ticket_price.setBounds(927, 652, 240, 40);
		la_delivery_price.setBounds(990, 698, 240, 40);
		
		rbt_bank.setBounds(800, 783, 160, 30);
		rbt_card.setBounds(960, 783, 160, 30);
		
		bt_return.setBounds(615, 860, 260, 50);
		bt_pay.setBounds(899, 860, 260, 50);

		add(scrol_table);
		
		add(bt_home);
		add(bt_match);
		add(bt_reservation);
		add(bt_cart);
		add(bt_mypage);
		
		add(la_name);
		add(la_email);
		add(la_phone);
		add(la_addr);
		
		add(tf_name);
		add(tf_email);
		add(tf_phone1);
		add(tf_phone2);
		add(tf_phone3);
		add(la_hyphen1);
		add(la_hyphen2);
		add(tf_addr1);
		add(tf_addr2);
		
		add(rbt_direct);
		add(rbt_delivery);		

		add(rbt_bank);
		add(rbt_card);
		
		add(la_total_price);
		add(la_ticket_price);
		add(la_delivery_price);
		
		add(bt_return);
		add(bt_pay);
		
		setBounds(300, 20, 1200, 1000);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new PayView();
	}
}
