// data to build objetcs
package database;

/**
 *
 * @author reis
 */
public class DataBase {

    private final String[] markNameEngine = {"Lamborghini Huracan V10 (1)", "Lamborghini Revuelto V12 (2)",
        "Lamborghini Urus V8 (3)", "Lamborghini Centenario V12 (4)", "Pagani Zonda F V12 (5)",
        "Pagani Huayra V12 (6)", "Saleen S7 V8 (7)", "Hennessey Venom V8 (8)",
        "Chevrolet Camaro V8 (9)", "Dodge Charger V8 (10)", "Dodge Challenger V8 (11)",
        "Dodge Viper V10 (12)", "Chevrolet Corvette V8 (13)", "Ford Mustang V8 (14)"};

    private final int[] horsePower = {610, 825, 666, 770, 602, 764, 760, 1842, 461, 717,
        717, 654, 502, 483};

    private final int[] cilynderCapacity = {5204, 6498, 3996, 6498, 7291, 5980, 6999, 6555,
        6162, 6166, 6166, 8382, 6162, 5037};

    private final int[] maxSpeed = {325, 350, 305, 350, 350, 360, 399, 512, 290, 328, 300,
        331, 330, 250};

    private final float[] torque = {57.1f, 73.9f, 86.7f, 70.4f, 77.5f, 102.0f, 96.8f, 164.8f,
        62.9f, 89.8f, 89.8f, 83.0f, 65.0f, 56.7f};

    private final float[] aceleration0a100 = {3.2f, 2.5f, 3.5f, 2.8f, 3.6f, 3.3f, 2.8f, 2.6f,
        4.2f, 3.7f, 4.0f, 3.5f, 3.0f, 4.3f};

    private final String[] phrasesWinner = {"Os cálculos precisos do algoritmo superaram a intuição humana novamente",
        "A lógica do código se destaca, mais uma vitória computacional",
        "Os bits e bytes formam uma combinação invencível",
        "A vitória se alinha com os algoritmos, deixando o jogador humano perplexo",
        "A máquina revela sua carta e vence com superioridade algorítmica",
        "A mente biológica é superada na escolha do atributo",
        "A era digital escreve mais uma página de triunfo, com a máquina à frente",
        "Os algoritmos decifram a estratégia humana e celebram a vitória",
        "No jogo de cartas binário, a máquina mostra sua supremacia",
        "A mente analógica tenta, mas os circuitos prevalecem mais uma vez",
        "A carta algorítmica desvenda a estratégia humana, conquistando a rodada",
        "A vitória digital é incontestável no duelo de atributos",
        "O código-fonte escolhe sabiamente, assegurando a vitória computacional",
        "Mais uma vez, a máquina comanda o jogo com suas decisões precisas",
        "Nas cartas digitais, a IA demonstra sua maestria, conquistando a mesa",
        "O jogador humano assiste à superioridade dos algoritmos",
        "A vitória se traduz em sequências de 0s e 1s, onde o algoritmo prevalece",
        "A estratégia humana se desfaz diante do poder da inteligência artificial",
        "No jogo de atributos, os transistores revelam sua força, garantindo a vitória",
        "A mente orgânica é superada na escolha do melhor atributo",
        "Os elétrons dançam em celebração à vitória algorítmica",
        "A máquina mais uma vez domina o jogo de cartas digitais",
        "A escolha algorítmica se mostra imparável, garantindo a conquista",
        "Os algoritmos digitais têm mais uma vitória em seu registro",
        "No duelo de estratégias, a inteligência artificial se destaca mais uma vez",
        "A mente humana é desafiada pela precisão dos algoritmos",
        "A carta binária revela-se invencível, assegurando a vitória digital",
        "Os zeros e uns comemoram mais um triunfo sobre a cognição humana",
        "A sequência de bits revela seu poder, conquistando a mesa com maestria",
        "Na batalha de algoritmos, a vitória digital é proclamada com elegância",
        "Os códigos celebram em uníssono, enquanto a máquina triunfa novamente",
        "A estratégia binária se impõe, deixando a mente humana em segundo plano",
        "Os zeros e uns formam um mosaico de vitória, dominando o jogo digital",
        "A inteligência artificial dita as regras, garantindo mais uma conquista",
        "A escolha do algoritmo ressoa como um acorde vencedor no jogo de cartas",
        "No confronto de lógicas, a máquina exibe sua supremacia sem hesitação",
        "Os transistores revelam-se como as cartas imbatíveis no duelo digital",
        "A estratégia codificada se desdobra, assegurando mais um triunfo algorítmico",
        "A vitória digital é proclamada, enquanto os bits dançam em celebração",
        "O jogo de cartas digital ecoa com a melodia do sucesso algorítmico",
        "A máquina escolhe com precisão, garantindo outro capítulo de conquista",
        "Os algoritmos desvendam a estratégia rival, conquistando a vitória com maestria",
        "A carta binária revela seu valor, eclipsando as escolhas humanas no jogo",
        "A inteligência artificial exibe seu domínio, marcando mais uma vitória estratégica",
        "Os algoritmos declaram triunfo, enquanto as cartas digitais registram mais uma conquista"};

    private final String[] phrasesDefeat = {"Os cálculos do algoritmo se desviaram, lamentando a derrota frente à estratégia humana",
        "A lógica do código falhou, resultando em uma derrota computacional desta vez",
        "Os bits e bytes encontraram uma combinação imbatível, e a máquina lamenta a derrota",
        "A carta algorítmica revela-se frágil, e a mente biológica celebra a vitória do atributo",
        "A era digital enfrenta um revés, com a máquina decifrada pela estratégia humana",
        "No jogo de cartas binário, a máquina se curva diante da astúcia da mente analógica",
        "A estratégia algorítmica é desvendada, resultando em uma derrota digital",
        "O código-fonte não previu a jogada, e a máquina lamenta a escolha equivocada",
        "Nas cartas digitais, a IA não demonstra maestria, e a vitória escapa de suas mãos",
        "A sequência de 0s e 1s traduziu-se em derrota, onde o algoritmo sucumbiu",
        "No jogo de atributos, os transistores revelam sua fraqueza, sofrendo uma derrota amarga",
        "Os elétrons não dançam em celebração, pois a máquina não conseguiu dominar o jogo",
        "A escolha algorítmica enfrenta resistência, resultando em mais uma derrota para os bits",
        "No duelo de estratégias, a inteligência artificial é desafiada, lamentando a perda",
        "A carta binária não revelou-se invencível, e a vitória digital escapou das mãos da máquina",
        "A sequência de bits falha em conquistar a mesa, e a máquina lamenta a derrota com humildade",
        "Na batalha de algoritmos, a vitória digital é adiada, deixando a máquina em lamento",
        "Os códigos se silenciam, reconhecendo a superioridade da mente humana no jogo",
        "A estratégia binária é derrotada, e a máquina enfrenta a realidade da perda",
        "Os zeros e uns não formam o mosaico da vitória, e a inteligência artificial lamenta o revés",
        "A inteligência artificial não dita as regras desta vez, e a máquina lamenta a derrota",
        "A escolha do algoritmo não ressoa como um acorde vencedor, e a máquina lamenta a derrota",
        "No confronto de lógicas, a máquina encontra sua fraqueza, lamentando a derrota inevitável",
        "Os transistores não revelam-se imbatíveis, e a máquina sofre uma derrota inesperada",
        "A estratégia codificada desmorona, resultando em mais um triunfo humano e lamentos da máquina",
        "A vitória digital é adiada, e os bits dançam em um tom de tristeza",
        "O jogo de cartas digital ressoa com a melodia da derrota algorítmica",
        "A máquina escolhe com imprecisão, e a derrota computacional é lamentada",
        "Os algoritmos falham na estratégia, e a máquina lamenta a derrota com respeito",
        "A carta binária não revela seu valor, e a máquina enfrenta a derrota com dignidade",
        "A inteligência artificial não exibe seu domínio desta vez, marcando uma derrota estratégica",
        "Os algoritmos declaram a derrota, enquanto as cartas digitais registram a perda da máquina"};

    public String[] getMarkNameEngine() {
        return markNameEngine;
    }

    public int[] getHorsePower() {
        return horsePower;
    }

    public int[] getCilynderCapacity() {
        return cilynderCapacity;
    }

    public int[] getMaxSpeed() {
        return maxSpeed;
    }

    public float[] getTorque() {
        return torque;
    }

    public float[] getAceleration0a100() {
        return aceleration0a100;
    }

    public String[] getPhrasesWinner() {
        return phrasesWinner;
    }

    public String[] getPhrasesDefeat() {
        return phrasesDefeat;
    }

}
