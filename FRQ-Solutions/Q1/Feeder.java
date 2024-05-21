public class Feeder{
  private int currentFood;

  public Feeder(int food){
    currentFood = food;
  }

  public void simulateOneDay(int numBirds){
    int chance = (int)(Math.random()*100)+1;
    if(chance > 5){
      int food = (int)(Math.random()*41)+10;
      int total = food * numBirds;
      if(total > currentFood){
        currentFood = 0;
      }else{
        currentFood -= total;
      }
    }
  }

  public int simulateManyDays(int numBirds, int numDays){
    int count = 0;
    for(int i = 1; i <= numDays; i++){
      simulateOneDay(numBirds);
      if(currentFood == 0){
        return count;
      }
      count++;
    }
    return count;
  }
}
