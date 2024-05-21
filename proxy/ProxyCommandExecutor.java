package org.example.proxy;

public class ProxyCommandExecutor implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutorImpl commandExecutor;

    public ProxyCommandExecutor(String userName, String password) {
        if ("fuadm".equals(userName) && "f@12345".equals(password)) this.isAdmin = true;
        commandExecutor = new CommandExecutorImpl();

    }
    @Override
    public void runCommand(String cmdCommand) throws Exception {
        if (isAdmin) {
            commandExecutor.runCommand(cmdCommand);
        } else {
            if (cmdCommand.trim().startsWith("rm"))
                System.out.println("'" + cmdCommand + "': " + "user can not be execute the command");
            else{
                commandExecutor.runCommand(cmdCommand);
            }
        }

    }
}
