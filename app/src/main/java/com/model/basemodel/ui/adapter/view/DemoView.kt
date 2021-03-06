package com.model.basemodel.ui.adapter.view

import android.app.Activity
import android.view.View
import com.model.basemodel.R
import com.model.basemodel.http.apiconfig.model
import kotlinx.android.synthetic.main.view_demo.*
import org.jetbrains.anko.UI
import org.jetbrains.anko.include
import org.jetbrains.anko.linearLayout

/**
 * BaseModel
 * Created by WZ.
 */

fun Activity.DemoView(m: model): View {

    val view = UI {
        linearLayout {
            include<View>(R.layout.view_demo)
        }
    }.view

    with(view) {
        decs.text = m.title
    }
    return view

}
