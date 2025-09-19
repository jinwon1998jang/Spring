package kr.co.ch05.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User2DTO {
    private String user_id;
    private String user_name;
    private String birth_date;
    private int user_age;
}
