package com.pf.olympic.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class ReserveView extends JFrame {
	public JButton bt_home, bt_match, bt_reservation, bt_cart, bt_mypage;
	public JPanel bg_panel;
	public ImageIcon bg_img;
	public ImageIcon icon_home, icon_match, icon_reserve, icon_cart, icon_mypage;
	public ImageIcon icon_home_mouse, icon_match_mouse, icon_reserve_mouse, icon_cart_mouse, icon_mypage_mouse;
	public JLabel la_match_name, la_match_date, la_match_starttime, la_hyphen, la_match_endtime, la_stadium_category, la_slash,la_stadium_name;
	public JLabel la_stadium;
	public ImageIcon img_stadium, img_picture;
	public JLabel la_match;
	public JLabel la_A_basic_price, la_A_wheel_price, la_A_partner_price;
	public JLabel la_B_basic_price, la_B_wheel_price, la_B_partner_price;
	public JComboBox<String> cb_quantity1, cb_quantity2, cb_quantity3, cb_quantity4, cb_quantity5, cb_quantity6;
	String[] quantity = {"0","1","2","3","4","5","6","7","8"};
	public JLabel la_quantity1, la_quantity2, la_quantity3, la_quantity4, la_quantity5, la_quantity6;  
	public JTable table;
	public JScrollPane scrol_table;
	public DefaultTableModel dtm;
	DefaultTableCellRenderer dctr;
	TableColumnModel tcm;
	//public JLabel la_quantity_str, la_total_quantity;
	public JLabel la_total_str, la_total_price;
	public ImageIcon icon_toList, icon_toCart;
	public JButton bt_toList, bt_toCart;
	
	public ReserveView() {
		setTitle("MainView");
		setLayout(null);
		
		setContentPane(new JLabel(new ImageIcon("img/view_img/ReserveView6.jpg")));
		
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
		
		//��ư�� �ܰ����� �����־���.
		/*bt_home.setBorderPainted(false);
		bt_match.setBorderPainted(false);
		bt_reservation.setBorderPainted(false);
		bt_cart.setBorderPainted(false);
		bt_mypage.setBorderPainted(false);*/
	

		la_match_name = new JLabel("바이애슬론 남성 계주 x 7.5km");
		la_match_date = new JLabel("2018년 2월 23일(금)");
		la_match_starttime = new JLabel("20:15");
		la_hyphen = new JLabel("~");
		la_match_endtime = new JLabel("21:45");
		la_stadium_category = new JLabel("평창 마운틴 클러스터");
		la_slash = new JLabel("/");
		la_stadium_name = new JLabel("알펜시아 바이애슬론 센터");
		
		//la_total_price.setFont(new Font("����", Font.BOLD, 40));
		la_match_name.setFont(new Font("돋움", Font.BOLD, 25));
		la_match_date.setFont(new Font("돋움", Font.BOLD, 18));
		la_match_starttime.setFont(new Font("돋움", Font.BOLD, 18));
		la_hyphen.setFont(new Font("돋움", Font.BOLD, 18));
		la_match_endtime.setFont(new Font("돋움", Font.BOLD, 18));
		la_stadium_category.setFont(new Font("돋움", Font.BOLD, 18));
		la_slash.setFont(new Font("돋움", Font.BOLD, 18));
		la_stadium_name.setFont(new Font("돋움", Font.BOLD, 18));		
		
		
		img_stadium = new ImageIcon("img/img_icon/img_stadium_bi.png");
		la_stadium = new JLabel(img_stadium);
		
		img_picture = new ImageIcon("img/img_icon/pic_bi.png");
		la_match = new JLabel(img_picture);
		
		la_A_basic_price = new JLabel("100000");
		cb_quantity1 = new JComboBox<>(quantity);
		la_quantity1 = new JLabel("매");
		la_A_wheel_price = new JLabel("20000");
		cb_quantity2 = new JComboBox<>(quantity);
		la_quantity2 = new JLabel("매");
		la_A_partner_price = new JLabel("20000");
		cb_quantity3 = new JComboBox<>(quantity);
		la_quantity3 = new JLabel("매");
		la_B_basic_price = new JLabel("20000");
		cb_quantity4 = new JComboBox<>(quantity);
		la_quantity4 = new JLabel("매");
		la_B_wheel_price = new JLabel("10000");
		cb_quantity5 = new JComboBox<>(quantity);
		la_quantity5 = new JLabel("매");
		la_B_partner_price = new JLabel("10000");
		cb_quantity6 = new JComboBox<>(quantity);
		la_quantity6 = new JLabel("매");
		
		la_A_basic_price.setFont(new Font("돋움", Font.BOLD, 18));
		la_A_wheel_price.setFont(new Font("돋움", Font.BOLD, 18));
		la_A_partner_price.setFont(new Font("돋움", Font.BOLD, 18));
		la_B_basic_price.setFont(new Font("돋움", Font.BOLD, 18));
		la_B_wheel_price.setFont(new Font("돋움", Font.BOLD, 18));
		la_B_partner_price.setFont(new Font("돋움", Font.BOLD, 18));
		
		cb_quantity1.setFont(new Font("돋움", Font.BOLD, 18));
		cb_quantity2.setFont(new Font("돋움", Font.BOLD, 18));
		cb_quantity3.setFont(new Font("돋움", Font.BOLD, 18));
		cb_quantity4.setFont(new Font("돋움", Font.BOLD, 18));
		cb_quantity5.setFont(new Font("돋움", Font.BOLD, 18));
		cb_quantity6.setFont(new Font("돋움", Font.BOLD, 18));
		
		la_quantity1.setFont(new Font("돋움", Font.BOLD, 18));
		la_quantity2.setFont(new Font("돋움", Font.BOLD, 18));
		la_quantity3.setFont(new Font("돋움", Font.BOLD, 18));
		la_quantity4.setFont(new Font("돋움", Font.BOLD, 18));
		la_quantity5.setFont(new Font("돋움", Font.BOLD, 18));
		la_quantity6.setFont(new Font("돋움", Font.BOLD, 18));
		
		Object[][] data = new Object[0][3];
		Object[] columnNames = { "좌석등급", "수량", "가격"};
		dtm = new DefaultTableModel(data, columnNames);
		table = new JTable(dtm);
		scrol_table = new JScrollPane(table);
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm);
		table.setRowSorter(sorter);
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		table.getColumnModel().getColumn(1).setPreferredWidth(50);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.setRowHeight(50);
		table.setFont(new Font("돋움", Font.BOLD, 20));
		
		dctr = new DefaultTableCellRenderer();
		dctr.setHorizontalAlignment(SwingConstants.CENTER);
		tcm = table.getColumnModel();
		for (int i = 0; i < columnNames.length; i++) {
			tcm.getColumn(i).setCellRenderer(dctr);
		}
		
		table.setFont(new Font("돋움", Font.BOLD, 20));
		
		la_total_str = new JLabel("총 예상 결제 금액     \\");
		la_total_price = new JLabel("10000");
		
		la_total_str.setFont(new Font("돋움", Font.BOLD, 20));
		la_total_price.setFont(new Font("돋움", Font.BOLD, 20));
		
		la_total_str.setForeground(Color.WHITE);
		la_total_price.setForeground(Color.WHITE);
		
		icon_toList = new ImageIcon("img/img_icon/icon_toList.png");
		icon_toCart = new ImageIcon("img/img_icon/icon_toCart.png");
		
		bt_toList = new JButton(icon_toList);
		bt_toCart = new JButton(icon_toCart);
		
		bg_panel = new JPanel();
		
		bt_home.setBounds(0, 184, 213, 54);
		bt_match.setBounds(221, 184, 213, 54);
		bt_reservation.setBounds(442, 184, 213, 54);
		bt_cart.setBounds(665, 184, 213, 54);
		bt_mypage.setBounds(886, 184, 300, 54);
		
		la_match_name.setBounds(100, 290, 500, 50);
		la_match_date.setBounds(100, 340, 200, 30);
		la_match_starttime.setBounds(100, 360, 70, 30);
		la_hyphen.setBounds(160, 360, 20, 30);
		la_match_endtime.setBounds(190, 360, 70, 30);
		la_stadium_category.setBounds(100, 380, 190, 30);
		la_slash.setBounds(290, 380, 10, 30);
		la_stadium_name.setBounds(300, 380, 250, 30);

		la_stadium.setBounds(41, 471, 607, 232);
		
		la_match.setBounds(41, 725, 607, 220);
		
		la_A_basic_price.setBounds(985, 341, 100, 30);
		cb_quantity1.setBounds(1060, 341, 50, 30);
		la_quantity1.setBounds(1113, 341, 50, 30);
		la_A_wheel_price.setBounds(995, 393, 100, 30);
		cb_quantity2.setBounds(1060, 393, 50, 30);
		la_quantity2.setBounds(1113, 393, 50, 30);
		la_A_partner_price.setBounds(995, 443, 100, 30);
		cb_quantity3.setBounds(1060, 443, 50, 30);
		la_quantity3.setBounds(1113, 443, 50, 30);
		la_B_basic_price.setBounds(995, 494, 100, 30);
		cb_quantity4.setBounds(1060, 494, 50, 30);
		la_quantity4.setBounds(1113, 494, 50, 30);
		la_B_wheel_price.setBounds(995, 547, 100, 30);
		cb_quantity5.setBounds(1060, 547, 50, 30);
		la_quantity5.setBounds(1113, 547, 50, 30);
		la_B_partner_price.setBounds(995, 597, 100, 30);
		cb_quantity2.setBounds(1060, 597, 50, 30);
		la_quantity2.setBounds(1113, 597, 50, 30);
		
		scrol_table.setBounds(677, 662, 487, 140);
		
		/*la_total_str.setBounds(770, 767, 250, 50);
		la_total_price.setBounds(1002, 767, 200, 50);*/
		
		la_total_str.setBounds(770, 810, 250, 50);
		la_total_price.setBounds(1002, 810, 200, 50);
		
		bt_toList.setBounds(676, 892, 222, 58);
		bt_toCart.setBounds(941, 892, 222, 58);
		
		add(bt_home);
		add(bt_match);
		add(bt_reservation);
		add(bt_cart);
		add(bt_mypage);
		
		//la_match_name, la_match_date, la_match_starttime, la_hyphen, 
		//la_match_endtime, la_stadium_category, la_slash,la_stadium_name;
		add(la_match_name);
		add(la_match_date);
		add(la_match_starttime);
		add(la_hyphen);
		add(la_match_endtime);
		add(la_stadium_category);
		add(la_slash);
		add(la_stadium_name);
		
		add(la_stadium);
		
		add(la_match);
		
		add(la_A_basic_price);
		add(la_A_wheel_price);
		add(la_A_partner_price);
		add(la_B_basic_price);
		add(la_B_wheel_price);
		add(la_B_partner_price);
		
		add(cb_quantity1);
		add(cb_quantity2);
		add(cb_quantity3);
		add(cb_quantity4);
		add(cb_quantity5);
		add(cb_quantity6);
		
		add(la_quantity1);
		add(la_quantity2);
		add(la_quantity3);
		add(la_quantity4);
		add(la_quantity5);
		add(la_quantity6);
		
		add(scrol_table);
		
		add(la_total_str);
		add(la_total_price);
		
		add(bt_toList);
		add(bt_toCart);
		
		setBounds(300, 20, 1200, 1000);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new ReserveView();
	}
}