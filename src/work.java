import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kirillov.mv on 27.03.2015.
 */
public class work extends JFrame{
    JButton b1,b2;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    int a,b;
    String q,w;
    eHandler handler = new eHandler();

    public work (String s){
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Clear");
        b2 = new JButton("Otvet");
        l1 = new JLabel("Vvedite 1 chislo");
        l2 = new JLabel("Vvedite 2 chislo");
        l3 = new JLabel("");
        l4 = new JLabel("");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        add(b1);
        add(b2);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(l4);
        b2.addActionListener(handler);
        b1.addActionListener(handler);
    }
    public  class eHandler implements ActionListener {
        public void  actionPerformed(ActionEvent e) {
            try{
                if (e.getSource() == b2) {
                    a = Integer.parseInt(t1.getText());
                    b = Integer.parseInt(t2.getText());
                    a++;
                    b++;
                    q = "tepr 1 =" + a;
                    w = "teper 2 =" + b;
                    l3.setText(q);
                    l4.setText(w);

                }
                if (e.getSource() == b1) {
                    t1.setText(null);
                    t2.setText(null);
                    l3.setText(null);
                    l4.setText(null);
                }
            }catch (Exception ee){JOptionPane.showMessageDialog(null,"vvedite chislo" );}
        }

    }}
