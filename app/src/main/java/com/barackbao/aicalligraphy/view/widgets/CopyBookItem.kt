package com.barackbao.aicalligraphy.view.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.barackbao.aicalligraphy.R
import com.barackbao.aicalligraphy.application.GlideApplication
import com.barackbao.aicalligraphy.model.CopyBook
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideBuilder
import kotlinx.android.synthetic.main.item_copybook.view.*
import java.util.jar.Attributes

/**
 * <pre>
 *     author : baoqianyue
 *     time   : 2018/09/23
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class CopyBookItem : FrameLayout {

    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        initView()
    }

    private fun initView() {
        View.inflate(context, R.layout.item_copybook, this)
    }

    fun setData(copyBook: CopyBook) {
        item_copybook_author_tv.text = copyBook.author
        item_copybook_name_tv.text = copyBook.copyBookName
        Glide.with(context).load(R.drawable.barack).into(item_copybook_img)
    }

}