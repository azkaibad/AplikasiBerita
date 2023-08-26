package com.example.coba;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsService {

    @GET("v2/top-headlines?country=id&apiKey=e5447b3a0527415f9c4250440adc6d6b")
    Call<NewsResponseModel> newsHeadline();

}
