package com.evalurye;

import java.util.Arrays;

public class Server {

    public static String port;
    public static String publicDir;
    private static boolean isTestServer;

    public static void main(String[] args)
    {
        isTestServer = Arrays.asList(args).contains("-test");

        if (Arrays.asList(args).contains("-d"))
            publicDir = getPublicDir(args);
        else
            setDefaultPublicDir();

        if (Arrays.asList(args).contains("-p"))
            port = getPortNumber(args);
        else
            setDefaultPortNumber();
    }


    public static String getPublicDir(String[] args) {
        return args[Arrays.asList(args).indexOf("-d") + 1];
    }

    public static String getPortNumber(String[] args) {
        return args[Arrays.asList(args).indexOf("-p") + 1];
    }

    public static void setDefaultPublicDir() {
        if (isTestServer)
             publicDir = ServerVars.TEST_SERVER.PUBLIC_DIR;
        else
            publicDir = ServerVars.DEFAULT_SERVER.PUBLIC_DIR;
    }

    public static void setDefaultPortNumber() {
        if (isTestServer)
            port = ServerVars.TEST_SERVER.portNumber;
        else
            port = ServerVars.DEFAULT_SERVER.portNumber;
    }
}
