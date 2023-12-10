package guru.springframework.basicauth.controller;

import guru.springframework.basicauth.model.Series;
import guru.springframework.basicauth.model.TousLesFilms;
import guru.springframework.basicauth.repository.TousLesSeriesRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class SeriesController {

    private TousLesSeriesRepository tousLesSeriesRepository;

    public SeriesController(TousLesSeriesRepository tousLesSeriesRepository) {
        this.tousLesSeriesRepository = tousLesSeriesRepository;
    }

    @GetMapping("/series/all")
    public ResponseEntity<List<Series>> getUsers() throws IOException {

        return ResponseEntity.ok(this.tousLesSeriesRepository.findAll());
    }

    @GetMapping("/series/one/{id}")
    public ResponseEntity<List<Series>> getUsers2(@PathVariable(value = "id") long id) throws IOException {

        return ResponseEntity.ok(this.tousLesSeriesRepository.findMyQuery(id));
    }

    @GetMapping("/series/ones/{id}")
    public ResponseEntity<String> getUsers3(@PathVariable(value = "id") long id) throws IOException {

        return ResponseEntity.ok(this.tousLesSeriesRepository.findMyQuery3(id).toString());
    }

    @GetMapping("/series/range/{idKeyLower}&{idKeyHigher}")
    public ResponseEntity<List<Series>> getUsers3(@PathVariable(value = "idKeyLower") long id1, @PathVariable(value = "idKeyHigher") long id2) throws IOException {

        return ResponseEntity.ok(this.tousLesSeriesRepository.findMyQuery2(id1,id2));
    }

}
