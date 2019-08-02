package com.mafh.myregister

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.support.v4.content.res.TypedArrayUtils.getResourceId
import android.content.res.TypedArray



class AddExpense : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_expense)

        val label1=findViewById<LinearLayout>(R.id.layout_label_1)
        val container1=findViewById<LinearLayout>(R.id.layout_container_1)
        val label2=findViewById<LinearLayout>(R.id.layout_label_2)
        val container2=findViewById<LinearLayout>(R.id.layout_container_2)
        val label3=findViewById<LinearLayout>(R.id.layout_label_3)
        val container3=findViewById<LinearLayout>(R.id.layout_container_3)


        val attrs = intArrayOf(R.attr.selectableItemBackground)
        val typedArray = this.obtainStyledAttributes(attrs)
        val backgroundResource = typedArray.getResourceId(0, 0)
        label1.setBackgroundResource(backgroundResource)
        label2.setBackgroundResource(backgroundResource)
        label3.setBackgroundResource(backgroundResource)
        container1.visibility=View.VISIBLE
        container2.visibility=View.GONE
        container3.visibility=View.GONE
        label1.setOnClickListener {

            if (container1.isShown)
                container1.visibility=View.GONE
            else
                container1.visibility=View.VISIBLE



        }
        label2.setOnClickListener {

            if (container2.isShown)
                container2.visibility=View.GONE
            else
                container2.visibility=View.VISIBLE



        }
        label3.setOnClickListener {

            if (container3.isShown)
                container3.visibility=View.GONE
            else
                container3.visibility=View.VISIBLE



        }
    }
}
