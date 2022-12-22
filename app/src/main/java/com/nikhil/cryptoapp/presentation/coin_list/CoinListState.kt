package com.nikhil.cryptoapp.presentation.coin_list

import com.nikhil.cryptoapp.domain.models.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
