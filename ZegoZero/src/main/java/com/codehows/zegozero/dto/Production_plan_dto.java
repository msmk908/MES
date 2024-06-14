package com.codehows.zegozero.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Production_plan_dto {
    private Integer plan_id;
    private Integer equipment_id;
    private Date estimated_start_date;
    private Date estimated_end_date;
    private Date start_date;
    private Date end_date;
}
