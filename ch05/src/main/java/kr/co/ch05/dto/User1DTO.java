package kr.co.ch05.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User1DTO {
    private String user_id;
    private String user_name;
    private String birth_date;
    private int user_age;
}
