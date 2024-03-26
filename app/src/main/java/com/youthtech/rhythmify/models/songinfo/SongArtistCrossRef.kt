package com.youthtech.rhythmify.models.songinfo

import androidx.room.Entity

@Entity(primaryKeys = ["songId", "artistId"])
data class SongArtistCrossRef (
    val songId: String,
    val artistId: String
)