import java.awt.*;

public class Stage {
    Grid stageGrid = new Grid();
    Actor[] stageActors = {new Rabbit(3, 3, 13158600), new Lion(5, 2, 16711680), new Puppy(17, 12, 8190976)};


    public Stage() {
    }

    void paint(Graphics g, Point p) {
        stageGrid.paint(g, p);
        for(int i=0; i<stageActors.length; i++) {
            stageActors[i].paint(g);
        }
    }


}