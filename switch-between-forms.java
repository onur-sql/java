 public static void VissibleEdit(JFrame oldForm, JFrame newform)
    {
    oldForm.setVisible(false);
    newform.setVisible(true);
    System.out.println(oldForm.getTitle()+" formundan "+newform.getTitle()+" formuna geçiş yapıldı");
    }
     public static void VissibleEdit(JFrame oldForm, JFrame newform,String msg,String MsgTitle)
    {
    JOptionPane.showMessageDialog(newform, msg, MsgTitle, 1);

    oldForm.setVisible(false);
    newform.setVisible(true);
    System.out.println(oldForm.getTitle()+" formundan "+newform.getTitle()+" formuna geçiş yapıldı");
    }
    // using
    // VissibleEdit(form1, New Form2);
    // VissibleEdit(form1, New Form2,"Hello");
    
