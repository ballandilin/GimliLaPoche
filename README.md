# GimliLaPoche 🍺⛏️

**Simulateur d'automate à états finis - La vie quotidienne de Gimli le nain**

*Projet réalisé dans le cadre du cursus DUT Informatique*

## Description

GimliLaPoche est une simulation basée sur un automate à états finis qui modélise la vie quotidienne de Gimli, un nain mineur. Le programme simule ses activités pendant une journée complète (1440 minutes) en prenant en compte son taux d'alcoolémie et ses différents États comportementaux.

![Automate Gimli](automate.graphml)

## Fonctionnalités

- **Simulation temporelle** : Simulation d'une journée complète par pas de 20 minutes
- **Gestion de l'alcoolémie** : Système réaliste de consommation et d'élimination d'alcool
- **Automate à états** : 7 états différents avec transitions probabilistes
- **Statistiques** : Comptage des transitions entre états
- **Pattern State** : Implementation du design pattern State pour une architecture propre

## Architecture

### États principaux
- **Mine** : États liés au travail (Travail, Pause, Forgeron)
- **Taverne** : Consommation d'alcool
- **Lit** : Repos et désaoûlement (Sieste 1, 2, 3)

### États spécifiques
1. **EtatTravail** : Gimli travaille à la mine (-0.15g alcool/cycle)
2. **EtatPause** : Pause avec consommation d'une bière (+0.39g alcool)
3. **EtatForgeron** : Réparation de la pioche cassée (-0.1g alcool)
4. **EtatTaverne** : Consommation de 3 bières (+1.17g alcool)
5. **EtatSieste1** : Première phase de sommeil (alcool = 0)
6. **EtatSieste2** : Deuxième phase de sommeil
7. **EtatSieste3** : Dernière phase avant réveil

## Logique de transition

### Probabilités dynamiques
- **Cassage de pioche** : 15% de base + 8% par gramme d'alcool
- **Bagarre en taverne** : 5% de base + 15% par gramme d'alcool
- **Sieste forcée** : Si taux d'alcool > 8g

### Calcul de l'alcoolémie
- **Taux par bière** : ~0.39g (28g / (102kg × 0.7))
- **Élimination** : 0.1-0.15g par cycle selon l'activité

## Installation et utilisation

### Prérequis
- Java 8 ou supérieur
- IDE Java (IntelliJ IDEA, Eclipse, etc.)

### Compilation et exécution
```bash
# Compilation
cd LaMine/src
javac com/company/*.java com/company/etats/*.java com/company/etats/sousEtats/*.java

# Exécution
java com.company.Main
```

### Utilisation dans un IDE
1. Ouvrir le projet dans votre IDE
2. Configurer le SDK Java
3. Exécuter la classe `Main.java`

## Résultats

Le programme affiche un récapitulatif des transitions entre états sous forme de HashMap :
```
-------------------------  Recap Temps  -------------------------
{MineTaverne=42, TaverneTaverne=156, MineMine=1832, ...}
```

## Structure du projet

```
GimliLaPoche/
├── README.md
├── .gitignore               # Fichiers à ignorer par Git
├── automate.graphml          # Diagramme de l'automate
├── GimliLaPoche              # Diagramme draw.io
├── GimliLaPoche.png         # Image du diagramme
└── LaMine/
    ├── LaMine.iml           # Configuration IntelliJ
    └── src/
        └── com/company/
            ├── Main.java            # Point d'entrée
            ├── Gimli.java           # Classe principale de simulation
            ├── GimliTest.java       # Version de test (obsolète)
            └── etats/
                ├── Etat.java        # Classe abstraite des états
                ├── TypeEtat.java    # Énumération des types d'états
                ├── Mine.java        # État parent Mine
                ├── Taverne.java     # État parent Taverne
                ├── Lit.java         # État parent Lit
                └── sousEtats/
                    ├── EtatTravail.java
                    ├── EtatPause.java
                    ├── EtatForgeron.java
                    ├── EtatTaverne.java
                    ├── EtatSieste1.java
                    ├── EtatSieste2.java
                    └── EtatSieste3.java
```

## Paramètres de simulation

- **Durée totale** : 1440 minutes (24h)
- **Pas de temps** : 20 minutes
- **Poids de Gimli** : 102 kg
- **Facteur d'hydratation** : 0.7
- **Teneur en alcool des bières** : 28g par bière

## Personnalisation

Pour modifier le comportement de la simulation :

1. **Probabilités** : Modifier les taux dans les méthodes `transition()`
2. **Consommation d'alcool** : Ajuster `tauxAlcoolBiere` dans `Etat.java`
3. **Durée** : Changer la variable `Temps` dans `Gimli.automate()`
4. **Pas de temps** : Modifier l'incrément `this.temps += 20`

## Auteur

- **Benjamin Milhet**
- **Nicolas Benoit**

## Notes techniques

- Utilisation du **Design Pattern State** pour une architecture modulaire
- Gestion des transitions probabilistes avec `Random`
- Système de récupération des statistiques via HashMap
- Code commenté et documenté en JavaDoc

## Problèmes connus

- Bug potentiel dans `EtatForgeron.transition()` : `Math.random()*3` devrait être `new Random().nextInt(3)`
- Classe `GimliTest` obsolète mais conservée pour référence

---

*Projet académique de simulation d'automate à états finis en Java - DUT Informatique*
