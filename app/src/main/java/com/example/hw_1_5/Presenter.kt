package com.example.hw_1_5

import android.graphics.Color
import com.example.hw_1_5.View.CounterView
import com.example.hw_1_5.model.Model

class Presenter (var view: CounterView){

    var model=Model()

    fun increment(){
        model.increment()
        view.showCount(model.number)
        if(model.number==10){
            view.showToast()
        }
        else if(model.number==15){
            view.saveColor(Color.GREEN)
            }
    }
    fun decrement(){
        model.decrement()
        view.showCount(model.number)

        if(model.number==10){
            view.showToast()
        }
        else if(model.number<15){
            view.saveColor(Color.BLACK)
        }
    }



}