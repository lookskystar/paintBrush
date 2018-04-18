package com.andy.frame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/*五、设置一张画纸,因为这画纸和画笔都是Java本身也就是我们JDK提供的，所以呢，我们要继承系统的JPanel
至于继承是什么，我们就把他理解成，儿子继承父亲的产业吧
*/
public class PaintStaticPanel extends JPanel {
	 public PaintStaticPanel(){
	 }
	 
	 /**
	  *六、 重写新父类的方法,也就是从父亲那里继承画笔，每当JPanel（画纸）改变时，该方法（画笔）就会执行
	  * （注意，
	  * print：打印
	  * 和
	  * paint：画笔 名称很像，我们要重写的就是该父类的方法paint
	  * 两个父类的方法）
	  */
	 public void paint(Graphics g) {
	  System.out.println("画笔开始工作...");
	 
	  //七、首先，我们来画一条线（通过画线的练习，让学生有直观的感觉，是能够通过代码控制画笔的，假如这4条线代表代表人的四条手脚）
	 
	  /*
	  g.drawLine(20, 20, 50, 50);
	  g.drawLine(170, 20, 150, 50);
	  g.drawLine(20, 170, 50, 150);
	  g.drawLine(170, 170, 150, 150);
	  */
	 
	  //八、通过方法重新构造以上的画线的代码(给线条)
	  line1Paint(g);
	  line2Paint(g);
	  line3Paint(g);
	  line4Paint(g);
	 
	 
	  //九、不但可以画线，我们还可以画圆，画矩形（接下来，我们就通过方法来画圆，我们的目的是要画一个人出来）
	  ovalPaint(g);//调用画圆的方法
	  oval1Paint(g);
	  oval2Paint(g);
	  oval3Paint(g);
	  oval4Paint(g);
	  rectPaint(g);
	 
	  //十、总结：这样一个人就让我们给一笔一笔的给画出来了，接下来，我们要给人画脸，这就要同学们自己完成了，大家可以发挥自己的想象，不需要按照一这一样的去画。
	 }
	 
	 //画线1-左边的手臂
	 public void line1Paint(Graphics g){
	  g.setColor(Color.RED);
	  g.drawLine(20, 20, 50, 50);
	 }
	 //画线2-右边的手臂
	 public void line2Paint(Graphics g){
	  g.setColor(Color.GRAY);
	  g.drawLine(170, 20, 150, 50);
	 }
	 //画线3左边的腿
	 public void line3Paint(Graphics g){
	  g.setColor(Color.YELLOW);
	  g.drawLine(20, 170, 50, 150);
	 }
	 //画线4 画粗线 右边的腿
	 public void line4Paint(Graphics g){
	  g.setColor(Color.CYAN);
	  g.drawLine(170, 170, 150, 150);
	// float lineWidth = 10.0f;
	// ((Graphics2D)g).setStroke(new BasicStroke(lineWidth));
	// ((Graphics2D)g).drawLine(170, 170, 150, 150);
	 }
	 
	 //画圆 -头
	 public void ovalPaint(Graphics g){
	  g.setColor(Color.YELLOW);
	  //g.drawOval(50, 0, 100, 50);//空心圆
	  g.fillOval(50, 0, 100, 50);//实心圆
	 }
	 //画圆 -左手
	 public void oval1Paint(Graphics g){
	  g.setColor(Color.RED);
	  g.fillOval(10, 10, 20,20);
	 }
	 //画圆 -右手
	 public void oval2Paint(Graphics g){
	  g.setColor(Color.RED);
	  g.fillOval(160, 10, 20,20);
	 }
	 //画圆 -左脚
	 public void oval3Paint(Graphics g){
	  g.setColor(Color.RED);
	  g.fillOval(10, 160, 20,20);
	 }
	 //画圆-右脚
	 public void oval4Paint(Graphics g){
	  g.setColor(Color.RED);
	  g.fillOval(160, 160, 20,20);
	 }
	 
	 //画方块-身体
	 public void rectPaint(Graphics g){
	  g.setColor(Color.BLUE);
	  //g.drawRect(50, 50, 100, 100);
	  g.fillRect(50, 50, 100, 100);
	 }
}
