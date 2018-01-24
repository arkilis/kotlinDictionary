package android.apeapp.mydict.mydictionary

/**
 * Created by ben on 24/1/18.
 */

object Model {
    data class Translation(val type: String, val errorCode: Int, val elapsedTime: Int, val translateResult: List<List<TranslateResultBean>>)
    data class TranslateResultBean(val src: String, val tgt: String)
}