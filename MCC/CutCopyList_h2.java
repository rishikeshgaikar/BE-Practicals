import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.*;
public class CutCopyList_h2 extends MIDlet
implements CommandListener
{
private Form form;
private String actions[]= {"cut", "copy", "paste", "delete", "select all", "unselect all"};
private List actionList;
public CutCopyList_h2()
{
actionList = new List("Edit", List.EXCLUSIVE, actions, null);
actionList.addCommand(new Command("Select list item", Command.SCREEN, 1));
actionList.setCommandListener(this);
}
public void startApp()
{
Display display;
display = Display.getDisplay(this);
display.setCurrent(actionList);
}
public void pauseApp()
{
}
public void destroyApp(boolean unconditional)
{
notifyDestroyed();
}
public void commandAction(Command c, Displayable d)
{
int i = actionList.getSelectedIndex();
String selectedItem = actionList.getString(i);
Alert alert = new Alert("Your Selection");
alert.setString(selectedItem);
alert.setTimeout(5000); // 5 seconds
Display display = Display.getDisplay(this);
display.setCurrent(alert, display.getCurrent() );
}
}
