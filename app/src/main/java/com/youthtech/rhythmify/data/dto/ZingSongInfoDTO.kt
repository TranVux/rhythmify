package com.youthtech.rhythmify.data.dto
import com.google.gson.annotations.SerializedName

data class ZingSongInfoResponse(
    val err: Long,
    val msg: String,
    val data: ZingSongInfoData,
    val timestamp: Long,
)

data class ZingSongInfoData(
    val encodeId: String,
    val title: String,
    val alias: String,
    val isOffical: Boolean,
    val username: String,
    val artistsNames: String,
    val artists: List<Artist>,
    val isWorldWide: Boolean,
    val thumbnailM: String,
    val link: String,
    val thumbnail: String,
    val duration: Long,
    val zingChoice: Boolean,
    val isPrivate: Boolean,
    val preRelease: Boolean,
    val releaseDate: Long,
    val genreIds: List<String>,
    val distributor: String,
    val indicators: List<Any?>,
    val isIndie: Boolean,
    val mvlink: String,
    val streamingStatus: Long,
    val allowAudioAds: Boolean,
    val hasLyric: Boolean,
    val userid: Long,
    val genres: List<Genre>,
    val composers: List<Composer>,
    val album: Album,
    @SerializedName("isRBT")
    val isRbt: Boolean,
    val like: Long,
    val listen: Long,
    val liked: Boolean,
    val comment: Long,
)






