package ifpb.escola;
public class Aluno extends Pessoa {

  // Atributos de instãncia
  private String matricula;
  private String tipoAluno;
  private String classe;
  private String nomeEscola;

  // Construtor
  public Aluno(String matricula, String tipoAluno, String classe, String nomeEscola,
  String nome, String sobreNome, String ultimoNome, int dia, int mes, int ano,
  String rg) {
  super(nome, sobreNome, ultimoNome, dia, mes, ano, rg);
  this.matricula = matricula;
  this.tipoAluno = tipoAluno;
  this.classe = classe;
  if ( !this.nomeEscola.equals("") )
  this.nomeEscola = nomeEscola;
  }

  public Aluno() {
  }

  // Métodos GET e SET
  public String getMatricula() {
  return matricula;
  }

  public void setMatricula(String matricula) {
  this.matricula = matricula;
  }

  public String getTipoAluno() {
  return tipoAluno;
  }

  public void setTipoAluno(String tipoAluno) {
  this.tipoAluno = tipoAluno;
  }

  public String getClasse() {
  return classe;
  }

  public void setClasse(String classe) {
  this.classe = classe;
  }

  public String getNomeEscola() {
  return nomeEscola;
  }

  public void setNomeEscola(String nomeEscola) {
  this.nomeEscola = nomeEscola;
  }

  @Override
  public String toString (){
  return super.toString()+
  "\nNumero de Matricula: " + this.getMatricula() +
  "\nTipo de Aluno: " + this.getTipoAluno() +
  "\nClasse: " + this.getClasse();
  }

} 
