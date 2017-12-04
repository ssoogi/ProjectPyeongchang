package com.pf.olympic.view;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MatchView extends JFrame {
	public JButton bt_home, bt_match, bt_reservation, bt_cart, bt_mypage;
	public JPanel bg_panel;
	public ImageIcon bg_img;
	public JComboBox<String> cb_match;
	String[] match= {"전체","개회식","스키점프","바이애슬론","봅슬레이","스피드 스케이팅","피겨스케이팅","쇼트트랙","아이스하키","컬링","폐회식"};
	public JButton bt_select;
	public JButton bt_open;
	public JButton bt_jump_8, bt_jump_10, bt_jump_12, bt_jump_16, bt_jump_17, bt_jump_19;
	public JButton bt_bi_10, bt_bi_11, bt_bi_12, bt_bi_14, bt_bi_15, bt_bi_17, bt_bi_18, bt_bi_20, bt_bi_22, bt_bi_23;
	public JButton bt_bop_18, bt_bop_19, bt_bop_20, bt_bop_21, bt_bop_24, bt_bop_25;
	public JButton bt_speed_10, bt_speed_11, bt_speed_12, bt_speed_13, bt_speed_14, bt_speed_15, bt_speed_16, bt_speed_18, bt_speed_19, bt_speed_21, bt_speed_23, bt_speed_24;
	public JButton bt_figure_9, bt_figure_11, bt_figure_12, bt_figure_14, bt_figure_15, bt_figure_16, bt_figure_17, bt_figure_19, bt_figure_20, bt_figure_21, bt_figure_23, bt_figure_25;
	public JButton bt_short_10, bt_short_13, bt_short_17, bt_short_20, bt_short_22;
	public JButton bt_hockey_10, bt_hockey_11, bt_hockey_12, bt_hockey_13, bt_hockey_14, bt_hockey_15, bt_hockey_16, bt_hockey_17, bt_hockey_18, bt_hockey_19, bt_hockey_20, bt_hockey_21, bt_hockey_22, bt_hockey_23, bt_hockey_24, bt_hockey_25;
	public JButton bt_curling_8, bt_curling_9, bt_curling_10, bt_curling_11, bt_curling_12, bt_curling_13, bt_curling_14, bt_curling_15, bt_curling_16, bt_curling_17, bt_curling_18, bt_curling_19, bt_curling_20, bt_curling_21, bt_curling_22, bt_curling_23, bt_curling_24, bt_curling_25;
	public JButton bt_close;
	public ImageIcon icon_home, icon_match, icon_reserve, icon_cart, icon_mypage;
	public ImageIcon img_open, img_jump, img_bi, img_bop, img_speed, img_figure, img_short, img_hockey, img_curling, img_close;
	public JLabel la_open, la_jump, la_bi, la_bop, la_speed, la_figure, la_short, la_hockey, la_curling, la_close;
	public ImageIcon icon_circle_blue, icon_circle_white, icon_medal_blue, icon_medal_white;
	public ImageIcon icon_home_mouse, icon_match_mouse, icon_reserve_mouse, icon_cart_mouse, icon_mypage_mouse;
	
	public MatchView() {
		setTitle("MainView");
		setLayout(null);
		
		setContentPane(new JLabel(new ImageIcon("img/view_img/CalenderViewSuperFinal2.jpg")));
		
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
		
		//버튼의 외곽선을 없애주었다.
		/*bt_home.setBorderPainted(false);
		bt_match.setBorderPainted(false);
		bt_reservation.setBorderPainted(false);
		bt_cart.setBorderPainted(false);
		bt_mypage.setBorderPainted(false);*/
		
		/*bt_home.setBorderPainted(false);
		bt_home.setContentAreaFilled(false);
		bt_home.setOpaque(false);*/

		//img_open, img_jump, img_bi, img_bop, img_speed, 
		//img_figure, img_short, img_hockey, img_curling, img_close;
		img_open = new ImageIcon("img/img_icon/img_open.png");
		img_jump = new ImageIcon("img/img_icon/img_jump.png");
		img_bi = new ImageIcon("img/img_icon/img_bi.png");
		img_bop = new ImageIcon("img/img_icon/img_bop.png");
		img_speed = new ImageIcon("img/img_icon/img_speed.png");
		img_figure = new ImageIcon("img/img_icon/img_figure.png");
		img_short = new ImageIcon("img/img_icon/img_short.png");
		img_hockey = new ImageIcon("img/img_icon/img_hockey.png");
		img_curling = new ImageIcon("img/img_icon/img_curling.png");
		img_close = new ImageIcon("img/img_icon/img_close.png");
		
		la_open = new JLabel(img_open);
		la_jump = new JLabel(img_jump);
		la_bi = new JLabel(img_bi);
		la_bop = new JLabel(img_bop);
		la_speed = new JLabel(img_speed);
		la_figure = new JLabel(img_figure);
		la_short = new JLabel(img_short);
		la_hockey = new JLabel(img_hockey);
		la_curling = new JLabel(img_curling);
		la_close = new JLabel(img_close);
		
		bg_panel = new JPanel();
		
		cb_match = new JComboBox<>(match);
		cb_match.setFont(new Font("돋움", Font.BOLD, 15));
		bt_select = new JButton("검색");
		
		icon_circle_blue = new ImageIcon("img/img_icon/icon_circle_blue.png");
		icon_circle_white = new ImageIcon("img/img_icon/icon_circle_white.png");
		icon_medal_blue = new ImageIcon("img/img_icon/icon_medal_blue.png");
		icon_medal_white = new ImageIcon("img/img_icon/icon_medal_white.png");
				
		bt_open = new JButton(icon_circle_white);
		
		bt_jump_8 = new JButton(icon_circle_blue);
		bt_jump_10 = new JButton(icon_medal_blue);
		bt_jump_12 = new JButton(icon_medal_blue);
		bt_jump_16 = new JButton(icon_circle_blue);
		bt_jump_17 = new JButton(icon_medal_white);
		bt_jump_19 = new JButton(icon_medal_white);
		
		bt_bi_10 = new JButton(icon_medal_blue);
		bt_bi_11 = new JButton(icon_medal_white);
		bt_bi_12 = new JButton(icon_medal_blue);
		bt_bi_14 = new JButton(icon_medal_blue);
		bt_bi_15 = new JButton(icon_medal_white);
		bt_bi_17 = new JButton(icon_medal_white);
		bt_bi_18 = new JButton(icon_medal_blue);
		bt_bi_20 = new JButton(icon_medal_blue);
		bt_bi_22 = new JButton(icon_medal_blue);
		bt_bi_23 = new JButton(icon_medal_white);
	  	
		bt_bop_18 = new JButton(icon_circle_blue);
		bt_bop_19 = new JButton(icon_medal_white);
		bt_bop_20 = new JButton(icon_circle_blue);
		bt_bop_21 = new JButton(icon_medal_white);
		bt_bop_24 = new JButton(icon_circle_blue);
		bt_bop_25 = new JButton(icon_medal_white);
		
		bt_speed_10 = new JButton(icon_medal_blue);
		bt_speed_11 = new JButton(icon_medal_white);
		bt_speed_12 = new JButton(icon_medal_blue);
		bt_speed_13 = new JButton(icon_medal_white);
		bt_speed_14 = new JButton(icon_medal_blue);
		bt_speed_15 = new JButton(icon_medal_white);
		bt_speed_16 = new JButton(icon_medal_blue);
		bt_speed_18 = new JButton(icon_medal_blue);
		bt_speed_19 = new JButton(icon_medal_white);
		bt_speed_21 = new JButton(icon_medal_white);
		bt_speed_23 = new JButton(icon_medal_white);
		bt_speed_24 = new JButton(icon_medal_blue);
			
		bt_figure_9 = new JButton(icon_circle_white);
		bt_figure_11 = new JButton(icon_circle_white);
		bt_figure_12 = new JButton(icon_medal_blue);
		bt_figure_14 = new JButton(icon_circle_blue);
		bt_figure_15 = new JButton(icon_medal_white);
		bt_figure_16 = new JButton(icon_circle_blue);
		bt_figure_17 = new JButton(icon_medal_white);
		bt_figure_19 = new JButton(icon_circle_white);
		bt_figure_20 = new JButton(icon_medal_blue);
		bt_figure_21 = new JButton(icon_circle_white);
		bt_figure_23 = new JButton(icon_medal_white);
		bt_figure_25 = new JButton(icon_circle_white);
		
		bt_short_10 = new JButton(icon_medal_blue);
		bt_short_13 = new JButton(icon_medal_white);
		bt_short_17 = new JButton(icon_medal_white);
		bt_short_20 = new JButton(icon_medal_blue);
		bt_short_22 = new JButton(icon_medal_blue);
		
		bt_hockey_10 = new JButton(icon_circle_blue);
		bt_hockey_11 = new JButton(icon_circle_white);
		bt_hockey_12 = new JButton(icon_circle_blue);
		bt_hockey_13 = new JButton(icon_circle_white);
		bt_hockey_14 = new JButton(icon_circle_blue);
		bt_hockey_15 = new JButton(icon_circle_white);
		bt_hockey_16 = new JButton(icon_circle_blue);
		bt_hockey_17 = new JButton(icon_circle_white);
		bt_hockey_18 = new JButton(icon_circle_blue);
		bt_hockey_19 = new JButton(icon_circle_white);
		bt_hockey_20 = new JButton(icon_circle_blue);
		bt_hockey_21 = new JButton(icon_medal_white);
		bt_hockey_22 = new JButton(icon_medal_blue);
		bt_hockey_23 = new JButton(icon_circle_white);
		bt_hockey_24 = new JButton(icon_medal_blue);
		bt_hockey_25 = new JButton(icon_medal_white);
		
		bt_curling_8 =new JButton(icon_circle_blue);
		bt_curling_9 =new JButton(icon_circle_white);
		bt_curling_10 =new JButton(icon_circle_blue);
		bt_curling_11 =new JButton(icon_circle_white);
		bt_curling_12 =new JButton(icon_circle_blue);
		bt_curling_13 =new JButton(icon_circle_white);
		bt_curling_14 =new JButton(icon_circle_blue);
		bt_curling_15 =new JButton(icon_circle_white);
		bt_curling_16 =new JButton(icon_circle_blue);
		bt_curling_17 =new JButton(icon_circle_white);
		bt_curling_18 =new JButton(icon_circle_blue);
		bt_curling_19 =new JButton(icon_circle_white);
		bt_curling_20 =new JButton(icon_circle_blue);
		bt_curling_21 =new JButton(icon_circle_white);
		bt_curling_22 =new JButton(icon_circle_blue);
		bt_curling_23 =new JButton(icon_medal_white);
		bt_curling_24 =new JButton(icon_medal_blue);
		bt_curling_25 =new JButton(icon_medal_white);
		
		bt_close = new JButton(icon_circle_white);
				
		//img_open, img_jump, img_bi, img_bop, img_speed, 
		//img_figure, img_short, img_hockey, img_curling, img_close;
		la_open.setBounds(20, 405, 200, 43);
		la_jump.setBounds(20, 457, 200, 43);
		la_bi.setBounds(20, 508, 200, 43);
		la_bop.setBounds(20, 558, 200, 43);
		la_speed.setBounds(20, 608, 200, 43);
		la_figure.setBounds(20, 658, 200, 43);
		la_short.setBounds(20, 708, 200, 43);
		la_hockey.setBounds(20, 758, 200, 43);
		la_curling.setBounds(20, 808, 200, 43);
		la_close.setBounds(20, 858, 200, 43);
		
		
		bt_home.setBounds(0, 184, 213, 54);
		bt_match.setBounds(221, 184, 213, 54);
		bt_reservation.setBounds(442, 184, 213, 54);
		bt_cart.setBounds(665, 184, 213, 54);
		bt_mypage.setBounds(886, 184, 300, 54);
		
		cb_match.setBounds(435, 260, 150, 40);
		bt_select.setBounds(615, 260, 150, 40);//x+30
		//전체 길이 300+30=330, 뷰길이 1200
		//앞부분 390, 330, 1200-720=480
		//435, 330, 435
		
		bt_open.setBounds(289, 405, 48, 43);
		
		bt_jump_8.setBounds(237, 457, 48, 43);
		bt_jump_10.setBounds(343, 457, 48, 43);
		bt_jump_12.setBounds(449, 457, 48, 43);
		bt_jump_16.setBounds(661, 457, 48, 43);
		bt_jump_17.setBounds(714, 457, 48, 43);
		bt_jump_19.setBounds(820, 457, 48, 43);
		
		bt_bi_10.setBounds(343, 508, 48, 43);
		bt_bi_11.setBounds(396, 508, 48, 43);
		bt_bi_12.setBounds(449, 508, 48, 43);
		bt_bi_14.setBounds(555, 508, 48, 43);
		bt_bi_15.setBounds(608, 508, 48, 43);
		bt_bi_17.setBounds(714, 508, 48, 43);
		bt_bi_18.setBounds(767, 508, 48, 43);
		bt_bi_20.setBounds(873, 508, 48, 43);
		bt_bi_22.setBounds(979, 508, 48, 43);
		bt_bi_23.setBounds(1032, 508, 48, 43);
		
		bt_bop_18.setBounds(767, 558, 48, 43);
		bt_bop_19.setBounds(820, 558, 48, 43);
		bt_bop_20.setBounds(873, 558, 48, 43);
		bt_bop_21.setBounds(926, 558, 48, 43);
		bt_bop_24.setBounds(1085, 558, 48, 43);
		bt_bop_25.setBounds(1138, 558, 48, 43);
		
		bt_speed_10.setBounds(343, 608, 48, 43);
		bt_speed_11.setBounds(396, 608, 48, 43);
		bt_speed_12.setBounds(449, 608, 48, 43);
		bt_speed_13.setBounds(502, 608, 48, 43);
		bt_speed_14.setBounds(555, 608, 48, 43);
		bt_speed_15.setBounds(608, 608, 48, 43);
		bt_speed_16.setBounds(661, 608, 48, 43);
		bt_speed_18.setBounds(767, 608, 48, 43);
		bt_speed_19.setBounds(820, 608, 48, 43);
		bt_speed_21.setBounds(926, 608, 48, 43);
		bt_speed_23.setBounds(1032, 608, 48, 43);
		bt_speed_24.setBounds(1085, 608, 48, 43);
		
		bt_figure_9.setBounds(289, 658, 48, 43);
		bt_figure_11.setBounds(396, 658, 48, 43);
		bt_figure_12.setBounds(449, 658, 48, 43);
		bt_figure_14.setBounds(555, 658, 48, 43);
		bt_figure_15.setBounds(608, 658, 48, 43);
		bt_figure_16.setBounds(661, 658, 48, 43);
		bt_figure_17.setBounds(714, 658, 48, 43);
		bt_figure_19.setBounds(820, 658, 48, 43);
		bt_figure_20.setBounds(873, 658, 48, 43);
		bt_figure_21.setBounds(926, 658, 48, 43);
		bt_figure_23.setBounds(1032, 658, 48, 43);
		bt_figure_25.setBounds(1138, 658, 48, 43);
		
		bt_short_10.setBounds(343, 708, 48, 43);
		bt_short_13.setBounds(502, 708, 48, 43);
		bt_short_17.setBounds(714, 708, 48, 43);
		bt_short_20.setBounds(873, 708, 48, 43);
		bt_short_22.setBounds(979, 708, 48, 43);
	
		bt_hockey_10.setBounds(343, 758, 48, 43);
		bt_hockey_11.setBounds(396, 758, 48, 43);
		bt_hockey_12.setBounds(449, 758, 48, 43);
		bt_hockey_13.setBounds(502, 758, 48, 43);
		bt_hockey_14.setBounds(555, 758, 48, 43);
		bt_hockey_15.setBounds(608, 758, 48, 43);
		bt_hockey_16.setBounds(661, 758, 48, 43);
		bt_hockey_17.setBounds(714, 758, 48, 43);
		bt_hockey_18.setBounds(767, 758, 48, 43);
		bt_hockey_19.setBounds(820, 758, 48, 43);
		bt_hockey_20.setBounds(873, 758, 48, 43);
		bt_hockey_21.setBounds(926, 758, 48, 43);
		bt_hockey_22.setBounds(979, 758, 48, 43);
		bt_hockey_23.setBounds(1032, 758, 48, 43);
		bt_hockey_24.setBounds(1085, 758, 48, 43);
		bt_hockey_25.setBounds(1138, 758, 48, 43);
		
		//x 시작 기준 237, y기준 809, 전체 width기준 48, 전체 height기준 43
		//x 차이는 5
		bt_curling_8.setBounds(237, 808, 48, 43); //285 
		bt_curling_9.setBounds(289, 808, 48, 43); //338
		bt_curling_10.setBounds(343, 808, 48, 43); //392
		bt_curling_11.setBounds(396, 808, 48, 43); //445
		bt_curling_12.setBounds(449, 808, 48, 43); //498
		bt_curling_13.setBounds(502, 808, 48, 43); //551 
		bt_curling_14.setBounds(555, 808, 48, 43); //604
		bt_curling_15.setBounds(608, 808, 48, 43); //657
		bt_curling_16.setBounds(661, 808, 48, 43); //710
		bt_curling_17.setBounds(714, 808, 48, 43); //763
		bt_curling_18.setBounds(767, 808, 48, 43); //816 
		bt_curling_19.setBounds(820, 808, 48, 43); //869
		bt_curling_20.setBounds(873, 808, 48, 43); //922
		bt_curling_21.setBounds(926, 808, 48, 43); //975
		bt_curling_22.setBounds(979, 808, 48, 43); //1028
		bt_curling_23.setBounds(1032, 808, 48, 43); //1081
		bt_curling_24.setBounds(1085, 808, 48, 43); //1134
		bt_curling_25.setBounds(1138, 808, 48, 43); 
		
		bt_close.setBounds(1138, 858, 48, 43);
		
		add(bt_home);
		add(bt_match);
		add(bt_reservation);
		add(bt_cart);
		add(bt_mypage);
		
		add(cb_match);
		add(bt_select);
		
		//img_open, img_jump, img_bi, img_bop, img_speed, 
		//img_figure, img_short, img_hockey, img_curling, img_close;
		add(la_open);
		add(la_jump);
		add(la_bi);
		add(la_bop);
		add(la_speed);
		add(la_figure);
		add(la_short);
		add(la_hockey);
		add(la_curling);
		add(la_close);
		
		
		add(bt_open);
		
		add(bt_jump_8);
		add(bt_jump_10);
		add(bt_jump_12);
		add(bt_jump_16);
		add(bt_jump_17);
		add(bt_jump_19);
		
		add(bt_bi_10);
		add(bt_bi_11);
		add(bt_bi_12);
		add(bt_bi_14);
		add(bt_bi_15);
		add(bt_bi_17);
		add(bt_bi_18);
		add(bt_bi_20);
		add(bt_bi_22);
		add(bt_bi_23);
		
		add(bt_bop_18);
		add(bt_bop_19);
		add(bt_bop_20);
		add(bt_bop_21);
		add(bt_bop_24);
		add(bt_bop_25);
		
		add(bt_speed_10);
		add(bt_speed_11);
		add(bt_speed_12);
		add(bt_speed_13);
		add(bt_speed_14);
		add(bt_speed_15);
		add(bt_speed_16);
		add(bt_speed_18);
		add(bt_speed_19);
		add(bt_speed_21);
		add(bt_speed_23);
		add(bt_speed_24);
		
		add(bt_figure_9);
		add(bt_figure_11);
		add(bt_figure_12);
		add(bt_figure_14);
		add(bt_figure_15);
		add(bt_figure_16);
		add(bt_figure_17);
		add(bt_figure_19);
		add(bt_figure_20);
		add(bt_figure_21);
		add(bt_figure_23);
		add(bt_figure_25);
		
		add(bt_short_10);
		add(bt_short_13);
		add(bt_short_17);
		add(bt_short_20);
		add(bt_short_22);
		
		add(bt_hockey_10);
		add(bt_hockey_11);
		add(bt_hockey_12);
		add(bt_hockey_13);
		add(bt_hockey_14);
		add(bt_hockey_15);
		add(bt_hockey_16);
		add(bt_hockey_17);
		add(bt_hockey_18);
		add(bt_hockey_19);
		add(bt_hockey_20);
		add(bt_hockey_21);
		add(bt_hockey_22);
		add(bt_hockey_23);
		add(bt_hockey_24);
		add(bt_hockey_25);
		
		add(bt_curling_8);
		add(bt_curling_9);
		add(bt_curling_10);
		add(bt_curling_11);
		add(bt_curling_12);
		add(bt_curling_13);
		add(bt_curling_14);
		add(bt_curling_15);
		add(bt_curling_16);
		add(bt_curling_17);
		add(bt_curling_18);
		add(bt_curling_19);
		add(bt_curling_20);
		add(bt_curling_21);
		add(bt_curling_22);
		add(bt_curling_23);
		add(bt_curling_24);
		add(bt_curling_25);
		
		add(bt_close);
	
		
		setBounds(300, 20, 1200, 1000);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new MatchView();
	}
}
