import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


private static Icon icon;

public static  void ImageConverter(JLabel label,String FileName)
     {
     icon =label.getIcon();
     label.setIcon(new ImageIcon(Package.getPackages().getClass().getResource("/icon/"+FileName+".png")));
             
     }
     public  static void DefaultImageConverter(JLabel label)
     {
     label.setIcon(icon);
     }
     
     // using //
     /*   icon name  create folder.
     *    ımage converter : ImageConverter(label1,"car");
     *    default image:    DefaultImageConverter(label1);
     *
     *
     *
     *
     */
