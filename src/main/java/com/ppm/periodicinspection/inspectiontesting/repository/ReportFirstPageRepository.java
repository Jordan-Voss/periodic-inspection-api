package com.ppm.periodicinspection.inspectiontesting.repository;

import com.ppm.periodicinspection.inspectiontesting.models.ReportFirstPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportFirstPageRepository extends JpaRepository<ReportFirstPage, Long> {
    ReportFirstPage findReportFirstPageByPrNo(Long prNo);
    ReportFirstPage findReportFirstPageByReportName(String reportName);

    Boolean existsByPrNo(Long prNo);
}
