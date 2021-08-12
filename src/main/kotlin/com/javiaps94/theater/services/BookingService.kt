package com.javiaps94.theater.services

import com.javiaps94.theater.domain.Seat
import org.springframework.stereotype.Service

@Service
class BookingService {
    fun isSeatFree(seat: Seat): Boolean {
        return true;
    }
}