import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;

public class TextFieldMIDlet extends MIDlet implements CommandListener {
	private Command exitCommand;
	private TextField aTextField;
	private Display display;
	private Form aForm;
	boolean isRun;

	public TextFieldMIDlet() {
		display = Display.getDisplay(this);
		exitCommand = new Command("Exit", Command.EXIT, 1);
		aTextField = new TextField("suwg test", "输入", 140, TextField.ANY);
		aForm = new Form("TextField Sample");
	}
	
	

   
	int size;
	byte[] bs;
	public void startApp() {
		aForm.append(aTextField);
		aForm.addCommand(exitCommand);
		aForm.setCommandListener(this);
		display.setCurrent(aForm);
		isRun=true;
		
		long key=Runtime.getRuntime().totalMemory()/1024;
		System.out.println(key);
		aTextField.setString("Runtime max size：（Byte）"+key);
		
//		new Thread(new Runnable() {
//			
//			public void run() {
//				// TODO Auto-generated method stub
//				while(isRun){
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					size++;
//					
//					aTextField.setString(""+size);
//					
//					bs=new byte[256*1024*size];
//				}
//				
//			}
//		}).start();
	}

	public void pauseApp() {
	}

	public void destroyApp(boolean unconditional) {
	}

	public void commandAction(Command c, Displayable s) {
		if (c == exitCommand) {
			destroyApp(false);
			notifyDestroyed();
		}
	}
}
