package ro.ase.cts.facade.classes;

public class FacadeInternare {

	public static String verificaPacient(Pacient pacient) {
		Medic medic = new Medic("Ion", "Cardiolog");
		StringBuilder sb = new StringBuilder();
		if (pacient.isEsteInStareGrava()) {
			sb.append("Pacientul " + pacient.getNumePacient() + " este in stare grava, trimite catre medic. ");
			
		}
		else {
			sb.append("Pacientul "+pacient.getNumePacient()+ " nu necesita internare. ");
		}
		if (medic.esteNecesareInternare(pacient)) {
			sb.append("Medicul a decis internarea. ");
			Salon salon = new Salon(24);
			if (salon.arePaturiLibere()) {
				sb.append(pacient.getNumePacient() + " poate fi internet in salon.");
			} else {
				sb.append(pacient.getNumePacient() + " va fi trimis catre alt spital.");
			}
		}

		return sb.toString();
	}

}
