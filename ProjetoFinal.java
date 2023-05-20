import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class ProjetoFinal{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> jogoCorrida = new ArrayList<String>();
        jogoCorrida.add("\n Forza 5\n");
        jogoCorrida.add("\n Gran Turismo 7\n");
        jogoCorrida.add("\n Need for Speed Unbound\n");
        ArrayList<String> jogoAcao = new ArrayList<String>();
        jogoAcao.add("\n Dark Souls\n");
        jogoAcao.add("\n God of War\n");
        jogoAcao.add("\n Batman Arkham-Knight\n");
        ArrayList<String> jogoAventura = new ArrayList<String>();
        jogoAventura.add("\n Zelda - Breath of the Wild\n");
        jogoAventura.add("\n Pokémon\n");
        jogoAventura.add("\n The Witcher 3 - Wild Hunt\n");
        
        ArrayList<String> jogoTotal = new ArrayList<String>(jogoCorrida.size()+jogoAcao.size()+jogoAventura.size());
        jogoTotal.addAll(jogoAcao);
        jogoTotal.addAll(jogoAventura);
        jogoTotal.addAll(jogoCorrida);
        jogoTotal.ensureCapacity(12);
        
        
        double precoTotal = 0.0;
        String nome="";
        String idade="";
        String telefone="";
        String endereco="";
        
        int opc = 0;
        
        boolean continuar3 = true;
        boolean continuar = true;
        int cadastro = 0;
        int corrida;
        int acao = 0;
        int aventura = 0;
        int promocao = 0;
        int quantidade = 0;
        int quantidade2 = 0;
        int quantidade3 = 0;
        int quantidade4 = 0;
        
            do{
                System.out.println("================================================================\n");
                System.out.println("                            Strean                             \n");
                System.out.println("================================================================n");
                System.out.println("1 -Cadastrar Usuário\n");
                System.out.println("2 -Listar Jogos de Corrida\n");
                System.out.println("3 -Listar Jogos de Ação\n");
                System.out.println("4 -Listar Jogos de Aventura\n");
                System.out.println("5 -Listar todos os Jogos\n");
                System.out.println("6 -Cadastrar um novo Jogo\n");
                System.out.println("7 -Efetuar Compra \n");
                System.out.println("8 -Encerrar o Programa\n");
                
                
                System.out.println("Digite a opção desejada");
                opc = sc.nextInt();

                

                    if(opc==8){//Encerrar Programa
                        continuar=false;
                        System.out.println("Você saiu da STREAN");
                    }
                    


                    if(opc == 1){//Cadastro
            
                        System.out.println("Digite seu Nome: ");
                    nome = sc.next();
                    
                            
                        System.out.println("Digite sua Idade: ");
                    idade = sc.next();
                        
                        System.out.println("Digite seu Telefone: ");
                    telefone = sc.next();

                        System.out.println("Digite seu Endereço: ");
                    endereco = sc.next();
                    
                        System.out.println("*******Cadastro Completo*******\n");
                        cadastro++;

                        

                    do{//Voltar para Menu
                        System.out.println("1- Voltar ao Menu\n");
                        System.out.println("2- Sair da Strean\n");
                    int opc3 = sc.nextInt();
                        
                    if(opc3==1){
                        continuar = true;
                    }
                    if(opc3==2){    
                        continuar = false;
                    }
                    continuar3 = false;
                    }while(continuar3);
                        
                
                    }



                    if(opc == 2){//Jogos de Corrida
                        continuar = false;
                        
                        for(String str : jogoCorrida){
                            System.out.println(str);
                        }

                    

                    do{//Voltar para Menu
                            System.out.println("\n");
                            System.out.println("1- Voltar ao Menu\n");
                            System.out.println("2- Sair da Strean\n");
                        int opc3 = sc.nextInt();
                            
                            if(opc3==1){
                                continuar = true;
                            }
                            if(opc3==2){    
                                continuar = false;
                            }
                            continuar3 = false;
                    }while(continuar3);
                    }

                   


                    if(opc == 3){//Jogos de Ação
                        continuar = false;

                        for(String str : jogoAcao){
                            System.out.println(str);
                        }
                    
                        do{//Voltar para Menu
                            System.out.println("\n");
                            System.out.println("1- Voltar ao Menu\n");
                            System.out.println("2- Sair da Strean\n");
                        int opc3 = sc.nextInt();
                            
                            if(opc3==1){
                                continuar = true;
                            }
                            if(opc3==2){    
                                continuar = false;
                            }
                            continuar3 = false;
                    }while(continuar3);
                    }



                    if(opc == 4){//Jogos de Aventura
                        continuar = false;
                        
                        for(String str : jogoAventura){
                            System.out.println(str);
                        }

                        do{//Voltar para Menu
                            System.out.println("\n");
                            System.out.println("1- Voltar ao Menu\n");
                            System.out.println("2- Sair da Strean\n");
                        int opc3 = sc.nextInt();
                            
                            if(opc3==1){
                                continuar = true;
                            }
                            if(opc3==2){    
                                continuar = false;
                            }
                            continuar3 = false;
                    }while(continuar3);
                    }



                    if(opc == 5){//Todos jogos
                        continuar = false;
                        
                        for(String str : jogoTotal){
                            System.out.println(str);
                        }

                        do{//Voltar para Menu
                            System.out.println("\n");
                            System.out.println("1- Voltar ao Menu\n");
                            System.out.println("2- Sair da Strean\n");
                        int opc3 = sc.nextInt();
                            
                            if(opc3==1){
                                continuar = true;
                            }
                            if(opc3==2){    
                                continuar = false;
                            }
                            continuar3 = false;
                    }while(continuar3);
                    }



                    if(opc == 6){//Adicionar Jogo na lista
                        continuar = false;
                        
                       
                        System.out.println("1- Corrida");
                        System.out.println("2- Ação");
                        System.out.println("3- Aventura");
                        System.out.println("Digite o nome do jogo: ");
                        String jogo = sc.next();
                        System.out.println("Escolha a classificação do jogo:");
                        int classi = sc.nextInt();


                        if(classi==1){
                            jogoCorrida.add(jogo);
                            
                        }
                        if(classi==2){
                            jogoAcao.add(jogo);
                        }
                        if(classi==3){
                            jogoAventura.add(jogo);
                        }


                        if(jogoTotal.size()>12){
                            System.out.println("*******ERRO*******");
                            jogoTotal.remove(13);
                        }

                        do{//Voltar para Menu
                            System.out.println("\n");
                            System.out.println("1- Voltar ao Menu\n");
                            System.out.println("2- Sair da Strean\n");
                        int opc3 = sc.nextInt();
                            
                            if(opc3==1){
                                continuar = true;
                            }
                            if(opc3==2){    
                                continuar = false;
                            }
                            continuar3 = false;
                    }while(continuar3);
                    }


                    
                    if(opc == 7){//Efetuar pagamento
                        continuar = false;
                    if(cadastro==0){
                        System.out.println("Para Efetuar uma compra você precisa fazer o Cadastro\n");
                    }
                    else{

                        boolean continuar2 = true;
                        Boolean ca = true;

                        do{             

                           

                    List<String> carrinhoNomes = new ArrayList<>();
                    List<Double> carrinhoPrecos = new ArrayList<>();

                        
                            System.out.println("=========MENU=========");
                            System.out.println("1-JOGOS DE AÇÃO ");
                            System.out.println("2-JOGOS DE CORRIDAS");
                            System.out.println("3-JOGOS DE AVENTURA");
                            System.out.println("0-Encerrar Compra");

                            int opcao = sc.nextInt();

                            if (opcao == 1) {
                                System.out.println("=====JOGOS DE AÇÃO=====");
                                System.out.println("1-Dark Souls");
                                System.out.println("2-God of War");
                                System.out.println("3-Batman Arkham Knight");
                                System.out.println("0-Voltar ao início");

                                int escolhaAcao = sc.nextInt();

                                if (escolhaAcao == 1) {
                                    carrinhoNomes.add("Dark Souls");
                                    carrinhoPrecos.add(70.00);
                                    System.out.println("Dark Souls - R$70,00");
                                } else if (escolhaAcao == 2) {
                                    carrinhoNomes.add("God of War");
                                    carrinhoPrecos.add(70.00);
                                    System.out.println("God of War - R$70,00");
                                } else if (escolhaAcao == 3) {
                                    carrinhoNomes.add("Batman Arkham Knight");
                                    carrinhoPrecos.add(70.00);
                                    System.out.println("Batman Arkham Knight - R$70,00");
                                } else if (escolhaAcao == 0) {
                                    
                                    System.out.println("Compra encerrada.");
                                }
                            } else if (opcao == 2) {
                                System.out.println("=====JOGOS DE CORRIDAS=====");
                                System.out.println("1-Forza Horizon 5 - R$80,00");
                                System.out.println("2-Gran Turismo 7 - R$80,00");
                                System.out.println("3-Need for Speed Unbound - R$50,00");
                                System.out.println("0-Voltar ao início");

                                int escolhaCorrida = sc.nextInt();

                                if (escolhaCorrida == 1) {
                                    carrinhoNomes.add("Forza Horizon 5");
                                    carrinhoPrecos.add(80.00);
                                    System.out.println("Forza Horizon 5 - R$80,00");
                                } else if (escolhaCorrida == 2) {
                                    carrinhoNomes.add("Gran Turismo 7");
                                    carrinhoPrecos.add(80.00);
                                    System.out.println("Gran Turismo 7 - R$80,00");
                                } else if (escolhaCorrida == 3) {
                                    carrinhoNomes.add("Need for Speed Unbound");
                                    carrinhoPrecos.add(50.00);
                                    System.out.println("Need for Speed Unbound - R$50,00");
                                } else if (escolhaCorrida == 0) {
                                    
                                    System.out.println("Compra encerrada.");
                                }
                            } else if (opcao == 3) {
                                System.out.println("=====JOGOS DE AVENTURA=====");
                                System.out.println("1-Zelda - Breath of the Wild - R$90,00");
                                System.out.println("2-Pokémon - R$90,00");
                                System.out.println("3-The Witcher 3 - Wild Hunt - R$90,00");
                                System.out.println("0-Voltar ao início");

                                int escolhaAventura = sc.nextInt();

                                if (escolhaAventura == 3) {
                                    carrinhoNomes.add("Zelda - Breath of the Wild");
                                    carrinhoPrecos.add(90.00);
                                    System.out.println("Zelda - Breath of the Wild - R$90,00");
                                } else if (escolhaAventura == 2) {
                                    carrinhoNomes.add("Pokémon");
                                    carrinhoPrecos.add(90.00);
                                    System.out.println("Pokémon - R$90,00");
                                } else if (escolhaAventura == 3) {
                                    carrinhoNomes.add("The Witcher 3 - Wild Hunt");
                                    carrinhoPrecos.add(90.00);
                                    System.out.println("The Witcher 3 - Wild Hunt - R$90,00");
                                } else if (escolhaAventura == 0) {
                                    
                                    System.out.println("Compra encerrada.");
                                }
                                

                            }

                            if (opcao == 0) {
                                ca = false;
                                System.out.println("Compra encerrada.");   
                            }
                       

                            System.out.println("=====Carrinho de Compras=====");
                            for (int i = 0; i < carrinhoNomes.size(); i++) {
                                String nom = carrinhoNomes.get(i);
                                double preco = carrinhoPrecos.get(i);
                                System.out.println(nom + " - R$" + preco);
                                precoTotal += preco;
                            }

                                System.out.println("Preço Total: R$" + precoTotal);

                        }while(ca);  
                        
                        System.out.println("================================================================\n");
                            System.out.println("                   Strean                      \n");
                            System.out.println("================================================================= \n");
                            
                            System.out.println("1 -  Ir Para o Pagamento\n");
                            int teste = sc.nextInt();          
                                

                            if(teste >= 1){
                                continuar2 = false;
                            
                                boolean conti = true;
                                                            
                                Double cont =  precoTotal-(0.05* precoTotal);
                                Double cont2 =  precoTotal-(0.010* precoTotal);
                                int con3 = 0;


                                System.out.println("***** APÓS A REALIZAÇÃO DO PEDIDO, FAÇA SEU PAGAMENTO AQUI *****\n");
                                
                                do{
                                    //adicione sua forma de pagamento
                                    System.out.println("**Escolha uma forma de pagamento**\n");
                                    System.out.println("1 - PIX com (10% de DESCONTO)\n");
                                    System.out.println("2 - Transfêrencia Bancária\n");
                                    System.out.println("3 - Cartão de Debito com (10% de DESCONTO)\n");
                                    System.out.println("4 - Cartão de Credito com (5% de DESCONTO)\n");
                                    
                                        
                                    System.out.println("Digite a opção desejada");
                                    int opca = sc.nextInt();

                                    if (opca == 1) {
                                        System.out.println("Você escolheu a forma de pagamento PIX, que havera 10% de DESCONTO");
                                        conti = false;
                                        System.out.println("Você vai pagar R$"+cont2 + " com desconto");
                                        System.out.println("Digite a Chave Pix: ");
                                        int id2 = sc.nextInt();
                                        System.out.println("Deseja finalizar a compra? (Digite 1 para SIM e 2 para NÃO)");
                                        int id = sc.nextInt();
                                    
                                        if(id==1){
                                            System.out.println("==================Compra Finalizada==================");
                                        System.out.println("Compra de: "+ nome +" de "+idade+" de Telefone: " + telefone+" e Endereço: "+endereco);
                                        }
                                    }
                                    if (opca == 2) {
                                        System.out.println("Você escolheu a opção de Transfêrencia Bancária");
                                        conti = false;
                                        System.out.println("Você vai pagar R$"+ con3);
                                        System.out.println("Digite sua Conta Bancária");
                                        int id2 = sc.nextInt();
                                        System.out.println("Deseja finalizar a compra? (Digite 1 para SIM e 2 para NÃO)");
                                        int id = sc.nextInt();
                                    
                                        if(id==1){
                                            System.out.println("==================Compra Finalizada==================");
                                        System.out.println("Compra de: "+ nome +" de "+idade+" de Telefone: " + telefone+" e Endereço: "+endereco);
                                        }

                                    }
                                    if (opca == 3) {
                                        System.out.println("Você escolheu a forma de pagamento de Cartao de Debito, que havera 10% de DESCONTO");
                                        conti = false;
                                      
                                        System.out.println("Você vai pagar R$"+cont2 + " com desconto");
                                        System.out.println("Informe seus dados: ");
                                        int id2 = sc.nextInt();
                                        System.out.println("Deseja finalizar a compra? (Digite 1 para SIM e 2 para NÃO)");
                                        int id = sc.nextInt();
                                    
                                        if(id==1){
                                            System.out.println("==================Compra Finalizada==================");
                                        System.out.println("Compra de: "+ nome +" de "+idade+" de Telefone: " + telefone+" e Endereço: "+endereco);
                                        }
                                        
                                    }
                                    if (opca == 4) {
                                        System.out.println("Você escolheu a forma de pagamento de Cartão de Credito, que havera 5% de DESCONTO\n");
                                        conti = false;
                                        System.out.println("Você vai pagar R$"+cont  + " com desconto\n");
                                        System.out.println("Informe seus dados: ");
                                        int id2 = sc.nextInt();
                                        System.out.println("Deseja finalizar a compra? (Digite 1 para SIM e 2 para NÃO)");
                                        int id = sc.nextInt();
                                    
                                        if(id==1){
                                        System.out.println("==================Compra Finalizada==================");
                                        System.out.println("Compra de: "+ nome +" de "+idade+" de Telefone: " + telefone+" e Endereço: "+endereco);
                                        
                                        }
                                    }
                                    

                                } while(conti);
                                   
                            }
                              
                        
                    }

                    do{//Voltar para Menu
                        System.out.println("\n");
                        System.out.println("1- Voltar ao Menu\n");
                        System.out.println("2- Sair da Strean\n");
                    int opc3 = sc.nextInt();
                        
                        if(opc3==1){
                            continuar = true;
                        }
                        if(opc3==2){    
                            continuar = false;
                        }
                        continuar3 = false;
                }while(continuar3);
                    }
            }while(continuar);
          
    sc.close();
    }
}
