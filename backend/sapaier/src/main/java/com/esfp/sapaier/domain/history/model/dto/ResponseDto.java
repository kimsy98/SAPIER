package com.esfp.sapaier.domain.history.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDto { //Response 정보를 저장해놓는 Dto
    private String status; //상태코드
    private int responseTime; //응답시간
    private HashMap<String, String> header;
    private String body;
}
