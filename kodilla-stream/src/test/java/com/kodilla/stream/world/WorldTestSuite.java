package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        BigDecimal qtypl =   new BigDecimal(38546218);
        Country pl = new Country("pl", "Poland", qtypl);
        BigDecimal qtyuk =   new BigDecimal(68546218);
        Country uk = new Country("uk", "United Kingdom", qtyuk);
        BigDecimal qtyde =   new BigDecimal(78546218);
        Country de = new Country("de", "Germany", qtyde);
        Continent Europe = new Continent("Europe");


        BigDecimal qtyus =   new BigDecimal(258546218);
        Country us = new Country("us", "USA", qtyus);
        BigDecimal qtyca =   new BigDecimal(48546218);
        Country ca = new Country("ca", "Canada", qtyca);
        BigDecimal qtyme =   new BigDecimal(78546218);
        Country me = new Country("me", "Mexico", qtyme);

        Continent NAm = new Continent("North America");

        World Earth = new World("Earth");
        Earth.addItem(Europe);
        Earth.addItem(NAm);

        //When
        Europe.addItem(pl);
        Europe.addItem(uk);
        Europe.addItem(de);
        NAm.addItem(us);
        NAm.addItem(ca);
        NAm.addItem(me);

        BigDecimal total = new BigDecimal(0);
        total = total.add(qtypl);
        total = total.add(qtyuk);
        total = total.add(qtyde);
        total = total.add(qtyus);
        total = total.add(qtyca);
        total = total.add(qtyme);
        Assert.assertEquals(Earth.getPeopleQuantity(), total);


    }
}
