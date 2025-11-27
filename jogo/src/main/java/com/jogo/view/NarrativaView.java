package com.jogo.view;

import java.util.List;
import java.util.Scanner;

import com.jogo.model.entity.SuspeitoEntity;

public class NarrativaView {

    private final Scanner scanner;

    public NarrativaView(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Pausa a execução e espera que o usuário pressione ENTER para continuar.
     */
    public void esperarEnterParaContinuar() {
        System.out.println("\n[... ]");
        this.scanner.nextLine(); 
  
    }

     public boolean reivestigar() {
        System.out.println("Gostaria de investigar novamente? (escreve 'S' para sim ou 'N' para não)");
        return true;
    }

    /**
     * Exibe a sequência da cena de prisão de Derick (Capítulo 1).
     */
    public void exibirCenaPrisaoDerick() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("--- CAPÍTULO 1: O PRINCIPAL SUSPEITO ---");
        System.out.println("-----------------------------------------------------------------------");
        
        esperarEnterParaContinuar();

        // --- Ação 1: Sirenes ---
        System.out.println("Ação: Josh vai até a casa de seu melhor amigo (Derick) para ir à escola.");
        System.out.println("Josh: \"O ar de Lakewood Hills nunca pareceu tão frio. Eu estava indo buscar Derick, mas");
        System.out.println("quando cheguei na rua dele, vi as sirenes.\"");
        
        // --- Pausa 1 ---
        esperarEnterParaContinuar();
        
        // --- Ação 2: Prisão ---
        System.out.println("Ação: Josh descobre que seu melhor amigo (Derick) é o principal suspeito do assassinato de Lucas.");
        System.out.println("Policial: \"Ele vai conosco. Você, garoto, afaste-se.\"");
        System.out.println("Derick: (Gritando ao longe, sendo escoltado) \"Josh! Não fui eu! Você tem que me ajudar!\"");
        System.out.println("Ação: Derick é levado preso até segunda ordem.");

        // --- Pausa 2 ---
        esperarEnterParaContinuar();

        // --- Ação 3: Dona Lúcia ---
        System.out.println("Ação: Josh conversa com a mãe de Derick (Dona Lúcia).");
        System.out.println("Josh: \"Dona Lúcia, por favor, me diga que isso é um erro. O que a polícia disse?\"");
        System.out.println("D. Lúcia: \"Dizem que ele e Lucas brigaram. Dizem que acharam algo..., mas meu filho é");
        System.out.println("inocente! Eu imploro, Josh, prove a inocência dele.\"");

        // --- Pausa 3 ---
        esperarEnterParaContinuar();

        // --- Ação 4: Promessa ---
        System.out.println("Josh: \"Eu prometo. Vou para a escola. Vou começar a investigar por lá.\"");
        System.out.println("Ação: Josh está indo para a escola. Sua investigação começou.");
        System.out.println("-----------------------------------------------------------------------");
    }

    public void exibirCenaZelador() {
        
        // --- Ação: Josh chega na escola ---
        System.out.println("Ação: Josh chega na escola e percebe que o Zelador (Bob) está mais feliz pela morte de Lucas.");
        
        esperarEnterParaContinuar(); // Pausa

        // --- Diálogo do Zelador ---
        System.out.println("Zelador Bob: (Assobiando, com um sorriso largo) \"Bom dia, Josh! Um dia de paz,");
        System.out.println("finalmente! Quando certas 'pragas' somem, a vida fica mais limpa, não é mesmo?\"");
        
        esperarEnterParaContinuar(); // Pausa

        // --- Próxima Ação de Risco ---
        System.out.println("Ação: Josh sente um arrepio. A felicidade do zelador é suspeita. Você precisa investigar o cômodo dele.");
        System.out.println("-----------------------------------------------------------------------\n");
        esperarEnterParaContinuar();
        System.out.println("Gostaria de investigar o cômodo do Zelador Bob? (escreve 'S' para sim ou 'N' para não)");

    }

    public void exibirResultadoBoaSorteZelador() {
        
        System.out.println("\n--- RESULTADO: BOA SORTE! 🍀 ---");
        System.out.println("Josh: \"Consegui deslizar para dentro. Encontrei um baú médio de madeira, trancado.\"");
        System.out.println("**Pista Adquirida:** Você encontra um Baú Misterioso!");
        System.out.println("----------------------------------");
        
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();
    }

    /**
     * Exibe a narrativa da MÁ SORTE na cena do Zelador.
     * Não recebe parâmetros e não retorna nada (void).
     */
    public void exibirResultadoMaSorteZelador() {
        
        System.out.println("\n--- RESULTADO: MÁ SORTE! 🚨 ---");
        System.out.println("Zelador Bob: \"O que pensa que está fazendo no meu armário, garoto? Isso é invasão!\"");
        System.out.println("**Ação:** Zelador te encontra vasculhando o armário. (+1 Suspeita adicionada)");
        System.out.println("----------------------------------");
        
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();
    }

    public void zeladorVaiEmbora() {
        System.out.println("Zelador Bob: \"Hmph. Melhor você ir embora daqui!\"");
        System.out.println("Ação: Zelador Bob vai embora, deixando você.");
        System.out.println("----------------------------------");
        
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();
    }

    public void exibirRetornoParaCasa() {
    
 
    
    System.out.println("  Depois de um longo tempo na escola, ou na rua investigando, Josh se dirige para casa.");
    System.out.println("  O sol se pôs, e as luzes da rua acendem. A cabeça dele está cheia de perguntas sobre o caso do assasinato de Lucas.");
    
    esperarEnterParaContinuar();
    
    System.out.println("  Ele sabe que a noite é o melhor momento para rever suas notas, verificar as pistas e planejar o próximo passo.");
    System.out.println("  Josh finalmente chega em casa.");
    System.out.println("------------------------------------\n");

    esperarEnterParaContinuar();

    System.out.println("Gostaria de revisar as pistas e suspeitas encontradas até agora? (escreve 'S' para sim ou 'N' para não)");
}

    // DENTRO DE NarrativaView.java

/**
 * Exibe a cena de transição onde Josh vai dormir e acorda para o novo dia.
 */
public void exibirNovoDia() {
    
    System.out.println("\n--- FIM DO DIA ---\n");
    
    esperarEnterParaContinuar();
    
    // Texto Resumido (Descanso)
    System.out.println("  As preocupações pesam, mas Josh consegue descansar. O corpo e a mente precisavam da pausa.");
    
    esperarEnterParaContinuar();
    
    System.out.println("\n... Horas se passam ...\n");
    
    esperarEnterParaContinuar();
    
    // Texto Resumido (Despertar e Urgência)
    System.out.println("  🌞 O sol entra pela janela. Um novo dia começou, e com ele, a sensação de que o tempo está se esgotando.");
    
    // Alerta de Início de Dia (Mantenha se você tiver o contador de dias)
    System.out.println("\n--- INÍCIO DE UM NOVO DIA DE INVESTIGAÇÃO ---"); 
    System.out.println("---------------------------------------------\n");

    esperarEnterParaContinuar();
}

// DENTRO DE NarrativaView.java

/**
 * Exibe a cena dramática da descoberta do rosto machucado do irmão James.
 * @param james A entidade do Suspeito James, para referência. (Opcional)
 */
public void exibirCenaJamesMachucado() {
    
    
    // Ação: Ao acordar você percebe que seu irmão (James) está machucado no rosto.
    System.out.println("  Ao sair do quarto, você encontra seu irmão, James, na cozinha.");
    esperarEnterParaContinuar();
    System.out.println("  Você congela ao ver o lado esquerdo do rosto dele: está roxo e inchado.");
    
    esperarEnterParaContinuar();

    // Diálogo: Josh
    System.out.println("\nJOSH: \"James! Seu rosto está roxo! O que houve?\"");
    
    // Diálogo: James
    System.out.println("JAMES: \"Não é nada. Deixe-me em paz, Josh. Não se preocupe.\"");
    esperarEnterParaContinuar();
    System.out.println("       Ele se vira bruscamente e se afasta, evitando seu olhar.");
    
    esperarEnterParaContinuar();

    System.out.println("VocÊ começa a pensar que talvez seu irmão possa saber de algo do assassinato");
    
    esperarEnterParaContinuar();
}
   
// DENTRO DE NarrativaView.java

/**
 * Exibe a cena básica onde Josh tenta obter informações com o pai de Lucas (Steve).
 */
public void exibirCenaCasaLucas() {
    
    // Ação: Josh vai à casa do Lucas
    System.out.println("\n--- VISITA À CASA DE LUCAS ---");
    esperarEnterParaContinuar();
    
    System.out.println("  Josh se dirige à casa de Lucas para tentar encontrar novas pistas.");
     esperarEnterParaContinuar();
    System.out.println("  Ele toca a campainha e o pai de Lucas, Steve, abre a porta com o rosto fechado.");
    
    esperarEnterParaContinuar();

    // Diálogo: Josh
    System.out.println("\nJOSH: \"Sr. Steve, eu só quero entender se Lucas estava com problemas...\"");
    
    esperarEnterParaContinuar();

    // Diálogo/Ação: Pai de Lucas (Steve)
    System.out.println("PAI DE LUCAS (Steve): \"VÁ EMBORA! Deixe minha família em paz.\"");
     esperarEnterParaContinuar();
    System.out.println("  Steve bate a porta na cara de Josh, encerrando abruptamente a conversa.");
    
    esperarEnterParaContinuar();
    
    // Ação: O evento se encerra
    System.out.println("  Josh não conseguiu nenhuma informação. Ele precisa repensar o próximo passo.");
    System.out.println("----------------------------------------\n");
     esperarEnterParaContinuar();

    System.out.println("Gostaria de tentar investigar mais a casa de Lucas? (escreve 'S' para sim ou 'N' para não)");
}

// DENTRO DE NarrativaView.java

/**
 * Exibe a cena onde Josh invade o quarto de Lucas e encontra o celular.
 */
public void exibirCenaInvasaoQuartoLucas() {
    
    System.out.println("\n--- AÇÃO ARRISCADA: QUARTO DE LUCAS ---\n");
    esperarEnterParaContinuar();
    
    // Ação: Invasão
    System.out.println("  Sem ter conseguido nada com o Sr. Steve, Josh decide quebrar as regras.");
    esperarEnterParaContinuar();
    System.out.println("  Ele consegue entrar na casa de Lucas (a vítima) sorrateiramente e se dirige ao quarto.");
    esperarEnterParaContinuar();
    System.out.println("  A porta está trancada, mas ele força a fechadura rapidamente.");
    
    esperarEnterParaContinuar();

    // Descrição da Busca
    System.out.println("  O quarto está revirado, evidência de que a polícia esteve ali, mas Josh procura por algo que possa ter passado despercebido.");
    
    esperarEnterParaContinuar();
    
    // Descoberta da Pista
    System.out.println("  Sob uma pilha de roupas, ele sente algo rígido.");
    esperarEnterParaContinuar();
    System.out.println("  Bingo. É o celular de Lucas. Um aparelho antigo que a polícia deve ter ignorado, ou que estava muito bem escondido.");
    
    esperarEnterParaContinuar();

    // Pista Revelada (A Pista será adicionada ao Service no Controller)
    System.out.println("\n  📱 PISTA DESCOBERTA: O Celular Antigo de Lucas.");
    System.out.println("  A memória do aparelho pode conter segredos vitais para o caso!");
    System.out.println("\n----------------------------------------------------\n");

    esperarEnterParaContinuar();
}

// DENTRO DE NarrativaView.java

/**
 * Exibe a cena dramática onde Josh é pego invadindo o quarto de Lucas pelo Sr. Steve.
 * (Esta cena deve levar a um aumento significativo da Suspeita ou a um Game Over no Controller).
 */
public void exibirCenaJoshPegoPeloPaiLucas() {
    
    System.out.println("\n=================================================");
    System.out.println("     🛑 VOCÊ FOI PEGO! CONFRONTO COM SR. STEVE 🛑");
    System.out.println("=================================================");
    
    esperarEnterParaContinuar();
    
    // Ação: O Confronto
    System.out.println("  Enquanto você examina o celular de Lucas, um barulho forte na porta o faz gelar.");
    esperarEnterParaContinuar();
    System.out.println("  É o **Sr. Steve**, o pai de Lucas. Ele o encara da soleira, os olhos arregalados de fúria e dor.");
    
    esperarEnterParaContinuar();

    // Diálogo: Pai de Lucas (Steve)
    System.out.println("\nSR. STEVE: \"VOCÊ! Seu pequeno criminoso! Como ousa entrar na minha casa e profanar o quarto do meu filho?\"");
    esperarEnterParaContinuar();
    System.out.println("           Ele aponta para você, as mãos tremendo de raiva.");
    
    esperarEnterParaContinuar();
    
    // Diálogo: Josh tenta se explicar
    System.out.println("\nJOSH: \"Sr. Steve, por favor! Eu sou amigo de Derick, eu só estou tentando...\"");
    esperarEnterParaContinuar();
    System.out.println("      Ele avança um passo, ignorando sua explicação.");
    
    esperarEnterParaContinuar();

    // Consequência Imediata
    System.out.println("SR. STEVE: \"TENTANDO O QUÊ?! Saia daqui AGORA! Vou ligar para a polícia!\"");
    esperarEnterParaContinuar();
    System.out.println("  Você não tem escolha a não ser fugir. Você corre o mais rápido possível, deixando a casa para trás.");

    // Alerta de Suspeita (A ser refletido no Model/Controller)
    System.out.println("\n  🚨 O seu disfarce foi COMPROMETIDO.");
    System.out.println("  Sua suspeita aumentou! O Sr. Steve não vai te esquecer.");
    
    System.out.println("=================================================\n");
}

// DENTRO DE NarrativaView.java

/**
 * Exibe a cena básica de Josh sendo chamado pelo Diretor Miller e a interrupção.
 */
public void exibirCenaDiretorMiller() {
    
    System.out.println("\n--- ENCONTRO COM O DIRETOR ---");
    esperarEnterParaContinuar();
    
    // Ação: Diretor chama Josh
    System.out.println("  Ao chegar na escola, o Sr. Miller, o Diretor, te chama à sua sala.");
    esperarEnterParaContinuar();
    System.out.println("  Você entra e ele aponta para uma cadeira.");
    
    esperarEnterParaContinuar();

    // Diálogo: Diretor Sr. Miller
    System.out.println("\nDIRETOR MILLER: \"Sente-se, Josh. Concentre-se nos seus exames.\"");
    esperarEnterParaContinuar();
    System.out.println("                \"Sua lealdade a Derick é admirável, mas não atrapalhe a investigação.\"");
    
    esperarEnterParaContinuar();

    // Ação: Interrupção
    System.out.println("  Antes que você possa responder, batem na porta.");
    esperarEnterParaContinuar();
    System.out.println("  O Diretor balança a cabeça, irritado, e se levanta para atender o chamado urgente, deixando a sala por um momento.");
    
    esperarEnterParaContinuar();
    
    System.out.println("------------------------------\n");

    System.out.println("Josh acha estranho o diretor ter pedido para você parar de investigar, ficou se questionando 'Como ele soube?'");
    esperarEnterParaContinuar();

    System.out.println("Gostaria de aproveitar a ausência do diretor para investigar a sala dele? (escreve 'S' para sim ou 'N' para não)");
}

// DENTRO DE NarrativaView.java

/**
 * Exibe a cena onde Josh investiga a sala vazia do diretor e encontra o baú misterioso.
 * (Esta cena deve levar à adição de uma Pista e ao aumento da Suspeita no Controller).
 */
public void exibirCenaInvestigacaoSalaDiretor() {
    
    System.out.println("\n--- INVESTIGAÇÃO SECRETA: SALA DO DIRETOR ---");
    esperarEnterParaContinuar(); // Usando o método simplificado
    
    // Ação: Início da Investigação
    System.out.println("  O Diretor Miller saiu. Você está sozinho na sala, e o tempo é limitado.");
     esperarEnterParaContinuar();
    System.out.println("  Seu coração dispara enquanto você começa a vasculhar o local, ignorando a ética.");
    
    esperarEnterParaContinuar();

    // Descoberta do Baú
    System.out.println("  Seu olhar cai sobre um armário de metal em um canto escuro. Você o abre e, escondido atrás de documentos, há um objeto pesado.");
     esperarEnterParaContinuar();
    System.out.println("  É um baú. Um baú **idêntico** ao que estava no cômodo do Zelador!");
    
    esperarEnterParaContinuar();

    // Pista e Suspeita Reveladas
    System.out.println("\n  🔎 NOVA PISTA: Baú Misterioso na Sala do Diretor.");
     esperarEnterParaContinuar();
    System.out.println("  Como o Diretor tem acesso a um objeto que também estava com o Zelador?");
     esperarEnterParaContinuar();
    System.out.println("  A suspeita em torno do Diretor Miller aumenta dramaticamente.");
    
    esperarEnterParaContinuar();

    // Risco Aumentado
    System.out.println("  Você ouve passos se aproximando. O Diretor está voltando!");
     esperarEnterParaContinuar();
    System.out.println("  Você fecha o armário o mais rápido que pode e volta para sua cadeira, fingindo calma.");
     esperarEnterParaContinuar();
    System.out.println("\n-------------------------------------------------\n");
     esperarEnterParaContinuar();
}

// DENTRO DE NarrativaView.java

/**
 * Exibe a cena dramática onde o Diretor Miller pega Josh invadindo sua sala.
 * (Esta cena deve levar a uma penalidade severa ou a um Game Over no Controller).
 */
public void exibirCenaDiretorPegaJosh() {
    
    System.out.println("\n=================================================");
    System.out.println("     🛑 VOCÊ FOI PEGO! CONFRONTO COM O DIRETOR 🛑");
    System.out.println("=================================================");
    
    esperarEnterParaContinuar();
    
    // Ação: O Confronto
    System.out.println("  Você mal tem tempo de abrir o baú quando ouve a porta se abrindo.");
    System.out.println("  Você se vira e encontra o Diretor Miller parado na soleira, olhando diretamente para você e para o baú aberto sobre a mesa.");
    
    esperarEnterParaContinuar();

    // Diálogo: Diretor Miller
    System.out.println("\nDIRETOR MILLER: \"O que você pensa que está fazendo, Josh?!\"");
    System.out.println("                Sua voz não é alta, mas tem um tom gélido de fúria controlada.");
    
    esperarEnterParaContinuar();
    
    // Diálogo: Josh tenta se explicar
    System.out.println("  Você tenta gaguejar uma explicação, mas as palavras somem.");
    System.out.println("  O Diretor entra e fecha a porta com um clique ameaçador.");
    
    esperarEnterParaContinuar();

    // Consequência Imediata
    System.out.println("DIRETOR MILLER: \"Você não apenas atrapalhou a investigação, como acabou de cometer um ato de vandalismo e invasão. Sua lealdade é pequena\"");
    System.out.println("  Diretor dá uma bronca e dispensa Josh");
    esperarEnterParaContinuar();
    // Alerta de Suspeita (A ser refletido no Model/Controller)
    System.out.println("\n  🚨 ALERTA MÁXIMO! O Diretor chamou as autoridades.");
    System.out.println("  Sua suspeita atingiu o limite. Você precisa fugir da escola imediatamente.");

    System.out.println("=================================================\n");
    esperarEnterParaContinuar();
}

// DENTRO DE NarrativaView.java

/**
 * Exibe a cena básica da volta à sala, a prova e a descoberta da pista na redação de James.
 */
public void exibirCenaProfessorEntregaRedacao() {
    
    System.out.println("\n--- VOLTA À ROTINA ESCOLAR ---");
    esperarEnterParaContinuar();
    
    // Ação: Diretor retorna
    System.out.println("  O Diretor Miller após voltar para sala, termina a conversa e dispensa você.");
    System.out.println("  Você sai da sala e se dirige para sua aula.");
    
    esperarEnterParaContinuar();

    // Ação: Josh faz a prova
    System.out.println("  Você faz a prova de rotina, tentando manter a mente no foco acadêmico.");
    
    esperarEnterParaContinuar();
    
    // Ação: Professor entrega a prova
    System.out.println("  Ao final da aula, o Professor de Matemática, Fred, entrega a pilha de testes corrigidos.");
    System.out.println("  Você percebe que a redação do seu irmão, James, está na pilha.");
    
    esperarEnterParaContinuar();

    // Diálogo e Pista: Reticências
    System.out.println("\nJOSH: \"O Professor Fred me entregou a pilha de testes. Na redação de James, a mesma pontuação estranha que vi no celular de Lucas: reticências com um ponto a mais! (.....). Cinco pontos. Será que é coincidencia, ou será que esse professor está planejando algo?\"");
    
    esperarEnterParaContinuar();
    
    // Pista Revelada (A Pista será adicionada ao Service no Controller)
    System.out.println("\n  🔎 PISTA DESCOBERTA: Padrão (....) na Redação de James.");
    System.out.println("  A mesma marca misteriosa que estava no celular da vítima está no teste do seu irmão.");
    
    esperarEnterParaContinuar();

    // Ação: Retorno para casa
    System.out.println("  Josh decide entregar logo essa redação para seu irmão, levando consigo.");
    System.out.println("  Ele encontra seu irmão na saída da escola, e acaba entregando sua redação.");
    
    System.out.println("\n------------------------------------\n");
    esperarEnterParaContinuar();
}

// DENTRO DE NarrativaView.java

/**
 * Exibe a cena onde Josh visita a mãe de Derick e obtém uma pista sobre vultos no quarto.
 */
public void exibirCenaDonaLuciaVultos() {
    
    System.out.println("\n--- VISITA: CASA DE DERICK ---");
    esperarEnterParaContinuar();
    
    // Ação: Josh visita Dona Lúcia
    System.out.println("  Josh chega à casa de Derick. A atmosfera é pesada. Dona Lúcia, a mãe de Derick (seu melhor amigo), o recebe com os olhos cansados.");
    System.out.println("  Ele tenta confortá-la enquanto iniciam a conversa.");
    
    esperarEnterParaContinuar();

    // Diálogo: D. Lúcia
    System.out.println("\nD. LÚCIA: \"Josh, eu voltei a pensar naquela noite... Eu juro, ouvi alguns vultos no quarto dele depois que a polícia saiu.\"");
    System.out.println("          \"Eu devia ter olhado, mas estava tão em choque... porém depois eu fui lá, e encontrei uma chave estranha em cima de sua mesa\"");
    
    esperarEnterParaContinuar();

    // Ação: Ela se retira brevemente
    System.out.println("  Dona Lúcia balança a cabeça, abalada com a lembrança.");
    System.out.println("  Ação: Ela sai da sala por um momento, dizendo que vai preparar um chá.");
    
    System.out.println("\n------------------------------\n");
    esperarEnterParaContinuar();
    System.out.println("Como dona Lúcia mencionou a chave estranha, gostaria de investigar o quarto de Derick? (escreve 'S' para sim ou 'N' para não)");
}

// DENTRO DE NarrativaView.java

/**
 * Exibe a cena onde Josh aproveita a ausência de D. Lúcia para vasculhar o quarto de Derick
 * e encontrar a chave que pode ser do baú.
 * (Esta cena deve levar à adição de uma Pista no Controller).
 */
public void exibirCenaJoshAchaChaveDerick() {
    
    System.out.println("\n--- INVESTIGAÇÃO OPORTUNA: QUARTO DE DERICK ---");
    esperarEnterParaContinuar();
    
    // Ação: Invasão e busca
    System.out.println("  Com Dona Lúcia na cozinha, você age rapidamente. Você entra no quarto de Derick, procurando algo que a polícia ignorou.");
    System.out.println("  Você se lembra do relato dela sobre os vultos. Alguém esteve aqui! E claro a chave estranha!");
    
    esperarEnterParaContinuar();

    // Descoberta da Chave
    System.out.println(" Você começa a vasculhar a mesa de Derick, revirando papéis e objetos pessoais.");
    System.out.println("E por fim acaba encontrando uma chave prateada, antiga, com detalhes intrincados.");
    
    esperarEnterParaContinuar();

    // Associação com a Pista Principal
    System.out.println("  Josh pega a chave e a examina. Ela tem um formato antigo e robusto.");
    System.out.println("  Você associa imediatamente: **esta pode ser a chave que abre o baú misterioso** encontrado na sala do Zelador e do Diretor!");
    
    esperarEnterParaContinuar();

    // Pista Revelada (A Pista será adicionada ao Service no Controller)
    System.out.println("\n  🔑 PISTA DESCOBERTA: Chave Prateada (Quarto de Derick).");
    System.out.println("  Você tem a peça que faltava para conectar Derick ao objeto central da investigação.");
    
    System.out.println("\n-------------------------------------------------\n");
}
// DENTRO DE NarrativaView.java

/**
 * Exibe a cena onde D. Lúcia retorna com o chá e encontra Josh no quarto de Derick.
 * Ela não fica brava, mas demonstra desconfiança e estranheza.
 */
public void exibirCenaDonaLuciaAchaJosh() {
    
    System.out.println("\n--- RETORNO INESPERADO: D. LÚCIA ---");
    esperarEnterParaContinuar();
    
    // Ação: Retorno de D. Lúcia
    System.out.println("  Você ouve um tilintar de xícaras. Dona Lúcia está voltando.");
    System.out.println("  Você mal tem tempo de fechar a porta do quarto e se volta para ela.");
    
    esperarEnterParaContinuar();

    // Diálogo/Ação: D. Lúcia
    System.out.println("  Dona Lúcia para na porta do quanrto. Ela te olha, depois olha para o quarto e para a porta.");
    System.out.println("  Seus olhos não demonstram raiva, mas sim uma profunda confusão e estranheza.");
    
    esperarEnterParaContinuar();
    
    // Diálogo: D. Lúcia
    System.out.println("\nD. LÚCIA: \"Josh? Você... estava no quarto de Derick?\"");
    System.out.println("          Sua voz é suave, mas a pergunta paira no ar como uma acusação silenciosa.");
    
    esperarEnterParaContinuar();

    // Ação: O evento se encerra
    System.out.println("  Você tenta disfarçar, mas sabe que ela percebeu algo. A estranheza dela é quase tão ruim quanto a raiva.");
    System.out.println("  A tensão é cortante, e você sabe que não pode mais investigar naquele local por enquanto.");
    
    // Alerta de Suspeita (A ser refletido no Model/Controller)
    System.out.println("\n  ⚠️ ALERTA: Você levantou a desconfiança de D. Lúcia.");
    
    System.out.println("----------------------------------------------------\n");

    esperarEnterParaContinuar();

    System.out.println("Ele saí novamente para fazer algo mais na cozinha.");
    esperarEnterParaContinuar();
}

// DENTRO DE NarrativaView.java

/**
 * Exibe a cena final onde Josh usa a chave de Derick para abrir o baú do Diretor,
 * encontrando a faca (suposta arma do crime) e refletindo sobre as implicações.
 */
public void exibirCenaAbreBauFinal() {
    
    System.out.println("\n--- A AÇÃO FINAL?: O SEGREDO DO BAÚ ---");
    esperarEnterParaContinuar();
    
    // Ação: Preparação
    System.out.println("  Você se despede de D. Lúcia e vai para a escola, levando a chave de Derick.");
    System.out.println("  Seu plano é arriscado: se esconder e ir direto à sala do Diretor Miller.");
    
    esperarEnterParaContinuar();
    
    // Ação: Invasão e Descoberta
    System.out.println("  Josh consegue se esgueirar até a diretoria. O baú ainda está escondido sob a mesa, exatamente onde você o viu.");
    System.out.println("  Você pega a chave prateada de Derick e a insere na fechadura do baú...");
    
    esperarEnterParaContinuar();
    
    // Josh Narra: A Descoberta da Arma
    System.out.println("\nJOSH (NARRA): \"A chave funcionou, e o baú se abriu. Lá dentro, sob alguns papéis antigos, estava a arma branca: uma faca.");
    System.out.println("              Será que é a arma do homicídio? Sim, deve ser! Esta é a faca!\"");
    
    esperarEnterParaContinuar();
    
    // Pista Revelada
    System.out.println("\n  🔪 PISTA CRÍTICA: Faca (Suposta Arma do Crime) encontrada no Baú do Diretor.");
    
    esperarEnterParaContinuar();

    // Ação: Retorno
    System.out.println("  Josh fecha o baú, sai da sala discretamente e termina o dia de aula como se nada tivesse acontecido.");
    
    esperarEnterParaContinuar();

    // Josh Narra (Continuação): Reflexão Final
    System.out.println("\nJOSH (NARRA): \"A faca no baú do diretor incrimina Derick de forma devastadora, pois a chave estava em seu quarto.");
    System.out.println("              Mas as pistas do celular e o sinal estranho apontam para outra direção... alguém está montando uma armadilha.\"");
    
    System.out.println("\n-------------------------------------------------\n");
    esperarEnterParaContinuar();
}

// DENTRO DE NarrativaView.java

/**
 * Exibe a cena onde Josh visita o local do assassinato e encontra um botão de camisa,
 * associando-o a possíveis novos suspeitos.
 */
public void exibirCenaBotaoCamisa() {
    
    System.out.println("\n--- INVESTIGAÇÃO: LOCAL DO CRIME ---");
    esperarEnterParaContinuar();
    
    // Ação: Chegada e Busca
    System.out.println("  Josh retorna ao local do assassinato, examinando a área que a polícia pode ter negligenciado.");
    System.out.println("  Ele se ajoelha, vasculhando o mato ralo perto de uma cerca.");
    
    esperarEnterParaContinuar();

    // Descoberta
    System.out.println("  Seus dedos encontram algo pequeno e duro: um **botão de camisa**, de um tipo incomum.");
    System.out.println("  Ele pega o botão e o examina sob a luz fraca.");
    
    esperarEnterParaContinuar();

    // Associação e Suspeitos
    System.out.println("\nJOSH (NARRA): \"Eu conheço este botão. É de uma camisa que algumas pessoas usam por aqui, um estilo peculiar...\"");
    System.out.println("              \"Este botão estreita o círculo de suspeitos para quatro pessoas:\"");
    
    esperarEnterParaContinuar();
    
    // Lista de Suspeitos Potenciais
    System.out.println("\n  🚨 SUSPEITOS DESTE BOTÃO:");
    System.out.println("    - O Professor");
    System.out.println("    - O Diretor (Sr. Miller)");
    System.out.println("    - Meu irmão (James)");
    System.out.println("    - O melhor amigo de Lucas (Marlon)");
    
    esperarEnterParaContinuar();

    // Pista Revelada (A ser adicionada ao Service no Controller)
    System.out.println("\n  🔎 PISTA DESCOBERTA: Botão de Camisa Incomum.");
    System.out.println("  Esta pista liga diretamente um de quatro suspeitos ao local da morte.");
    
    System.out.println("----------------------------------------------\n");
     esperarEnterParaContinuar();
}

// DENTRO DE NarrativaView.java

/**
 * Exibe a cena que força Josh/o jogador a revisar obrigatoriamente
 * todas as pistas e suspeitos antes de prosseguir.
 */
public void exibirCenaRevisaoObrigatoria() {
    
    System.out.println("\n=================================================");
    System.out.println("      ⚠️ REVISÃO OBRIGATÓRIA DE EVIDÊNCIAS ⚠️");
    System.out.println("=================================================");
    
    esperarEnterParaContinuar();
    
    // Ação: Decisão de Revisão
    System.out.println("  Josh volta para casa, já que é sábado e não tem aula, e decide que não pode cometer erros na próxima fase.");
    System.out.println("  É obrigatório revisar todo o progresso do caso antes de confrontar os suspeitos.");
    
    esperarEnterParaContinuar();

    // Chamada para a exibição das pistas
    System.out.println("\n  Primeiro, vamos revisar todas as PISTAS encontradas:");
    
    // 💡 NOTA: O Controller deve chamar this.narrativaView.exibirListaPistas() aqui.
    
    esperarEnterParaContinuar();

    // Chamada para a exibição dos suspeitos
    System.out.println("\n  Em seguida, vamos revisar a lista completa de SUSPEITOS:");
    esperarEnterParaContinuar();
    
    System.out.println("=================================================\n");
    System.out.println("\n  E por fim será entrevistado três suspeitos. Escolha sabiamente.");
    // 💡 NOTA: O Controller deve chamar this.narrativaView.exibirListaSuspeitos() aqui.
    System.out.println("=================================================\n");

    esperarEnterParaContinuar();
    
}

// DENTRO DE NarrativaView.java

/**
 * Exibe o menu de seleção para as entrevistas finais, permitindo que o jogador
 * escolha o primeiro dos três suspeitos a serem confrontados.
 * @param suspeitosDisponiveis A lista completa dos SuspeitoEntity para escolha.
 */
public void exibirMenuSelecaoEntrevistas(int numeracao, String texto) {
    
    System.out.println("\n=================================================");
    System.out.println("     🎤 FASE FINAL: SELEÇÃO DE ENTREVISTAS (" + numeracao  + "/3)");
    System.out.println("=================================================");
    
    esperarEnterParaContinuar();
    
    // Instrução
    System.out.println("  Com base em todas as pistas, você terá a chance de interrogar **somente três** suspeitos.");
    System.out.println("  Sua " + texto + " escolha é crucial. Selecione o número correspondente ao seu primeiro alvo:");
    
    System.out.println("\n--- LISTA DE SUSPEITOS DISPONÍVEIS ---");
    
    esperarEnterParaContinuar();

    System.out.println("----------------------------------------");
    System.out.print("\nEscolha o número do suspeito a ser entrevistado primeiro: ");
    
    System.out.println("1 - Zelador, estava com baú misterioso");
    System.out.println("2 - Pai de Derick (Sr Steve)");
    System.out.println("3 - Diretor Miller, estava com baú misterioso");
    System.out.println("4 - Professor Fred");
    System.out.println("5 - James (irmão)");
    System.out.println("6 - Derick (melhor amigo)");
    System.out.println("7 - Marlon, Melhor amigo de Lucas (vítima)");
    
    System.out.println("\n=================================================\n");
    esperarEnterParaContinuar();

}

// DENTRO DE NarrativaView.java

public void entrevistarZelador() {
    System.out.println("\n--- ENTREVISTA: ZELADOR ---");
    esperarEnterParaContinuar();
    
    System.out.println("  Josh confronta o Zelador sobre o baú e a morte de Lucas.");
    
    esperarEnterParaContinuar();

    System.out.println("ZELADOR: \"É verdade, eu não ia muito com a cara do Lucas. Mas nunca faria tamanha coisa.\"");
    System.out.println("ZELADOR: \"Achei o baú no cômodo de limpeza e entreguei ao Diretor para que fosse colocado em achados e perdidos.\"");
    
    esperarEnterParaContinuar();
    
    System.out.println("  A versão do Zelador sobre o baú coincide com a do Diretor (Pista).");
    System.out.println("----------------------------------------\n");
}

// DENTRO DE NarrativaView.java

public void entrevistarPaiDerickSrSteve() {
    System.out.println("\n--- ENTREVISTA: PAI DE DERICK (SR. STEVE) ---");
    esperarEnterParaContinuar();
    
    System.out.println("  Josh se aproxima do Sr. Steve, esperando obter alguma informação.");
    
    esperarEnterParaContinuar();

    System.out.println("SR. STEVE: \"Eu já te disse para me deixar em paz! Meu filho está preso, e você está intrometido na vida de todo mundo!\"");
    System.out.println("  O Sr. Steve está dominado pela raiva e se recusa veementemente a conversar. Ele encerra a porta na sua cara.");
    
    esperarEnterParaContinuar();
    
    System.out.println("  A raiva e a recusa do Sr. Steve não ajudam na investigação, mas sua proteção é notável.");
    System.out.println("----------------------------------------\n");
}

// DENTRO DE NarrativaView.java

public void entrevistarDiretorMiller() {
    System.out.println("\n--- ENTREVISTA: DIRETOR MILLER ---");
    esperarEnterParaContinuar();
    
    System.out.println("  Josh questiona o Diretor Miller sobre o baú encontrado em sua sala.");
    
    esperarEnterParaContinuar();

    System.out.println("DIRETOR MILLER: \"Josh, você já pode ir para a sua sala. Concentre-se nos seus estudos e esqueça essa investigação. Confie nas autoridades.\"");
    System.out.println("DIRETOR MILLER: \"O Zelador o colocou lá para achados e perdidos. É procedimento padrão. Não há nada de misterioso.\"");
    
    esperarEnterParaContinuar();
    
    System.out.println("  O Diretor responde com eloquência, mantendo a calma, mas a história do 'achados e perdidos' é conveniente demais.");
    System.out.println("----------------------------------------\n");
}

// DENTRO DE NarrativaView.java

public void entrevistarProfessorFred() {
    System.out.println("\n--- ENTREVISTA: PROFESSOR FRED ---");
    esperarEnterParaContinuar();
    
    System.out.println("  Josh fala com o Professor Fred, que é um dos suspeitos do 'botão de camisa'.");
    
    esperarEnterParaContinuar();

    System.out.println("PROFESSOR FRED: \"É uma tragédia, Josh. Por mais que eu e Lucas tivéssemos nossas desavenças em aula, eu o respeitava muito.\"");
    System.out.println("PROFESSOR FRED: \"Estou à disposição da polícia, mas sou inocente. A única coisa que me importa são meus alunos.\"");
    
    esperarEnterParaContinuar();
    
    System.out.println("  O Professor se faz de inocente, mas sua ênfase no respeito, apesar das 'desavenças', soa um pouco forçada.");
    System.out.println("----------------------------------------\n");
}

// DENTRO DE NarrativaView.java

public void entrevistarDerick() {
    System.out.println("\n--- ENTREVISTA: DERICK (NA CADEIA) ---");
    esperarEnterParaContinuar();
    
    System.out.println("  Você visita seu melhor amigo, Derick, na cadeia.");
    System.out.println("  Josh, sem acusar, relata a descoberta da chave em seu quarto.");
    
    esperarEnterParaContinuar();

    System.out.println("DERICK: \"Uma chave? Eu nunca vi essa chave na vida, Josh! O que está acontecendo?\"");
    System.out.println("  Derick parece genuinamente surpreso, mas então sua expressão muda.");
    
    esperarEnterParaContinuar();

    System.out.println("DERICK: \"Espere! Eu vi meu irmão com uma chave parecida uma vez. Não era igual, mas era parecida... James estava com ela!\"");
    
    esperarEnterParaContinuar();
    
    System.out.println("  🚨 PISTA CHAVE: Derick nega a posse da chave, mas acusa seu próprio irmão, James.");
    System.out.println("----------------------------------------\n");
}

// DENTRO DE NarrativaView.java

public void entrevistarJamesIrmao() {
    System.out.println("\n--- ENTREVISTA: JAMES (IRMÃO) ---");
    esperarEnterParaContinuar();
    
    System.out.println("  Josh confronta seu irmão, James, sobre a chave mencionada por Derick.");
    
    esperarEnterParaContinuar();

    System.out.println("JAMES: \"Eu não sei do que você está falando, Josh. Pare de me incomodar com as suas histórias de detetive. Eu não tenho nada a ver com isso!\"");
    System.out.println("  James fica defensivo e evita o contato visual, negando qualquer envolvimento com a chave ou Lucas.");
    
    esperarEnterParaContinuar();
    
    System.out.println("  O comportamento de James é evasivo e levanta a suspeita. Ele está escondendo algo.");
    System.out.println("----------------------------------------\n");
}

// DENTRO DE NarrativaView.java

public void entrevistarMarlonMelhorAmigo() {
    System.out.println("\n--- ENTREVISTA: MARLON (MELHOR AMIGO DE LUCAS) ---");
    esperarEnterParaContinuar();
    
    System.out.println("  Josh confronta Marlon, o melhor amigo de Lucas, que está na lista do 'botão de camisa'.");
    
    esperarEnterParaContinuar();

    System.out.println("MARLON: \"E daí, Josh? O que você quer? Lucas mereceu o que aconteceu? Eu não sei. O celular dele? Eu não estava lá. Não sei de nada.\"");
    System.out.println("  Marlon age de forma apática e desafiadora, com frases curtas e evasivas. Seu comportamento sugere que ele sabe mais do que diz.");
    
    esperarEnterParaContinuar();
    
    System.out.println("  Marlon está agindo de forma estranha, quase como se estivesse tentando encobrir o crime ou parecer culpado de propósito.");
    System.out.println("----------------------------------------\n");
}

// DENTRO DE NarrativaView.java

public void exibirFinalVitoria(int escolhaCorreta) {
    String nomeAssassino = (escolhaCorreta == 5) ? "James" : "ERRO_NOME"; // Deve ser James

    System.out.println("\n=================================================");
    System.out.println("     🎉 VITÓRIA! A VERDADE FOI REVELADA! 🎉");
    System.out.println("=================================================");
    esperarEnterParaContinuar();

    System.out.printf("  Você aponta o dedo para o número %d: %s!\n", escolhaCorreta, nomeAssassino);
    esperarEnterParaContinuar();
    
    System.out.println("  Seu trabalho de detetive estava correto: **James**, seu próprio irmão, é o assassino de Lucas.");
    System.out.println("  O motivo era sombrio: James sentia uma profunda **inveja** da amizade de Josh com Derick.");
    esperarEnterParaContinuar();
    
    System.out.println("  Ele matou Lucas para **incriminar Derick**, usando a chave e plantando a faca no baú do Diretor, esperando que Derick apodrecesse na cadeia e que a amizade de vocês acabasse.");
    System.out.println("  O rosto machucado, a chave misteriosa, e o padrão (....) na redação eram todas as provas que James estava envolvido.");
    esperarEnterParaContinuar();

    System.out.println("\n  Graças a você, Derick é libertado e a justiça é feita!");
    System.out.println("  FIM DE JOGO: VOCÊ VENCEU!");
    System.out.println("=================================================\n");
}

// DENTRO DE NarrativaView.java

public void exibirFinalDerrota(int escolhaErrada, int assassinoReal) {
    // Busca o nome do acusado para a história
    String nomeAcusado = switch (escolhaErrada) {
        case 1 -> "o Zelador (que só queria paz)";
        case 2 -> "o Pai de Derick (Sr. Steve)";
        case 3 -> "o Diretor Miller (que só cobria o Zelador)";
        case 4 -> "o Professor Fred (que se irritava com Lucas, mas não o odiava)";
        case 6 -> "o próprio Derick (seu amigo)";
        case 7 -> "Marlon (o amigo estranho)";
        default -> "ALGUÉM DESCONHECIDO";
    };
    
    System.out.println("\n=================================================");
    System.out.println("     😭 DERROTA! A ACUSAÇÃO ESTAVA ERRADA! 😭");
    System.out.println("=================================================");
    esperarEnterParaContinuar();

    System.out.printf("  Você acusou **%s** (%d).\n", nomeAcusado, escolhaErrada);
    esperarEnterParaContinuar();
    
    System.out.println("  Infelizmente, a prova contra essa pessoa não se sustentou no tribunal. Você falhou em encontrar o verdadeiro culpado.");
    System.out.println("  Como resultado, seu melhor amigo, **Derick, foi condenado e preso** pelo crime que não cometeu.");
    esperarEnterParaContinuar();
    
    System.out.println("\n*** O VERDADEIRO ASSASSINO É REVELADO ***");
    esperarEnterParaContinuar();

    System.out.println("  O assassino era **James** (Suspeito #5), seu próprio irmão.");
    System.out.println("  Ele matou Lucas, não por ódio a ele, mas por **inveja doentia da sua amizade com Derick**.");
    esperarEnterParaContinuar();
    
    System.out.println("  Seu lado obscuro o levou a armar a cena do crime perfeitamente, garantindo que o amigo que você tanto prezava fosse punido em seu lugar.");
    System.out.println("  James escapou impune. O destino de Derick está selado.");
    esperarEnterParaContinuar();

    System.out.println("\nFIM DE JOGO: VOCÊ PERDEU!");
    System.out.println("=================================================\n");
}

}