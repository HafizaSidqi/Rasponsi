
package responsi;


import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame{
    private Image image;
    
    JLabel ltitle = new JLabel("LOGIN ADMIN");
    
    JLabel lun = new JLabel("Username");
    final JTextField fun = new JTextField();
    
    JLabel lpw = new JLabel("Password");
    final JPasswordField fpw = new JPasswordField();
    
    JButton btnlogin = new JButton("LOGIN");
    JButton btnback = new JButton("BACK");
    
    public Login() {
        
        image = new ImageIcon(getClass().getResource("cofeeandlaptop.jpg")).getImage();
         this.setContentPane(new JPanel() {
         @Override
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null);
         }
         });
        setTitle("Login");
        setDefaultCloseOperation(3);
        setSize(550, 450);
        

        
        
        btnlogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                if(fun.getText().equals("admin") && fpw.getText().equals("1234")){
                    JOptionPane.showMessageDialog(null, "berhasil login");
                    //MVC_Film f = new MVC_Film();
                    //dispose();
                }
                else {
                    System.out.println("username atau password salah");
                    JOptionPane.showMessageDialog(null, "Login Failed!");
                }
            }
        });
        btnback.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Home home = new Home();
                dispose();
            }
        });
        setLayout(null);
        add(ltitle);
        ltitle.setFont(new Font("times new roman", Font.PLAIN, 14));
        ltitle.setBounds(230, 70, 200, 100);
        add(lun);
        lun.setBounds(150, 150, 100, 25);
        add(fun);
        fun.setBounds(250, 150, 150, 25);
        add(lpw);
        lpw.setBounds(150, 200, 100, 25);
        add(fpw);
        fpw.setBounds(250, 200, 150, 25);
        add(btnlogin);
        btnlogin.setBounds(180, 250, 70, 25);
        add(btnback);
        btnback.setBounds(300, 250, 70, 25);
        setVisible(true);
    }
}
