package JCommand;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class CommandTest {
    static public int d=500;
    public static void main(String[] args) throws InterruptedException {

        Editor editor = new Editor();
        Command command1 = new PasteCommand(editor, "001");
        Command command2 = new PasteCommand(editor, "002");
        Command command3 = new CopyCommand(editor, "003");
        Command command4 = new PasteCommand(editor, "004");
        Command command5 = new DeleteCommand(editor, "005");
        Command command6 = new DeleteCommand(editor, "006");
        Command command7 = new CopyCommand(editor, "007");
        Command command8 = new PasteCommand(editor, "008");

        Invoker invoker = new Invoker();

        invoker.getStatus();
        sleep(d);
        invoker.setCommand(command1);
        invoker.executeCommand();
        sleep(d);
        invoker.setCommand(command2);
        invoker.executeCommand();
        sleep(d);
        invoker.setCommand(command3);
        invoker.executeCommand();
        sleep(d);
        invoker.setCommand(command4);
        invoker.executeCommand();
        sleep(d);
        invoker.getStatus();
        sleep(d);
        invoker.undoCommand();
        sleep(d);
        invoker.getStatus();
        sleep(d);
        invoker.setCommand(command5);
        invoker.executeCommand();
        sleep(d);
        invoker.setCommand(command6);
        invoker.executeCommand();
        sleep(d);
        invoker.setCommand(command7);
        invoker.executeCommand();
        sleep(d);
        invoker.setCommand(command8);
        invoker.executeCommand();
        sleep(d);
        invoker.getStatus();
        sleep(d);
        invoker.undoCommand(command6);
        sleep(d);
        invoker.getStatus();


    }


}

interface Command {

    default boolean undo() {
        int n = Invoker.commandHistory.indexOf(this);
        for (int i = Invoker.commandHistory.size() - 1; i >= n; i--) {
            Invoker.commandHistory.remove(i);
        }
        System.out.println("Undo command: " + this);
        return true;
    }

    boolean execute();
}

class Invoker {
    static List<Command> commandHistory = new ArrayList<>();

    void getStatus() throws InterruptedException {
        System.out.println("***");
        sleep(500);
        if (!commandHistory.isEmpty()) {
            System.out.println("Command History: ");
            sleep(500);
            for (int i = 0; i < commandHistory.size(); i++) {
                System.out.println(""+i+". "+commandHistory.get(i));
                sleep(500);
            }
        } else System.out.println("Status: No command");
        System.out.println("***");
        sleep(500);
    }

    void setCommand(Command command) {
        commandHistory.add(command);
    }

    void executeCommand() {
        if (!commandHistory.get(commandHistory.size() - 1).execute()) {
            commandHistory.remove(commandHistory.size() - 1);
        }

    }

    void undoCommand(Command command) {
        if (commandHistory.contains(command)) command.undo();
    }

    void undoCommand() {
        commandHistory.get(commandHistory.size() - 1).undo();
    }
}