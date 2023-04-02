import java.awt.event.*;  
import java.applet.*;  
import java.awt.*;  
public class EventApplet extends Applet implements ActionListener  
{  
    Button bttn;  
    TextField txtfld;  
    public void init()  
    {  
        txtfld=new TextField();  
        txtfld.setBounds(35,45,250,30);  
        bttn=new Button("click me");  
        bttn.setBounds(90,110,70,60);  
        add(bttn);add(txtfld);  
        bttn.addActionListener(this);  
        setLayout(null);  
      }  
      public void actionPerformed(ActionEvent ae)  
      {  
        txtfld.setText("welcome to c-sharpcorner.com");  
      }  
}  
/* 
