package org.example.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(String cmdCommand) throws IOException {
        Runtime.getRuntime().exec(cmdCommand);
        System.out.println("'" + cmdCommand + "'" + "command executed");
    }
}
