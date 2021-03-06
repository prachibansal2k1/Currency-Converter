package start1;

import javax.swing.*;  
public class OptionPaneExample {  
JFrame f;  
OptionPaneExample(){  
	boolean check=true;
	while(check) {
    f=new JFrame();   
    String val=JOptionPane.showInputDialog(f,"Enter Value");    
    if(val==null) {
    	
    	check=false;
    	return;
    }
    else if(val!=null) {
    //System.out.println(name);
    JOptionPane.showMessageDialog(f, "Amount of Rupees: ₹"+val);
    Object[] options = {"Quit","U.S. Dollar","Euro","Pound"};
    int n = JOptionPane.showOptionDialog(f,"Choose which currency "+ " you wish to convert"," ",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,options,options[3]);
    //System.out.println(n);
    double rs=(Double.parseDouble(val));
    	switch (n) {
    	case 0:
    		check=false;
    		return;
    	case 1:
    	double m=0.014*rs;
    		String str = String.format("%.2f", m);
    		JOptionPane.showMessageDialog(f, "Amount in U.S. Dollars: $"+str);
    		break;
    	case 2:
    		double e=0.011*rs;
    		String str1 = String.format("%.2f", e);
    		JOptionPane.showMessageDialog(f, "Amount in Euros: €"+str1);
    		break;
    	case 3:
    		double p=0.01*rs;
    		String str2 = String.format("%.2f", p);
    		JOptionPane.showMessageDialog(f, "Amount in pounds: £"+str2);
			break;
    		}
    	}
    Object[] options = {"Quit ","Try Again"};
    int n = JOptionPane.showOptionDialog(f,"Finished, what do you want to do?","Money Converter",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,options,options[1]);
    if(n==0)
    	check=false;
	}
}  
public static void main(String[] args) {  
    new OptionPaneExample();  
}  
}  