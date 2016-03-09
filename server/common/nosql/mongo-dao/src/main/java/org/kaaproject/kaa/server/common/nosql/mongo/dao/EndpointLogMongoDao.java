package org.kaaproject.kaa.server.common.nosql.mongo.dao;

import org.kaaproject.kaa.server.common.dao.impl.EndpointLogDao;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by liuhu on 3/9/16.
 */
@Repository
public class EndpointLogMongoDao extends AbstractMongoDao<String, ByteBuffer> implements EndpointLogDao<String> {

    private ThreadLocal<String> applicationToken = new ThreadLocal<>();
    public static final String ENDPOINT_LOGS = "logs_";

    @Override
    public List<String> findByKeyHash(String applicationToken, String endpointKeyHash) {
        this.applicationToken.set(applicationToken);
        Query query = new Query();
        Criteria criteria = new Criteria();
        criteria.and("header.endpointKeyHash.string").is(endpointKeyHash);
        query.addCriteria(criteria);
        query.fields().include("event");
        return mongoTemplate.find(query, getDocumentClass(), getCollectionName());

    }

    @Override
    protected String getCollectionName() {
        return ENDPOINT_LOGS + applicationToken.get();
    }

    @Override
    protected Class<String> getDocumentClass() {
        return String.class;
    }
}
