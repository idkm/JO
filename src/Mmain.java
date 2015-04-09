import javax.swing.*;

/**
 * Created by kirillov.mv on 27.03.2015.
 */
public class Mmain {
    public static void main(String args[]){
        work o = new work("Pizdosiki");

        o.setVisible(true);
        o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        o.setSize(200, 200);
        o.setResizable(false);
        o.setLocationRelativeTo(null);
    }
}
