package com.company;


import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

    }
}


class CommandClass {
    void execute(){}
    void doSomthing(){}
}

class Configuration {
    final int MAX_ADMIN_COUNT=1;
    final int MAX_GUEST_COUNT=6;

}

class Log {
    void writeToLog(){}
}

class User {
    String username;
    Map<User, ClientConnection> userMap;
    ArrayList<String> roles;
    void putToRoleList(String role){

    }
    void showRoles(){}
}
class Command {

}

class CommandManager {
    Map<String, Map<String,Command>> commandsMaps;
    Map<String,Command> commandList;

    CommandManager getInstance(){
        return new CommandManager(); //Внимание!!!  Заглушка
    }
    void processCommand(String role){}
    void putToMap(){}
    String getCommandForRole(String role){
        return "1"; //Заглушка
    }
}

class ClientManager {
    Map<Thread,Socket> clientMap;
    Map<Integer,User> sessionMap;
    List<ClientConnection> guestList;
    List<ClientConnection> adminList;

    void getAllClients(){

    }
}

class ClientConnection {
    int session_ID;
    Inet4Address client_IP;
    Socket clientSocket;
    Thread myThread;
    public void run(){}
}

class Acceptor {
    Socket clientSocket;
    ServerSocket serverSocket;
    Thread serverThread;
    int connections;
    void startMainThread(){}
}