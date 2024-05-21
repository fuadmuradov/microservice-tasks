package org.example.chainRepository;

public class HR implements LeaveHandler {
    private LeaveHandler superVisor;
    @Override
    public void setSuperVisor(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }

    @Override
    public String applyLeave(Leave leave) {
        if(leave.getRequestDay()<=21) {
            if(leave.getReasonType()==ReasonType.REGULAR){
                return "Your Apply approved by HR";
            }
            else {
                return "Your apply rejected by HR";
            }
        }
        else {
            return superVisor.applyLeave(leave);
        }
    }
}
