package org.kaaproject.kaa.server.common.nosql.mongo.dao;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kaaproject.kaa.server.common.dao.AbstractTest;
import org.kaaproject.kaa.server.common.dao.impl.EndpointLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liuhu on 3/9/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/mongo-dao-test-context.xml")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class EndpointLogMongoTest extends AbstractTest {

    @Autowired
    private EndpointLogDao<String> endpointLogDao;
    @BeforeClass
    public static void init() throws Exception {
        MongoDBTestRunner.setUp();
    }

    @Test
    public void findLog (){
        System.out.println("findLog" + endpointLogDao.findByKeyHash("04889451674031650167","uCfuL01Emt7TFB3KrlYU95EPKv8="));
    }

}
