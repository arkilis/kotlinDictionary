package android.apeapp.mydict.mydictionary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        request()
    }

    fun request() {

        //步骤4:创建Retrofit对象
        val retrofit = Retrofit.Builder()
                .baseUrl("http://fanyi.youdao.com/") // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
                .build()

        // 步骤5:创建 网络请求接口 的实例
        val request = retrofit.create<PostRequstInterface>(PostRequstInterface::class.java!!)

        //对 发送请求 进行封装(设置需要翻译的内容)
        val call = request.getCall("I love you")

        //步骤6:发送网络请求(异步)
        call.enqueue(object : Callback<Translation1> {
            override fun onResponse(call: Call<Translation1>, response: Response<Translation1>) {
                println("xxxxxxxxxxxxxxxxxxx")
                println(response.body().getTranslateResult()!![0][0].tgt)
                //System.out.println("翻译是：" + response.body().getTranslateResult()!!.get(0)[0].)
            }

            //请求失败时回调
            override fun onFailure(call: Call<Translation1>, throwable: Throwable) {
                println("请求失败")
                println(throwable.message)
            }
        })
    }
}
