package com.example.ytube10;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieApi {
 //CHANGE THE MOCKY    https://run.mocky.io/v3/45257cd3-bd46-47dd-8b30-a8e21b5c7140
    //https://run.mocky.io/v3/76445072-ebb8-4ff6-824c-ae34b5999f07

    //11viddeo  https://run.mocky.io/v3/21b882ad-cdc4-43fd-ae3f-bbf1400a365c

    // 12 video https://run.mocky.io/v3/b7ff02af-3b92-4453-a32f-785bd1086cde
    @GET("v3/b7ff02af-3b92-4453-a32f-785bd1086cde")
    Call<JSONResponse> getMovies();
}
