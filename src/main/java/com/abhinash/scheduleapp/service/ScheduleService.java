package com.abhinash.scheduleapp.service;

import com.abhinash.scheduleapp.entity.Schedule;
import com.abhinash.scheduleapp.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;


    public List<Schedule> getScheduleList(){
        return scheduleRepository.findAll();
    }

    public Schedule getScheduleById(Long id){
        Optional<Schedule> schedule =  scheduleRepository.findById(id);
       return schedule.get();
    }

    public Schedule addUpdateSchedule(Schedule schedule){
        return scheduleRepository.save(schedule);
    }
}
