package com.home.redditap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class RedditAP
{
    
    public static void main(String[] args) 
    {
        Splash();
        Login();
    }
    
    public static void Splash()
    {
        Splash_Panel Splash1 = new Splash_Panel();
        JFrame Splash_Frame = Create_JFrame(Splash1,"",450,450,0);
        Splash_Frame.setVisible(true);

        //Timer
        for (int i = 0; i < 100; i++)
        {
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(RedditAP.class.getName()).log(Level.SEVERE, null, ex);
            }
            Splash1.Progress.setValue(i);
            Splash1.Percentage.setText(Integer.toString(i) + " %");
        }

        Splash_Frame.setVisible(false);
    }

    public static void Login()
    {

    }

    public static JFrame Create_JFrame(JPanel Panel, String Title, int Width, int Height, int IsSplash)
    {
        JFrame Frame = new JFrame(Title);
        Frame.setSize(Width,Height);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setResizable(false);
        Frame.setLocationRelativeTo(null);
        Frame.add(Panel);
        
        
        if (IsSplash == 0)
        {
            Frame.setUndecorated(true);
        }
        else
        {
            Frame.setUndecorated(false);
        }

        return Frame;

    }

}
