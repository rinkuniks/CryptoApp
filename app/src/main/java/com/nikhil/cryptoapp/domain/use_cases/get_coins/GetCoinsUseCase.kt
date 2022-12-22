package com.nikhil.cryptoapp.domain.use_cases.get_coins

import com.nikhil.cryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {

}