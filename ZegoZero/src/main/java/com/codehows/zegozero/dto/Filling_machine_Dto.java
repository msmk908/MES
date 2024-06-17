package com.codehows.zegozero.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Filling_machine_Dto {

    // 충진기 dto
    private String equipment_name;
    private int input;
    private int output;

}
