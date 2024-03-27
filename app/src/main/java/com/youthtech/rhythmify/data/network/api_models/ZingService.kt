package com.youthtech.rhythmify.data.network.api_models

import ZingGetRadioResponse
//import com.youthtech.rhythmify.data.dto.ZingGetRadioResponse
import com.youthtech.rhythmify.data.network.utils.ApiPath
import com.youthtech.rhythmify.enums.MvSort
import com.youthtech.rhythmify.enums.SearchType
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ZingService {
    @GET(ApiPath.GET_HOME)
    suspend fun getHome(
        @Query("page") page: String? = "1",
        @Query("count") count: Number? = 15,
        @Query("segmentId") segmentId: String? = "-1",
        @Query("sig") sig: String
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingHomeResponse>

    @GET(ApiPath.GET_SECTION_SONG_STATION)
    suspend fun getSectionSongStation(
        @Query("count") count: Number? = 10,
        @Query("sig") sig: String
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingGetSectionSongStationResponse>

    @GET(ApiPath.GET_SONG)
    suspend fun getSong(
        @Query("id") id: String,
        @Query("sig") sig: String
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingSongStreamResponse>

    @GET(ApiPath.GET_SONG_INFO)
    suspend fun getSongInfo(
        @Query("id") id: String,
        @Query("sig") sig: String
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingSongInfoResponse>

    @GET(ApiPath.GET_SONG_LYRIC)
    suspend fun getSongLyric(
        @Query("id") id: String,
        @Query("sig") sig: String
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingSongLyricsResponse>

    @GET(ApiPath.GET_HOME_CHART)
    suspend fun getHomeChart(
        @Query("sig") sig: String
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingGetHomeChartResponse>

    @GET(ApiPath.GET_NEW_RELEASE_CHART)
    suspend fun getNewReleaseChart(
        @Query("sig") sig: String
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingGetNewReleaseChartResponse>

    @GET(ApiPath.GET_WEEK_CHART)
    suspend fun getWeekChart(
        @Query("id") id: String,
        @Query("week") week: Number,
        @Query("year") year: Number,
        @Query("sig") sig: String
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingGetWeekChartResponse>

    @GET(ApiPath.GET_RADIO)
    suspend fun getRadio(
        @Query("page") page: Number? = 1,
        @Query("count") count: Number? = 10,
        @Query("sig") sig: String,
    ): Response<ZingGetRadioResponse>

    @GET(ApiPath.GET_LIST_BY_GENDER)
    suspend fun getListByGenre(
        @Query("id") id: String,
        @Query("page") page: Number? = 1,
        @Query("count") count: Number? = 10,
        @Query("sig") sig: String,
    ): Response<Any>

    @GET(ApiPath.GET_ARTIST)
    suspend fun getArtist(
        @Query("alias") name: String,
        @Query("sig") sig: String,
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingGetArtistResponse>

    @GET(ApiPath.GET_HUB_HOME)
    suspend fun getHubHome(
        @Query("sig") sig: String,
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingGetHubHomeResponse>

    @GET(ApiPath.GET_HUB_DETAIL)
    suspend fun getHubHomeDetail(
        @Query("id") id: String,
        @Query("sig") sig: String,
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingGetHubDetailResponse>

    @GET(ApiPath.GET_TOP_100)
    suspend fun getTop100(
        @Query("sig") sig: String,
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingGetTop100Response>

    @GET(ApiPath.GET_LIST_MV)
    suspend fun getListMv(
        @Query("id") id: String,
        @Query("page") page: Number? = 1,
        @Query("count") count: Number? = 10,
        @Query("sort") sort: MvSort = MvSort.LISTEN,
        @Query("type") type: String? = "genre",
        @Query("sig") sig: String,
    ): Response<Any>

    @GET(ApiPath.GET_CATEGORY_MV)
    suspend fun getCategoryMv(
        @Query("id") id: String,
        @Query("type") type: String? = "video",
        @Query("sig") sig: String,
    ): Response<Any>

    @GET(ApiPath.GET_MV)
    suspend fun getMv(
        @Query("id") mvId: String,
        @Query("sig") sig: String,
    ): Response<Any>

    @GET(ApiPath.GET_PLAYLIST)
    suspend fun getPlaylist(
        @Query("id") playlistId: String,
        @Query("sig") sig: String,
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingPlaylistResponse>

    @GET(ApiPath.GET_SUGGEST_PLAYLIST)
    suspend fun getSuggestPlaylist(
        @Query("id") playlistId: String,
        @Query("sig") sig: String,
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingSuggestPlaylistResponse>

    @GET(ApiPath.GET_EVENT)
    suspend fun getEvent(
        @Query("sig") sig: String,
    ): Response<Any>

    @GET(ApiPath.GET_EVENT_INFO)
    suspend fun getEventInfo(
        @Query("id") eventId: String,
        @Query("sig") sig: String,
    ): Response<Any>

    @GET(ApiPath.SEARCH_ALL)
    suspend fun searchAll(
        @Query("q") keyword: String,
        @Query("sig") sig: String,
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingSearchAllResponse>

    @GET(ApiPath.SEARCH_BY_TYPE)
    suspend fun searchByType(
        @Query("q") keyword: String,
        @Query("type") type: SearchType,
        @Query("page") page: Number? = 1,
        @Query("count") count: Number? = 18,
        @Query("sig") sig: String,
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingSearchByTypeResponse>

    @GET(ApiPath.GET_RECOMMEND_KEYWORD)
    suspend fun getRecommendKeyword(
        @Query("sig") sig: String,
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingGetRecommendKeywordResponse>

    @GET(ApiPath.GET_SUGGEST_KEYWORD)
    suspend fun getSuggestKeyword(
        @Query("num") num: String? = "10",
        @Query("query") keyword: String,
        @Query("language") language: String? = "vi",
        @Query("sig") sig: String,
    ): Response<com.youthtech.rhythmify.data.network.dto.ZingSuggestKeywordResponse>
}