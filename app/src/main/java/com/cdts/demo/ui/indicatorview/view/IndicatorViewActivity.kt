package com.cdts.demo.ui.indicatorview.view

import android.support.v4.app.Fragment
import com.cdts.demo.schema.view.BaseSingleFragmentActivity

class IndicatorViewActivity: BaseSingleFragmentActivity() {
    override var fragment: Fragment = IndicatorViewFragment()

    var title: String? = null

    override fun setupUI() {
        super.setupUI()
        (fragment as IndicatorViewFragment).let {
            it.title = title
        }
    }
}