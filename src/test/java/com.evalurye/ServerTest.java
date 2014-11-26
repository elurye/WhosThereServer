package com.evalurye;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ServerTest {

    private Server server;
    private ArrayList<String> args;

    @Before
    public void setUp() throws Exception {
        server = new Server();
        args = new ArrayList<String> ();
        args.add("-test");
    }

    @Test
    public void defaultTestDirectoryToInitializeServer() {
        String[] mainArgs = new String[args.size()];
        server.main(args.toArray(mainArgs));

        assertEquals(ServerVars.TEST_SERVER.PUBLIC_DIR, server.publicDir);
        assertEquals(ServerVars.TEST_SERVER.portNumber, server.port);
    }

    @Test
    public void givenDirectoryAsArgumentToInitializeServer() {
        String testDir = "/test";
        args.add("-d");
        args.add(testDir);

        String[] mainArgs = new String[args.size()];
        server.main(args.toArray(mainArgs));

        assertEquals(testDir, server.publicDir);
        assertEquals(ServerVars.TEST_SERVER.portNumber, server.port);
    }

    @Test
    public void givenPortAsArgumentToInitializeServer() {
        String testPort = "8000";
        args.add("-p");
        args.add(testPort);

        String[] mainArgs = new String[args.size()];
        server.main(args.toArray(mainArgs));

        assertEquals(ServerVars.TEST_SERVER.PUBLIC_DIR, server.publicDir);
        assertEquals(testPort, server.port);
    }

}