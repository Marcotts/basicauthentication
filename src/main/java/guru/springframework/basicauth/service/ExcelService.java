package guru.springframework.basicauth.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import guru.springframework.basicauth.model.TousLesFilms;
import guru.springframework.basicauth.repository.TousLesFilmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;



@Service
public class ExcelService {

    @Autowired
    TousLesFilmsRepository repository;

    public void save(MultipartFile file) throws FileNotFoundException {

        FileInputStream file2 = new FileInputStream("classpath:Mes Films V5.02.xlsm");

    }

    public List<TousLesFilms> getAllTutorials() {
        return repository.findAll();
    }
}
