package yahooApi.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quote {

    private Date date;

    private double value;

    public Quote(Date date, double value) {
        this.date = date;
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setQuote(double quote) {
        this.value = quote;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Quote other = (Quote) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        return  sf.format(date)+" "+value;
    }
}
