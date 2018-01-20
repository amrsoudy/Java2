import java.util.Random;
import java.util.Scanner;

public class Blateau {
	Joueur joueur1;
	Joueur joueur2;
	Case[] caseList = new Case[36];
	

	Scanner kb = new Scanner(System.in);

	public Blateau(Joueur joueur1, Joueur joueur2) {

		this.joueur1 = joueur1;
		this.joueur2 = joueur2;
		CaseMultiply MutiplyCaseInstanse = new CaseMultiply();
		CaseDivision DivisionCaseInstanse = new CaseDivision();
		CaseSubstration SubstractionCaseInstanse = new CaseSubstration();
		CaseAddation AddCaseInstanse = new CaseAddation();
		CaseBond BondCaseInstanseB1 = new CaseBond(1);
		CaseBond BondCaseInstanseB2 = new CaseBond(2);
		CaseBond BondCaseInstanseB3 = new CaseBond(3);
		CaseFin FinCaseInstanse = new CaseFin();
		CaseDebut debutCaseInstanse = new CaseDebut();

		caseList[0] = debutCaseInstanse;
		caseList[1] = MutiplyCaseInstanse;
		caseList[2] = AddCaseInstanse;
		caseList[3] = DivisionCaseInstanse;
		caseList[4] = SubstractionCaseInstanse;
		caseList[5] = MutiplyCaseInstanse;
		caseList[6] = DivisionCaseInstanse;
		caseList[7] = BondCaseInstanseB2;
		caseList[8] = AddCaseInstanse;
		caseList[9] = DivisionCaseInstanse;

		caseList[10] = MutiplyCaseInstanse;
		caseList[11] = DivisionCaseInstanse;
		caseList[12] = SubstractionCaseInstanse;
		caseList[13] = AddCaseInstanse;
		caseList[14] = BondCaseInstanseB3;
		caseList[15] = SubstractionCaseInstanse;
		caseList[16] = DivisionCaseInstanse;
		caseList[17] = MutiplyCaseInstanse;
		caseList[18] = BondCaseInstanseB1;

		caseList[19] = AddCaseInstanse;
		caseList[20] = BondCaseInstanseB3;
		caseList[21] = MutiplyCaseInstanse;
		caseList[22] = SubstractionCaseInstanse;
		caseList[23] = DivisionCaseInstanse;
		caseList[24] = SubstractionCaseInstanse;
		caseList[25] = BondCaseInstanseB2;
		caseList[26] = DivisionCaseInstanse;
		caseList[27] = MutiplyCaseInstanse;

		caseList[28] = MutiplyCaseInstanse;
		caseList[29] = DivisionCaseInstanse;
		caseList[30] = MutiplyCaseInstanse;
		caseList[31] = DivisionCaseInstanse;
		caseList[32] = BondCaseInstanseB3;
		caseList[33] = AddCaseInstanse;
		caseList[34] = DivisionCaseInstanse;
		caseList[35] = FinCaseInstanse;

		this.joueur1.setCurentPosition(0);
		this.joueur2.setCurentPosition(0);

		run();

	}

	public void run() {
		Joueur CurrentJoueur = null;
		int NextJump;
		long temp1;
		long temp2;
		int de;
		int val1;
		int val2;
		Random rand = new Random();
		while (joueur1.getCurentPosition() < 35 && joueur2.getCurentPosition() < 35) {
			if (CurrentJoueur == null) {
				CurrentJoueur = joueur1;
			} else if (CurrentJoueur == joueur1) {

				CurrentJoueur = joueur2;

			} else {
				CurrentJoueur = joueur1;

			}

			temp1 = GetNextPosition();
			System.out.println("Svp pressez entre pour trouver le dée");

			kb.nextLine();
			kb.nextLine();

			temp2 = GetNextPosition();
			NextJump = (int) ((temp2 - temp1) % 6 + 1);
			System.out.println("le dée :  " + NextJump);
			val1 = rand.nextInt(5);
			val2 = rand.nextInt(5);
			if ((CurrentJoueur.getCurentPosition() + NextJump) < 35) {
				
			
				Case CurrentCase = caseList[CurrentJoueur.getCurentPosition() + NextJump];

				if (CurrentCase.getType() == "Bond") {
					System.out.println("Bond");
					CurrentJoueur.setCurentPosition(CurrentJoueur.getCurentPosition() + NextJump);
					CurrentJoueur.setCurentPosition(CurrentJoueur.getCurentPosition() + CurrentCase.getBondVal());
					System.out.println(CurrentJoueur.getNom() + " dans  case  nom  : " + CurrentJoueur.getCurentPosition());

				} else if (CurrentCase.getType() == "operation") {
					System.out.println("c'est La Tour de " + CurrentJoueur.getNom());

					System.out.println(CurrentCase.toString(val1, val2));
					int result = kb.nextInt();

					if (result == CurrentCase.calcul(val1, val2)) {
						System.out.println("c'est Correct");
						CurrentJoueur.setCurentPosition(CurrentJoueur.getCurentPosition() + NextJump);
						if (joueur1.getCurentPosition() == joueur2.getCurentPosition()) {
							System.out.println("c'est le meme place d'autre joueur");
							CurrentJoueur.setCurentPosition(CurrentJoueur.getCurentPosition() + 1);
							CurrentCase = caseList[CurrentJoueur.getCurentPosition()];
							if (CurrentCase.getType() == "Bond") {
								CurrentJoueur.setCurentPosition(
										CurrentJoueur.getCurentPosition() + CurrentCase.getBondVal());
							}

						}
						System.out.println(
								CurrentJoueur.getNom() + " dans  case  nom  : " + CurrentJoueur.getCurentPosition());

					} else {
						System.out.println("c'est pas correct reponse donc tu vas rester ici "
								+ CurrentJoueur.getCurentPosition());

					}

				}

			}else {
				
				CurrentJoueur.setCurentPosition(CurrentJoueur.getCurentPosition()+NextJump);
				System.out.println("tu est trouver la fin ");
				
				
				
			}

		}
		if (joueur1.getCurentPosition() > joueur2.getCurentPosition()) {

			System.out.println("la gagner est " + joueur1.getNom());

		} else {

			System.out.println("la gagner est   " + joueur2.getNom());

		}

	}

	public long GetNextPosition() {

		long temp = System.currentTimeMillis();

		return temp;
	}

}
