package LMemento;

public class OriginatorGame {
    int level;
    String difficulty;

    public OriginatorGame(int level, String difficulty) {
        this.level = level;
        this.difficulty = difficulty;
    }

    public MementoGameSave save() {
        return new MementoGameSave(this.level, this.difficulty);
    }

    public void restore(MementoGameSave mementoGameSave){
        this.level=mementoGameSave.getLevel();
        this.difficulty=mementoGameSave.getDifficulty();
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "OriginatorGame{" +
                "level=" + level +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }

    class MementoGameSave {
        int level;
        String difficulty;

        public MementoGameSave(int level, String difficulty) {
            this.level = level;
            this.difficulty = difficulty;
        }

        public int getLevel() {
            return level;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }

}
