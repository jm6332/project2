package com.kh.spring.match.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring.gym.model.vo.Gym;
import com.kh.spring.gym.model.vo.Schedule;
import com.kh.spring.match.model.vo.Match;
import com.kh.spring.match.model.vo.MatchInfo;
import com.kh.spring.match.model.vo.MatchInfoView;
import com.kh.spring.match.model.vo.MatchRegInfo;

@Mapper
public interface MatchDao {

	List<MatchInfo> selectScheduleList();

	int registerMatch(Match match);

	Match selectMatch(Match match);

	int updateMatch(Match match);

	List<MatchInfo> selectMatchList(String userId1);
}
