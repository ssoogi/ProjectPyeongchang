package com.pf.olympic.view;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CustomerView extends JFrame {
	public JButton bt_home, bt_match, bt_reservation, bt_cart, bt_mypage;
	public JPanel bg_panel;
	public ImageIcon bg_img;
	public ImageIcon icon_home, icon_match, icon_reserve, icon_cart, icon_mypage;
	public ImageIcon icon_home_mouse, icon_match_mouse, icon_reserve_mouse, icon_cart_mouse, icon_mypage_mouse;
	
	public CustomerView() {
		setTitle("MainView");
		setLayout(null);
		
		setContentPane(new JLabel(new ImageIcon("img/view_img/mainview2.jpg")));
		
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
		
		/*bt_home.setBorderPainted(false);
		bt_match.setBorderPainted(false);
		bt_reservation.setBorderPainted(false);
		bt_cart.setBorderPainted(false);
		bt_mypage.setBorderPainted(false);*/
	
		
		bg_panel = new JPanel();
		
		bt_home.setBounds(0, 184, 213, 54);
		bt_match.setBounds(221, 184, 213, 54);
		bt_reservation.setBounds(442, 184, 213, 54);
		bt_cart.setBounds(665, 184, 213, 54);
		bt_mypage.setBounds(886, 184, 300, 54);
		
		add(bt_home);
		add(bt_match);
		add(bt_reservation);
		add(bt_cart);
		add(bt_mypage);
		
		setBounds(300, 20, 1200, 1000);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new CustomerView();
	}
}
