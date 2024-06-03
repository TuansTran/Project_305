

import java.util.Calendar;

public class MidPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    public String getPriority() {
        return priority;
    }

    public String getExpireDay() {
        return expireDay;
    }

    public void setExpireDay(String expireDay) {
        this.expireDay = expireDay;
    }

    public String getStatus() {
        return status;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setExpire(String expireDay) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        this.expireDay = String.format("%1$td/%1$tm/%1$tY", calendar);
    }

    public void setStatus(String status) {
        this.status = "Accepted";
    }

    public void processRequest() {
        System.out.println("Request accepted, completion day is " + expireDay);
    }
}

class MidPriorityConcreteCreator extends RequestCreator {
    RequestProduct createRequest() {
        return new MidPriorityConcrete();
    }
}