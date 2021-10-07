package com.ppm.periodicinspection.inspectiontesting.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class ReportFirstPage {
        @Id
        @SequenceGenerator(name = "report_sequence", sequenceName = "report_sequence", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "report_sequence")
        private Long id;
        private String reportName;
        @Temporal(TemporalType.DATE)
        private Date date;
        private Long prNo;
        private String contractorName;
        private String contractorAddress;
        private String contractorRegNo;
        private String installationAge;
        private String occupantName;
        private String occupantAddress;
        private Boolean occupantInAttendance;
        private String installationCategory;
        private String inspectionReason;
        private boolean installationExtendCoveredByReport;
        private String partialInspectionComment;
        private String earthingType;
        private String installationVoltage;
        private Long l1;
        private Long l2;
        private Long l3;
        private Long l1L2;
        private Long l2L3;
        private Long l3L1;
        private int maxProspectiveCurrent;
        private String deviceType;
        private String normalRating;
        private String ratedCurrent;
        private String trippingCurrent;

        public ReportFirstPage() {
        }

        public ReportFirstPage(Long id, String reportName, Date date, Long prNo, String contractorName, String contractorAddress, String contractorRegNo, String installationAge, String occupantName, String occupantAddress, Boolean occupantInAttendance, String installationCategory, String inspectionReason, boolean installationExtendCoveredByReport, String partialInspectionComment, String earthingType, String installationVoltage, Long l1, Long l2, Long l3, Long l1L2, Long l2L3, Long l3L1, int maxProspectiveCurrent, String deviceType, String normalRating, String ratedCurrent, String trippingCurrent) {
                this.id = id;
                this.reportName = reportName;
                this.date = date;
                this.prNo = prNo;
                this.contractorName = contractorName;
                this.contractorAddress = contractorAddress;
                this.contractorRegNo = contractorRegNo;
                this.installationAge = installationAge;
                this.occupantName = occupantName;
                this.occupantAddress = occupantAddress;
                this.occupantInAttendance = occupantInAttendance;
                this.installationCategory = installationCategory;
                this.inspectionReason = inspectionReason;
                this.installationExtendCoveredByReport = installationExtendCoveredByReport;
                this.partialInspectionComment = partialInspectionComment;
                this.earthingType = earthingType;
                this.installationVoltage = installationVoltage;
                this.l1 = l1;
                this.l2 = l2;
                this.l3 = l3;
                this.l1L2 = l1L2;
                this.l2L3 = l2L3;
                this.l3L1 = l3L1;
                this.maxProspectiveCurrent = maxProspectiveCurrent;
                this.deviceType = deviceType;
                this.normalRating = normalRating;
                this.ratedCurrent = ratedCurrent;
                this.trippingCurrent = trippingCurrent;
        }

        public ReportFirstPage(Date date, String reportName, Long prNo, String contractorName, String contractorAddress, String contractorRegNo, String installationAge, String occupantName, String occupantAddress, Boolean occupantInAttendance, String installationCategory, String inspectionReason, boolean installationExtendCoveredByReport, String partialInspectionComment, String earthingType, String installationVoltage, Long l1, Long l2, Long l3, Long l1L2, Long l2L3, Long l3L1, int maxProspectiveCurrent, String deviceType, String normalRating, String ratedCurrent, String trippingCurrent) {
                this.date = date;
                this.reportName = reportName;
                this.prNo = prNo;
                this.contractorName = contractorName;
                this.contractorAddress = contractorAddress;
                this.contractorRegNo = contractorRegNo;
                this.installationAge = installationAge;
                this.occupantName = occupantName;
                this.occupantAddress = occupantAddress;
                this.occupantInAttendance = occupantInAttendance;
                this.installationCategory = installationCategory;
                this.inspectionReason = inspectionReason;
                this.installationExtendCoveredByReport = installationExtendCoveredByReport;
                this.partialInspectionComment = partialInspectionComment;
                this.earthingType = earthingType;
                this.installationVoltage = installationVoltage;
                this.l1 = l1;
                this.l2 = l2;
                this.l3 = l3;
                this.l1L2 = l1L2;
                this.l2L3 = l2L3;
                this.l3L1 = l3L1;
                this.maxProspectiveCurrent = maxProspectiveCurrent;
                this.deviceType = deviceType;
                this.normalRating = normalRating;
                this.ratedCurrent = ratedCurrent;
                this.trippingCurrent = trippingCurrent;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getReportName() {
                return reportName;
        }

        public void setReportName(String reportName) {
                this.reportName = reportName;
        }

        public Date getDate() {
                return date;
        }

        public void setDate(Date date) {
                this.date = date;
        }

        public Long getPrNo() {
                return prNo;
        }

        public void setPrNo(Long prNo) {
                this.prNo = prNo;
        }

        public String getContractorName() {
                return contractorName;
        }

        public void setContractorName(String contractorName) {
                this.contractorName = contractorName;
        }

        public String getContractorAddress() {
                return contractorAddress;
        }

        public void setContractorAddress(String contractorAddress) {
                this.contractorAddress = contractorAddress;
        }

        public String getContractorRegNo() {
                return contractorRegNo;
        }

        public void setContractorRegNo(String contractorRegNo) {
                this.contractorRegNo = contractorRegNo;
        }

        public String getInstallationAge() {
                return installationAge;
        }

        public void setInstallationAge(String installationAge) {
                this.installationAge = installationAge;
        }

        public String getOccupantName() {
                return occupantName;
        }

        public void setOccupantName(String occupantName) {
                this.occupantName = occupantName;
        }

        public String getOccupantAddress() {
                return occupantAddress;
        }

        public void setOccupantAddress(String occupantAddress) {
                this.occupantAddress = occupantAddress;
        }

        public Boolean getOccupantInAttendance() {
                return occupantInAttendance;
        }

        public void setOccupantInAttendance(Boolean occupantInAttendance) {
                this.occupantInAttendance = occupantInAttendance;
        }

        public String getInstallationCategory() {
                return installationCategory;
        }

        public void setInstallationCategory(String installationCategory) {
                this.installationCategory = installationCategory;
        }

        public String getInspectionReason() {
                return inspectionReason;
        }

        public void setInspectionReason(String inspectionReason) {
                this.inspectionReason = inspectionReason;
        }

        public boolean isInstallationExtendCoveredByReport() {
                return installationExtendCoveredByReport;
        }

        public void setInstallationExtendCoveredByReport(boolean installationExtendCoveredByReport) {
                this.installationExtendCoveredByReport = installationExtendCoveredByReport;
        }

        public String getPartialInspectionComment() {
                return partialInspectionComment;
        }

        public void setPartialInspectionComment(String partialInspectionComment) {
                this.partialInspectionComment = partialInspectionComment;
        }

        public String getEarthingType() {
                return earthingType;
        }

        public void setEarthingType(String earthingType) {
                this.earthingType = earthingType;
        }

        public String getInstallationVoltage() {
                return installationVoltage;
        }

        public void setInstallationVoltage(String installationVoltage) {
                this.installationVoltage = installationVoltage;
        }

        public Long getL1() {
                return l1;
        }

        public void setL1(Long l1) {
                this.l1 = l1;
        }

        public Long getL2() {
                return l2;
        }

        public void setL2(Long l2) {
                this.l2 = l2;
        }

        public Long getL3() {
                return l3;
        }

        public void setL3(Long l3) {
                this.l3 = l3;
        }

        public Long getL1L2() {
                return l1L2;
        }

        public void setL1L2(Long l1L2) {
                this.l1L2 = l1L2;
        }

        public Long getL2L3() {
                return l2L3;
        }

        public void setL2L3(Long l2L3) {
                this.l2L3 = l2L3;
        }

        public Long getL3L1() {
                return l3L1;
        }

        public void setL3L1(Long l3L1) {
                this.l3L1 = l3L1;
        }

        public int getMaxProspectiveCurrent() {
                return maxProspectiveCurrent;
        }

        public void setMaxProspectiveCurrent(int maxProspectiveCurrent) {
                this.maxProspectiveCurrent = maxProspectiveCurrent;
        }

        public String getDeviceType() {
                return deviceType;
        }

        public void setDeviceType(String deviceType) {
                this.deviceType = deviceType;
        }

        public String getNormalRating() {
                return normalRating;
        }

        public void setNormalRating(String normalRating) {
                this.normalRating = normalRating;
        }

        public String getRatedCurrent() {
                return ratedCurrent;
        }

        public void setRatedCurrent(String ratedCurrent) {
                this.ratedCurrent = ratedCurrent;
        }

        public String getTrippingCurrent() {
                return trippingCurrent;
        }

        public void setTrippingCurrent(String trippingCurrent) {
                this.trippingCurrent = trippingCurrent;
        }
}
