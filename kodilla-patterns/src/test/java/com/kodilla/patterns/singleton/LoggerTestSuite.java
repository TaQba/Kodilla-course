package com.kodilla.patterns.singleton;

import org.junit.*;

public class LoggerTestSuite {
    Logger logger = null;
    @Before
    public void before(){
        this.logger = Logger.getInstance();
    }

    @After
    public void after() {
        this.logger = null;
    }

    @Test
    public void shouldAddEntry() {
        //Given
        //When
        this.logger.log("FooBar");
        //Then
        Assert.assertEquals("FooBar", this.logger.getLastLog());
    }

    @Test
    public void shouldReturnSameEntry() {
        //Given
        //When
        this.logger.log("FooBar");
        Logger newLogger  = Logger.getInstance();
        //Then
        Assert.assertEquals("FooBar", newLogger.getLastLog());
    }

}
