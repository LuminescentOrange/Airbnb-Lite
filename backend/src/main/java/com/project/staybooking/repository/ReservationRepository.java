package com.project.staybooking.repository;

import com.project.staybooking.model.Reservation;
import com.project.staybooking.model.Stay;
import com.project.staybooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * @Description
 * @date
 */
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByGuest(User guest);

    List<Reservation> findByStay(Stay stay);

    Reservation findByIdAndGuest(Long id, User guest); //使用jpa要满足他的命名格式findBy

    List<Reservation> findByStayAndCheckoutDateAfter(Stay stay, LocalDate date);

}

