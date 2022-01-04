package com.smartbatchjobui.smartbatchjobui.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "batch_job")
@EntityListeners(AuditingEntityListener.class)
public class CreateBatchJobEntity extends AudiTable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Batch_job_id")
    private Long batchJobId ;
    @Column(name = "Batch_Job_Name")
    private String batchJobName;
    @Column(name = "Batch_Job_Description")
    private String batchJobDescription ;
    @Column(name = "Batch_Job_Type")
    private String batchJobType ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateBatchJobEntity that = (CreateBatchJobEntity) o;
        return Objects.equals(batchJobId, that.batchJobId) && Objects.equals(batchJobName, that.batchJobName) &&
                Objects.equals(batchJobDescription, that.batchJobDescription) && Objects.equals(batchJobType, that.batchJobType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchJobId, batchJobName, batchJobDescription, batchJobType);
    }

    @Override
    public String toString() {
        return "CreateBatchJobEntity{" +
                "batchJobId=" + batchJobId +
                ", batchJobName='" + batchJobName + '\'' +
                ", batchJobDescription='" + batchJobDescription + '\'' +
                ", batchJobType='" + batchJobType + '\'' +
                '}';
    }
    public Long getBatchJobId() {
        return batchJobId;
    }

    public void setBatchJobId(Long batchJobId) {
        this.batchJobId = batchJobId;
    }
    
    public String getBatchJobName() {
        return batchJobName;
    }

    public void setBatchJobName(String batchJobName) {
        this.batchJobName = batchJobName;
    }

    public String getBatchJobDescription() {
        return batchJobDescription;
    }

    public void setBatchJobDescription(String batchJobDescription) {
        this.batchJobDescription = batchJobDescription;
    }

    public String getBatchJobType() {
        return batchJobType;
    }

    public void setBatchJobType(String batchJobType) {
        this.batchJobType = batchJobType;
    }
}