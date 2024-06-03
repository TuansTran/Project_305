

import java.util.Calendar;

public class LowPriorityConcrete implements RequestProduct {
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
        this.expireDay = String.format("%1$td/%1$tm/%1$tY", calendar);
    }

    public void setStatus(String status) {
        this.status = "Done";
    }

    public void processRequest() {
        System.out.println("Request denied. ");
    }
}

class LowPriorityConcreteCreator extends RequestCreator {
    RequestProduct createRequest() {
        LowPriorityConcrete lowPriorityConcrete = new LowPriorityConcrete();
        return lowPriorityConcrete;
    }
}