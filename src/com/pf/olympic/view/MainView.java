package com.pf.olympic.view;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainView extends JFrame{
	public JButton bt_home, bt_match, bt_reservation, bt_cart, bt_mypage, bt_login, bt_join;
	public JTextField tf_id;
	public JPasswordField tf_pw;
	public JPanel bg_panel;
	public ImageIcon bg_img;
	public ImageIcon icon_home, icon_match, icon_reserve, icon_cart, icon_mypage;
	public ImageIcon icon_home_mouse, icon_match_mouse, icon_reserve_mouse, icon_cart_mouse, icon_mypage_mouse;
	public ImageIcon icon_login, icon_join;
	
	public MainView() {
		setTitle("MainView");
		setLayout(null);
		
		setContentPane(new JLabel(new ImageIcon("img/view_img/mainview3.png")));
		
		icon_home = new ImageIcon("img/img_icon/icon_home.jpg");
		icon_match = new ImageIcon("img/img_icon/icon_match.jpg");
		icon_reserve = new ImageIcon("img/img_icon/icon_reserve.jpg");
		icon_cart = new ImageIcon("img/img_icon/icon_cart.jpg");
		icon_mypage = new ImageIcon("img/img_icon/icon_mypage.jpg");
		icon_login = new ImageIcon("img/img_icon/icon_login.jpg");
		icon_join = new ImageIcon("img/img_icon/icon_join.jpg");
		
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
		bt_login = new JButton(icon_login);
		bt_join = new JButton(icon_join);
		
		//버튼의 외곽선을 없애주었다.
		/*bt_home.setBorderPainted(false);
		bt_match.setBorderPainted(false);
		bt_reservation.setBorderPainted(false);
		bt_cart.setBorderPainted(false);
		bt_mypage.setBorderPainted(false);*/
		
		//마우스를 버튼에 올리면 파란색 언더바생성!
		bt_home.setRolloverIcon(icon_home_mouse);
		bt_match.setRolloverIcon(icon_match_mouse);
		bt_reservation.setRolloverIcon(icon_reserve_mouse);
		bt_cart.setRolloverIcon(icon_cart_mouse);
		bt_mypage.setRolloverIcon(icon_mypage_mouse);
		
		tf_id = new JTextField(10);
		tf_pw = new JPasswordField(10);
		
		bg_panel = new JPanel();
		
		bt_home.setBounds(0, 184, 213, 54);
		bt_match.setBounds(221, 184, 213, 54);
		bt_reservation.setBounds(442, 184, 213, 54);
		bt_cart.setBounds(665, 184, 213, 54);
		bt_mypage.setBounds(886, 184, 300, 54);
		
		tf_id.setBounds(980, 310, 170, 50);
		tf_pw.setBounds(980, 395, 170, 50);
		tf_id.setFont(new Font("돋움", Font.BOLD, 35));
		tf_pw.setFont(new Font("돋움", Font.BOLD, 35));
		
		bt_login.setBounds(912, 492, 259, 60);
		bt_join.setBounds(912, 564, 259, 60);
		
		add(bt_home);
		add(bt_match);
		add(bt_reservation);
		add(bt_cart);
		add(bt_mypage);
		add(tf_id);
		add(tf_pw);
		add(bt_login);
		add(bt_join);
		
		setBounds(300, 20, 1200, 1000);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new MainView();
	}

}
