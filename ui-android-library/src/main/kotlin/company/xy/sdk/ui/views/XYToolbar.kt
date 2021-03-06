package company.xy.sdk.ui.views

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import company.xy.sdk.ui.R
import company.xy.sdk.ui.XYBaseActivity

open class XYToolbar : Toolbar {

    open var isBackNavigationEnabled = false

    constructor(context: Context) : super(ContextThemeWrapper(context, R.style.xy_toolbar)) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet) :
            super(ContextThemeWrapper(context, R.style.xy_toolbar), attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init(context)
    }

    private fun init(context: Context) {
        if (context is XYBaseActivity) {
            context.setSupportActionBar(this)
            val actionBar = context.supportActionBar
            if (actionBar != null) {
                actionBar.setDisplayShowHomeEnabled(true)
                actionBar.setDisplayHomeAsUpEnabled(false)
                actionBar.setDisplayShowCustomEnabled(true)
                actionBar.setDisplayShowTitleEnabled(false)
            }
        }
    }

    fun enableMenuNavigation(onClickListener: OnClickListener) {
        isBackNavigationEnabled = false
        navigationIcon = ContextCompat.getDrawable(context, R.drawable.xy_ui_toolbar_menu)
        setNavigationOnClickListener(onClickListener)
    }

    fun enableBackNavigation(activity: XYBaseActivity) {
        isBackNavigationEnabled = true
        navigationIcon = ContextCompat.getDrawable(context, R.drawable.xy_ui_toolbar_back)
        setNavigationOnClickListener { activity.onBackPressed() }
    }

    fun enableBackNavigation(onClickListener: OnClickListener) {
        isBackNavigationEnabled = true
        navigationIcon = ContextCompat.getDrawable(context, R.drawable.xy_ui_toolbar_back)
        setNavigationOnClickListener(onClickListener)
    }

    companion object {

        private val TAG = XYToolbar::class.java.simpleName
    }
}
