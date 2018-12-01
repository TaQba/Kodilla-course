package com.kodilla.good.patterns.challenges;

public class httpClient implements ClientInterface {
    private boolean isLoginStatus = false;
    private boolean connection = false;

    @Override
    public void connect(String url, int port) throws ConnectionException {
        if (!Validation.url(url)) {
            throw new ConnectionException();
        }
        int[] allowedPorts = new int[] {80,8080,443};
        if (!Validation.port(port, allowedPorts)) {
            throw new ConnectionException();
        }
        connection = true;
    }

    @Override
    public void login(String username, String password) throws ConnectionException {
        if(!connection) {
            throw new ConnectionException();
        }

        if (!Validation.username(username)) {
            throw new ConnectionException();
        }


        if (!Validation.password(password)) {
            throw new ConnectionException();
        }
        isLoginStatus = true;
    }

    @Override
    public boolean isLogin() {
        return isLoginStatus;
    }

    @Override
    public void disconnect() {
        connection = false;
    }

    @Override
    public void logout() {
        isLoginStatus = false;
        disconnect();
    }
}
