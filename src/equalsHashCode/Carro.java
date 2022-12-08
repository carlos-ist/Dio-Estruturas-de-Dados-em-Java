package equalsHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carro {

	String marca;

	public String getMarca() {
		return marca;
	}

	public Carro(String marca) {
		this.marca = marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca); // Retorna um hash de acordo com o parâmetro marca.
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // É testado primeiro se a referência de memória do objeto é igual.
			return true;
		if (obj == null) // Se o objeto é nulo.
			return false;
		if (getClass() != obj.getClass()) // Se são objetos da mesma classe.
			return false;
		Carro other = (Carro) obj; // Por fim é feito um cast para a classe do objeto que está chamando o método.
		return Objects.equals(marca,
				other.marca); /*
								 * Por fim, recursivamente, o método equals é exetudado e retorna um booleano de
								 * acordo com o critério de comparação, neste caso, pelo atributo 'marca'
								 */
	}

	public static void main(String[] args) {

		List<Carro> listaCarro = new ArrayList<>();

		listaCarro.add(new Carro("Ford"));
		listaCarro.add(new Carro("Chevrolet"));
		listaCarro.add(new Carro("Volkswagen"));

		System.out.println(listaCarro.contains(
				new Carro("Ford"))); 	/*
										 * Para esse contains funcionar, possivelmente ele usará o método
										 * equals-hashcode que foi sobreescrito na classe carro, para saber qual o
										 * critério de igualdade para poder comparar dois objetos do tipo carro.
										 */
		
		// HashCodes
		System.out.println(new Carro("Ford").hashCode()); // Observando o hashCode gerado para um objeto Carro, de marca "Ford".
		System.out.println(new Carro("Ford").hashCode()); // Incluindo nova instância para observar o hashCode.
		System.out.println(new Carro("Ford1").hashCode()); // Gerando uma nova instância com nome parecido para observar o novo hashCode
		
		//Equals
		
		Carro car1 = new Carro("Ford");
		Carro car2 = new Carro("Chevrolet");
		
		System.out.println(car1.equals(car2));
		System.out.println(car1.equals(new Carro("Ford")));

	}

}
