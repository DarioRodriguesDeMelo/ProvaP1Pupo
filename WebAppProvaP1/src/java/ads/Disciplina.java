package ads;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String ementa;
    private int ciclo;
    private double nota;

    public Disciplina(String nome, String ementa, int ciclo) {
        this.nome = nome;
        this.ementa = ementa;
        this.ciclo = ciclo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public static ArrayList<Disciplina> getList(){
        ArrayList<Disciplina> list = new ArrayList<>();
        list.add(new Disciplina("Nome 1", "Ementa 1", 4));
        list.add(new Disciplina("Nome 2", "Ementa 2", 4));
        list.add(new Disciplina("Nome 3", "Ementa 3", 4));
        list.add(new Disciplina("Nome 4", "Ementa 4", 4));
        return list;
    }
}

 /*disciplinas.add(new Disciplina("Gestão de Projetos","Definição de projeto segundo concepção difundida pelas melhores"
                                          +"práticas de gestão de projetos. Histórico do desenvolvimento do conjunto de"
                                          +"conhecimentos de gestão de projetos. Comparação ente o gerenciamento por projetos"
                                          +"com o gerenciamento tradicional. O ciclo de vida de um projeto. Os fatores"
                                          +"de sucesso e insucesso de projetos e sua mensuração. As nove de conhecimento para"
                                          +"a gestão de projetos e seus processos : Integração, Escopo, Tempo, Custo,"
                                          +"Qualidade, Recursos Humanos, Comunicações, Riscos e Aquisições.",5));
           disciplinas.add(new Disciplina("Banco de dados","Conceitos de Base de Dados. Modelos conceituais de informações. Modelos de Dados:"
                                          +"Relacional,  Redes e Hierárquicos. Modelagem de dados - conceitual, lógica e física. Teoria"
                                          +"relacional: dependências funcionais e multivaloradas, formas normais. Restrições de"
                                          +"integridade e de segurança em Banco de Dados Relacional. Sistemas Gerenciadores"
                                          +"de Banco de Dados – objetivo e funções. Linguagens de declaração e de manipulação de dados.",4));
           disciplinas.add(new Disciplina("Redes de computadores","Comunicação de Dados. Topologia e Características Físicas"
                                          +"de Redes. Redes Locais de Longa Distância. Redes de Alta Velocidade. Protocolos"
                                          +"e Serviços de Comunicação. Camadas de Sistemas Abertos. Sistemas Operacionais"
                                          +"de Redes. Interconexão de redes. Avaliação de Desempenho. Estrutura e Funcionamento"
                                          +"da Internet.",5));
           disciplinas.add(new Disciplina("Segurança da informação","Comunicação de Dados. Topologia e Características Físicas"
                                          +"de Redes. Redes Locais de Longa Distância. Redes de Alta Velocidade. Protocolos e "
                                          +"Serviços de Comunicação. Camadas de Sistemas Abertos. Sistemas Operacionais de Redes."
                                          +"Interconexão de redes. Avaliação de Desempenho. Estrutura e Funcionamento da Internet.",5));
           disciplinas.add(new Disciplina("Sistemas operacionais II","Apresentação de um sistema operacional específico utilizado"
                                          +"em ambiente corporativo. Requisitos de hardware para instalação do sistema. Processo "
                                          +"de instalação, personalização, operação, administração e segurança sobre o sistema"
                                          +"operacional focado.  Elaboração de projetos de seleção e implantação de um sistema"
                                          +"operacional.", 4 ));
           disciplinas.add(new Disciplina("Inglês","Aprofundamento da compreensão e produção oral e escrita por meio funções"
                                          +" sociais e estruturas mais complexas da língua. Ênfase na oralidade, atendendo às"
                                          +"especificidades acadêmico-profissionais da área e abordando aspectos sócio-culturais"
                                          +"da língua inglesa.",5));
           disciplinas.add(new Disciplina("Programação Linear","Desenvolver aplicativos. Matrizes. Sistemas Lineares. Programação"
                                          +"Linear: Método Gráfico e Método Simplex. Aplicações: Método do Transporte", 6));
           disciplinas.add(new Disciplina("laboratório de engenharia de software","Desenvolvimento de um software utilizando os"
                                          +"conhecimentos adquiridos ao longo do curso. A elaboração deve abordar as disciplinas"
                                          +"de requisitos, análise e projeto, implementação, implantação e gerência de projetos."
                                          +"O processo de desenvolvimento, assim como a técnica fica a critério de acordo entre"
                                          +"professor e aluno.",5 ));
           disciplinas.add(new Disciplina("Programação orientada a objetos","Conceitos e evolução da tecnologia de orientação a"
                                          +"objetos. Limitações e diferenças entre o paradigma da programação estruturada em"
                                          +"relação à orientação a objetos. Conceito de objeto, classe, métodos, atributos,"
                                          +"herança, polimorfismo, agregação, associação, dependência, encapsulamento, mensagem"
                                          +"e suas respectivas notações na linguagem padrão de representação da orientação a"
                                          +"objetos. Implementação de algoritmos orientado a objetos utilizando linguagens de"
                                          +"programação. Aplicação e uso das estruturas fundamentais da orientação a objetos.",4));
}      

*/
