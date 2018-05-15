package JCommand;

public class PasteCommand implements Command {
    Editor editor;
    public String str;


    public PasteCommand(Editor editor, String str) {
        this.editor = editor;
        this.str = str;
    }




    @Override
    public boolean execute() {
        editor.paste(str);
        return true;
    }

    @Override
    public String toString() {
        return "PasteCommand{" +
                "str='" + str + '\'' +
                '}';
    }
}
