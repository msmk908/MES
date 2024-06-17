package com.codehows.zegozero.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Production_performance_Dto {

    // 생산실적 dto
    private int order_id;
    private int input;
    private int output;

}
