import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class MappingCommands extends MIDlet implements
CommandListener
{
private Display display;
private Form fmMain;
private TextBox tbHelp;
private Command cmExit;
private Command cmHelp;
private Command cmBack ;
public MappingCommands()
{
display = Display.getDisplay(this);
cmHelp = new Command("Help", Command.HELP, 1);
cmBack = new Command("Back", Command.BACK, 1);
cmExit = new Command("Exit", Command.EXIT, 1);
fmMain = new Form("Core J2ME");
fmMain.addCommand(cmExit);
fmMain.addCommand(cmHelp);
fmMain.setCommandListener(this);
tbHelp = new TextBox("Help", "Help text here...", 500, 0);
tbHelp.addCommand(cmBack);
tbHelp.setCommandListener(this);
}
public void startApp()
{
display.setCurrent(fmMain);
}
public void pauseApp()
{ }
public void destroyApp(boolean unconditional)
{ }
public void commandAction(Command c, Displayable s)
{
if (c == cmExit)
{
destroyApp(false);
notifyDestroyed();
}
else if (c == cmHelp)
display.setCurrent(tbHelp);
else if (c == cmBack)
display.setCurrent(fmMain);
}
}