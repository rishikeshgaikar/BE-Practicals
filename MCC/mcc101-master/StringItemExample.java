import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class StringItemExample extends MIDlet
implements CommandListener
{
private Display display;
private Form form;
private StringItem question;
private Command giveup;
private Command exit;
public StringItemExample()
{
display = Display.getDisplay(this);
question = new StringItem("Question ","A plane crashes on the border between Canada and the US Where are the survivors buried");
giveup = new Command("Give Up", Command.SCREEN, 1);
exit = new Command("Exit", Command.EXIT, 1);
form = new Form("Quiz");
form.addCommand(exit);
form.addCommand(giveup);
form.append(question);
form.setCommandListener(this);
}
public void startApp()
{
display.setCurrent(form);
}
public void pauseApp()
{
}
public void destroyApp(boolean unconditional)
{
}
public void commandAction(Command command, Displayable displayable)
{
if (command == giveup)
{
question.setLabel("Answer: ");
question.setText("Survivors are not buried.");
form.removeCommand(giveup);
}
else if (command == exit)
{
destroyApp(false);
notifyDestroyed();
}
}
}