package lotto;

import java.util.List;

public class LottoTickets {

  private final List<LottoTicket> tickets;

  private LottoTickets(List<LottoTicket> tickets) {
    this.tickets = tickets;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    for (LottoTicket lottoTicket : tickets) {
      builder.append(lottoTicket);
      builder.append("\n");
    }

    return builder.toString();
  }

  public static LottoTickets of(List<LottoTicket> tickets) {
    if (tickets == null) {
      throw new NullPointerException();
    }

    return new LottoTickets(tickets);
  }

  public Score getScore(WinningNumber winningNumber) {
    Score score = new Score();
    for (LottoTicket ticket : this.tickets) {
      score.recordScore(ticket.numMatched(winningNumber));
    }
    return score;
  }
}
