package com.kodilla.good.patterns.challenges;

interface IShopInterface {
    void setConnection() throws ConnectionException;
    boolean isConnected();
    void login(String username, String password) throws ConnectionException;
    void logout();
    String toString();
    boolean order(Product product);
}
