/*Create a slideshow which has three slides.
which includes only text.Program should change to the newslide 
after 5 seconds.After the third slide program returns to the First Slide*/
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class SlideShow extends MIDlet implements CommandListener {
public Form slide1;
public Form slide2;
public Form slide3;
public Command Exit;
public Display display;
public SlideShow()
{
display=Display.getDisplay(this);
Exit=new Command("Exit",Command.EXIT,1);
slide1=new Form("Slide1");
slide1.append("This is Slide number 1");
slide1.addCommand(Exit);
slide2=new Form("Slide2");
slide2.append("This is Slide number 2");
slide2.addCommand(Exit);
slide3=new Form("Slide3");
slide3.append("This is Slide number 3");
slide3.addCommand(Exit);
slide1.setCommandListener(this);
slide2.setCommandListener(this);
slide3.setCommandListener(this);
}
public void startApp() {
Thread runner = new Thread(new ThreadRunner(display,slide1,slide2,slide3));
runner.start();
}
public void pauseApp() {
}
public void destroyApp(boolean unconditional) {
}
public void commandAction(Command command,Displayable displayable)
{
if(displayable==slide1)
{
if(command==Exit)
notifyDestroyed();
}
else if(displayable==slide2)
{
if(command==Exit)
notifyDestroyed(); }
else if(displayable==slide3)
{
if(command==Exit)
notifyDestroyed();
}
}
}
class ThreadRunner implements Runnable {
Display display;
public int c=0;
public Form slide1;
public Form slide2;
public Form slide3;
public ThreadRunner(Display display,Form slide1,Form slide2,Form slide3) {
this.display = display;
this.slide1=slide1;
this.slide2=slide2;
this.slide3=slide3;
}
public void run() {
while(true)
{
c++;
if(c==1)
display.setCurrent(slide1);
else if(c==2)
display.setCurrent(slide2);
else if(c==3)
display.setCurrent(slide3);
else if(c==4)
c=0;
try
{
Thread.sleep(1500);
}
catch(Exception ex)
{
}
}
}
}
