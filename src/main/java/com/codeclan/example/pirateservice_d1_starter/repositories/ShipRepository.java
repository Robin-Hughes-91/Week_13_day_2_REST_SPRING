package com.codeclan.example.pirateservice_d1_starter.repositories;

import com.codeclan.example.pirateservice_d1_starter.models.Ship;
import com.codeclan.example.pirateservice_d1_starter.projections.EmbedForPirate;
import com.codeclan.example.pirateservice_d1_starter.projections.EmbedForShip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = EmbedForShip.class)
public interface ShipRepository extends JpaRepository<Ship, Long> {
}
