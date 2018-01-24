package android.apeapp.mydict.mydictionary

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by ben on 24/1/18.
 */
interface PostRequstInterface {
    @POST("translate?doctype=json&jsonversion=&type=&keyfrom=&model=&mid=&imei=&vendor=&screen=&ssid=&network=&abtest=")
    @FormUrlEncoded
    abstract fun getCall(@Field("i") targetSentence: String): Call<Model.Translation>
}