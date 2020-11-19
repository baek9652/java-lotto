package lotto.views;

import static lotto.LottoGameConstant.NUM_LOTTO_MESSAGE;
import static lotto.LottoGameConstant.SCORING_OPENING_MESSAGE;
import static lotto.LottoGameConstant.SPLIT_LINE_MESSAGE;

public class ResultView {

  private ResultView() {
  }

  public static void printNumLotto(int numLotto) {
    System.out.print(numLotto);
    System.out.println(NUM_LOTTO_MESSAGE);
  }

  public static void printLottoInfo(String lotto) {
    System.out.print(lotto);
  }

  public static void printStatisticsOutline() {
    System.out.println(SCORING_OPENING_MESSAGE);
    System.out.println(SPLIT_LINE_MESSAGE);
  }

  public static void printMatchedNumber(int number){
    System.out.print(number);
  }
}
