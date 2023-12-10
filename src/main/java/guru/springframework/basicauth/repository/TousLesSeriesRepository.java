package guru.springframework.basicauth.repository;


import guru.springframework.basicauth.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TousLesSeriesRepository extends JpaRepository<Series, Long> {

    @Query(value = "Select * from (Select * from Serie1 union select * from Serie2) where id = :IDKEY", nativeQuery = true)
    List<Series> findMyQuery(@Param("IDKEY") Long monPropreQuery);

    @Query(value = "Select * from Serie1 where id = :IDKEY", nativeQuery = true)
    Series findMyQuery3(@Param("IDKEY") Long monPropreQuery);


    @Query(value = "Select * from Serie1 where id >=:IDKEYLOWER and id <= :IDKEYHIGHER", nativeQuery = true)
    List<Series> findMyQuery2(@Param("IDKEYLOWER") Long idKeyLower, @Param("IDKEYHIGHER") Long idKeyHigher );




}
