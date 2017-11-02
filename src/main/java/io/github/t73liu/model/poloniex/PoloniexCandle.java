package io.github.t73liu.model.poloniex;

import io.github.t73liu.util.DateUtil;
import org.ta4j.core.BaseTick;
import org.ta4j.core.Tick;

public class PoloniexCandle {
    private long date;
    private double high;
    private double low;
    private double open;
    private double close;
    private double volume;
    private double quote;
    private double weightedAverage;

    public long getDate() {
        return date;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public double getOpen() {
        return open;
    }

    public double getClose() {
        return close;
    }

    public double getVolume() {
        return volume;
    }

    public double getQuote() {
        return quote;
    }

    public double getWeightedAverage() {
        return weightedAverage;
    }

    public Tick toTick() {
        return new BaseTick(DateUtil.unixSecondsToZonedDateTime(date), open, high, low, close, volume);
    }
}
