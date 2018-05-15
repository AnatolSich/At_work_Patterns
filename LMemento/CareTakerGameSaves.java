package LMemento;

import java.util.ArrayList;
import java.util.List;

public class CareTakerGameSaves {
    OriginatorGame originatorGame;
    List<OriginatorGame.MementoGameSave> mementoGameSaves = new ArrayList<>();

    public CareTakerGameSaves(OriginatorGame originatorGame) {
        this.originatorGame = originatorGame;
    }

    public void pushToList(){
        OriginatorGame.MementoGameSave m = originatorGame.save();
        mementoGameSaves.add(m);
    }

    public void popFromList(){
        int lastSaveIndex =  mementoGameSaves.size()-1;
        OriginatorGame.MementoGameSave m = mementoGameSaves.get(lastSaveIndex);
        originatorGame.restore(m);
        mementoGameSaves.remove(lastSaveIndex);
    }
}
