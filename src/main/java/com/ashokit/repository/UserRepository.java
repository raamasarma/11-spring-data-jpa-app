package com.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.UserEntity;



public interface UserRepository extends CrudRepository<UserEntity,Serializable>{
    @Query("from UserEntity where email=:email")
	public UserEntity findByEmail(String email);
    
    @Query("select UserId,UserName where age=:age")
    public UserEntity  findByAge(Integer age);
    
    @Query(value="select * from user_details where user_id=:userId",nativeQuery=true )
    public UserEntity findById(Integer userId);
    
	
	
	
    
	
	 

}
