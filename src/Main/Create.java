package Main;

import Controller.*;
import Model.*;

import java.util.Scanner;

public class Create {

    private static Scanner scan = new Scanner(System.in);
    private static Menu menu = new Menu();

    public void criarPrescricao(){

        String cpf;

        do{
            menu.exibirMensagem("Digite o cpf do paciente que criar a prescrição: ");
            cpf = scan.nextLine();
            if(cpf.length()!=11)menu.exibirMensagem("Digite um cpf válido.");
        }while(cpf.length()!=11);

        Paciente paciente = ControllerPaciente.readPaciente(cpf);

        if(paciente!=null){
            menu.exibirMensagem("Paciente encontrado.");
            Medicamento medicamento = new Medicamento();
            criarMedicamento(medicamento);
            ControllerPaciente.criaPrescricao(paciente,medicamento);
        }else{
            menu.exibirMensagem("Paciente não encontrado com este cpf.");
        }



    }

    public Paciente criarPaciente(Paciente paciente){

        String nome,cpf,email,data,endereco,historico,telefone;

        do{
            menu.exibirMensagem("Digite o nome: ");
            nome = scan.nextLine();
            if(!nome.isEmpty()){
                paciente.setNome(nome);
            }else{
                menu.exibirMensagem("O Nome não pode ser vazio.");
            }
        }while(nome.isEmpty());

        do{
            menu.exibirMensagem("Digite o cpf: ");
            cpf = scan.nextLine();
            if(cpf.length()==11){
                if(!ControllerPaciente.checaExistente(cpf)){
                    paciente.setCpf(cpf);
                }else{
                 menu.exibirMensagem("CPF já cadastrado.");
                }
            }else{
                menu.exibirMensagem("O CPF precisa ter 11 dígitos.");
            }
        }while(cpf.length()!=11);

        if(paciente.getCpf() == null){
            menu.exibirMensagem("Não foi possível cadastrar o paciente.");
            return null;
        }

        do{
            menu.exibirMensagem("Digite o e-mail: ");
            email = scan.nextLine();
            if(!email.isEmpty()){
                paciente.setEmail(email);
            }else{
                menu.exibirMensagem("O E-mail não pode ser vazio.");
            }
        }while(email.isEmpty());

        do{
            menu.exibirMensagem("Digite a data de nascimento no formato dd/mm/aaaa: ");
            data = scan.nextLine();
            if(!data.isEmpty()){
                paciente.setDataNasc(data);
            }else{
                menu.exibirMensagem("A Data não pode ser vazio.");
            }
        }while(data.isEmpty());

        do{
            menu.exibirMensagem("Digite o endereco: ");
            endereco = scan.nextLine();
            if(!endereco.isEmpty()){
                paciente.setEndereco(endereco);
            }else{
                menu.exibirMensagem("O Endereço não pode ser vazio.");
            }
        }while(endereco.isEmpty());

        do{
            menu.exibirMensagem("Digite o histórico hospitalar: ");
            historico = scan.nextLine();
            if(!historico.isEmpty()){
                paciente.setHistorico(historico);
            }else{
                menu.exibirMensagem("O Histórico não pode ser vazio.");
            }
        }while(historico.isEmpty());

        do{
            menu.exibirMensagem("Digite o telefone: ");
            telefone = scan.nextLine();
            if(telefone.length()==9){
                paciente.setTelefone(Integer.parseInt(telefone));
            }else{
                menu.exibirMensagem("O Telefone precisa ter 9 dígitos.");
            }

        }while(telefone.length()!=9);

        menu.exibirMensagem("Paciente registrado com sucesso.");
        return paciente;
    }

    public Medico criarMedico(Medico medico){

        String nome,especialidade,CRM,email,telefone;

        do{
            menu.exibirMensagem("Digite o nome: ");
            nome = scan.nextLine();
            if(!nome.isEmpty()){
                medico.setNome(nome);
            }else{
                menu.exibirMensagem("O Nome não pode ser vazio.");
            }
        }while(nome.isEmpty());

        do {
            menu.exibirMensagem("Digite o e-mail: ");
            email = scan.nextLine();
            if(!email.isEmpty()){
                medico.setEmail(email);
            }else{
                menu.exibirMensagem("O E-mail não pode ser vazio.");
            }
        }while(email.isEmpty());

        do {
            menu.exibirMensagem("Digite a especialidade: ");
            especialidade = scan.nextLine();
            if(!especialidade.isEmpty()){
                medico.setEspecialidade(especialidade);
            }else{
                menu.exibirMensagem("A Especialidade não pode ser vazio.");
            }
        }while(especialidade.isEmpty());

        do {
            menu.exibirMensagem("Digite o número do CRM: ");
            CRM = scan.nextLine();
            if(CRM.length()==6){
                medico.setCRM(Integer.parseInt(CRM));
            }else{
                menu.exibirMensagem("O CRM precisa ter 6 dígitos.");
            }
        }while(CRM.length()!=6);

        do {
            menu.exibirMensagem("Digite o telefone: ");
            telefone = scan.nextLine();
            if(telefone.length()==9){
                medico.setTelefone(Integer.parseInt(telefone));
            }else{
                menu.exibirMensagem("O Telefone precisa ter 9 dígitos.");
            }
        }while(telefone.length()!=9);

        menu.exibirMensagem("Médico registrado com sucesso.");
        return medico;
    }

    public Medicamento criarMedicamento(Medicamento medicamento){

        String nome, dosagem, frequencia, descricao, dataVenc, prescricao;

        do {
            menu.exibirMensagem("Digite o nome do medicamento: ");
            nome = scan.nextLine();
            if(!nome.isEmpty()){
                medicamento.setNome(nome);
            }else{
                menu.exibirMensagem("O Nome não pode ser vazio.");
            }
        }while(nome.isEmpty());

        do {
            menu.exibirMensagem("Digite a dosagem: ");
            dosagem = scan.nextLine();
            if(!dosagem.isEmpty()){
                medicamento.setDosagem(Integer.parseInt(dosagem));
            }else{
                menu.exibirMensagem("A Dosagem não pode ser vazio.");
            }
        }while(dosagem.isEmpty());

        do {
            menu.exibirMensagem("Digite a frequência em horas: ");
            frequencia = scan.nextLine();
            if(!frequencia.isEmpty()){
                medicamento.setFrequencia(Integer.parseInt(frequencia));
            }else{
                menu.exibirMensagem("A Frequência não pode ser vazio.");
            }
        }while(frequencia.isEmpty());

        do {
            menu.exibirMensagem("Digite a descrição: ");
            descricao = scan.nextLine();
            if(!descricao.isEmpty()){
                medicamento.setDescricao(descricao);
            }else{
                menu.exibirMensagem("A Descrição não pode ser vazio.");
            }
        }while(descricao.isEmpty());

        do {
            menu.exibirMensagem("Digite a data de vencimento no formato dd/mm/aaaa: ");
            dataVenc = scan.nextLine();
            if(!dataVenc.isEmpty()){
                medicamento.setDataVenc(dataVenc);
            }else{
                menu.exibirMensagem("A Data de vencimento não pode ser vazio.");
            }
        }while(dataVenc.isEmpty());

        do {
            menu.exibirMensagem("Digite a prescrição: ");
            prescricao = scan.nextLine();
            if(!prescricao.isEmpty()){
                medicamento.setPrescricao(prescricao);
            }else{
                menu.exibirMensagem("A Prescrição não pode ser vazio.");
            }
        }while(prescricao.isEmpty());

        menu.exibirMensagem("Medicamento registrado com sucesso.");
        return medicamento;
    }

    public Dispositivo criarDispositivo(Dispositivo dispositivo){

        String tipo, marca, modelo, status, valor;

        do {
            menu.exibirMensagem("Digite o tipo: ");
            tipo = scan.nextLine();
            if(!tipo.isEmpty()){
                dispositivo.setTipo(tipo);
            }else{
                menu.exibirMensagem("O Tipo não pode ser vazio.");
            }
        }while(tipo.isEmpty());

        do {
            menu.exibirMensagem("Digite a marca: ");
            marca = scan.nextLine();
            if(!marca.isEmpty()){
                dispositivo.setMarca(marca);
            }else{
                menu.exibirMensagem("A Marca não pode ser vazio.");
            }
        }while(marca.isEmpty());

        do {
            menu.exibirMensagem("Digite o modelo: ");
            modelo = scan.nextLine();
            if(!modelo.isEmpty()){
                dispositivo.setModelo(modelo);
            }else{
                menu.exibirMensagem("O Modelo não pode ser vazio.");
            }
        }while(modelo.isEmpty());

        do {
            menu.exibirMensagem("Digite o status: ");
            status = scan.nextLine();
            if(!status.isEmpty()){
                dispositivo.setStatus(status);
            }else{
                menu.exibirMensagem("O Status não pode ser vazio.");
            }
        }while(status.isEmpty());

        do {
            menu.exibirMensagem("Digite o valor: ");
            valor = scan.nextLine();
            if(!valor.isEmpty()){
                dispositivo.setValor(Integer.parseInt(valor));
            }else{
                menu.exibirMensagem("O Valor não pode ser vazio.");
            }
        }while(valor.isEmpty());

        menu.exibirMensagem("Dispositivo registrado com sucesso.");
        return dispositivo;
    }

    public Monitoramento criarMonitoramento(Monitoramento monitoramento){

        String dados;

        int tentativas = 0;
        int tentativas2 = 0;

        do{
            menu.exibirMensagem("Digite o CPF do paciente: ");
            Paciente paciente = ControllerPaciente.readPaciente(scan.nextLine());
            if(paciente!=null){
                monitoramento.setPaciente(paciente);
                break;
            }else{
                menu.exibirMensagem("Paciente não encontrado com esse CPF.");
                tentativas++;
            }
        }while(tentativas<3);

        if(monitoramento.getPaciente()==null){
            menu.exibirMensagem("Não foi possível criar um monitoramento.");
            return null;
        }

        do{
            menu.exibirMensagem("Digite o tipo do dispositivo: ");
            Dispositivo dispositivo = ControllerDispositivo.readDispositivo(scan.nextLine());
            if(dispositivo!=null){
                monitoramento.setDispositivo(dispositivo);
                break;
            }else{
                menu.exibirMensagem("Dispositivo não encontrado.");
                tentativas2++;
            }
        }while(tentativas2<3);

        if(monitoramento.getDispositivo()==null){
            menu.exibirMensagem("Não foi possível criar um monitoramento.");
            return null;
        }

        do{
            menu.exibirMensagem("Digite os dados: ");
            dados = scan.nextLine();
            if(!dados.isEmpty()){
                monitoramento.setDados(dados);
            }else{
                menu.exibirMensagem("O Monitoramento deve conter dados.");
            }
        }while(dados.isEmpty());

        menu.exibirMensagem("Monitoramento criado com sucesso.");
        return monitoramento;
    }

    public Alerta criarAlerta(Alerta alerta){

        String tipo, mensagem, data;

        int tentativas = 0;
        int tentativas2 = 0;

        do {
            menu.exibirMensagem("Digite o tipo: ");
            tipo = scan.nextLine();
            if(!tipo.isEmpty()){
                alerta.setTipo(tipo);
            }else{
                menu.exibirMensagem("O Tipo não pode ser vazio.");
            }
        }while(tipo.isEmpty());

        do {
            menu.exibirMensagem("Digite a mensagem: ");
            mensagem = scan.nextLine();
            if(!mensagem.isEmpty()){
                alerta.setMensagem(mensagem);
            }else{
                menu.exibirMensagem("A Mensagem não pode ser vazio.");
            }
        }while(mensagem.isEmpty());

        do{
            menu.exibirMensagem("Digite o CPF do paciente: ");
            Paciente paciente = ControllerPaciente.readPaciente(scan.nextLine());
            if(paciente!=null){
                alerta.setPaciente(paciente);
                break;
            }else{
                menu.exibirMensagem("Paciente não encontrado com esse CPF.");
                tentativas++;
            }
        }while(tentativas<3);

        if(alerta.getPaciente()==null){
            menu.exibirMensagem("Não foi possível criar um alerta.");
            return null;
        }

        do{
            menu.exibirMensagem("Digite o CRM do médico: ");
            Medico medico = ControllerMedico.readMedico(scan.nextInt());
            scan.nextLine();
            if(medico!=null){
                alerta.setMedico(medico);
                break;
            }else{
                menu.exibirMensagem("Médico não encontrado com esse CRM.");
                tentativas2++;
            }
        }while(tentativas2<3);

        if(alerta.getMedico()==null){
            menu.exibirMensagem("Não foi possível criar um alerta.");
            return null;
        }

        do {
            menu.exibirMensagem("Digite a data no formato dd/mm/aaaa: ");
            data = scan.nextLine();
            if(!data.isEmpty()){
                alerta.setData(data);
            }else{
                menu.exibirMensagem("A Data não pode ser vazio.");
            }
        }while(data.isEmpty());

        menu.exibirMensagem("Alerta criado com sucesso.");
        return alerta;
    }

    public Agendamento criarAgendamento(Agendamento agendamento){

        String data, hora, diagnostico;

        int tentativas = 0;
        int tentativas2 = 0;
        int tentativas3 = 0;

        do{
            menu.exibirMensagem("Digite a data no formato dd/mm/aaaa: ");
            data = scan.nextLine();
            if(!data.isEmpty()){
                agendamento.setData(data);
            }else{
                menu.exibirMensagem("A Data não pode ser vazio.");
            }
        }while(data.isEmpty());

        do{
            menu.exibirMensagem("Digite a hora: ");
            hora = scan.nextLine();
            if(!hora.isEmpty()){
                agendamento.setHora(hora);
            }else{
                menu.exibirMensagem("A hora não pode ser vazio.");
            }
        }while(hora.isEmpty());


        do{
            menu.exibirMensagem("Digite o CPF do paciente: ");
            Paciente paciente = ControllerPaciente.readPaciente(scan.nextLine());
            if(paciente!=null){
                agendamento.setPaciente(paciente);
                break;
            }else{
                menu.exibirMensagem("Paciente não encontrado com esse CPF.");
                tentativas++;
            }
        }while(tentativas<3);

        if(agendamento.getPaciente()==null){
            menu.exibirMensagem("Não foi possível criar um agendamento.");
            return null;
        }

        do{
            menu.exibirMensagem("Digite o CRM do médico: ");
            Medico medico = ControllerMedico.readMedico(scan.nextInt());
            scan.nextLine();
            if(medico!=null){
                agendamento.setMedico(medico);
                break;
            }else{
                menu.exibirMensagem("Médico não encontrado com esse CRM.");
                tentativas2++;
            }
        }while(tentativas2<3);

        if(agendamento.getMedico()==null){
            menu.exibirMensagem("Não foi possível criar um agendamento.");
            return null;
        }

        do{
            menu.exibirMensagem("Digite o diagnóstico: ");
            diagnostico = scan.nextLine();
            if(!diagnostico.isEmpty()){
                agendamento.setDiagnostico(diagnostico);
            }else{
                menu.exibirMensagem("O Diagnóstico não pode ser vazio.");
            }
        }while(diagnostico.isEmpty());

        do{
            menu.exibirMensagem("Digite o nome do medicamento: ");
            Medicamento medicamento = ControllerMedicamento.readMedicamento(scan.nextLine());
            if(medicamento!=null){
                agendamento.setMedicamento(medicamento);
                break;
            }else{
                menu.exibirMensagem("Medicamento não encontrado com esse nome.");
                tentativas3++;
            }
        }while(tentativas3<3);

        if(agendamento.getMedicamento()==null){
            menu.exibirMensagem("Não foi possível criar um agendamento.");
            return null;
        }

        menu.exibirMensagem("Agendamento criado com sucesso.");
        return agendamento;
    }

    public static void cadastros(int opcao){
        switch(opcao){
            case 1:
                Medicamento medicamento = new Medicamento();
                ControllerMedicamento controllerMedicamento = new ControllerMedicamento();
                controllerMedicamento.createMedicamento(medicamento);
                break;
            case 2:
                Dispositivo dispositivo = new Dispositivo();
                ControllerDispositivo controllerDispositivo = new ControllerDispositivo();
                controllerDispositivo.createDispositivo(dispositivo);
                break;
            case 3:
                Monitoramento monitoramento = new Monitoramento();
                ControllerMonitoramento controllerMonitoramento = new ControllerMonitoramento();
                controllerMonitoramento.createMonitoramento(monitoramento);
                break;
            case 4:
                Alerta alerta = new Alerta();
                ControllerAlerta controllerAlerta = new ControllerAlerta();
                controllerAlerta.createAlerta(alerta);
                break;
            case 5:
                Create create = new Create();
                create.criarPrescricao();
                break;
            case 6:
                Agendamento agendamento = new Agendamento();
                ControllerAgendamento controllerAgendamento = new ControllerAgendamento();
                controllerAgendamento.createAgendamento(agendamento);
                break;
            default:
                break;
        }
    }
}