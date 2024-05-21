package org.example.chainRepository;

public class TeamLeader implements LeaveHandler {
    private LeaveHandler superVisor;
    @Override
    public void setSuperVisor(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }

    @Override
    public String applyLeave(Leave leave) {
        if(leave.getRequestDay()<=7) {
            if(leave.getReasonType()==ReasonType.REGULAR){
                return "Your Apply approved by TeamLeader";
            }
            else {
                return "Your apply rejected by TeamLeader";
            }
        }
        else {
            return superVisor.applyLeave(leave);
        }
    }
}
