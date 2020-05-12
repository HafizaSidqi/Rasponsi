
package responsi;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Home extends JFrame{
    private Image image;
    
    //Icon iconhome = (Icon) new ImageIcon("C:\\Users\\Ikhsan\\Documents\\NetBeansProjects\\Responsi\\src\\responsi\\homeicon.png");
    
    JButton btnhome = new JButton(" HOME ");
    JButton btngaji = new JButton(" GAJI ");
    JButton btnread = new JButton(" READ ");
    JButton btnpetunjuk = new JButton(" PETUNJUK ");
    JButton btnadmin = new JButton(" ADMIN ");
    
    JLabel lapp = new JLabel("APLIKASI PERHITUNGAN GAJI PT.VETERAN JAYA");
    
    public Home(){
        image = new ImageIcon(getClass().getResource("backgroundd.jpg")).getImage();
         this.setContentPane(new JPanel() {
         @Override
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null);
         }
         });
         
        setTitle("Home");
        setDefaultCloseOperation(3);
        setSize(650, 550);
        
        setLayout(null);
        add(btnhome);
        btnhome.setBounds(10, 10, 120, 80);
        add(btngaji);
        btngaji.setBounds(10, 100, 120, 80);
        add(btnread);
        btnread.setBounds(10, 190, 120, 80);
        add(btnpetunjuk);
        btnpetunjuk.setBounds(10, 280, 120, 80);
        
        add(btnadmin);
        btnadmin.setBounds(500, 10, 120, 80);
        
        add(lapp);
        lapp.setBounds(180, 480, 300, 25);
        
        setVisible(true);
        
        /*
        btnhome.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        Home home = new Home();
        dispose();
        }
        });*/
        
        btnadmin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Login login = new Login();
                dispose();
            }
        });
        
        btngaji.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                MVGaji gaji = new MVGaji();
                dispose();
            }
        });
        
        btnread.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                MVRead read = new MVRead();
                dispose();
            }
        });

       
        btnpetunjuk.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Petunjuk petunjuk = new Petunjuk();
                dispose();
            }
        });
    }
    
}
