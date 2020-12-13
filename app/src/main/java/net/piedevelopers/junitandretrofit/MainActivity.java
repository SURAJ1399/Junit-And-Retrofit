package net.piedevelopers.junitandretrofit;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import android.os.Bundle;
import android.util.Log;

import net.piedevelopers.junitandretrofit.api.RetrofitClient;
import net.piedevelopers.junitandretrofit.api.RetrofitInterface;
import net.piedevelopers.junitandretrofit.models.ArticleResponse;


public class MainActivity extends AppCompatActivity {

RetrofitInterface retrofitInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      retrofitInterface= RetrofitClient.retrofit.create(RetrofitInterface.class);
      Call<ArticleResponse>  call=retrofitInterface.executearticlefetch();
      call.enqueue(new Callback<ArticleResponse>() {
          @Override
          public void onResponse(Call<ArticleResponse> call, Response<ArticleResponse> response) {
              Log.i("info","response"+response.body().getArticles().size());
          }

          @Override
          public void onFailure(Call<ArticleResponse> call, Throwable t) {
              Log.i("info","response"+t.getMessage());
          }
      });




    }
}