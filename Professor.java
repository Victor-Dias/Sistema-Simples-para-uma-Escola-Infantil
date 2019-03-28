package ifpb.escola;
public class Professor extends Pessoa {

  // Atributos de instância
  private String especialidade;
  private String nomeEscola;
  private double salario;

  // Construtor
  public Professor(String especialidade, String nomeEscola, double salario) {
  this.especialidade = especialidade;
  if ( !this.nomeEscola.equals("") )
  this.nomeEscola = nomeEscola;
  this.salario = salario;
  }

  public Professor() {
  }

  public String getEspecialidade() {
  return especialidade;
  }

  public void setEspecialidade(String especialidade) {
  this.especialidade = especialidade;
  }

  public String getNomeEscola() {
  return nomeEscola;
  }

  public void setNomeEscola(String nomeEscola) {
  this.nomeEscola = nomeEscola;
  }

  public double getSalario() {
  return salario;
  }

  public void setSalario(double salario) {
  this.salario = salario;
  }

  @Override
  public String toString (){
  return super.toString()+
  "\nMateria lecionada: "+this.getEspecialidade()+
  "\nNome da Escola: "+this.getNomeEscola()+
  "\nSalario: "+this.getSalario();
  }

}
