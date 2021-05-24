package src;


import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.Window;

import Interface.Acceuil;
import Modele.*;

public class App {
    public static void main(String[] args) throws Exception {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Acceuil frame = new Acceuil();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
	    			}
	    		}
	    	});
	}
}