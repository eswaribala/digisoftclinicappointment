package com.softura.softclinic.appointments.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Appointment {

    private long patientMobileNo;
    private String doa;
    private String time;
    private String doctorName;


}
