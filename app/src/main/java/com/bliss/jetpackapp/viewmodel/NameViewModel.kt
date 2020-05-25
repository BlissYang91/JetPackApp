package com.bliss.jetpackapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @Author yangtianfu
 * @CreateTime 2020/5/23 14:39
 * @Describe LiveData 使用
 * LiveData 是一种可用于任何数据的封装容器，其中包括可实现 Collections 的对象，如 List。
 * LiveData 对象通常存储在 ViewModel 对象中，并可通过 getter 方法进行访问
 */
class NameViewModel :ViewModel(){

    val currentName:MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

   fun upDataUI(){
       currentName.postValue("更新了UI")
   }

}