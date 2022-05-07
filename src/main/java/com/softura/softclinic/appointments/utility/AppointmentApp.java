package com.softura.softclinic.appointments.utility;

import com.softura.softclinic.appointments.models.Appointment;
import lombok.extern.slf4j.Slf4j;


import java.time.LocalDate;
import java.util.Scanner;

public class AppointmentApp {

    public static  void main(String[] args){

        Appointment appointment=new Appointment();
        Scanner scanner=new Scanner(System.in);
        //read the values
        System.out.println("Enter Patient Mobile No");
        appointment.setPatientMobileNo(scanner.nextLong());
        scanner.nextLine();
        System.out.println("Enter Date of appointment yyyy-mm-dd");
         appointment.setDoa(scanner.nextLine());
        System.out.println("Enter Time of appointment HH:MM");
        appointment.setTime(scanner.nextLine());
        System.out.println("Enter Doctor Name");
        appointment.setDoctorName(scanner.nextLine());

        //view the details
       System.out.println(appointment);
    }
}
