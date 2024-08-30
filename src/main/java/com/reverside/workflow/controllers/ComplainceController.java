package com.reverside.workflow.controllers;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reverside.workflow.models.Profile;
import com.reverside.workflow.models.ProfileRequest;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class ComplainceController {
    @GetMapping("/checkStatus")
    public Profile assess(@RequestBody ProfileRequest request) {
        Profile profile = new Profile();
        profile.setInternationalComplianceDate(LocalDate.now());
        profile.setLocalComplianceDate(LocalDate.now());
        profile.setProfileId(request.getProfileId());
        profile.setUsername(request.getUsername());

        profile.setLocalCompliace(setRandomState());
        profile.setInternationalCompliance(setRandomState());

        System.out.println(profile);
        return profile;
    }

    public static boolean setRandomState() {
        boolean compState = false;
        int state = new Random().nextInt(2);

        if (state == 0) compState = true;
        if (state == 1) compState = false;

        return compState;
    }
}
