package com.fxt.servlet;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fxt.entity.Goods;
import com.fxt.entity.Orders;
import com.fxt.service.OrdersService;
import com.fxt.service.impl.OrdersServiceImpl;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

/**
 * Servlet implementation class ShujufenxiServlet
 */
public class ShujufenxiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShujufenxiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		OrdersService os=new OrdersServiceImpl();
		int t=Integer.parseInt(request.getParameter("t"));
		List<Orders> Marketlist=os.findMarketing(t);
		String gcname[]=new String[Marketlist.size()];
		int xsl[]=new int[Marketlist.size()];
		int max=0;
		for(int i=0;i<Marketlist.size();i++){
			gcname[i]=Marketlist.get(i).getGcname();
			xsl[i]=Marketlist.get(i).getXsl();
			if(xsl[i]>max){
				max=xsl[i];
			}
		}
		double bb=3.8;
		int hh=10;
		if(max>100&&max<=200){
			bb=1.9;
			hh=20;
		}else if(max>200&&max<=400){
			bb=0.95;
			hh=40;
		}else if(max>400&&max<=600){
			bb=0.633333;
			hh=60;
		}else if(max>600&&max<=1000){
			bb=0.38;
			hh=100;
		}else if(max>1000&&max<=2000){
			bb=0.19;
			hh=200;
		}
//		System.out.println(max);

		int width  = 800;
		int height = 600;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		// 锟斤拷锟斤拷图锟斤拷
		Graphics g = image.getGraphics();
		Graphics2D g2d = (Graphics2D)g;
		// 锟斤拷锟斤拷色s
		g.setColor(new Color(240, 249, 255));

		g.fillRect(0, 0, width, height);
		// 锟斤拷锟斤拷锟斤拷色
		g.setColor(Color.RED);
		g.setFont(new Font("宋体", Font.PLAIN, 22));
		g.drawString("放心团销售业绩统计图", 15, 25);
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("宋体", Font.PLAIN, 16));
		g.drawString("销售量(单位/个)", 20, 50);
		g.drawString("商品类别", 720, 465);
		g.setFont(new Font("SanSSerif", Font.PLAIN, 12));

		int visitValue = 0;
		//锟斤拷锟斤拷锟斤拷
		for (int i = 418; i > 0; i -= 38) {
		    g.setColor(Color.BLACK);
		    g.drawString("" + visitValue, 50, (i + 27));
		    g.setColor(Color.LIGHT_GRAY);
		    g.drawLine(80, (i + 27), 720, (i + 27));
		    visitValue += hh;
		}
		g.setColor(Color.BLACK);
		g.drawLine(80, 40, 80, 445);
		g.drawLine(80, 445, 750, 445);
		int drawHigh[] = new int[gcname.length];
		int drawwidth[] = new int[gcname.length];

		//锟桔碉拷锟斤拷锟�
		
		for (int i = 0; i < gcname.length; i++) {
		    drawHigh[i] = 445 - (int) (Math.ceil(xsl[i] * bb));
		    drawwidth[i] = 110 + i * 80;
		    g.drawString(""+xsl[i], drawwidth[i]-3, drawHigh[i]-5);
		    g.drawString(gcname[i], 100 + i * 80, 465);
		}

		//g2d.setXORMode(Color.WHITE);
		//锟斤拷锟竭达拷细
		g2d.setStroke(new BasicStroke(2.0f));
		//锟斤拷锟竭碉拷锟斤拷色
		g2d.setPaint(Color.RED);
		//锟斤拷锟斤拷锟斤拷
		g2d.drawPolyline(drawwidth, drawHigh, gcname.length);
		// 锟斤拷锟斤拷图锟斤拷
		g.dispose();

		ServletOutputStream sos = response.getOutputStream();
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(sos);
		encoder.encode(image);
		//*/
	}

}
