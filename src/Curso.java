public class Curso {
    
    public String nome = "Back-end";
    public String descricao = "No curso de back-end você aprenderá a usar Java";
    public String professores = "Gabriel e André";
    public int cargaHoraria = 300;
    
    
    public void progresso() {
        System.out.println("Você já atingiu 30% de conclusão!");
    }
    
    public void notas() {
        System.out.println("Nota 1: 8,5");
        System.out.println("Nota 2: 6,5");
        System.out.println("Nota 3: 9,5");
    }
    
    public void participacao() {
        System.out.println("Você participou de: 10 aulas de um total de 12 aulas");
    }
}
