package android.apeapp.mydict.mydictionary

/**
 * Created by ben on 24/1/18.
 */

object Model {
    data class Data(val data:Translation)
    data class Translation(val translations: List<TranslateResultBean>)
    data class TranslateResultBean(val translatedText: String, val detectedSourceLanguage: String)
}