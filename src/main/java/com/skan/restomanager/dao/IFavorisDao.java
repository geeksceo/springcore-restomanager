package com.skan.restomanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skan.restomanager.domain.Favoris;

public interface IFavorisDao extends JpaRepository<Favoris, Long> {

}
