package guru.springframework.basicauth.repository;


import guru.springframework.basicauth.model.TousLesFilms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TousLesFilmsRepository extends JpaRepository<TousLesFilms, Long> {

    @Query(value = "Select * from TousLesFilms where id = :IDKEY", nativeQuery = true)
    List<TousLesFilms> findMyQuery(@Param("IDKEY") Long monPropreQuery);

    @Query(value = "Select * from TousLesFilms where ANNEE = 2022", nativeQuery = true)
    List<TousLesFilms> findAllMyAll();

    @Query(value = "Select \"TitreFrancais\" from TousLesFilms where id = :IDKEY", nativeQuery = true)
    String findMyQuery3(@Param("IDKEY") Long monPropreQuery);


    @Query(value = "Select * from TousLesFilms where id >=:IDKEYLOWER and id <= :IDKEYHIGHER", nativeQuery = true)
    List<TousLesFilms> findMyQuery2(@Param("IDKEYLOWER") Long idKeyLower, @Param("IDKEYHIGHER") Long idKeyHigher );




}
