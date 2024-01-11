package com.fhz.flow_demo

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

/**
 * 时间:2024/1/11
 * @author Mr.Feng
 * 简述: TODO
 */
fun main() = runBlocking{

    createFlow().collect {
        println(it)
    }

    flowOf(1,2,3).map {
        it
    }.filter {
        it > 1
    }.onEach {
        println(it)
    }.debounce(500).collect{
        println(it)
    }


}

fun createFlow() = flow{
    emit("..")
    emit("----")
}