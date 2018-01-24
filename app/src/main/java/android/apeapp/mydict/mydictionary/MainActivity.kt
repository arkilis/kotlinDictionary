package android.apeapp.mydict.mydictionary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextInput = findViewById<EditText>(R.id.queryEditText)
        val searchButton = findViewById<Button>(R.id.searchButton)

        searchButton.setOnClickListener {
            if (editTextInput.text.toString().isNotEmpty()) {
                request(editTextInput.text.toString())
            } else {
                Toast.makeText(this, "Input text cannot be empty!", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun request(textInput: String) {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://fanyi.youdao.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val request = retrofit.create<PostRequstInterface>(PostRequstInterface::class.java!!)

        val call = request.getCall(textInput)

        call.enqueue(object : Callback<Model.Translation> {
            override fun onResponse(call: Call<Model.Translation>, response: Response<Model.Translation>) {
                //Toast.makeText(this, response.body().translateResult[0][0].tgt, Toast.LENGTH_LONG).show()
                findViewById<TextView>(R.id.resultsTextView).text = response.body().translateResult[0][0].tgt;
            }

            override fun onFailure(call: Call<Model.Translation>, throwable: Throwable) {
                println("Request Error!")
                println(throwable.message)
            }
        })
    }
}
