package br.com.geradorFrases.screenmatchfrases.service;

import br.com.geradorFrases.screenmatchfrases.Frase;
import br.com.geradorFrases.screenmatchfrases.dto.FraseDTO;
import br.com.geradorFrases.screenmatchfrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repositorio;
    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
