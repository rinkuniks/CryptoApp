package com.nikhil.cryptoapp.domain.repository

import com.nikhil.cryptoapp.data.remote.dto.CoinDetailDto
import com.nikhil.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}
