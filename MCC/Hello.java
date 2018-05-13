import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
public class Hello extends MIDlet{
private Form form;
private Display display;
public void startApp(){
form = new Form("Hello World");
String msg = "Hello World message";
form.append(msg);
display = Display.getDisplay(this);
display.setCurrent(form);
}
public void pauseApp(){}
public void destroyApp(boolean unconditional){
notifyDestroyed();
}
}