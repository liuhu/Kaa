package org.kaaproject.kaa.common.dto;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by liuhu on 3/4/16.
 */
public class EndpointStatusDto implements HasId, Serializable {

    private static final long serialVersionUID = 993250361430325513L;

    private String id;

    private byte[] endpointKeyHash;

    private String applicationToken;

    private String tenantId;

    private String nodeId;

    private int status;

    @Override
    public String getId() {
        return id;
    }

    @Override
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EndpointStatusDto that = (EndpointStatusDto) o;

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
        return "EndpointStatusDto{" +
                "id='" + id + '\'' +
                ", endpointKeyHash=" + Arrays.toString(endpointKeyHash) +
                ", applicationToken='" + applicationToken + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", nodeId='" + nodeId + '\'' +
                ", status=" + status +
                '}';
    }
}
