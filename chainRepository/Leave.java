package org.example.chainRepository;

public class Leave {
    private int requestDay;
    private ReasonType reasonType;

    public Leave(int requestDay, ReasonType reasonType) {
        this.requestDay = requestDay;
        this.reasonType = reasonType;
    }

    public int getRequestDay() {
        return this.requestDay;
    }

    public ReasonType getReasonType(){
        return this.reasonType;
    }
}
