package com.codeclan.example.pirateservice_d1_starter.repositories;

import com.codeclan.example.pirateservice_d1_starter.models.Raid;
import com.codeclan.example.pirateservice_d1_starter.projections.EmbedForPirate;
import com.codeclan.example.pirateservice_d1_starter.projections.EmbedForRaid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = EmbedForRaid.class)
public interface RaidRepository extends JpaRepository<Raid, Long> {
}
