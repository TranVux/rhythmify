package com.youthtech.rhythmify.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.youthtech.rhythmify.data.dto.Artist
import com.youthtech.rhythmify.data.dto.Composer
import com.youthtech.rhythmify.data.dto.Genre
import com.youthtech.rhythmify.data.dto.PreviewInfo

@Entity
data class Song(
    @PrimaryKey val encodeId: String,
    val title: String,
    val alias: String,
    val artistsNames: String,
// val artists: List<Artist>,
    val thumbnailM: String,
    val link: String,
    val thumbnail: String,
    val duration: Long,
    val releaseDate: Long,
    val genreIds: List<String>,
    val distributor: String,
    val streamingStatus: Long,
    val hasLyric: Boolean,
// val genres: List<Genre>,
// val composers: List<Composer>,
    val album: Album,
    val like: Long,
    val listen: Long,
    val liked: Boolean,
    val comment: Long,
)