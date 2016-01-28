import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;


public class HelloWorldMIDlet extends MIDlet implements CommandListener {
	
	private TextBox textbox;

	public HelloWorldMIDlet() {
		super();
		System.out.println("ssssssssssss");
	}

	protected void startApp() throws MIDletStateChangeException {
		try{
			
			
			TextBox textbox = new TextBox("suwg", "HelloWorld", 4, 4);
		Display.getDisplay(this).setCurrent(textbox);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	protected void pauseApp() {
		
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		
	}

	public void commandAction(Command c, Displayable d) {
		// TODO Auto-generated method stub
		
	}
}