package org.example.chainRepository;

public interface LeaveHandler {
      public void setSuperVisor(LeaveHandler superVisor);

    public abstract String applyLeave(Leave leave);
}
