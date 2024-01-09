package com.fhz.hilt_demo.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import javax.inject.Inject

/**
 * 时间:2024/1/8
 * @author Mr.Feng
 * 简述: user
 */

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,

    @ColumnInfo(name = "first_name")
    val firstName: String?,

    val lastName: String?
)
