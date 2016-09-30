import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Darcie on 3/09/2016.
 *
 */

class STDeck {
    private ArrayList<Card> cards;
    public ArrayList<Card> playedCards;
    private Card passCard;



    public STDeck() {
        cards = new ArrayList<Card>();
        playedCards = new ArrayList<Card>();
        initSTDeck();
        shuffleArray();
    }


        private void initSTDeck(){

        cards.add(new MineralCard("Quartz", "Sio2", "tectosilicate", "hexagonal",
                "igneous metamorphic sedimentary", 7.0, 2.65, "poor/none", "high", "moderate"));
        cards.add(new MineralCard("Plagioclase", "NaAlSi3O8 - CaAl2Si2O8", "tectosilicate", "triclinic",
                "igneous metamorphic sedimentary", 6.5, 2.8, "1 perfect, 1 good", "very high", "moderate"));
        cards.add(new MineralCard("Orthoclase", "KAlSi3O8", "tectosilicate", "monoclinic",
                "igneous metamorphic sedimentary", 6.5, 2.6, "1 perfect, 1 good", "high", "moderate"));
        cards.add(new MineralCard("Biotite", "K(Fe,Mg)3AlSi3O10(OH)2", "phyllosilicate", "monoclinic",
                "igneous metamorphic", 3.0, 3.3, "1 perfect", "moderate", "low"));
        cards.add(new MineralCard("Muscovite", "KAl3Si3O10(OH)2", "phyllosilicate", "monoclinic",
                "igneous metamorphic", 3.0, 2.9, "1 perfect", "moderate", "moderate"));
        cards.add(new TrumpCard("The Miner", "Economic Value"));
        cards.add(new MineralCard("Hornblende", "Ca2(Mg,Fe)4Al2Si7O22(OH)2", "inosilicate", "monoclinic",
                "igneous metamorphic", 6.0, 3.5, "2 good", "moderate", "trivial"));
        cards.add(new MineralCard("Actinolite", "Ca2(Mg,Fe)5Si8O22(OH)2", "inosilicate", "monoclinic",
                "metamorphic", 6.0, 3.5, "2 good", "low", "low"));
        cards.add(new MineralCard("Glaucophane", "Na2(Mg,Fe)3Al2Si8O22(OH)2", "inosilicate", "monoclinic",
                "metamorphic", 6.0, 3.2, "2 good", "low", "trivial"));
        cards.add(new MineralCard("Olivine", "(Mg,Fe)2SiO4", "nesosilicate", "orthorombic",
                "igneous metamorphic mantle", 7.0, 4.4, "2 poor", "high", "low"));
        cards.add(new MineralCard("Garnet", "(Fe,Mg,Ca,Mn)3(Al,Fe)2Si3O12", "nesosilicate", "isometric",
                "igneous metamorphic mantle", 7.5, 4.3, "none", "moderate", "moderate"));
        cards.add(new MineralCard("Titanite", "CaTiSiO5", "nesosilicate", "monoclinic",
                "igneous metamorphic", 5.5, 3.6, "3 good", "low", "low"));
        cards.add(new MineralCard("Zircon", "ZrSiO4", "nesosilicate", "tetragonal",
                "igneous metamorphic sedimentary", 7.5, 4.7, "2 poor", "trace", "moderate"));
        cards.add(new MineralCard("Augite", "Ca(Mg,Fe)Si2O6", "inosilicate", "monoclinic",
                "igneous metamorphic", 6.5, 3.6, "2 good", "high", "trivial"));
        cards.add(new MineralCard("Orthopyroxene", "(Mg,Fe)2Si2O6", "inosilicate", "orthorombic",
                "igneous metamorphic mantle", 6.0, 3.9, "2 good", "high", "trivial"));
        cards.add(new TrumpCard("The Petrologist", "Crustal Abundance"));
        cards.add(new MineralCard("Chlorite", "(Mg,Fe)5Al2Si3O10(OH)8", "phyllosilicate", "monoclinic",
                "metamorphic", 3.0, 3.3, "1 perfect", "moderate", "low"));
        cards.add(new MineralCard("Antigorite", "(Mg,Fe)3Si2O5(OH)4", "phyllosilicate", "monoclinic",
                "metamorphic mantle", 4.0, 2.6, "1 perfect", "low", "low"));
        cards.add(new MineralCard("Talc", "Mg3Si4O10(OH)2", "phyllosilicate", "monoclinic",
                "metamorphic", 1.0, 2.8, "1 perfect", "low", "moderate"));
        cards.add(new MineralCard("Kaolinite", "Al2Si2O5(OH)4", "phyllosilicate", "triclinic",
                "sedimentary", 2.5, 2.7, "1 perfect", "moderate", "high"));
        cards.add(new MineralCard("Andalusite", "Al2SiO5", "nesosilicate", "orthorhombic",
                "metamorphic", 7.0, 3.15, "2 good", "low", "moderate"));
        cards.add(new MineralCard("Kyanite", "Al2SiO5", "nesosilicate", "triclinic",
                "metamorphic", 7.0, 3.7, "1 perfect, 1 good", "trace", "moderate"));
        cards.add(new MineralCard("Sillimanite", "Al2SiO5", "nesosilicate", "orthorhombic",
                "igneous metamorphic", 7.5, 3.25, "1 perfect, 1 good", "low", "low"));
        cards.add(new MineralCard("Staurolite", "(Fe,Mg)2Al9Si4O22(OH)2", "nesosilicate", "monoclinic",
                "metamorphic", 7.0, 3.8, "1 good", "trace", "low"));
        cards.add(new MineralCard("Epidote", "Ca2(Al,Fe)3Si3O12(OH)", "sorosilicate", "monoclinic",
                "igneous metamorphic", 6.5, 3.5, "1 perfect", "moderate", "trivial"));
        cards.add(new TrumpCard("The Gemmologist", "Hardness"));
        cards.add(new MineralCard("Tourmaline", "Na(Mg,Fe)3Al6B3Si6O27(OH)4", "cyclosilicate", "hexagonal",
                "metamorphic", 7.5, 3.2, "2 poor", "trace", "moderate"));
        cards.add(new MineralCard("Topaz", "Al2SiO4(F,OH)2", "nesosilicate", "orthorhombic",
                "metamorphic sedimentary", 8.0, 3.6, "1 perfect", "ultratrace", "low"));
        cards.add(new MineralCard("Beryl", "Be3Al2Si6O18", "cyclosilicate", "hexagonal",
                "igneous metamorphic", 8.0, 2.9, "1 poor", "trace", "moderate"));
        cards.add(new MineralCard("Pyrite", "FeS2", "sulfide", "isometric",
                "igneous metamorphic", 6.5, 5.0, "2 poor", "low", "moderate"));
        cards.add(new MineralCard("Pyrrhotite", "Fe1-xS", "sulfide", "monoclinic",
                "igneous metamorphic", 4.5, 4.6, "none", "low", "moderate"));
        cards.add(new MineralCard("Chalcopyrite", "CuFeS2", "sulfide", "tetragonal",
                "igneous metamorphic", 4.0, 4.3, "2 poor", "low", "very high"));
        cards.add(new MineralCard("Galena", "PbS", "sulfide", "isometric",
                "metamorphic", 2.5, 7.6, "3 perfect", "trace", "high"));
        cards.add(new MineralCard("Sphalerite", "(Zn,Fe)S", "sulfide", "isometric",
                "metamorphic", 4.0, 4.1, "6 perfect", "trace", "high"));
        cards.add(new MineralCard("Molybdenite", "MoS2", "sulfide", "hexagonal",
                "igneous metamorphic", 1.5, 4.7, "1 perfect", "trace", "high"));
        cards.add(new TrumpCard("The Mineralogist", "Cleavage"));
        cards.add(new MineralCard("Gold", "Au", "native element", "isometric",
                "metamorphic sedimentary", 3.0, 19.3, "none", "ultratrace", "I'm rich!"));
        cards.add(new MineralCard("Diamond", "C", "native element", "isometric",
                "igneous metamorphic sedimentary", 10.0, 3.5, "4 perfect", "ultratrace", "I'm rich!"));
        cards.add(new MineralCard("Graphite", "C", "native element", "hexagonal",
                "metamorphic sedimentary", 2.0, 2.2, "1 perfect", "trace", "moderate"));
        cards.add(new MineralCard("Halite", "NaCl", "halide", "isometric",
                "sedimentary", 2.5, 2.2, "3 perfect", "trace", "moderate"));
        cards.add(new MineralCard("Fluorite", "CaF2", "halide", "isometric",
                "metamorphic", 4.0, 3.2, "4 perfect", "trace", "moderate"));
        cards.add(new MineralCard("Gypsum", "CaSo4(H2O)2", "sulfate", "monoclinic",
                "metamorphic sedimentary", 2.0, 2.3, "1 perfect, 2 good", "trace", "high"));
        cards.add(new MineralCard("Barite", "BaSO4", "sulfate", "orthorhombic",
                "metamorphic sedimentary", 3.5, 4.5, "2 perfect, 1 good", "trace", "moderate"));
        cards.add(new MineralCard("Apatite", "Ca5(PO4)3(OH,F,Cl)", "phosphate", "hexagonal",
                "igneous metamorphic sedimentary", 5.0, 3.2, "2 poor", "low", "high"));
        cards.add(new MineralCard("Monazite", "(La,Ce,Nd)PO4", "phosphate", "monoclinic",
                "igneous metamorphic sedimentary", 5.0, 5.3, "1 good, 1 poor", "trace", "moderate"));
        cards.add(new TrumpCard("The Geophysicist", "Specific gravity or Magnetite"));
        cards.add(new MineralCard("Calcite", "CaCO3", "carbonate", "hexagonal",
                "igneous metamorphic sedimentary", 3.0, 2.7, "3 perfect", "moderate", "high"));
        cards.add(new MineralCard("Dolomite", "CaMg(CO3)2", "carbonate", "hexagonal",
                "metamorphic sedimentary", 3.5, 2.9, "3 perfect", "low", "low"));
        cards.add(new MineralCard("Magnesite", "MgCO3", "carbonate", "hexagonal",
                "metamorphic sedimentary", 4.0, 3.0, "3 perfect", "low", "moderate"));
        cards.add(new MineralCard("Siderite", "FeCO3", "carbonate", "hexagonal",
                "metamorphic sedimentary", 4.5, 4.0, "3 perfect", "trace", "moderate"));
        cards.add(new MineralCard("Magnetite", "Fe3O4", "oxide (spinel)", "isometric",
                "igneous metamorphic sedimentary", 6.0, 5.2, "none", "moderate", "very high"));
        cards.add(new MineralCard("Hematite", "Fe2O3", "oxide", "hexagonal",
                "metamorphic sedimentary", 6.0, 5.3, "none", "trace", "high"));
        cards.add(new MineralCard("Chromite", "(Fe,Mg)Cr2O4", "oxide (spinal)", "isometric",
                "igneous sedimentary", 5.5, 5.1, "none", "low", "high"));
        cards.add(new MineralCard("Ilmenite", "TiFeO3", "oxide", "hexagonal",
                "igneous metamorphic sedimentary", 6.0, 4.8, "none", "low", "moderate"));
        cards.add(new MineralCard("Rutile", "TiO2", "oxide", "tetragonal",
                "metamorphic sedimentary", 6.5, 4.3, "2 good", "low", "high"));
        cards.add(new TrumpCard("The Geologist", "Any"));
        cards.add(new MineralCard("Corundum", "Al2O3", "oxide", "hexagonal",
                "metamorphic sedimentary", 9.0, 4.0, "none", "trace", "moderate"));
        cards.add(new MineralCard("Cassiterite", "SnO2", "oxide", "tetragonal",
                "igneous metamorphic sedimentary", 7.0, 7.1, "1 good, 1 poor", "trace", "high"));
        cards.add(new MineralCard("Gibbsite", "Al(OH)3", "hydroxide", "monoclinic",
                "metamorphic sedimentary", 3.5, 2.4, "1 perfect", "low", "high"));
        cards.add(new MineralCard("Geothite", "FeO(OH)", "hydroxide", "orthorhombic",
                "sedimentary", 5.5, 4.3, "1 perfect, 1 good", "moderate", "moderate"));

    }

    public String toString(){
        return cards.toString();
    }

    private ArrayList shuffleArray()
    {
        Collections.shuffle(cards);
        return cards;
        }

    public ArrayList dealCards(){
        ArrayList hand = new ArrayList<>();

        for(int i = 0; i < 8; i++){
            hand.add(cards.get(0));
            cards.remove(0);
        }
        return hand;
    }

    public Card playerTurnPass(){
        this.passCard = cards.get(0);
        cards.remove(0);
    return this.passCard;
    }

    public void checkEmptyDeck(){

        if (cards.size() == 2){
            cards.addAll(playedCards);
            System.out.println("The deck is empty. Re-shuffling the played cards back into the deck.");
            shuffleArray();

        }

    }

    public boolean emptyDeck(){
        if (cards.size() == 0){
            return true;
        }
        else {
            return false;
        }
    }

}
