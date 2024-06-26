package com.youthtech.rhythmify.data.dto

import com.google.gson.annotations.SerializedName

data class ZingGetArtistResponse(
    val err: Long,
    val msg: String,
    val data: ZingGetArtistData,
    val timestamp: Long,
)

data class ZingGetArtistData(
    val id: String,
    val name: String,
    val link: String,
    val spotlight: Boolean,
    val alias: String,
    val playlistId: String,
    val cover: String,
    val thumbnail: String,
    val biography: String,
    val sortBiography: String,
    val thumbnailM: String,
    val national: String,
    val birthday: String,
    val realname: String,
    val totalFollow: Long,
    val follow: Long,
    val awards: List<String>,
    val oalink: String,
    val oaid: Long,
    val sections: List<Section>,
    val sectionId: String,
    val isOAbrand: Boolean,
    val tabs: List<Long>,
    val hasOA: Boolean,
)

data class Section(
    val sectionType: String,
    val viewType: String,
    val title: String,
    val link: String,
    val sectionId: String,
    val items: List<ZingGetArtistItem>,
    val options: ZingGetArtistOptions?,
    val itemType: String?,
)

data class ZingGetArtistItem(
    val encodeId: String?,
    val title: String?,
    val alias: String?,
    val isOffical: Boolean?,
    val username: String?,
    val artistsNames: String?,
    val artists: List<Artist>?,
    val isWorldWide: Boolean?,
    val thumbnailM: String,
    val link: String,
    val thumbnail: String,
    val duration: Long?,
    val zingChoice: Boolean?,
    val isPrivate: Boolean?,
    val preRelease: Boolean?,
    val releaseDate: Any?,
    val genreIds: List<String>?,
    val album: Album?,
    val distributor: String?,
    val indicators: List<Any?>?,
    val isIndie: Boolean?,
    val mvlink: String?,
    val streamingStatus: Long?,
    val allowAudioAds: Boolean?,
    val hasLyric: Boolean?,
    val radioId: Long?,
    val previewInfo: PreviewInfo?,
    val isoffical: Boolean?,
    val sortDescription: String?,
    val releasedAt: Long?,
    @SerializedName("PR")
    val pr: Boolean?,
    val playItemMode: Long?,
    val subType: Long?,
    val uid: Long?,
    val isShuffle: Boolean?,
    val userName: String?,
    val isAlbum: Boolean?,
    val textType: String?,
    val isSingle: Boolean?,
    val releaseDateText: String?,
    val artist: Artist?,
    val id: String?,
    val name: String?,
    val spotlight: Boolean?,
    val isOA: Boolean?,
    val isOAbrand: Boolean?,
    val playlistId: String?,
    val totalFollow: Long?,
)


data class ZingGetArtistOptions(
    val artistId: String,
)

