package lotto;

import static lotto.LottoGameConstant.NUMBERS_PER_TICKET;
import static lotto.LottoGameConstant.NUM_WINNING_NUMBERS;

import java.util.Collections;
import java.util.List;

public class LottoTicket {

  private final List<LottoNumber> lottoNumbers;

  private LottoTicket(List<LottoNumber> lottoNumbers) {
    this.lottoNumbers = lottoNumbers;
  }

  public static LottoTicket of(List<LottoNumber> lottoNumbers) {
    if (lottoNumbers == null || lottoNumbers.size() != NUMBERS_PER_TICKET) {
      throw new IllegalArgumentException();
    }

    // TODO: Collection 에 대한 예외처리 공부
    Collections.sort(lottoNumbers);

    // 중복 체킹. sort 되어 있으므로 붙어 있는 번호가 동일하면 예외
    for (int i = 0; i < NUMBERS_PER_TICKET - 1; i++) {
      checkEquality(lottoNumbers.get(i), lottoNumbers.get(i + 1));
    }

    return new LottoTicket(lottoNumbers);
  }

  private static void checkEquality(LottoNumber number1, LottoNumber number2) {
    if (number1.equals(number2)) {
      throw new IllegalArgumentException();
    }
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    builder.append('[');
    builder.append(lottoNumbers.get(0));

    for (int i = 1; i < lottoNumbers.size(); i++) {
      builder.append(", ");
      builder.append(lottoNumbers.get(i).toString());
    }

    builder.append(']');

    return builder.toString();
  }

  public int numMatched(WinningNumber winningNumber) {
    int result = 0;
    for (int i = 0; i < NUM_WINNING_NUMBERS; i++) {
      result += this.lottoNumbers.contains(winningNumber.get(i)) ? 1 : 0;
    }
    return result;
  }
}
