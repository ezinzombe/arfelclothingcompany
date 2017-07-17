package zw.co.arfel.clothing.serviceImpl;


import org.springframework.stereotype.Service;
import zw.co.arfel.clothing.model.Advert;
import zw.co.arfel.clothing.repository.AdvertRepository;
import zw.co.arfel.clothing.service.AdvertService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class AdvertServiceImpl implements AdvertService {
    @Resource
    private AdvertRepository advertRepository;
    @Override
    public Advert save(Advert advert) {
        return advertRepository.save(advert);
    }

    @Override
    public Optional<Advert> findOne(Long id) {
        return null;
    }

    @Override
    public Optional<List<Advert>> findAll() {
        return Optional.ofNullable((List<Advert>)advertRepository.findAll());
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Boolean checkDuplicate(Advert advert) {
        return null;
    }
}
