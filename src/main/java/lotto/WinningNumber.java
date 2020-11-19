package lotto;

import static lotto.LottoGameConstant.NUM_WINNING_NUMBERS;

import java.util.ArrayList;
import java.util.List;

public class WinningNumber {

  private final List<LottoNumber> numbers;

  private WinningNumber(List<LottoNumber> lottoNumbers) {
    this.numbers = lottoNumbers;
  }

  public static WinningNumber of(String input) {
    String[] tokenizedInput = input.split(", ");
    List<LottoNumber> numbers = new ArrayList<>();

    if (tokenizedInput.length != NUM_WINNING_NUMBERS) {
      throw new IllegalArgumentException();
    }

    for (String inputs : tokenizedInput) {
      numbers.add(LottoNumber.of(Integer.parseInt(inputs)));
    }

    return new WinningNumber(numbers);
  }

  public LottoNumber get(int index) {
    return this.numbers.get(index);
  }
}
