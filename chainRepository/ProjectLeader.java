package org.example.chainRepository;

public class ProjectLeader implements LeaveHandler {
    private LeaveHandler superVisor;
    @Override
    public void setSuperVisor(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }

    @Override
    public String applyLeave(Leave leave) {
        if(leave.getRequestDay()<=14) {
            if(leave.getReasonType()==ReasonType.REGULAR){
                return "Your Apply approved by ProjectLeader";
            }
            else {
                return "Your apply rejected by ProjectLeader";
            }
        }
        else {
            return this.superVisor.applyLeave(leave);
        }

    }
}
