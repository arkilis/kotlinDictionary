package android.apeapp.mydict.mydictionary

/**
 * Created by ben on 24/1/18.
 */
class Translation1 {

    private var type: String? = null
    private var errorCode: Int = 0
    private var elapsedTime: Int = 0
    private var translateResult: List<List<TranslateResultBean>>? = null

    fun getType(): String? {
        return type
    }

    fun setType(type: String) {
        this.type = type
    }

    fun getErrorCode(): Int {
        return errorCode
    }

    fun setErrorCode(errorCode: Int) {
        this.errorCode = errorCode
    }

    fun getElapsedTime(): Int {
        return elapsedTime
    }

    fun setElapsedTime(elapsedTime: Int) {
        this.elapsedTime = elapsedTime
    }

    fun getTranslateResult(): List<List<TranslateResultBean>>? {
        return translateResult
    }

    fun setTranslateResult(translateResult: List<List<TranslateResultBean>>) {
        this.translateResult = translateResult
    }

    class TranslateResultBean {
        var src: String? = null
        var tgt: String? = null
    }
}