package lotto;

// TODO: Enum 활용법 공부
// public enum Score {
//
//   ZERO(0),
//   ONE(1),
//   TWO(2),
//   THREE(3),
//   FOUR(4),
//   FIVE(5),
//   SIX(6);
//
//   int matchedNumber;
//
//   Score(int matchedNumber) {
//     this.matchedNumber = matchedNumber;
//   }
// }

import java.util.HashMap;
import java.util.Map;

public class Score {

  private static final String MATCHED_SIX ="2_000_000_000";
  private static final String MATCHED_FIVE ="150_000_000";
  private static final String MATCHED_FOUR ="50_000";
  private static final String MATCHED_THREE ="5_000";

  Map<Integer, Integer> ScoreMap;
  Map<Integer, String> PriceMap;

  public Score() {
    ScoreMap = new HashMap<>();
    PriceMap = new HashMap<>();

    for(int i = 0; i <= 6; i++){
      ScoreMap.put(i, 0);
    }

    for (int i = 0; i < )

  }

  public void recordScore(int numMatched) {
    this.ScoreMap.put(numMatched, this.ScoreMap.get(numMatched) + 1);
  }

  public static void main(String[] args){
    Score score = new Score();
    score.recordScore(3);
  }

}
