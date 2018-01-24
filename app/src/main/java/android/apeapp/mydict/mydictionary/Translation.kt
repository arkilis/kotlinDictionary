package android.apeapp.mydict.mydictionary

/**
 * Created by ben on 24/1/18.
 */

class Translation {

    val status: Int = 0

    class content {

        companion object {
            val from: String? = null
            val to: String? = null
            val vendor: String? = null
            val out: String? = null
            val errNo: Int = 0
        }
    }


    //定义 输出返回数据 的方法
    fun show() {
        println(status)

        println(content.from)
        println(content.to)
        println(content.vendor)
        println(content.out)
        println(content.errNo)
    }
}