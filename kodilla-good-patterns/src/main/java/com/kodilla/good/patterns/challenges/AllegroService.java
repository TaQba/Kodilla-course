package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class AllegroService implements IShopInterface {
    static final String URL  = "http://allegro.com/search";
    static final int PORT  = 443;
    private ClientInterface client =  new httpClient();
    private String username;
    @Override
    public void setConnection() throws ConnectionException {
        client.connect(URL,PORT);
    }

    @Override
    public boolean isConnected() {
        return client.isLogin();
    }

    @Override
    public void login(String username, String password) throws ConnectionException {
        client.login(username,password);
        this.username = username;
    }

    @Override
    public void logout() {
        client.logout();
    }

    @Override
    public boolean order(Product product) {
        if(client.isLogin()) {
            if (this.search(product.toString())) {
                System.out.println("Product: " + product.toString() + " found on Allegro Stock." );
                return true;
            } else {
                System.out.println("Product: " + product.toString() + " not found on Allegro Stock." );
                return false;
            }
        }
        System.out.println("User is not logged in" );
        return false;
    }

    @Override
    public String toString() {
        return "AllegroService{" +
                "username=" + username +
                '}';
    }

    private boolean search(String productName) {
        ArrayList<String> products = new ArrayList<String>();
        products.add("Medal of Honor");
        products.add("Kapcie");

        return products.contains(productName);
    }
}
