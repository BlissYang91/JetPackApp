package com.bliss.jetpackapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.bliss.jetpackapp.viewmodel.NameViewModel
import kotlinx.android.synthetic.main.activity_name.*
import java.lang.reflect.Array.get

class NameActivity : AppCompatActivity() {
    private lateinit var model:NameViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        model = ViewModelProvider(this).get(NameViewModel::class.java)
//        model.currentName.observe(this, Observer {
//            //接收 currentName 更新UI
//            nameTextView.text = it
//        })

        model.upDataUI()
        val nameObserver = Observer<String> {
            //接收 currentName 更新UI
            nameTextView.text = it
        }
        model.currentName.observe(this, nameObserver)

//        example()
    }

    /**
     * liveData数据监听更新UI
     */
    private fun example() {
//        分开操作
//        val observer = Observer<QueryBeanTechsCarTypeBean> {
//            logE("查询是否支持智能定损：${it}")
//            if (it?.externalReparationsId != null) {
//                goToAR(it.externalReparationsId)
//            } else {
//                ToastUtils.s(context, "车型不支持")
//            }
//        }
//        serverModel.queryBeanTechsCarTypeBean.observe(this,observer)


//        常规写法
//        serverModel.queryBeanTechsCarTypeBean.observe(this, Observer {
//            logE("查询是否支持智能定损：${it}")
//            if (it?.externalReparationsId != null) {
//                goToAR(it.externalReparationsId)
//            } else {
//                ToastUtils.s(context, "车型不支持")
//            }
//        })
    }

}
