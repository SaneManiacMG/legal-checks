package com.reverside.workflow.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Profile {
    private String profileId;
    private String username;
    private boolean localCompliace;
    private boolean internationalCompliance;
    private LocalDate localComplianceDate;
    private LocalDate internationalComplianceDate;
}
