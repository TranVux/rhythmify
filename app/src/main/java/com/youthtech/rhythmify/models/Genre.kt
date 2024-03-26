package com.youthtech.rhythmify.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Genre (
   @PrimaryKey val id: String,
    val name: String,
    val title: String,
    val alias: String,
)
