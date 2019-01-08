package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.invoice.Rachunek;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private RachunekDao rachunekDao;
    @Autowired
    private ItemDao itemDao;

    private static final String NAME = "Shoes";

    @Test
    public void testProductDaoSave() {
        //Given
        Product product = new Product(NAME);

        //when
        productDao.save(product);

        //Then
        int id = product.getId();
        Product readProduct = productDao.findOne(id);
        Assert.assertEquals(id, readProduct.getId());

        //CleanUp
        productDao.delete(id);
    }

    @Test
    public void testItemDaoSaveWithProducts() {
        //Given
        Product product1 = new Product("Trainers");
        Product product2 = new Product("Flipflops");

        Item item1 = new Item(new BigDecimal(1233321), 20, new BigDecimal(431231));
        Item item2 = new Item(new BigDecimal(123321), 21, new BigDecimal(4331231));

        Rachunek rachunek = new Rachunek("ABC123");

        product1.getItems().add(item1);
        product2.getItems().add(item2);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item1.setRachunek(rachunek);
        item2.setRachunek(rachunek);

        //When
        rachunekDao.save(rachunek);
        int rachunekId = rachunek.getId();
        productDao.save(product1);
        int productId1 = product1.getId();
        productDao.save(product2);
        int productId2 = product2.getId();

        //Then
        Assert.assertNotEquals(0, rachunekId);
        Assert.assertNotEquals(0, productId1);
        Assert.assertNotEquals(0, productId2);

        //CleanUp
        itemDao.deleteAll();
        productDao.deleteAll();
        rachunekDao.deleteAll();
    }
}
