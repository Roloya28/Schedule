package com.example.schedule.controller;

import com.example.schedule.dto.CreateScheduleRequestDto;
import com.example.schedule.dto.ScheduleResponseDto;
import com.example.schedule.dto.ScheduleWithEmailResponseDto;
import com.example.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping // 스케쥴 생성
    public ResponseEntity<ScheduleResponseDto> save(@RequestBody CreateScheduleRequestDto requestDto) {

        System.out.println("received request to create schedule: " + requestDto);

        ScheduleResponseDto scheduleResponseDto = scheduleService.save(requestDto.getTitle(), requestDto.getContents(), requestDto.getUsername());

        return new ResponseEntity<>(scheduleResponseDto, HttpStatus.CREATED);
    }


    @GetMapping // 스케쥴 전체 조회
    public ResponseEntity<List<ScheduleResponseDto>> findAll() {

        List<ScheduleResponseDto> scheduleResponseDtoList = scheduleService.findAll();

        return new ResponseEntity<>(scheduleResponseDtoList, HttpStatus.OK);
    }

    @GetMapping("/{id}") // 스케쥴 단건 조회
    public ResponseEntity<ScheduleWithEmailResponseDto> findById(@PathVariable Long id) {

        ScheduleWithEmailResponseDto scheduleWithEmailResponseDto = scheduleService.findById(id);

        return new ResponseEntity<>(scheduleWithEmailResponseDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}") // 스케쥴 삭제
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        scheduleService.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
