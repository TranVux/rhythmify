package com.youthtech.rhythmify.data.network.dto

data class ZingGetRecommendKeywordResponse(
    val err: Long,
    val msg: String,
    val data: List<com.youthtech.rhythmify.data.network.dto.ZingKeyword>,
    val timestamp: Long,
)

data class ZingKeyword(
    val keyword: String,
    val link: String,
)