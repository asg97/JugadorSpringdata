package com.daw.basquet.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public void crearEquipo () {

        Equipo unicaja = new Equipo("unicaja", "malaga", LocalDate.of(1995, 8, 8));
        Equipo baskonia = new Equipo("Baskonia", "vitoria", LocalDate.of(1995, 8, 8));
        Equipo estudiantes = new Equipo("estudiantes", "madrid", LocalDate.of(1995, 8, 8));
        Equipo dkv = new Equipo("dkv", "badalona", LocalDate.of(1995, 8, 8));
        Equipo lagunaro = new Equipo("laguna aro", "Florida", LocalDate.of(1995, 8, 8));

        equipoRepository.save(unicaja);
        equipoRepository.save(baskonia);
        equipoRepository.save(estudiantes);
        equipoRepository.save(dkv);
        equipoRepository.save(lagunaro);

    }

    public void consultasEquipos () {

        System.out.println("Lista de equipos de estudiantes");
        for (Equipo listaEquipos : equipoRepository.findEquipoByLocalidad("madrid")) {
            System.out.println(listaEquipos);
        }

//			System.out.println("Lista de jugadores de Los lakers");
//
//			for (Equipo listaJugadores : equipoRepository.findByNombreEquipo("Lakers")) {
//				System.out.println(listaJugadores);
//			}


    }
}
