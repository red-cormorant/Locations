package ag.ihopethisworkssequel;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Objects;

public class SportDetails {

    //@Indexed(direction = IndexDirection.ASCENDING)
    private String extremeSport;
    private String periodOfTime;

    //@Indexed(direction = IndexDirection.ASCENDING)
    private double averagePrice;

    public SportDetails() {

    }

    public SportDetails(String extremeSport, String periodOfTime, double averagePrice) {
        this.extremeSport = extremeSport;
        this.periodOfTime = periodOfTime;
        this.averagePrice = averagePrice;
    }

    public String getExtremeSport() {
        return extremeSport;
    }

    public void setExtremeSport(String extremeSport) {
        this.extremeSport = extremeSport;
    }

    public String getPeriodOfTime() {
        return periodOfTime;
    }

    public void setPeriodOfTime(String periodOfTime) {
        this.periodOfTime = periodOfTime;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportDetails sport = (SportDetails) o;
        return Double.compare(sport.averagePrice, averagePrice) == 0 &&
                extremeSport.equals(sport.extremeSport) &&
                periodOfTime.equals(sport.periodOfTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extremeSport, periodOfTime, averagePrice);
    }

    @Override
    public String toString() {
        return "{" +
                "extremeSport='" + extremeSport + '\'' +
                ", periodOfTime='" + periodOfTime + '\'' +
                ", averagePrice=" + averagePrice +
                '}';
    }
}
