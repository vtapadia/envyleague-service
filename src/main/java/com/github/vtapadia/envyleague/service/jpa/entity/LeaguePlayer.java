package com.github.vtapadia.envyleague.service.jpa.entity;


import com.github.vtapadia.envyleague.service.domain.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "league_player")
@Data
public class LeaguePlayer {
    @Id
    LeaguePlayerKey leaguePlayerKey;
    @Enumerated(EnumType.STRING)
    Status status;
}
