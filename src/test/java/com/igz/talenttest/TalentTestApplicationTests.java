package com.igz.talenttest;

import com.igz.talenttest.rest.WelcomeController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TalentTestApplicationTests {
    @Autowired
    private WelcomeController welcomeController;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(welcomeController);
    }

}
