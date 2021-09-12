package com.abhinash.scheduleapp.controller;

import com.abhinash.scheduleapp.entity.Schedule;
import com.abhinash.scheduleapp.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(Model model){
        return "index";
    }


    @RequestMapping(value = {"/schedule"}, method = RequestMethod.GET)
    public String scheduleList(Model model){

        //getting schedule list from database
        List<Schedule> schedules = scheduleService.getScheduleList();

        //passing data schedulelist to html form
        model.addAttribute("scheduleList", schedules);
        return "schedulelist";
    }

    @RequestMapping(value = {"/to-edit-schedule"}, method = RequestMethod.GET)
    public String editSchedule(Model model, Long id){
        Schedule schedule = scheduleService.getScheduleById(id);
        model.addAttribute("schedule", schedule);
        return "editSchedule";
    }

    @RequestMapping(value = {"/edit-schedule"}, method = RequestMethod.POST)
    public String editSchedule(Schedule schedule){
        scheduleService.addUpdateSchedule(schedule);
        return "redirect:/schedule";
    }

    @RequestMapping(value = {"/to-add-schedule"}, method = RequestMethod.GET)
    public String addSchedule(Model model, Long id){
        return "addSchedule";
    }

    @RequestMapping(value = {"/add-schedule"}, method = RequestMethod.POST)
    public String addSchedule(Schedule schedule){
        scheduleService.addUpdateSchedule(schedule);//it call save method present in service class which is
        // responsible to save data to database
        return "redirect:/home";
    }

}
