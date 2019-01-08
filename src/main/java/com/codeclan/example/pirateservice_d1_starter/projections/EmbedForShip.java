package com.codeclan.example.pirateservice_d1_starter.projections;

import com.codeclan.example.pirateservice_d1_starter.models.Pirate;
import com.codeclan.example.pirateservice_d1_starter.models.Raid;
import com.codeclan.example.pirateservice_d1_starter.models.Ship;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="embedForShip", types = Ship.class)
public interface EmbedForShip {

    String getName();
    List<Pirate> getPirates();

}
