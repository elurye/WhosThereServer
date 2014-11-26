package com.evalurye;

/**
 * Created by evelina.lurye on 11/25/14.
 */
public enum ServerVars {

    DEFAULT_SERVER ("/var/www/htdocs", "5000"),
    TEST_SERVER    ("/var/www/test", "5050");

    public String PUBLIC_DIR;
    public String portNumber;

    ServerVars(String publicDir, String portNumber) {
        this.PUBLIC_DIR = publicDir;
        this.portNumber = portNumber;
    }



}
