package net.piedevelopers.junitandretrofit.api;



import net.piedevelopers.junitandretrofit.models.ArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("articles")
    Call<ArticleResponse> executearticlefetch();
}
