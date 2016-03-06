package org.kaaproject.kaa.server.common.nosql.mongo.dao;

import org.junit.*;
import org.junit.runner.RunWith;
import org.kaaproject.kaa.common.dto.EndpointStatusDto;
import org.kaaproject.kaa.server.common.dao.AbstractTest;
import org.kaaproject.kaa.server.common.dao.impl.EndpointStatusDao;
import org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoEndpointStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liuhu on 3/6/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/mongo-dao-test-context.xml")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class EndpointStatusMongoDaoTest extends AbstractTest {
    @Autowired
    private EndpointStatusDao<MongoEndpointStatus> endpointStatusDao;

    @BeforeClass
    public static void init() throws Exception {
        MongoDBTestRunner.setUp();
    }

    @Test
    public void status (){
        EndpointStatusDto dto = new EndpointStatusDto();
        dto.setStatus(1);
        dto.setNodeId("1234");
        dto.setEndpointKeyHash(new byte[] {1,2,3,4,5,6});
        MongoEndpointStatus s = endpointStatusDao.save(dto);
        Assert.assertNotNull(s);
    }
}
