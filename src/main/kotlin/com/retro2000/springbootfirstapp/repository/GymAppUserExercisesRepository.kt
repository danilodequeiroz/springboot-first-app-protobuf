package com.retro2000.springbootfirstapp.repository

import com.retro2000.springbootfirstapp.model.UserExercisesProto.User
import org.springframework.data.jpa.repository.JpaRepository

interface GymAppUserExercisesRepository : JpaRepository<User, Long> {
    fun deleteByIdReturningRecord(id: Long): User
    fun deleteByIdReturningRecordCount(id: Long): Long
}