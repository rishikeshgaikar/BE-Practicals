import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class BarGraphMIDlet extends MIDlet implements CommandListener{
 public Form form;
 public Command exitCommand;
 public Command OkCommand;
 public Command backCommand;
 public Displayable d;
 public Display display;
 public TextField textfield1;
 public TextField textfield2;
 public TextField textfield3;
 public TextField textfield4;
 public TextField textfield5;
public BarGraphMIDlet()
 {
 display=Display.getDisplay(this);
 form=new Form("BarGraph");
 textfield1=new TextField("Value1:-","",30,TextField.ANY);
 textfield2=new TextField("Value2:-","",30,TextField.ANY);
 textfield3=new TextField("Value3:-","",30,TextField.ANY);
 textfield4=new TextField("Value4:-","",30,TextField.ANY);
 textfield5=new TextField("Value5:-","",30,TextField.ANY);
 form.append(textfield1);
 form.append(textfield2);
 form.append(textfield3);
 form.append(textfield4);
 form.append(textfield5);
 OkCommand=new Command("Ok",Command.OK,1);
 exitCommand=new Command("Exit",Command.EXIT,1);
 backCommand=new Command("Back",Command.BACK,1);
 form.addCommand(OkCommand);
 form.addCommand(exitCommand);
 form.setCommandListener(this);
 }
public void startApp() {
 display.setCurrent(form);
 }
 public void pauseApp() {
 }
 public void destroyApp(boolean unconditional) {
 }
 public void commandAction(Command command,Displayable displayable)
 {
 if(displayable==form)
 {
 if(command==OkCommand)
 {
 int[] data=new int[5];
 data[0]=Integer.parseInt(textfield1.getString());
 data[1]=Integer.parseInt(textfield2.getString());
 data[2]=Integer.parseInt(textfield3.getString());
 data[3]=Integer.parseInt(textfield4.getString());
 data[4]=Integer.parseInt(textfield5.getString());
 d=new BarCanvas(data);
d.addCommand(backCommand);
 d.setCommandListener(this);
 display.setCurrent(d);
 }
 else if(command==exitCommand)
 notifyDestroyed();
 }
 else if(displayable==d)
 {
 if(command==backCommand)
 display.setCurrent(form);
 }
 }
}
class BarCanvas extends Canvas{
 int[] data;
 public int x;
 public int y;
 public int y1;
public int h;
 public BarCanvas(int[] data)
 {
 this.data=data;
 x=10;
 }
public void paint(Graphics g)
 {
 g.setColor(255, 255, 255);
 g.fillRect(0, 0, this.getWidth(), this.getHeight());
 g.setColor(255, 125, 100);
 int i=0;
 y1=data[0];
 h=200;
 while(i<data.length)
 {
 y=data[i];
 h=200+y1-y;
 g.fillRect(x, y,25 , h);
 x+=30;
 i++;
 }
}
}