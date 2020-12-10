package com.birthday.birthdaybash.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birthday.birthdaybash.entity.Abhi;

@Repository
public interface AbhiRepo extends JpaRepository<Abhi, Long>{

	

	Abhi findByaName(String name);

}
