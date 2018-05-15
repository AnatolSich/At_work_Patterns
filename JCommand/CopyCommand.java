package JCommand;

public class CopyCommand implements Command {
    Editor editor;
    public String str;


    public CopyCommand(Editor editor, String str) {
        this.editor = editor;
        this.str = str;
    }




    @Override
    public boolean execute() {
        editor.copy(str);
        return true;
    }

    @Override
    public String toString() {
        return "CopyCommand{" +
                "str='" + str + '\'' +
                '}';
    }
}
