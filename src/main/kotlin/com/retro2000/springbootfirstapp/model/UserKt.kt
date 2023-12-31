// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: user.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.retro2000.springbootfirstapp.model;

@kotlin.jvm.JvmName("-initializeuser")
public inline fun user(block: com.retro2000.springbootfirstapp.model.UserKt.Dsl.() -> kotlin.Unit): com.retro2000.springbootfirstapp.model.UserExercisesProto.User =
  com.retro2000.springbootfirstapp.model.UserKt.Dsl._create(com.retro2000.springbootfirstapp.model.UserExercisesProto.User.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `User`
 */
public object UserKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.retro2000.springbootfirstapp.model.UserExercisesProto.User.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.retro2000.springbootfirstapp.model.UserExercisesProto.User.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.retro2000.springbootfirstapp.model.UserExercisesProto.User = _builder.build()

    /**
     * `int32 id = 1;`
     */
    public var id: kotlin.Int
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * `int32 id = 1;`
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * `string email = 2;`
     */
    public var email: kotlin.String
      @JvmName("getEmail")
      get() = _builder.getEmail()
      @JvmName("setEmail")
      set(value) {
        _builder.setEmail(value)
      }
    /**
     * `string email = 2;`
     */
    public fun clearEmail() {
      _builder.clearEmail()
    }

    /**
     * `string password = 3;`
     */
    public var password: kotlin.String
      @JvmName("getPassword")
      get() = _builder.getPassword()
      @JvmName("setPassword")
      set(value) {
        _builder.setPassword(value)
      }
    /**
     * `string password = 3;`
     */
    public fun clearPassword() {
      _builder.clearPassword()
    }

    /**
     * `string name = 4;`
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * `string name = 4;`
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ExercisesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .Exercise exercises = 5;`
     */
     public val exercises: com.google.protobuf.kotlin.DslList<com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise, ExercisesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getExercisesList()
      )
    /**
     * `repeated .Exercise exercises = 5;`
     * @param value The exercises to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addExercises")
    public fun com.google.protobuf.kotlin.DslList<com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise, ExercisesProxy>.add(value: com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise) {
      _builder.addExercises(value)
    }
    /**
     * `repeated .Exercise exercises = 5;`
     * @param value The exercises to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignExercises")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise, ExercisesProxy>.plusAssign(value: com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise) {
      add(value)
    }
    /**
     * `repeated .Exercise exercises = 5;`
     * @param values The exercises to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllExercises")
    public fun com.google.protobuf.kotlin.DslList<com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise, ExercisesProxy>.addAll(values: kotlin.collections.Iterable<com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise>) {
      _builder.addAllExercises(values)
    }
    /**
     * `repeated .Exercise exercises = 5;`
     * @param values The exercises to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllExercises")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise, ExercisesProxy>.plusAssign(values: kotlin.collections.Iterable<com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise>) {
      addAll(values)
    }
    /**
     * `repeated .Exercise exercises = 5;`
     * @param index The index to set the value at.
     * @param value The exercises to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setExercises")
    public operator fun com.google.protobuf.kotlin.DslList<com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise, ExercisesProxy>.set(index: kotlin.Int, value: com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise) {
      _builder.setExercises(index, value)
    }
    /**
     * `repeated .Exercise exercises = 5;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearExercises")
    public fun com.google.protobuf.kotlin.DslList<com.retro2000.springbootfirstapp.model.UserExercisesProto.Exercise, ExercisesProxy>.clear() {
      _builder.clearExercises()
    }


    /**
     * `.google.protobuf.Timestamp last_updated = 6;`
     */
    public var lastUpdated: com.google.protobuf.Timestamp
      @JvmName("getLastUpdated")
      get() = _builder.getLastUpdated()
      @JvmName("setLastUpdated")
      set(value) {
        _builder.setLastUpdated(value)
      }
    /**
     * `.google.protobuf.Timestamp last_updated = 6;`
     */
    public fun clearLastUpdated() {
      _builder.clearLastUpdated()
    }
    /**
     * `.google.protobuf.Timestamp last_updated = 6;`
     * @return Whether the lastUpdated field is set.
     */
    public fun hasLastUpdated(): kotlin.Boolean {
      return _builder.hasLastUpdated()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.retro2000.springbootfirstapp.model.UserExercisesProto.User.copy(block: com.retro2000.springbootfirstapp.model.UserKt.Dsl.() -> kotlin.Unit): com.retro2000.springbootfirstapp.model.UserExercisesProto.User =
  com.retro2000.springbootfirstapp.model.UserKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.retro2000.springbootfirstapp.model.UserExercisesProto.UserOrBuilder.lastUpdatedOrNull: com.google.protobuf.Timestamp?
  get() = if (hasLastUpdated()) getLastUpdated() else null

