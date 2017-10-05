package com.daw.basquet.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDate;
import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo,Long> {

    List<Equipo> findEquipoByLocalidad(String localidad);



}
