package ynov.main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import ynov.main.Entity.Pouvoir;
import ynov.main.Entity.PouvoirRepository;
import ynov.main.Entity.Dto.CreatePouvoirDto;

@Service
public class PouvoirService {
    @Autowired
    private PouvoirRepository pouvoirRepository;

    public Pouvoir createPower(CreatePouvoirDto dto) {
        Pouvoir p = new Pouvoir();
        long nb = pouvoirRepository.findAll().size();
        p.setId(nb);
        p.setName(dto.getName());
        return pouvoirRepository.save(p);
    }

    public List<Pouvoir> getAllPowers() {
        return pouvoirRepository.findAll();
    }

    public Pouvoir findById(@Valid Long pouvoirId) {
        return pouvoirRepository.findById(pouvoirId).get();
    }
}
