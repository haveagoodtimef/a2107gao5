package com.fhz.hilt_demo.test

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

/**
 * 时间:2024/1/9
 * @author Mr.Feng
 * 简述:
 *     //开启协程作用域
 *     //1,可以阻塞线程 , 用于测试环境
 * //    runBlocking {
 * //        println("这是协程的方法")
 * //    }
 *     //2, 全局,不阻塞线程, 用于测试测试环境
 * //    val abc = GlobalScope.launch {
 * //        println("我是全局作用域的协程")
 * //    }
 * //    abc.cancel()
 *
 *     //3,实际在生成环境中.
 * //    CoroutineScope(Dispatchers.IO).launch{
 * //        println("生成环境")
 * //    }
 */


suspend fun doSomethingUsefulOne(): Int {
    delay(2000L) // 假设我们在这里做了一些有用的事
    return 5
}

 suspend fun doSomethingUsefulTwo(): Int {
    delay(2000L) // 假设我们在这里做了一些有用的事
    return 5
}

fun main() = runBlocking {

    val long = measureTimeMillis {
         val async = async {
             doSomethingUsefulOne()
         }
        val async1 = async {
            doSomethingUsefulTwo()
        }
        println(async1.await()  + async.await()) //并发
    }
    println(long) //4



    launch{

        withContext(Dispatchers.IO){
            val a = 1
            withContext(Dispatchers.Main){
                //.setText(a)
            }

        }
    }









    /**
     * launch 返回值是job .加入,
     * job.cancel() 取消协程
     *
     *
     * async 返回值是Deferred<T>
     *     Deferred<T> 有3个方法
     *        1,  await() 阻塞, 等待结果
     *
     */


    /**
     * suspend 关键字
     *
     * 1, 挂起函数
     *
     * 2, 挂起函数只能在协程中调用
     *
     */


//    runBlocking{
//
//        //1,开始协程
////        val job1 = launch {
////            delay(1000)
////            println("这是1")
////        }
////
////        val job2 = launch {
////            job1.join()
////            println("这是2")
////        }
////        job1.cancel()
////        job1.join()
////        println(job1.isActive)
////        println(job1.isCompleted)
//
//        //2,开始协程
//        val start = System.currentTimeMillis()
//        val deferred1 = async {
//            delay(2000)
//            println("这是asyc1")
//            5
//        }
//        val deferred2 = async {
//            delay(2000)
//            println("这是asyc2")
//            5
//        }
//
//
//
//        val end = System.currentTimeMillis()
//        println(end - start)
//
//
//
//    }

}