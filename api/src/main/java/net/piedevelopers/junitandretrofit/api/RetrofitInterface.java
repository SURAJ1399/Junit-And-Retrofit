package net.piedevelopers.junitandretrofit.api;



import net.piedevelopers.junitandretrofit.models.ArticleResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("articles")
    Call<ArticleResponse> executearticlefetch();
    @GET("articles")
    Call<ArticleResponse> getarticlesbytag(@Query("tag") String tag);
}
