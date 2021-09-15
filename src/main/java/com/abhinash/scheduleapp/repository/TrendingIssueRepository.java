package com.abhinash.scheduleapp.repository;

import com.abhinash.scheduleapp.entity.TrendingIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrendingIssueRepository extends JpaRepository<TrendingIssue, Long> {
}
