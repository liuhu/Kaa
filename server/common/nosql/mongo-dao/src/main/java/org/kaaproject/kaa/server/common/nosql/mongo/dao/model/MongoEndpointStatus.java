package org.kaaproject.kaa.server.common.nosql.mongo.dao.model;

import org.kaaproject.kaa.common.dto.EndpointStatusDto;
import org.kaaproject.kaa.server.common.dao.model.EndpointStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Arrays;

import static org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoModelConstants.ENDPOINT_STATUS;
import static org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoModelConstants.ES_ENDPOINT_KEY_HASH;
import static org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoModelConstants.ES_APPLICATION_TOKEN;
import static org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoModelConstants.ES_TENANT_Id;
import static org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoModelConstants.ES_NODE_Id;
import static org.kaaproject.kaa.server.common.nosql.mongo.dao.model.MongoModelConstants.ES_STATUS;

/**
 * Created by liuhu on 3/4/16.
 */
@Document(collection = ENDPOINT_STATUS)
public class MongoEndpointStatus implements EndpointStatus, Serializable {
    private static final long serialVersionUID = -2665038351026211323L;

    @Id
    private String id;
    @Field(ES_ENDPOINT_KEY_HASH)
    private byte[] endpointKeyHash;
    @Field(ES_APPLICATION_TOKEN)
    @Indexed
    private String applicationToken;
    @Field(ES_TENANT_Id)
    private String tenantId;
    @Field(ES_NODE_Id)
    private String nodeId;
    @Field(ES_STATUS)
    private int status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getEndpointKeyHash() {
        return endpointKeyHash;
    }

    public void setEndpointKeyHash(byte[] endpointKeyHash) {
        this.endpointKeyHash = endpointKeyHash;
    }

    public String getApplicationToken() {
        return applicationToken;
    }

    public void setApplicationToken(String applicationToken) {
        this.applicationToken = applicationToken;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public EndpointStatusDto toDto() {
        EndpointStatusDto dto = new EndpointStatusDto();
        dto.setId(id);
        dto.setEndpointKeyHash(endpointKeyHash);
        dto.setApplicationToken(applicationToken);
        dto.setTenantId(tenantId);
        dto.setNodeId(nodeId);
        dto.setStatus(status);
        return dto;
    }

    public MongoEndpointStatus() {

    }

    public MongoEndpointStatus(EndpointStatusDto dto) {
        this(dto, null);
    }

    public MongoEndpointStatus(EndpointStatusDto dto, Long version) {
        this.id = dto.getId();
        this.endpointKeyHash = dto.getEndpointKeyHash();
        this.applicationToken = dto.getApplicationToken();
        this.tenantId = dto.getTenantId();
        this.nodeId = dto.getNodeId();
        this.status = dto.getStatus();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MongoEndpointStatus that = (MongoEndpointStatus) o;

        if (status != that.status) return false;
        if (!Arrays.equals(endpointKeyHash, that.endpointKeyHash)) return false;
        if (applicationToken != null ? !applicationToken.equals(that.applicationToken) : that.applicationToken != null)
            return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        return nodeId != null ? nodeId.equals(that.nodeId) : that.nodeId == null;

    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(endpointKeyHash);
        result = 31 * result + (applicationToken != null ? applicationToken.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (nodeId != null ? nodeId.hashCode() : 0);
        result = 31 * result + status;
        return result;
    }

    @Override
    public String toString() {
        return "MongoEndpointStatus{" +
                "id='" + id + '\'' +
                ", endpointKeyHash=" + Arrays.toString(endpointKeyHash) +
                ", applicationToken='" + applicationToken + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", nodeId='" + nodeId + '\'' +
                ", status=" + status +
                '}';
    }
}
