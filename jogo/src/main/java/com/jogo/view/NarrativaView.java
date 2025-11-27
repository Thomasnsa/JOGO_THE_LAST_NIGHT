package com.jogo.view;

import java.util.Scanner;

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

}