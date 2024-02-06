import java.util.ArrayList;
import java.util.Scanner;

public class ListaCursoProfessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> listaCursos = new ArrayList<>();
        ArrayList<String> listaProfessores = new ArrayList<>();
        ArrayList<String> listaCursosConcluidos = new ArrayList<>();
        
        System.out.println("Bem vindo a lista de Cursos e Professores!");
        
        int opcao;
        int opcaoLista;
        int opcaoAdicionar;
        int opcaoRemover;
        int indice;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Listar");
            System.out.println("2 - Adicionar");
            System.out.println("3 - Marcar curso como conluído");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("Escolha uma opção:");
                    System.out.println("1- Listar cursos");
                    System.out.println("2- Listar professores");
                    System.out.println("3- Listar cursos concluídos");
                    opcaoLista = entrada.nextInt();
                    entrada.nextLine();
                    
                    switch (opcaoLista) {
                        case 1:
                            System.out.println("Cursos: ");
                            listarItens(listaCursos);
                            break;
                        case 2:
                            System.out.println("Professores");
                            listarItens(listaProfessores);
                            break;
                        case 3:
                            System.out.println("Cursos concluídos: ");
                            listarItens(listaCursosConcluidos);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Escolha uma opção:");
                    System.out.println("1- Adicionar curso");
                    System.out.println("2- Adicionar professor");
                    opcaoAdicionar = entrada.nextInt();
                    entrada.nextLine();
                    
                    switch (opcaoAdicionar){
                        case 1:
                            System.out.println("Informe o nome do curso: ");
                            String curso = entrada.nextLine();
                            adicionarItem(listaCursos, curso);
                            System.out.println("Curso adicionado com sucesso!");
                            break;
                        case 2:
                            System.out.println("Informe o nome do professor: ");
                            String professor = entrada.nextLine();
                            adicionarItem(listaProfessores, professor);
                            System.out.println("Professor adicionado com sucesso!");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 3:
                    marcarComoConcluido(listaCursos, listaCursosConcluidos, entrada);
                    break;
                case 4:
                    System.out.println("Escolha uma opção:");
                    System.out.println("1- Remover curso");
                    System.out.println("2- Remover professor");
                    opcaoRemover = entrada.nextInt();
                    entrada.nextLine();
                    
                    switch (opcaoRemover) {
                        case 1:
                            indice = listaPedirIndice(listaCursos, entrada);
                            removerItemLista(listaCursos, indice);
                            break;
                        case 2:
                            indice = listaPedirIndice(listaProfessores, entrada);
                            removerItemLista(listaCursos, indice);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa. Aqui está a lista de cursos e professores:");
                    System.out.println("Cursos");
                    listarItens(listaCursos);
                    System.out.println();
                    System.out.println("Professores");
                    listarItens(listaProfessores);
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
        entrada.close();
        
    }
    
    public static void adicionarItem(ArrayList<String> lista, String item) {
        lista.add(item);
    }
    
    public static void listarItens(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++ ) {
            String item = lista.get(i);
            System.out.println(i + " - " + item);
        }
    }
    
    public static int listaPedirIndice(ArrayList<String> lista, Scanner entrada) {
        listarItens(lista);
        
        System.out.println("Escolha o índice: ");
        return entrada.nextInt();
    }
    
    public static void removerItem(ArrayList<String> lista, int indice) {
        if (indice >= 0 && indice <= lista.size()) {
            lista.remove(indice);
            System.out.println("Item removido!");
        } else {
            System.out.println("O índice passado não existe!");
        }
    }
    
    public static void removerItemLista(ArrayList<String> lista, int indice) {
        removerItem(lista, indice);
    }
    
    public static void marcarComoConcluido(ArrayList<String> listaCursos, ArrayList<String> listaCursosConcluidos, Scanner entrada) {
        int indice = listaPedirIndice(listaCursos, entrada);
        
        if (indice >= 0 && indice <= listaCursos.size()) {
            String cursoConcluido = listaCursos.get(indice);
            listaCursosConcluidos.add(cursoConcluido);
            System.out.println("Curso marcado como conluído!");
            removerItem(listaCursos, indice);
        } else {
            System.out.println("O índice passado não existe!");
        }
    }
}

