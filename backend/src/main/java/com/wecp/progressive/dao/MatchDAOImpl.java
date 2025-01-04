package com.wecp.progressive.dao;

<<<<<<< HEAD
public class MatchDAOImpl {
=======
import java.util.List;

import com.wecp.progressive.entity.Match;

public class MatchDAOImpl implements MatchDAO {

    @Override
    public int addMatch(Match match) {
        return -1;
    }

    @Override
    public Match getMatchById(int matchId) {
        return null;
    }

    @Override
    public void updateMatch(Match match) {
        
    }

    @Override
    public void deleteMatch(int matchId) {
       
    }

    @Override
    public List<Match> getAllMatches() {
        return List.of();
    }
>>>>>>> a163731712386a9bcdffcb8f74c90a5d22c255d1

}
