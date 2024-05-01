package TrabalhoA3.unisul.service.Impl;

import TrabalhoA3.unisul.entity.Carro;
import TrabalhoA3.unisul.repositories.CarroRepository;
import TrabalhoA3.unisul.service.CarroService;
import org.springframework.stereotype.Service;

@Service
public class CarroServiceImpl implements CarroService {

    private CarroRepository repository;

    public CarroServiceImpl(CarroRepository repository) {
        this.repository = repository;
    }


    @Override
    public void save(Carro carro) {

    }
}
