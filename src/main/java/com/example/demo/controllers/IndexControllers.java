package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Clientes;
import com.example.demo.models.Computadoras;
import com.example.demo.models.Proveedores;
import com.example.demo.models.Tickets;
import com.example.demo.models.Venta;

@Controller
@RequestMapping("/ExamenUnidad2")
public class IndexControllers {
	
	@GetMapping("/")
	public String index(Model modelo) {
		modelo.addAttribute("titulo","Menú de Negocio");
		return "index";
	}
	
	@GetMapping("/clientes")
	public String clientes(Model modelo) {
		ArrayList<Clientes> client= new ArrayList<Clientes>();
		client.add(new Clientes(2832384,"Alonso","Cabral Ramírez",554478627,"alonsocabral@live.com","Valencia Robledo"));
		client.add(new Clientes(8283732,"Blanca","Nuñez Esparza",557961731,"BlancaVector@live.com","Reyes del moral"));
		client.add(new Clientes(8213492,"Melinda","Campos Lara",519874129,"MafaldabyQuino@gmail.com","Enrique Barcelo"));
		client.add(new Clientes(2831832,"Felipe","Álvarez Chávez",552183182,"felipito498@gmail.com","Valle de Bravo"));
		client.add(new Clientes(1290139,"Leonardo","Ramos Salinas",557912344,"leoguerreeroc@gmail.com","Nueva Atalaya "));
		client.add(new Clientes(2832384,"Oscar","Tapia Rosas",554478627,"oscarin_genio@live.com","Arcos de Belen "));
		client.add(new Clientes(8283732,"Alejandra","Treviño Guerrero",557961731,"Alesepsimodel@live.com","Salvador Márquez"));
		client.add(new Clientes(8213492,"Mario","Filio Blanco",519874129,"generalkenobio@gmail.com","Barovero Galindo"));
		client.add(new Clientes(2831832,"Valeria","García Jara",552183182,"valekeygarza89@gmail.com","Alex Blanco "));
		client.add(new Clientes(1290139,"Paola","Rojas Sandoval",557912344,"pau_rojonav@gmail.com","Avenida Faro de Ote "));
		modelo.addAttribute("clientes",client);
		modelo.addAttribute("titulo","Tabla Clientes");
		return "clientes";
	}
	
	@GetMapping("/computadoras")
	public String computadoras(Model modelo) {
		ArrayList<Computadoras> compu= new ArrayList<Computadoras>();
		compu.add(new Computadoras(2832384,"Lenovo","Intel Celeron","Windows","4 gb",8));
		compu.add(new Computadoras(2832384,"Hp Pavilion"," Core i5","Ubuntu","8 gb",6));
		compu.add(new Computadoras(2832384,"Asus","Core i5 ","Linux ","12 gb",4));
		compu.add(new Computadoras(2832384,"Mac Book Air","Intel Celeron","Mac OS X","4 gb",4));
		compu.add(new Computadoras(2832384,"Pentium Gold","Intel","Windows","8 gb",4));
		compu.add(new Computadoras(2832384,"Dell Gaming","Intel Core i5","Windows","8 gb",8));
		compu.add(new Computadoras(2832384,"Lap Hp"," AMD Ryzen","Linux Ubuntu","8 gb",8));
		compu.add(new Computadoras(2832384,"Asus","Core i5 ","Linux ","12 gb",4));
		compu.add(new Computadoras(2832384,"Dell Precision","Intel 8a i7","Mac OS X","4 gb",6));
		compu.add(new Computadoras(2832384,"Acer Aspire 5 Slim","AMD Ryzen 5","Windows","8 gb",4));
		modelo.addAttribute("computadoras",compu);
		modelo.addAttribute("titulo","Tabla Compus");
		return "computadoras";
	}
	
	@GetMapping("/proveedores")
	public String proveedores(Model modelo) {
		ArrayList<Proveedores> prov= new ArrayList<Proveedores>();
		prov.add(new Proveedores(2832382,"GlobalTek","Alfredo Carreón","Carreoncorp@live.com","713418HVDF8",557965931,"Alfredo Molina"));
		prov.add(new Proveedores(2198913,"KimNet","Armando Robledo","robledoarm@live.com","2812271BNMR08",551821212,"Enrique Esparza"));
		prov.add(new Proveedores(2823294,"Cumpoatm","Marco González","cupomarc@live.com","7128491UTEOR99",551928121,"Joel Vásquez"));
		prov.add(new Proveedores(2747290,"MayorCompu","David Guzmán","davidsabio@live.com","812172187KBN42",558127120,"Kevin Pérez"));
		prov.add(new Proveedores(2198727,"PCSolutions","Carlos Rodríguez","lazioprox@live.com","5512871GER1",558127218,"Laura Torres"));
		prov.add(new Proveedores(2314900,"Arcnet","Zayda Almodóvar","Carreoncorp@live.com","821741712GBNM9",559127123,"Soldedad Vela"));
		prov.add(new Proveedores(2098712,"CompuDabo","Rosa Vásquez","PipaGD_Rosita@live.com","812721821GBL1",551928174,"Montes de Oca"));
		prov.add(new Proveedores(2091283,"TeckOption","Homero Hinojosa","HomerSimpsonmex@live.com","1832u828NMKB4",55634902,"Av Arcos de Belén"));
		prov.add(new Proveedores(2910192,"SuitOffice","Carlos Rivera","ReyLeonSimba@live.com","71841098JQN2",557961346,"Mar de plata"));
		prov.add(new Proveedores(2918728,"Arcadia","Lucia Alvarado","ready_player_one99@live.com","128471842BET",556651379,"Estela Plateada 07"));
		modelo.addAttribute("proveedores",prov);
		modelo.addAttribute("titulo","Tabla Proveedores");
		return "proveedores";
	}
	
	@GetMapping("/tickets")
	public String tickets(Model modelo) {
		ArrayList<Tickets> tick= new ArrayList<Tickets>();
		tick.add(new Tickets(2832384, 92189182, 18319824,"4 piezas", "$10000"));
		tick.add(new Tickets(4984782, 18341557, 91272173,"10 piezas", "$100000"));
		tick.add(new Tickets(1298139, 12891355, 71233131,"5 piezas", "$12000"));
		tick.add(new Tickets(4232311, 51892020, 68436980,"3 piezas", "$8000"));
		tick.add(new Tickets(5573492, 91293430, 12894191,"15 piezas", "$145500"));
		tick.add(new Tickets(1283189, 91293430, 82121919,"11 piezas", "$110500"));
		tick.add(new Tickets(4937411, 67813459, 17247128,"6 piezas", "$75500"));
		tick.add(new Tickets(7082195, 13822898, 12312671,"12 piezas", "$115500"));
		tick.add(new Tickets(1234578, 74839250, 97135792,"6 piezas", "$55500"));
		tick.add(new Tickets(9874321, 11994400, 11389756,"2 piezas", "$30000"));
		
		modelo.addAttribute("tickets",tick);
		modelo.addAttribute("titulo","Tabla Tickets");
		return "tickets";
	}
	
		@GetMapping("/venta")
		public String venta(Model modelo) {
			ArrayList<Venta> vent= new ArrayList<Venta>();
			vent.add(new Venta(2832384,82349327,"04/10/14",4000 , 149.90, 199.90, 4350.50));
			vent.add(new Venta(2932984,61734126,"21/09/24",8000 , 249.90, 249.90, 8500.50));
			vent.add(new Venta(2814132,52133932,"05/12/10",9000 , 119.90, 39.90, 9550.50));
			vent.add(new Venta(2192390,12344789,"15/02/08",5500 , 109.90, 20.90, 5640.50));
			vent.add(new Venta(2855327,94817481,"25/07/20",11000 , 99.90, 55.90, 7000.50));
			vent.add(new Venta(8317483,21978413,"02/10/19",9000 , 49.90, 119.90, 9170.50));
			vent.add(new Venta(2932984,61249977,"20/04/22",4000 , 69.90, 209.90, 4280.50));
			vent.add(new Venta(1277333,81212859,"11/03/11",7500 , 109.90, 39.90, 7550.50));
			vent.add(new Venta(8232487,98756110,"15/07/08",11500 , 79.90, 20.90, 11600.50));
			vent.add(new Venta(1987242,12234789,"29/05/09",20000 , 399.90, 45.90, 20450.50));
			modelo.addAttribute("venta",vent);
			modelo.addAttribute("titulo","Tabla Venta");
			return "venta";	
		}

}
