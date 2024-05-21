package org.example.chainRepository;

public class Manager implements LeaveHandler {
    private LeaveHandler superVisor;
    @Override
    public void setSuperVisor(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }

    @Override
    public String applyLeave(Leave leave) {
        if(leave.getRequestDay()>21) {
            if(leave.getReasonType()==ReasonType.REGULAR){
                return "Your Apply approved by Manager";
            }
            else {
                return "Your apply rejected by Manager";
            }
        }
        else {
            return "Your apply rejected by Manager";
        }
    }
}
