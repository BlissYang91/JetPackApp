package com.bliss.jetpackapp.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

/**
 * @Author yangtianfu
 * @CreateTime 2020/5/22 17:13
 * @Describe
 * ① LifecycleObserver: Lifecycle观察者。我们需要自定义类实现LifecycleObserver，通过注解的方式可观察生命周期方法。
 * ② Lifecycle: 生命周期抽象类。持有添加和移除监听方法。定义State和Event枚举。
 * ③ 接受事件是通过注解OnLifecycleEvent来完成的，参数即Event枚举
 * ④ LifecycleOwner：Lifecycle持有者。让Activity或者fragment实现该接口，当生命周期改变是事件会被LifecycleObserver接收到。
 */

class MyObserver :LifecycleObserver {
    private val TAG: String
        get() = "MyObserver"

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun  connectListener(){
        Log.e(TAG, "connectListener: ==ON_RESUME==")
    }
    
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun disconnectListener(){
        Log.e(TAG, "disconnectListener: ==ON_PAUSE==")
    }

//    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
//    fun onAny(owner: LifecycleOwner, event: Lifecycle.Event)
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
//    fun onCreate()
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
//    fun onDestroy()
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_START)
//    fun onStart()
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
//    fun onStop()
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
//    fun onResume()
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
//    fun onPause()
}