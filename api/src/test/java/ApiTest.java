import net.piedevelopers.junitandretrofit.api.RetrofitClient;
import net.piedevelopers.junitandretrofit.api.RetrofitInterface;
import net.piedevelopers.junitandretrofit.models.ArticleResponse;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class ApiTest {
    @Test
    public void getArticle() throws IOException {

        RetrofitInterface retrofitInterface= RetrofitClient.retrofit.create(RetrofitInterface .class);
        Call<ArticleResponse> articleResponseCall= retrofitInterface.executearticlefetch();
        Response<ArticleResponse> articles=articleResponseCall.execute();
        articles.body();
    }
    @Test
    public void getArticleByTag() throws IOException {

        RetrofitInterface retrofitInterface= RetrofitClient.retrofit.create(RetrofitInterface .class);
        Call<ArticleResponse> articleResponseCall= retrofitInterface.getarticlesbytag("Angularjs");
        Response<ArticleResponse> articlesbytag=articleResponseCall.execute();
        articlesbytag.body();
    }

}
