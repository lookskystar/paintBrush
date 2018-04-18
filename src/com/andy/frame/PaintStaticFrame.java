package com.andy.frame;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 静态画图
 * 
 * @author andy
 */
public class PaintStaticFrame {
	/**
	 * 一、主方法 特点：编写时必须按照以下格式，一字不差的编写。 主方法是程序的入口，一个类智能有一个主方法。 当我们运行程序是，开始就是要调用主方法。
	 */
	public static void main(String args[]) {
		System.out.println("main方法开始运行。。。。");
		// 定义一个窗体
		JFrame jFrame = new JFrame();
		// 设置窗体显示在屏幕的位置坐标，200和150，分别代表距离屏幕左上角（0,0）的x轴和y轴的位置
		jFrame.setLocation(200, 150);
		// 设置窗体的长和宽，500和400分别表示。
		jFrame.setSize(500, 400);

		/*
		 * 二、特点：写到这里，我们可以看到java语言的一个特点： 1、java语句很多都是有英语单词组成的。
		 * 2、如果一个单词表达不出想表达的意思，那么会由两个单词组成。 3、两个单词组成语句，第二个单词的第一个字母是大写
		 * 4、每一条语句，都是以;号结尾的。 我们写了上面3条语句，至少是能得到这4个特点吧。那么我们以后编写的代码，就要基本遵循这几点。
		 */

		// 四、通过上面代码，我们可以知道怎样去编写一个窗体，怎样设置它的显示位置和大小，怎样控制它显示还是不显示。
		// 但是大家会发现，这个窗体没有什么功能，连最起码的关闭都没有。下面我们就来写这句代码。
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 现在窗体的基本功能是有了，是不是觉得单调了一点，那么我们给窗体设置一下颜色和主题。
		jFrame.setTitle("我的画板");
		jFrame.setBackground(Color.WHITE);
		// 到这里为止，我们画画要的桌子就准备好了，下面，我们要准备画纸和画笔了

		// 把画纸放到桌布上
		PaintStaticPanel paintPanel = new PaintStaticPanel();
		jFrame.add(paintPanel);

		/*
		 * 三、为什么加上下面的语句就能显示出一个窗体呢？
		 * 原来我们java窗体有一个特性，在创建一个窗体，指定了显示的位置，指定了长和宽，还是不能显示的。
		 * 因为窗体的默认显示属性是隐藏的，我们要把默认的显示属性修改一下，也就是true
		 * true的反义词是什么呀？false，那么我们试试把true改为false试试！ 我们还可以把显示的位置，长和宽，改改，试试
		 */
		jFrame.setVisible(true);
	}
}
