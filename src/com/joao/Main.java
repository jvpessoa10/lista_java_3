package com.joao;

import com.joao.domain.*;
import com.joao.services.CarService;
import com.joao.services.HostService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public CarService carService;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escolha o  tipo de serviço:");
        System.out.println("1 - Aluguel de veiculos");
        System.out.println("2 - Aluguel de residencias \n >> ");



        ArrayList result = new ArrayList();

        int menuInput = in.nextInt();
        if(menuInput == 1){
            CarService carService = new CarService();
            System.out.println("Escolha o  tipo de veículo:\n 1 - Carro comum\n2 - Carro basico\n3 - Carro luxo\n4 - Carro executivo");

            Class classType;
            switch (in.nextInt()){
                case 1:
                    classType = CarroComum.class;
                    break;
                case 2:
                    classType = CarroBasico.class;
                    break;
                case 3:
                    classType = CarroLuxo.class;
                    break;
                case 4:
                    classType = CarroExecutivo.class;
                    break;
                default:
                    classType = CarroComum.class;

            }

            result = carService.findByType(classType);

        }else if(menuInput == 2){
            HostService hostService = new HostService();
            System.out.println("Escolha o  tipo de Acomodamento:\n 1 - Hotel\n2 - Pousada\n3 - Albergue\n4 - Aluguel de casa ou apartamento");

            Class classType;
            switch (in.nextInt()){
                case 1:
                    classType = Hotel.class;
                    break;
                case 2:
                    classType = Pousada.class;
                    break;
                case 3:
                    classType = Albergue.class;
                    break;
                case 4:
                    classType = Aluguel.class;
                    break;
                default:
                    classType = Hotel.class;

            }

            result = hostService.findByType(classType);
        }


        for (int i = 0; i <result.size() ; i++) {
            System.out.println(i + " - " + result.get(i).toString());
        }



    }
}
