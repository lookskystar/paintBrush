package com.andy.frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 也许，有的同学会说，这样一笔一笔的画，那多费事情呀，我想随意想画什么酒画什么，类似画图中的笔
 * 这样也是能实现的，只不过复杂一点，下面我们就在深入一点，随意笔。
 * 自由画人
 * @author andy
 */
public class PaintDynFrame {
 /**
  * 主方法
  * @param args
  */
 public static void main(String[] args) {
  //一
  System.out.println("main方法开始运行。。。。");
  JFrame frame=new JFrame("画板");
  frame.setLocation(200,150);
  frame.setSize(500, 400);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setBackground(Color.WHITE);
 
  //三、把画纸放到桌面上
  PaintDynPanel paintPanel2=new PaintDynPanel();
  frame.add(paintPanel2);
 
  //四、面板加上鼠标监听
  paintPanel2.addMouseMotionListener(paintPanel2);
 
  //如果显示语句不放在最后会怎么样?
  frame.setVisible(true);
 }
}
