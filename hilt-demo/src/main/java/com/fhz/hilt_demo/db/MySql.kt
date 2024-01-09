package com.fhz.hilt_demo.db

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * 时间:2024/1/9
 * @author Mr.Feng
 * 简述: greendao  -- room -
 * 说明:
 */
//class MySql :SQLiteOpenHelper() {
//    override fun onCreate(db: SQLiteDatabase) {
//        db.execSQL("create table user(id integer primary key autoincrement,username text,age integer)")
//    }
//    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
//        db.execSQL("drop table if exists user")
//        onCreate(db)
//    }
//}