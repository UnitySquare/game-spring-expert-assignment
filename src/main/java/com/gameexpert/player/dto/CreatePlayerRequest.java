package com.gameexpert.player.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;

@Getter
public class CreatePlayerRequest {

    // TODO Lv 3: 2~12글자의 영문 대소문자, 숫자와 밑줄을 허용하는 검증을 적용합니다.
    @NotBlank(message = "닉네임은 필수 입력값입니다.")
    @Pattern(
            regexp = "^[a-zA-Z0-9_]{2,12}$",
            message = "닉네임은 2~12자의 영문 대소문자, 숫자, 밑줄(_)만 사용 가능합니다."
    )
    private final String nickname;

    public CreatePlayerRequest(String nickname) {
        this.nickname = nickname;
    }
}
