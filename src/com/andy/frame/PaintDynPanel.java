package com.andy.frame;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

/*
 * 二、同样的，我们继承(extends)父类JPanel,实现(implements)接口MouseMotionListener
 * MouseMotionListener:用于接收组件上鼠标移动事件的侦听接口
 * 我们怎么去看待“实现接口”：
 * 我们打一个比喻，就好比你看见一个女孩子，很漂亮，你想认识她，找她做女朋友。
 * 这个女孩子就提了几个要求：一人之下，万人之上，状元之才。她才答应你。
 * implements，就是实现她的要求，她的什么要求呢？就是MouseMotionListener
 * 那么我们光嘴上说，做到了不行，必须要实实在在在的实现了，那么，我们点击左边的红叉，他就自动帮你实现了。
 */
public class PaintDynPanel extends JPanel implements MouseMotionListener{
 public PaintDynPanel(){
 }
 /*六、因为坐标是不断的变动的，所以我们要在方法的外面给定x和y的坐标（全局变量），那么这个坐标在那里改变呢？
  * 是不是在我们移动鼠标的时候改变呀，我们试试看，我们的paint方法是什么时候开始工作呢？
  * 是不是每一次窗体变化，paint方法就工作一次呀，鼠标轨迹的改变是不是窗体的变化呢？我们试试看
  */
 int x;
 int y;
 
 //二、重写父类的画笔方法
 @Override
 public void paint(Graphics g) {
  System.out.println("画笔开始工作...");
  //八、画圆，坐标由全局变量给定
  g.fillOval(x, y, 5, 5);
 
  /*
   * 九、总结
   * 这样一个简单的画图程序我们就完成了，也许又有同学会问了？只是黑色，没有其他颜色了。
   * 其实，改变画笔的颜色，背景色，以及你在画图工具上看到的所有的功能，我们都能够做出来的。
   * 很多开发的方式和技巧等着同学们去挖掘。
   *
   * 在编写几句代码，就会出现问题，导致开发缓慢，兴趣不高，而要提高自己，让自己很快的开发，就必须要重基础学起。
   * 大家应该听说过，空杯思想，杯子里以前的水不倒出来，新鲜的水就永远也到不进去，就导致杯子里面永远是不新鲜的水。
   */
 }
 /*二、实现MouseMotionListener接口mouseDragged方法。
  * 鼠标按下并拖动时候调用
  * 这个好比一人之下，万人之上
  */
 public void mouseDragged(MouseEvent e) {
  /*五、得到鼠标按下移动的xy轴坐标并打印出来
  int x=e.getX();
  int y=e.getY();
  System.out.println("鼠标按下移动：->x:"+x+":y:"+y);
  */
 
  /*七、把xy轴的坐标付给全局变量的xy，然后刷新页面 */ 
  x=e.getX();
  y=e.getY();
  repaint();
 }
 /*二、实现MouseMotionListener接口mouseMoved方法
  * 鼠标移动时候调用
  * 这个好比状元之才
  */
 public void mouseMoved(MouseEvent e) {
 
 }
}