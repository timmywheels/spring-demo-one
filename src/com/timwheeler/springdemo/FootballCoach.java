package com.timwheeler.springdemo;

public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice 50 Oklahomas";
    }
}
