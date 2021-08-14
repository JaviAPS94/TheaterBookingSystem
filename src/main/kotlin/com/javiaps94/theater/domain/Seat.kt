package com.javiaps94.theater.domain

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Seat(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                val id: Long,
                val row: Char,
                val num: Int,
                val price: BigDecimal,
                val description: String) {
    override fun toString(): String = "Seat $row-$num $$price ($description)"
}