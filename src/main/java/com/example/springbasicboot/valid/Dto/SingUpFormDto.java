package com.example.springbasicboot.valid.Dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class SingUpFormDto {
    @NotEmpty
    String name;
    @NotEmpty
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", message = "이메일 형식에 맞지 않습니다.")
    String email;
    @NotEmpty
    @Size(min = 6, message = "비밀번호는 최소 6자 이상이어야 합니다.")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,16}$", message = "비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
    String password;
    @Past
    LocalDate date;
    @NotEmpty
    String gender;
}
