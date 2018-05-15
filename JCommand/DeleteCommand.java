package JCommand;

public class DeleteCommand implements Command {
    Editor editor;
    public String str;


    public DeleteCommand(Editor editor, String str) {
        this.editor = editor;
        this.str = str;
    }



    @Override
    public boolean execute() {
        editor.delete(str);
        return true;
    }

    @Override
    public String toString() {
        return "DeleteCommand{" +
                "str='" + str + '\'' +
                '}';
    }
}
