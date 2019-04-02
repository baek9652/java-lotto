package lotto;

import lotto.domain.AutoLotteries;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AutoLotteriesTest {
    static final int NUMBER_MANUAL_LOTTERIES = 3;
    static final int NUMBER_TOTAL_LOTTERIES = 15;

    @Test
    public void 자동_구매_개수_입력_테스트() {
        AutoLotteries autoLotteries = new AutoLotteries(NUMBER_TOTAL_LOTTERIES, NUMBER_MANUAL_LOTTERIES);

        autoLotteries.generateAutoLotteries();

        assertThat(autoLotteries.getAutoLotteriesSize()).isEqualTo(12);
    }
}
