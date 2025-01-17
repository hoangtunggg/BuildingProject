package com.javaweb.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;

@Repository
@Primary
public class BuildingRepositoryImpl implements BuildingRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<BuildingEntity> findAll(BuildingSearchBuilder buildingSearchBuilder) {
		//JPQL
//		String sqlString = "FROM BuildingEntity";
//		Query query = entityManager.createQuery(sqlString, BuildingEntity.class);
		// nếu không có class => sẽ không có key và k thể duyệt được
		
		//SQL Native
		String sqlString = "SELECT * FROM building b WHERE b.name LIKE '%building' ";
		Query query = entityManager.createNativeQuery(sqlString, BuildingEntity.class);
		return query.getResultList();
	}
	
}
