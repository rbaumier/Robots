### Robot game !

__Polluters vs Cleaners__

Who won ? Who's next ? You decide !

-------------------------------------------------------------------------------------

__model__
monde => liste de robots + liste de cases

__timer__
timer (externe au model) => envoie un tick au controller toutes les ... => update du monde dans controller
Il peut être dans le programme principal, mais c'est mieux qu'il soit dans un thread.
il prend la forme while(true){
  sleep()
  updateModelView()
}

__controller__
1) updateWorld()
2) updateView
(il doit connaitre le monde et la vue)
déplacer, en fonction position autres robots -> j'abandonne déplacement ou j'essaie d'aller ailleurs.*

__view__


premier robot qui bouge : premier qui prend la case (implicitement lié à la position dans la liste)
=> on ne nous demande pas de gérer un déplacement parallèle et tout ... juste le premier qui bouge prend la case

le robot doit pouvoir conaitre le monde dans lequel il évolue pour pouvoir modifier l'état des cases.
le robot nettoyeur distrait doit nettoyer une case sale sur 2 (et pas une case sur 2)

*Normalement, le code de modification du model doit se trouver dans le controller (et non le model)
parcours de la liste des robots devrait être dans le controller.

Graphic :
awt ou javaFX (avantage: portable sur iOS et android nativement)

prof :
wc -l *.java
- version texte 299
- graphique : 545

déplacement
- r1.déplacer() => modifie x,y de robot
  -> random entre 1 et 4, si c'est 1, on essaie de le déplacer en haut à gauche, si c'est 2 en haut à droite, etc..., sinon xn=x-1, yn=y-2  => on peut faire différemment
  -> if(libre(xn,yn)) -> x=xn, y=yn

