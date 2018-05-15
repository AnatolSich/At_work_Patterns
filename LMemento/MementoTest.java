package LMemento;

public class MementoTest {
    public static void main(String[] args) {
        OriginatorGame game = new OriginatorGame(1, "simple");
        CareTakerGameSaves saves = new CareTakerGameSaves(game);

        //Saving gameplay
        saves.pushToList();
        System.out.println(game);

        game.setLevel(2);
        saves.pushToList();
        System.out.println(game);

        game.setLevel(3);
        saves.pushToList();
        System.out.println(game);

        game.setLevel(1);
        game.setDifficulty("middle");
        saves.pushToList();
        System.out.println(game);

        //Gameplay is not appropriate
        //restore last save from history
        game.setLevel(2);
        game.setDifficulty("middle");
        System.out.println(game);
        saves.popFromList();
        System.out.println(game);

        //restore another last save from history
        saves.popFromList();
        System.out.println(game);

    }
}
