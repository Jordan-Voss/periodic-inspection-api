package com.ppm.periodicinspection.inspectiontesting.service;

import com.ppm.periodicinspection.inspectiontesting.models.ReportFirstPage;
import com.ppm.periodicinspection.inspectiontesting.repository.ReportFirstPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
public class ReportFirstPageService {

        private final ReportFirstPageRepository reportFirstPageRepository;

        @Autowired
        public ReportFirstPageService(ReportFirstPageRepository reportFirstPageRepository) {
            this.reportFirstPageRepository = reportFirstPageRepository;
        }

        public List<ReportFirstPage> getReports() {
            return reportFirstPageRepository.findAll();
        }

        public void insertNewReport(ReportFirstPage reportFirstPage) {
//        Optional<Lesson> lessonOptional = lessonRepository
//                .findLessonByAvailable(lesson.getAvailable());
//        if (lessonOptional.isPresent()) {
//            throw new IllegalStateException("nope");
//        }
            reportFirstPageRepository.save(reportFirstPage);
            System.out.println(reportFirstPage);
        }

}
