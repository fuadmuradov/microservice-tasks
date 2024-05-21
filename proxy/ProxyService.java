package org.example.proxy;

public class ProxyService {
    public static void main(String[] args) {
        ProxyCommandExecutor commandExecutor = new ProxyCommandExecutor("fuadm", "f@12345");

        try {
            commandExecutor.runCommand("notepad.exe");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
