package com.kodilla.good.patterns.challenges;

interface ClientInterface {
    void connect(String url, int port) throws ConnectionException;
    void login(String username, String password) throws ConnectionException;
    boolean isLogin();
    void logout();
    void disconnect();
}
