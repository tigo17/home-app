package com.concrete.HomeApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.concrete.HomeApp.models.Cliente;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class HomeAppApplicationTests {

	@Test
	@DisplayName("Quando eu passar um CPF válido o valor precisa ser verdadeiro")
	void paraValidarCPF() {
		Cliente cliente = new Cliente("Tiago", "33219274897");
		assertEquals(true, cliente.validarCPF());
	}
	@Test
	@DisplayName("Quando eu passar um CPF inválido o valor precisa ser falso")
	void paraValidarCPFInvalido() {
		Cliente cliente = new Cliente("Tiago", "33219274800");
		assertEquals(false, cliente.validarCPF());
	}
	@Test
	@DisplayName("Quando eu passar um CPF válido formatado o valor precisa ser verdadeiro")
	void paraValidarCPF_Formatado() {
		Cliente cliente = new Cliente("Tiago", "332.192.748-97");
		assertEquals(true, cliente.validarCPF());
	}
	@Test
	@DisplayName("Quando eu passar um CPF inválido formatado o valor precisa ser falso")
	void paraValidarCPFInvalido_Formatado() {
		Cliente cliente = new Cliente("Tiago", "332.192.748-00");
		assertEquals(false, cliente.validarCPF());
	}
	@Test
	@DisplayName("Quando eu passar um CPF nulo o valor precisa ser falso")
	void paraValidarCPFNulo() {
		Cliente cliente = new Cliente("Tiago", null);
		assertEquals(false, cliente.validarCPF());
	}


	//@Test
	//@DisplayName("Quando eu passar um cpf válido o valor precisa ser verdadeiro")
	//void paraValidarCPF() {
		//Cliente leandro = new Cliente("Leandro Santos", "43545768058");
	//	Cliente leandro = new Cliente();
	//	leandro.setNome("Leandro Santos");
	//	leandro.setCpf("43545768058");
	//	assertEquals(true, leandro.validarCPF());
	//}


}

