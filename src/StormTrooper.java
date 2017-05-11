import java.util.ArrayList;
import java.util.UUID;

public class StormTrooper implements CommunicationInterface
{

    private String name;

    protected int rank;

    private String uuid;

    public static void main(String name)
    {
    }

    public StormTrooper(String name)
    {
        this.rank = 0;
        this.name = name;
        this.uuid = UUID.randomUUID().toString();
    }

    public String getName()
    {
        return name;
    }

    public StormTrooper setName(String name)
    {
       this.name = name;

       return this;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void talk(ArrayList<StormTrooper> collection)
    {
        for (StormTrooper trooper : collection) {
            if(!trooper.getUuid().equals(this.uuid)) {
                if(trooper.getRank() > this.rank) {
                    System.out.println(this.name + ": Seigneur " + trooper.getName());
                } if(trooper.getRank() == this.rank) {
                    System.out.println(this.name+": Hi "+trooper.getName());
                } if(trooper.getRank() < this.rank) {
                    System.out.println(this.name + ": sale merde " + trooper.getName());
                }
            }
        }
    }
}
