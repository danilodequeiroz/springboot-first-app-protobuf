package com.retro2000.springbootfirstapp.business

import com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise
import com.retro2000.springbootfirstapp.model.UserExercisesProto.User
import com.retro2000.springbootfirstapp.repository.GymAppUserExercisesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserBusiness {

    @Autowired
    lateinit var gymAppUserExercisesRepository: GymAppUserExercisesRepository
    fun deleteUserById(userId: Long) {
        return gymAppUserExercisesRepository.deleteById(userId)
    }

    fun deleteUserByIdAndCount(userId: Long): Boolean {
        return gymAppUserExercisesRepository.deleteByIdReturningRecordCount(userId) > 0
    }

    fun findAllUsers(): MutableList<User> {
        return gymAppUserExercisesRepository.findAll()
    }

    fun findUserById(userId: Long): User {
        return gymAppUserExercisesRepository.findById(userId).get()
    }

    fun findUsersByIds(userId: MutableIterable<Long>): MutableList<User> {
        return gymAppUserExercisesRepository.findAllById(userId)
    }

    fun saveUser(user: User): User {
        return gymAppUserExercisesRepository.save(user)
    }

    fun setExerciseForUser(userId: Long, exercise: Exercise): User {
        val user = gymAppUserExercisesRepository.findById(userId).get()
        user.exercisesList.add(exercise)
        return gymAppUserExercisesRepository.save(user)
    }

    fun setExercisesForUser(userId: Long, exercises: MutableList<Exercise>): User {
        val user = gymAppUserExercisesRepository.findById(userId).get()
        user.exercisesList.addAll(exercises)
        return gymAppUserExercisesRepository.save(user)
    }

    fun updateUserName(userId: Long, name:String){
        val user = gymAppUserExercisesRepository.findById(userId).get()
        gymAppUserExercisesRepository.save(User.newBuilder(user).also { it.name = name }.build())
    }
}