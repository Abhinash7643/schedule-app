package com.abhinash.scheduleapp.controller;

import com.abhinash.scheduleapp.entity.TrendingIssue;
import com.abhinash.scheduleapp.service.TrendingIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TrendingIssueController {

    @Autowired
    private TrendingIssueService trendingIssueService;

    @GetMapping("/trendingIssue")
    public String getAllTrendingIssue(Model model){
        //getting schedule list from database
        List<TrendingIssue> trendingIssues = trendingIssueService.getAllTrendingIssue();

        model.addAttribute("trendingIssue", trendingIssues);
        return "trending-issue/trendingissuelist";
    }

    @GetMapping("/to-add-trending-issue")
    public String addTrendingIssue(Model model){
        return "trending-issue/addTrendingIssue";
    }

    @RequestMapping(value = {"/add-trending-issue"}, method = RequestMethod.POST)
    public String addTrendingIssue(TrendingIssue trendingIssue){
        trendingIssueService.addTrendingIssue(trendingIssue);
        return "redirect:/trendingIssue";
    }

    @RequestMapping(value = {"/to-edit-trendingIssue"}, method = RequestMethod.GET)
    public String editSchedule(Model model, Long id){
        TrendingIssue trendingIssue = trendingIssueService.getTrendingIssueById(id);
        model.addAttribute("trendingIssue", trendingIssue);
        return "trending-issue/editTrendingIssue";
    }

    @RequestMapping(value = {"/edit-trendingIssue"}, method = RequestMethod.POST)
    public String editSchedule(TrendingIssue trendingIssue){
        trendingIssueService.updateTrendingIssue(trendingIssue);
        return "redirect:/trendingIssue";
    }
}
