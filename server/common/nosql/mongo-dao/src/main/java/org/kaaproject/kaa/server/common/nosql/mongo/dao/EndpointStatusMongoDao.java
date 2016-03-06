package org.kaaproject.kaa.server.common.nosql.mongo.dao;

import org.kaaproject.kaa.common.dto.EndpointStatusDto;
import org.kaaproject.kaa.server.common.dao.impl.EndpointStatusDao;
import org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoEndpointStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;
import java.util.List;

import static org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoModelConstants.ENDPOINT_STATUS;
import static org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoModelConstants.ES_APPLICATION_TOKEN;
import static org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoModelConstants.ES_ENDPOINT_KEY_HASH;
import static org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoModelConstants.ES_NODE_Id;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * Created by liuhu on 3/4/16.
 */
public class EndpointStatusMongoDao extends AbstractMongoDao<MongoEndpointStatus, ByteBuffer> implements EndpointStatusDao<MongoEndpointStatus> {

    private static final Logger LOG = LoggerFactory.getLogger(EndpointStatusMongoDao.class);

    @Override
    protected String getCollectionName() {
        return ENDPOINT_STATUS;
    }

    @Override
    protected Class<MongoEndpointStatus> getDocumentClass() {
        return MongoEndpointStatus.class;
    }

    @Override
    public MongoEndpointStatus save(EndpointStatusDto dto) {
        if (null != findEndpointStatusByKeyHashAndNodeId(dto.getEndpointKeyHash(), dto.getNodeId())) {
            remove(query(where(ES_ENDPOINT_KEY_HASH).is(dto.getEndpointKeyHash()).and(ES_NODE_Id).is(dto.getNodeId())));
        }
        return save(new MongoEndpointStatus(dto));
    }

    @Override
    public List<MongoEndpointStatus> findByApplicationToken(String applicationToken) {
        LOG.debug("Find endpoint profiles by endpoint user id [{}] ", applicationToken);
        return find(query(where(ES_APPLICATION_TOKEN).is(applicationToken)));
    }

    @Override
    public MongoEndpointStatus findEndpointStatusByKeyHashAndNodeId(byte[] endpointKeyHash, String nodeId){
        return findOne(query(where(ES_ENDPOINT_KEY_HASH).is(endpointKeyHash).and(ES_NODE_Id).is(nodeId)));
    }

}
