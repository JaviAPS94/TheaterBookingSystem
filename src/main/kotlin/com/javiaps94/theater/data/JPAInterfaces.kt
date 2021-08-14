package com.javiaps94.theater.data

import com.javiaps94.theater.domain.Booking
import com.javiaps94.theater.domain.Performance
import com.javiaps94.theater.domain.Seat
import org.springframework.data.jpa.repository.JpaRepository

interface SeatRepository : JpaRepository<Seat, Long>

interface PerformanceRepository : JpaRepository<Performance, Long>

interface BookingRepository : JpaRepository<Booking, Long>