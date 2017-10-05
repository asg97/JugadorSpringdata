package com.daw.basquet.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.time.LocalDate;
import org.springframework.data.domain.PageRequest;
import java.util.Arrays;
@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository EquipoRepository;




    public void testJugador(){

        Jugador ibrahim = new Jugador(
                "Ibrahim",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(ibrahim);

        Jugador melon = new Jugador(
                "melon",
                LocalDate.of(1991,1,9),
                5,
                6,
                9,
                "base"
        );

        jugadorRepository.save(melon);

        Jugador apple = new Jugador(
                "apple",
                LocalDate.of(1991,1,9),
                5,
                6,
                9,
                "pivot"
        );

        jugadorRepository.save(apple);

        Jugador tj = new Jugador(
                "tj",
                LocalDate.of(1991,1,9),
                5,
                6,
                9,
                "ala-pivot"
        );

        jugadorRepository.save(tj);

        Jugador mj = new Jugador(
                "mj",
                LocalDate.of(1991,1,9),
                5,
                6,
                9,
                "escolta"
        );

        jugadorRepository.save(mj);

        Jugador lj = new Jugador(
                "lj",
                LocalDate.of(1991,1,9),
                10,
                2,
                5,
                "escolta"
        );

        jugadorRepository.save(lj);

        Jugador jugador1 = new Jugador(
                "jugador1",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador(
                "jugador2",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador(
                "jugador3",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador(
                "jugador4",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador4);

        Jugador jugador5= new Jugador(
                "jugador5",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador(
                "jugador6",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador6);

        Jugador jugador7 = new Jugador(
                "jugador7",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador7);

        Jugador jugador8 = new Jugador(
                "jugador8",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador8);

        Jugador jugador9 = new Jugador(
                "jugador9",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador(
                "jugador10",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador10);

        Jugador jugador11 = new Jugador(
                "jugador11",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador11);

        Jugador jugador12 = new Jugador(
                "jugador12",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador12);

        Jugador jugador13 = new Jugador(
                "jugador13",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador13);

        Jugador jugador14 = new Jugador(
                "jugador14",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador14);

        Jugador jugador15 = new Jugador(
                "jugador15",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador15);

        Jugador jugador16 = new Jugador(
                "jugador16",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador16);

        Jugador jugador17 = new Jugador(
                "jugador17",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador17);

        Jugador jugador18 = new Jugador(
                "jugador18",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador18);

        Jugador jugador19 = new Jugador(
                "jugador19",
                LocalDate.of(1991,1,9),
                8,
                8,
                8,
                "alero"
        );

        jugadorRepository.save(jugador19);

        Jugador[] jugadores  = {
                ibrahim,melon,apple,tj,mj,lj,jugador1,
                jugador2,jugador3,jugador4,jugador5,jugador6,jugador7,jugador8,jugador9,jugador10,
                jugador11,jugador12,jugador13,jugador14,jugador15,jugador16,jugador17,jugador18,jugador19
        };

        for (int i = 0; i < jugadores.length; i++) {
            if (i < 5)
                jugadores[i].setEquipo(EquipoRepository.findOne(1L));
            else if (i >= 5 && i <10)
                jugadores[i].setEquipo(EquipoRepository.findOne(2L));
            else if (i >=10 && i < 15)
                jugadores[i].setEquipo(EquipoRepository.findOne(3L));
            else if (i >= 15 && i <20)
                jugadores[i].setEquipo(EquipoRepository.findOne(4L));
            else if (i >=20 && i <25)
                jugadores[i].setEquipo(EquipoRepository.findOne(5L));
        }

        jugadorRepository.save(Arrays.asList(jugadores));

    }


    public void consultasJugadores () {

        System.out.println("Jugadores con el nombre Martin");
        for (Jugador jugador: jugadorRepository.findByNombre("Martin")) {
            System.out.println(jugador);
        }

        System.out.println("Jugadores con el número de canastas mayor o iguales que 5");
        for (Jugador jugador: jugadorRepository.findByNumCanastasGreaterThanEqual(5)) {
            System.out.println(jugador);
        }

        System.out.println("Jugador con número de canastas entre 5 y 8");
        for (Jugador jugador: jugadorRepository.findByNumCanastasBetween(5, 8)) {
            System.out.println(jugador);
        }

        System.out.println("Jugadores cuya posición es Delantero");
        for (Jugador jugador: jugadorRepository.findByPosicion("delantero")) {
            System.out.println(jugador);
        }

        System.out.println("Jugadores que nacieron antes del 1995/07/28");
        for (Jugador jugador: jugadorRepository.findByFechaNacimientoBefore(LocalDate.of(1995, 7, 28))) {
            System.out.println(jugador);
        }

        List<Object[]> aaa = jugadorRepository.findMediaAgrupados();

        System.out.println("Media de posiciones agrupados por posicion: ");
        for (Object[] stat: aaa) {
            System.out.println("Posición: "+ stat[3]);
            System.out.println("Número asistencias Media: "+ stat[0]);
            System.out.println("Número canastas Media: "+ stat[1]);
            System.out.println("Número rebotes Media: "+ stat[2]);
        }

        System.out.println("Maximo y minimo de estadisticas: ");
        List<Object[]> lista = jugadorRepository.findMaximoMinimoStats();

        for(Object[] minmax: lista) {
            for(Object minmaxx: minmax) {
                System.out.println(minmaxx);
            }
        }

        System.out.println("Lista de jugadores de lakers");
        for(Jugador aa: jugadorRepository.findByEquipoNombreEquipo("Lakers")) {
            System.out.println(aa);
        }


        System.out.println("Lista de jugadores de Los Lakers que son PORTEROS");
        for (Jugador jugador : jugadorRepository.findByEquipoNombreEquipoAndPosicionEquals("Lakers", "portero")) {
            System.out.println(jugador);
        }


        System.out.println("**************** JUGADOR CON MÁS CANASTAS DEL EQUIPO LAKERS ****************");
        System.out.println(jugadorRepository.findJugadorByEquipoAndMaxCanastas("Lakers", new PageRequest(0, 1))); ;
        System.out.println("****************************************************");













    }

}




