import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/Quiz.png"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,800,500);
        add(image);

        JLabel heading=new JLabel("Quizzy Whizzy");
        heading.setBounds(850,60,300,45);
        heading.setFont(new Font("Constantia",Font.BOLD,40));
        heading.setForeground(new Color(0,40,104));
        add(heading);

        JLabel name=new JLabel("Enter your name");
        name.setBounds(890,150,300,25);
        name.setFont(new Font("Constantia",Font.BOLD,20));
        name.setForeground(new Color(0,40,104));
        add(name);

        tfname=new JTextField();
        tfname.setBounds(840,200,300,25);
        tfname.setFont(new Font("Calibri Light",Font.BOLD,20));
        add(tfname);

        rules=new JButton("Rules");
        rules.setBounds(845,270,120,25);
        rules.setBackground(new Color(54,116,181));
        rules.setForeground(new Color(251, 248, 239));
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(1015,270,120,25);
        back.setBackground(new Color(54,116,181));
        back.setForeground(new Color(251, 248, 239));
        back.addActionListener(this);
        add(back);

        setSize(1200,500);
        setLocation(400,200);
    setVisible(true);    
    }

public void actionPerformed(ActionEvent ae){
    if (ae.getSource()== rules){
        String name=tfname.getText();
        setVisible(false);
        new Rules(name);

    }
    else if(ae.getSource()== back){
        setVisible(false);

    }
}

public static void main(String args[]){
    new Login();
}
}