package com.nikhil.cryptoapp.presentation.coin_detail

import com.nikhil.cryptoapp.domain.models.Coin
import com.nikhil.cryptoapp.domain.models.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail?= null,
    val error: String = ""
)
