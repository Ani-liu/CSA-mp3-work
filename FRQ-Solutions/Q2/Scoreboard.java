public class Scoreboard {
  private String team1;
  private String team2;
  private int score1;
  private int score2;
  private boolean active;

  public Scoreboard(String t1, String t2){
    team1 = t1;
    team2 = t2;
    score1 = 0;
    score2 = 0;
    active = true;
  }
  
  public void recordPlay(int num){
    if(active){
      score1 += num;
    }else{
      score2 += num;
    }

    if(num == 0){
      active = !active;
    }
  }

  public String getScore(){
    String score = score1 + "-" + score2+ "-";
    if(active){
      return score + team1;
    }else{
      return score + team2;
    }
  }
}
