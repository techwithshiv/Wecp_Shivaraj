package com.wecp.progressive.dao;

<<<<<<< HEAD

public class TeamDAOImpl {
=======
import java.util.List;

import com.wecp.progressive.entity.Team;

public class TeamDAOImpl implements TeamDAO {

    @Override
    public int addTeam(Team team) {
       return -1;
    }

    @Override
    public Team getTeamById(int teamId) {
        
        return null;
    }

    @Override
    public void updateTeam(Team team) {
        
    }

    @Override
    public void deleteTeam(int teamId) {
        
    }

    @Override
    public List<Team> getAllTeams() {
        return List.of();
    }
>>>>>>> a163731712386a9bcdffcb8f74c90a5d22c255d1



}
