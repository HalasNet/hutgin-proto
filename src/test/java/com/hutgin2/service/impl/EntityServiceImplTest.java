package com.hutgin2.service.impl;

import com.hutgin2.core.service.MetaModel;
import com.hutgin2.service.EntityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:conf/spring/application.xml")
public class EntityServiceImplTest {

    @Autowired
    private MetaModel metaModel;

    @Autowired
    private EntityService entityService;

    @Test
    public void testGetAll() throws Exception {
        List t = entityService.getAll(metaModel.getModel().getTables().get(0));
        Assert.isTrue(t != null);

    }
}
