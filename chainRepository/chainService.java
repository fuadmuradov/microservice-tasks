package org.example.chainRepository;

public class chainService {
    public static void main(String[] args) {
        var teamLeader = new TeamLeader();
        var projectLeader = new ProjectLeader();
        var hr = new HR();
        var manager = new Manager();

        teamLeader.setSuperVisor(projectLeader);
        projectLeader.setSuperVisor(hr);
        hr.setSuperVisor(manager);

        Leave leave = new Leave(15, ReasonType.REGULAR);
        System.out.println(teamLeader.applyLeave(leave));
    }
}
