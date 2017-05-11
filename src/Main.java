public class Main {
    public static void main(String[] args)
    {
        Patrol patrol = new Patrol();
        patrol.addToCollection(new StormTrooper("TK-129"));
        patrol.addToCollection(new StormTrooper("TK-130"));
        patrol.addToCollection(new StormTrooper("TK-131"));
        patrol.addToCollection(new StormTrooper("TK-132"));
        patrol.addToCollection(new Officer("TK-133"));
        patrol.addToCollection(new Officer("TK-134"));
        patrol.talk();
    }
}
