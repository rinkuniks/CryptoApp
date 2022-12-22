package com.nikhil.cryptoapp.data.repository

import com.nikhil.cryptoapp.data.remote.CoinPaprikaApi
import com.nikhil.cryptoapp.data.remote.dto.CoinDetailDto
import com.nikhil.cryptoapp.data.remote.dto.CoinDto
import com.nikhil.cryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}