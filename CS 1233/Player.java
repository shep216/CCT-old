public class Player extends GenericPlayer{

  // ---------------------
  // Game attributes
  // ---------------------
  protected String name;
  protected int numberOfWins;
  protected int numberOfLosses;
  protected int numberOfTies;
  protected int numberOfGamesPlayed;

  // default constructor
  public Player(){
    name = "";
    numberOfWins = 0;
    numberOfLosses = 0;
    numberOfTies = 0;
    numberOfGamesPlayed = 0;
  }

  // overload constructor
  public Player(String name){
    this.name = name;
    numberOfWins = 0;
    numberOfLosses = 0;
    numberOfTies = 0;
    numberOfGamesPlayed = 0;
  }
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
  public void setName(String name){
    this.name = name;
  }
  public void setNumberOfWins(int numberOfWins){
    this.numberOfWins = numberOfWins;
  }
  public void setNumberOfLosses(int numberOfLosses){
    this.numberOfLosses = numberOfLosses;
  }
  public void setNumberOfTies(int numberOfTies){
    this.numberOfTies = numberOfTies;
  }
  public void setNumberOfGames(int numberOfGamesPlayed){
    this.numberOfGamesPlayed = numberOfGamesPlayed;
  }
/*
A.playerOpponent(Player player2, String p1choice, String p2choice)
  Player A will play against player2. Both players will store the outcome of the match. Ties are counted.*/
  public void playOpponent(Player player2, String p1choice, String p2choice){
    if(p1choice.equals(p2choice)){
      setNumberOfTies(getNumberOfTies() + 1);
      player2.setNumberOfTies(player2.getNumberOfTies() + 1);
    }
    else if((p1choice.equals("rock") && p2choice.equals("scissors")) ||
            (p1choice.equals("scissors") && p2choice.equals("paper")) ||
            (p1choice.equals("paper") && p2choice.equals("rock"))){
              setNumberOfWins(getNumberOfWins() + 1);
              player2.setNumberOfLosses(player2.getNumberOfLosses() + 1);
    }
    else{
      setNumberOfLosses(getNumberOfLosses() + 1);
      player2.setNumberOfWins(player2.getNumberOfWins() + 1);
    }
    setNumberOfGames(getNumberOfGamesPlayed() + 1);
    player2.setNumberOfGames(player2.getNumberOfGamesPlayed() + 1);
  }

  @Override
  public void printWinPercentage(){
    double games = getNumberOfGamesPlayed();
    double wins = getNumberOfWins();
    double winPercentage = wins/games;

    System.out.printf("Win percentage: %.2f percent", winPercentage);
  }

  @Override
  public double getWinPercentage(){
    double games = getNumberOfGamesPlayed();
    double wins = getNumberOfWins();
    double winPercentage = wins/games;

    return winPercentage;
  }

  @Override
  public void printLossPercentage(){
    double games = getNumberOfGamesPlayed();
    double losses = getNumberOfLosses();
    double lossPercentage = losses/games;

    System.out.printf("Loss percentage: %.2f percent", lossPercentage);
  }

  @Override
  public double getLossPercentage(){
    double games = getNumberOfGamesPlayed();
    double losses = getNumberOfLosses();
    double lossPercentage = losses/games;

    return lossPercentage;
  }

  @Override
  public void report(){
    System.out.println("" + getName() + "reports:");
    System.out.println("Name: " + getName());
    System.out.println("Wins: " + getNumberOfWins());
    System.out.println("Losses: " + getNumberOfLosses());
    System.out.println("Ties: " + getNumberOfTies());
  }
}
