package com.example.coba;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsService {

    @GET("v2/top-headlines?country=id&apiKey=7cbd04f3e10c4cdbad91029b89148aca")
    Call<NewsResponseModel> newsHeadline();

}
