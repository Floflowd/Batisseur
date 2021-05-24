

import java.awt.EventQueue;

import Interface.Acceuil;

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