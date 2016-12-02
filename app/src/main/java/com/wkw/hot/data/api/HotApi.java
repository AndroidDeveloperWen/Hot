package com.wkw.hot.data.api;

import com.wkw.common_lib.rx.ApiResponse;
import com.wkw.hot.entity.PopularEntity;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by wukewei on 16/5/26.
 */
public interface HotApi {

    @GET("txapi/weixin/wxhot")
    rx.Observable<ApiResponse<List<PopularEntity>>> getPopular(@Query("page") int page, @Query("num") int num, @Query("word") String word);

}
