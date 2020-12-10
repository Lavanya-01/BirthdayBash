package com.birthday.birthdaybash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.birthday.birthdaybash.entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Long>{

}
