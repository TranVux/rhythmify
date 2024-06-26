package com.youthtech.rhythmify.data.dto


data class ZingGetWeekChartResponse(
    val err: Long,
    val msg: String,
    val data: ZingGetWeekChartData,
    val timestamp: Long,
)

data class ZingGetWeekChartData(
    val banner: String,
    val playlistId: String,
    val chartId: Long,
    val cover: String,
    val country: String,
    val type: String,
    val group: List<WeekChartGroup>,
    val link: String,
    val week: Long,
    val year: Long,
    val latestWeek: Long,
    val startDate: String,
    val endDate: String,
    val items: List<WeekChartItem>,
    val sectionId: String,
)

data class WeekChartItem(
    val encodeId: String,
    val title: String,
    val alias: String,
    val isOffical: Boolean,
    val username: String,
    val artistsNames: String,
    val artists: List<Artist>,
    val isWorldWide: Boolean,
    val previewInfo: PreviewInfo,
    val thumbnailM: String,
    val link: String,
    val thumbnail: String,
    val duration: Long,
    val zingChoice: Boolean,
    val isPrivate: Boolean,
    val preRelease: Boolean,
    val releaseDate: Long,
    val genreIds: List<String>,
    val album: Album,
    val distributor: String,
    val indicators: List<Any?>,
    val isIndie: Boolean,
    val streamingStatus: Long,
    val allowAudioAds: Boolean,
    val hasLyric: Boolean,
    val rakingStatus: Long,
    val score: Long,
    val downloadPrivileges: List<Long>?,
    val mvlink: String?,
)




