public abstract class GenericPlayer
{
    // ---------------------
    // Game attributes
    // ---------------------
    protected String name;
    protected int numberOfWins;
    protected int numberOfLosses;
    protected int numberOfTies;
    protected int numberOfGamesPlayed;

    // Accessors: getName(), getNumberOfWins(), etc...
    public String getName(){
      return name;
    }
    public int getNumberOfWins(){
      return numberOfWins;
    }
    public int getNumberOfLosses(){
      return numberOfWins;
    }
    public int getNumberOfTies(){
      return numberOfTies;
    }
    public int getNumberOfGamesPlayed(){
      return numberOfGamesPlayed;
    }
    // Modifiers: setName(String m), setNumberOfWins(), etc...
    public String setName(String name){
      this.name = name;
    }
    public int setNumberOfWins(int numberOfWins){
      this.numberOfWins = numberOfWins;
    }
    public int setNumberOfLosses(int numberOfLosses){
      this.numberOfLosses = numberOfLosses;
    }
    public int setNumberOfTies(int numberOfTies){
      this.numberOfTies = numberOfTies;
    }
    public int setNumberOfGames(int numberOfGamesPlayed){
      this.numberOfGamesPlayed = numberOfGamesPlayed;
    }
    // -------------------
    // abstract functions
    // -------------------
    public abstract double getWinPercentage();
    public abstract void printWinPercentage();
    public abstract double getLossPercentage();
    public abstract void printLossPercentage();
}
