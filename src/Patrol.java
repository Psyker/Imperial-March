import java.util.ArrayList;

public class Patrol
{

    private ArrayList<StormTrooper> collection;

    public static void main(String[] args) {

    }

    public void talk()
    {
        for (StormTrooper trooper : this.collection) {
            trooper.talk(this.collection);
        }
    }

    public Patrol()
    {
        this.collection = new ArrayList<>();
    }

    public Patrol addToCollection(StormTrooper trooper)
    {
        this.collection.add(trooper);

        return this;

    }

    public ArrayList getCollection() {
        return this.collection;
    }
}
