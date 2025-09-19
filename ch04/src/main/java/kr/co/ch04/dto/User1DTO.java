package kr.co.ch04.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User1DTO {
    private String USER_ID;
    private String USER_NAME;
    private String BIRTH_DATE;
    private int USER_AGE;
}
