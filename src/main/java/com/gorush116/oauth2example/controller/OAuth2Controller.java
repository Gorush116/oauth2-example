package com.gorush116.oauth2example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "알림 API", description = "컨트롤러에 대한 설명입니다.")
@RequestMapping("/")
public class OAuth2Controller {

    @Operation(summary = "수신함 리스트", description = "파라미터로 받은 유저가 수신한 알림 목록을 최신순으로 정렬하여 전달")
    @Parameter(name = "alarmType", description = "보내는 알림의 타입")
    @Parameter(name = "toId", description = "받는 유저의 아이디")
    @Parameter(name = "fromId", description = "보내는 유저의 아이디")
    @Parameter(name = "alarmMsg", description = "알림의 내용")
    @Parameter(name = "alarmStatus", description = "알림의 처리상태, Required = false || 요청 시 보내지 않아도 자동 처리됨.")
    @GetMapping("/test")
    public String test() {

        return "Hello";
    }

    @ApiResponse(responseCode = "200", description = "수신함 조회 성공", content = @Content(schema = @Schema(implementation = ResponseDto.class)))
    @GetMapping("/api/response")
    public String apiResponse() {
        return "apiResponse";
    }

}
