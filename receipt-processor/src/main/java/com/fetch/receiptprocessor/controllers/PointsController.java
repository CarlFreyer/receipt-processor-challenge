package com.fetch.receiptprocessor.controllers;

import com.fetch.receiptprocessor.models.GetPointsDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PointsController {

    @GetMapping("/receipts/{id}/points")
    public GetPointsDTO getPoints(@PathVariable Long id) {

        return new GetPointsDTO(1);
    }

    @PostMapping("/receipts/{id}/points")
    public GetPointsDTO getPoints(@PathVariable Long id) {

        return new GetPointsDTO(1);
    }
}
