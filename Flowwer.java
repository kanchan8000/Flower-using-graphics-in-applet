import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Flowwer extends Applet implements ActionListener{
    Button b1,b2;
int x=1;


public void init(){

b2=new Button("small");

b2.setBounds(1000,100,60,60);

add(b2);
b2.addActionListener(this);
b1=new Button("Enlarge");

b1.setBounds(1000,100,80,60);

add(b1);
b1.addActionListener(this);
}

public void paint(Graphics g)
{
if(x==1)
{
    super.paint(g);
     
    g.setColor(Color.green);  //flower stem
    g.fillRect(520, 250, 10, 100);
    
    g.setColor(Color.red);  //petals
    g.fillOval(505, 190, 40, 40);
    g.fillOval(530, 210, 40, 40);
    g.fillOval(525, 240, 40, 40);
    g.fillOval(490, 240, 40, 40);
    g.fillOval(480, 210, 40, 40);
}

if(x==0)
{ 
    super.paint(g);  

    g.setColor(Color.green);  //flower stem
    g.fillRect(620, 350, 20, 160);
    
    g.setColor(Color.red);  //petals
    g.fillOval(605, 290, 45, 45);
    g.fillOval(630, 310, 45, 45);
    g.fillOval(590, 340, 45, 45);
    g.fillOval(580, 310, 45, 45);
    g.fillOval(625, 340, 45, 45);
}

}

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1){
        x=0;
        repaint();
        }
        if(e.getSource()==b2){
        x=1;
        repaint();
        }
        
        }
}