
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R4PORT-ROOT
 */
public class ColorSettings {


private static Color defaultColor;
private static Color defaultBackGroundColor;
public static void setBg(JButton button, Color color)
{
defaultColor = button.getBackground();
defaultBackGroundColor = button.getForeground();
button.setBackground(color);
System.out.println(button.getText() + " Rengi "+ defaultColor +" olarak değiştirildi.");

}
public static void setBg(JButton button, Color color,Color ForeColor)
{
defaultColor = button.getBackground();
defaultBackGroundColor = button.getForeground();
button.setBackground(color);
button.setForeground(ForeColor);
System.out.println(button.getText() + " Rengi "+ defaultColor +" olarak değiştirildi.");

}


public static void setBg(JLabel label, Color color)
{
defaultColor = label.getBackground();
defaultBackGroundColor = label.getForeground();
label.setBackground(color);
System.out.println(label.getText() + " Rengi "+ defaultColor +" olarak değiştirildi.");

}
public static void setBg(JLabel label, Color color,Color ForeColor)
{
defaultColor = label.getBackground();
defaultBackGroundColor = label.getForeground();
label.setBackground(color);
label.setForeground(ForeColor);
System.out.println(label.getText() + " Rengi "+ defaultColor +" olarak değiştirildi.");

}

public static void setDefaultBg(JButton button)
{
    button.setBackground(defaultColor);
   button.setForeground(defaultBackGroundColor);

    System.out.println(button.getText() + " Rengi "+ defaultColor +" olarak varsıyalan renge değiştirildi.");
}

public static void setDefaultBg(JLabel label)
{
    label.setBackground(defaultColor);
    label.setForeground(defaultBackGroundColor);

    System.out.println(label.getText() + " Rengi "+ defaultColor +" olarak varsıyalan renge değiştirildi.");
}


}
    
