package br.com.db1.cidade.cidadeapi.repository;

import java.util.List;

import org.aspectj.lang.annotation.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.db1.cidade.cidadeapi.model.Cidade;
import br.com.db1.cidade.cidadeapi.model.Uf;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CidadeRepositoryTest {
	
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@org.junit.After
	public void after() {
		cidadeRepository.deleteAll();
	}
	
	
	
	@Test
	public void deveSalvarUmaNovaCidade() {
		Cidade cidade = new Cidade ("Maringa", Uf.PR);
		cidadeRepository.save(cidade);
		
		List<Cidade> cidades = cidadeRepository.findAll();
		
		Cidade cidadeSalva = cidades.get(0);
		Assert.assertEquals(cidade.getNome(), cidadeSalva.getNome());
	}

}
