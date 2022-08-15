package com.rsstudio.networkcalling.model

data class Pagination(
    val has_next_page: Boolean,
    val items: Items,
    val last_visible_page: Int,
    val current_page: Int
)