package org.example.domain;

import org.junit.Ignore;
import org.junit.Test;
import za.ac.cput.onlinestore.Category;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class CategoriesTest {

    @Test
    public void objectEquality() {
        Category cat = new Category("3242df", "Laptops", "Gadgets and Devices");
        assertEquals("Laptops", cat.getCategoryName());
    }

    @Test
    public void objectIdentity() {
        Category cat = new Category("3242df", "Laptops", "Gadgets and Devices");
        Category cat1 = cat;
        assertSame(cat, cat1);
    }

    @Test
    public void failingTest() {
        Category category = new Category();
        category.setCategoryName("Sbonga");

        assertEquals("Brian", category.getCategoryName());
    }

    @Test(timeout = 1000)
    public void timeOutTest() {
        ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(new Category("3242df", "Laptops", "Gadgets and Devices"));
        categories.add(new Category("3823jj", "Pants", "Women's Clothing"));
        categories.add(new Category("5334kh", "Televisions", "New Arrivals"));
        categories.add(new Category("97j342", "Winter Jackets", "Men's Clothing"));
        categories.add(new Category("1134ik", "Women's Shoes", "Sale"));

        for (Category category : categories) {
            System.out.println(category.getCategoryName());
        }
    }

    @Ignore
    @Test
    public void categoryNameTest() {
        Category category = new Category();
        category.setCategoryName("Sbonga");

        assertNull(category.getCategoryName());
    }

}