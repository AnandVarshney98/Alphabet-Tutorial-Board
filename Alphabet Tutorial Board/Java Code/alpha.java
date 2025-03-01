import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class alpha extends Applet implements ActionListener
{
	Button A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
	int f=0;
	Image img;
	AudioClip ag;
	int x=1000, y=1000;
	public void init()
	{
	   A=new Button("A");
	   B=new Button("B");
	   C=new Button("C");
	   D=new Button("D");
	   E=new Button("E");
	   F=new Button("F");
	   G=new Button("G");
	   H=new Button("H");
	   I=new Button("I");
	   J=new Button("J");
	   K=new Button("K");
	   L=new Button("L");
	   M=new Button("M");
	   N=new Button("N");
	   O=new Button("O");
	   P=new Button("P");
	   Q=new Button("Q");
	   R=new Button("R");
	   S=new Button("S");
	   T=new Button("T");
	   U=new Button("U");
	   V=new Button("V");
	   W=new Button("W");
	   X=new Button("X");
	   Y=new Button("Y");
	   Z=new Button("Z");
	   add(A);
	   add(B);
	   add(C);
	   add(D);
	   add(E);
	   add(F);
	   add(G);
	   add(H);
	   add(I);
	   add(J);
	   add(K);
	   add(L);
	   add(M);
	   add(N);
	   add(O);
	   add(P);
	   add(Q);
	   add(R);
	   add(S);
	   add(T);
	   add(U);
	   add(V);
	   add(W);
	   add(X);
	   add(Y);
	   add(Z);
	   A.addActionListener(this);
	   B.addActionListener(this);
	   C.addActionListener(this);
	   D.addActionListener(this);
	   E.addActionListener(this);
	   F.addActionListener(this);
	   G.addActionListener(this);
	   H.addActionListener(this);
	   I.addActionListener(this);
	   J.addActionListener(this);
	   K.addActionListener(this);
	   L.addActionListener(this);
	   M.addActionListener(this);
	   N.addActionListener(this);
	   O.addActionListener(this);
	   P.addActionListener(this);
	   Q.addActionListener(this);
	   R.addActionListener(this);
	   S.addActionListener(this);
	   T.addActionListener(this);
	   U.addActionListener(this);
	   V.addActionListener(this);
	   W.addActionListener(this);
	   X.addActionListener(this);
	   Y.addActionListener(this);
	   Z.addActionListener(this); 
	   int rr=(int)(Math.random()*1000)%256;
	   int gg=(int)(Math.random()*1000)%256;
	   int bb=(int)(Math.random()*1000)%256;
	   Color c=new Color(rr,gg,bb);
	   setBackground(c);

	    
	  
	}
	public void paint(Graphics g)
	{
		Font f1=new Font("Arial",Font.BOLD,100);
		g.setFont(f1);
		g.setColor(Color.yellow);
		if(f==1)
		{
			img=getImage(getDocumentBase(),"apple.png");
			ag=getAudioClip(getCodeBase(),"a.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Aa", 660, 350);
			g.drawString("Apple",840, 800);
			setBackground(Color.black);
		}
		if(f==2)
		{
			img=getImage(getDocumentBase(),"ball.png");
			ag=getAudioClip(getCodeBase(),"b.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Bb", 660, 350);
			g.drawString("Ball", 800, 800);
			setBackground(Color.black);
		}
		if(f==3)
		{
			img=getImage(getDocumentBase(),"cat.png");
			ag=getAudioClip(getCodeBase(),"c.wav");
			ag.play();
            g.drawImage(img, 790, 300,this);
            g.drawString("Cc", 660, 350);
            g.drawString("Cat", 800, 800);
            setBackground(Color.black);
		}
		if(f==4)
		{
			img=getImage(getDocumentBase(),"dog.png");
			ag=getAudioClip(getCodeBase(),"d.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Dd", 660, 350);
			g.drawString("Dog", 800, 800);
			setBackground(Color.black);
		}
		if(f==5)
		{
			img=getImage(getDocumentBase(),"elephant.png");
			ag=getAudioClip(getCodeBase(),"e.wav");
			ag.play();			
			g.drawImage(img, 790, 300,this);
			g.drawString("Ee", 660, 350);
			g.drawString("Elephant", 750, 800);
			setBackground(Color.black);
		}
		if(f==6)
		{
			img=getImage(getDocumentBase(),"fish.png");
			ag=getAudioClip(getCodeBase(),"f.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Ff", 660, 350);
			g.drawString("Fish", 750, 800);
			setBackground(Color.black);
		}
		if(f==7)
		{
			img=getImage(getDocumentBase(),"goat.png");
			ag=getAudioClip(getCodeBase(),"g.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Gg", 660, 350);
			g.drawString("Goat", 750, 800);
			setBackground(Color.black);
		}	
		if(f==8)
		{
			img=getImage(getDocumentBase(),"horse.png");
			ag=getAudioClip(getCodeBase(),"h.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Hh", 660, 350);
			g.drawString("Horse", 750, 800);
			setBackground(Color.black);
		}	
		if(f==9)
		{
			img=getImage(getDocumentBase(),"icecream.png");
			ag=getAudioClip(getCodeBase(),"i.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Ii", 660, 350);
			g.drawString("Ice cream", 750, 800);
			setBackground(Color.black);
		}	
	    if(f==10)
		{
			img=getImage(getDocumentBase(),"jug.png");
			ag=getAudioClip(getCodeBase(),"j.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Jj", 660, 350);
			g.drawString("Jug", 750, 800);
			setBackground(Color.black);
		}	
		if(f==11)
		{
			img=getImage(getDocumentBase(),"kite.png");
			ag=getAudioClip(getCodeBase(),"k.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Kk", 660, 350);
			g.drawString("Kite", 750, 800);
			setBackground(Color.black);
		}	
		if(f==12)
		{
			img=getImage(getDocumentBase(),"lion.png");
			ag=getAudioClip(getCodeBase(),"l.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Ll",600, 350);
			g.drawString("Lion", 750, 800);
			setBackground(Color.black);
		}	
		if(f==13)
		{
			img=getImage(getDocumentBase(),"monkey.png");
			ag=getAudioClip(getCodeBase(),"m.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Mm", 660, 350);
			g.drawString("Monkey", 750, 800);
			setBackground(Color.black);
		}	
	    if(f==14)
		{
			img=getImage(getDocumentBase(),"nest.png");
			ag=getAudioClip(getCodeBase(),"n.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Nn", 660, 350);
			g.drawString("Nest", 750, 800);
			setBackground(Color.black);
		}	
		if(f==15)
		{
			img=getImage(getDocumentBase(),"orange.png");
			ag=getAudioClip(getCodeBase(),"o.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Oo", 660, 350);
			g.drawString("Orange", 750, 800);
			setBackground(Color.black);
		}	
		if(f==16)
		{
			img=getImage(getDocumentBase(),"parrot.png");
			ag=getAudioClip(getCodeBase(),"p.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Pp", 660, 350);
			g.drawString("Parrot", 750, 800);
			setBackground(Color.black);
		}	
		if(f==17)
		{
			img=getImage(getDocumentBase(),"queen.png");
			ag=getAudioClip(getCodeBase(),"q.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Qq", 660, 350);
			g.drawString("Queen", 750, 800);
			setBackground(Color.black);
		}	
		if(f==18)
		{
			img=getImage(getDocumentBase(),"rabbit.png");
			ag=getAudioClip(getCodeBase(),"r.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Rr", 660, 350);
			g.drawString("Rabbit", 750, 800);
			setBackground(Color.black);
		}	
		if(f==19)
		{
			img=getImage(getDocumentBase(),"sun.png");
			ag=getAudioClip(getCodeBase(),"s.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Ss", 660, 350);
			g.drawString("Sun", 750, 800);
			setBackground(Color.black);
		}	
		if(f==20)
		{
			img=getImage(getDocumentBase(),"tiger.png");
			ag=getAudioClip(getCodeBase(),"t.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Tt", 660, 350);
			g.drawString("Tiger", 750, 800);
			setBackground(Color.black);
		}	
		if(f==21)
		{
			img=getImage(getDocumentBase(),"umbrella.png");
			ag=getAudioClip(getCodeBase(),"u.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Uu", 660, 350);
			g.drawString("Umbrella", 750, 800);
			setBackground(Color.black);
		}	
		if(f==22)
		{
			img=getImage(getDocumentBase(),"van.png");
			ag=getAudioClip(getCodeBase(),"v.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Vv", 660, 350);
			g.drawString("Van", 750, 800);
			setBackground(Color.black);
		}	
		if(f==23)
		{
			img=getImage(getDocumentBase(),"watch.png");
			ag=getAudioClip(getCodeBase(),"w.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Ww", 660, 350);
			g.drawString("Watch", 750, 800);
			setBackground(Color.black);
		}	
		if(f==24)
		{
			img=getImage(getDocumentBase(),"xray.png");
			ag=getAudioClip(getCodeBase(),"x.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Xx", 660, 350);
			g.drawString("X-Ray", 750, 800);
			setBackground(Color.black);
		}	
		if(f==25)
		{
			img=getImage(getDocumentBase(),"yacht.png");
			ag=getAudioClip(getCodeBase(),"y.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Yy", 660, 350);
			g.drawString("Yacht", 750, 800);
			setBackground(Color.black);
		}	
        if(f==26)
		{
			img=getImage(getDocumentBase(),"zebra.png");
			ag=getAudioClip(getCodeBase(),"z.wav");
			ag.play();
			g.drawImage(img, 790, 300,this);
			g.drawString("Zz", 660, 350);
			g.drawString("Zebra", 750, 800);
			setBackground(Color.black);
		}		
	}
	public void actionPerformed(ActionEvent e)
	{
	   if(e.getSource()==A)
	   {
	    	f=1;
	    	repaint();
	   }
	   if(e.getSource()==B)
	   {
	        f=2;
	        repaint();
	   }
	   if(e.getSource()==C)
	   {
	   	    f=3;
	   	    repaint();
	   }	
	   if(e.getSource()==D)
	   {
	   	    f=4;
	   	    repaint();
	   }
	   if(e.getSource()==E)
	   {
	   	    f=5;
	   	    repaint();
	   }	
	   if(e.getSource()==F)
	   {
	   	    f=6;
	   	    repaint();
	   }
	   if(e.getSource()==G)
	   {
	    	f=7;
	    	repaint();
	   }
	   if(e.getSource()==H)
	   {
	    	f=8;
	    	repaint();
	   }
	   if(e.getSource()==I)
	   {
	    	f=9;
	    	repaint();
	   }
	   if(e.getSource()==J)
	   {
	    	f=10;
	    	repaint();
	   }
	   if(e.getSource()==K)
	   {
	    	f=11;
	    	repaint();
	   }
	   if(e.getSource()==L)
	   {
	    	f=12;
	    	repaint();
	   }
	   if(e.getSource()==M)
	   {
	    	f=13;
	    	repaint();
	   }
	   if(e.getSource()==N)
	   {
	    	f=14;
	    	repaint();
	   }
	   if(e.getSource()==O)
	   {
	    	f=15;
	    	repaint();
	   }
	   if(e.getSource()==P)
	   {
	    	f=16;
	    	repaint();
	   }
	   if(e.getSource()==Q)
	   {
	    	f=17;
	    	repaint();
	   }
	   if(e.getSource()==R)
	   {
	    	f=18;
	    	repaint();
	   }
	   if(e.getSource()==S)
	   {
	    	f=19;
	    	repaint();
	   }
	   if(e.getSource()==T)
	   {
	    	f=20;
	    	repaint();
	   }
	   if(e.getSource()==U)
	   {
	    	f=21;
	    	repaint();
	   }
	   if(e.getSource()==V)
	   {
	    	f=22;
	    	repaint();
	   }
	   if(e.getSource()==W)
	   {
	    	f=23;
	    	repaint();
	   }
	   if(e.getSource()==X)
	   {
	    	f=24;
	    	repaint();
	   }
	   if(e.getSource()==Y)
	   {
	    	f=25;
	    	repaint();
	   }
	   if(e.getSource()==Z)
	   {
	    	f=26;
	    	repaint();
	   }
	      
	}
	
}
/*<applet code=alpha width=1900 height=890>
</applet>*/