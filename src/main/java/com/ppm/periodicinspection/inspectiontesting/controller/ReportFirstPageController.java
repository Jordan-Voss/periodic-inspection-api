package com.ppm.periodicinspection.inspectiontesting.controller;

import com.ppm.periodicinspection.inspectiontesting.models.ReportFirstPage;
import com.ppm.periodicinspection.inspectiontesting.payload.response.MessageResponse;
import com.ppm.periodicinspection.inspectiontesting.repository.ReportFirstPageRepository;
import com.ppm.periodicinspection.inspectiontesting.service.ReportFirstPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/report")
public class ReportFirstPageController {

    @Autowired
    ReportFirstPageRepository reportFirstPageRepository;


    private final ReportFirstPageService reportFirstPageService;

    @Autowired
    public ReportFirstPageController(ReportFirstPageService reportFirstPageService) {
        this.reportFirstPageService = reportFirstPageService;
    }

    @GetMapping()
    public List<ReportFirstPage> getAllReports(){
        return reportFirstPageService.getReports();
    };

    @PostMapping("/insert")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<?> insertNewAvailableBooking(@RequestBody ReportFirstPage reportFirstPages) {
        if (reportFirstPageRepository.existsByPrNo(reportFirstPages.getPrNo())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Username is already taken"));
        } else {
            reportFirstPageService.insertNewReport(reportFirstPages);
            return ResponseEntity.accepted().body(new MessageResponse("Inserted Successfully"));
        }
    }

    @PostMapping("/update")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<?> insertUpdatedReport(@RequestBody ReportFirstPage reportFirstPages) {
            reportFirstPageService.insertEditedReport(reportFirstPages);
            return ResponseEntity.accepted().body(new MessageResponse("Updated Successfully"));
        }
    }
