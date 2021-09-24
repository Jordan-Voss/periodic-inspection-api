package com.ppm.periodicinspection.inspectiontesting.controller;

import com.ppm.periodicinspection.inspectiontesting.models.ReportFirstPage;
import com.ppm.periodicinspection.inspectiontesting.service.ReportFirstPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/report/1")
public class ReportFirstPageController {


    private final ReportFirstPageService reportFirstPageService;

    @Autowired
    public ReportFirstPageController(ReportFirstPageService reportFirstPageService) {
        this.reportFirstPageService = reportFirstPageService;
    }

    @GetMapping()
    public List<ReportFirstPage> getAvailableLessons(){
        return reportFirstPageService.getReports();
    };

    @PostMapping("/insert")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public void insertNewAvailableBooking(@RequestBody ReportFirstPage reportFirstPages) {
            reportFirstPageService.insertNewReport(reportFirstPages);

    }


}
