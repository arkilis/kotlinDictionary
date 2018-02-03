package android.apeapp.mydict.mydictionary

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by ben on 24/1/18.
 */
interface PostRequstInterface {
    @POST("v2?key=AIzaSyAFxNjprKkTrbdDJcR6sqA55ZDxy8HOi3U&target=zh")
    @FormUrlEncoded
    abstract fun getCall(@Field("q") targetSentence: String): Call<Model.Data>
}