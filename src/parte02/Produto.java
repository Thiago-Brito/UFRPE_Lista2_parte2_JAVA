package parte02;

public class Produto {
      private double valor;
      private int quantidade;
      private String descricao;
      
      public Produto(double valor,int quantidade, String descricao) {
    	  this.valor = valor;
    	  this.quantidade = quantidade;
    	  this.descricao = descricao;
      }
      
      public double calcularTotal() {
    	  return this.valor * this.quantidade;
      }

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
