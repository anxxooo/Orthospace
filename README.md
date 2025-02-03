# Orthospace

## Présentation  
Orthospace est une application dédiée à la gestion des cabinets d’orthophonie, facilitant l’organisation des rendez-vous, la prise en charge des patients et leur suivi. Elle permet aux orthophonistes d’accompagner les personnes de tous âges ayant des troubles du langage, de la communication, de l’apprentissage ou de la déglutition, afin d’améliorer leur autonomie et leur bien-être.

## Fonctionnalités  

### 1. Création de compte  
Lors de la première utilisation, l’orthophoniste crée son compte en renseignant :  
- Nom et prénom  
- Adresse  
- Numéro de téléphone  
- Adresse e-mail  
- Mot de passe  

### 2. Gestion des rendez-vous  
L'application intègre un agenda pour planifier différents types de consultations :  
- **Consultation initiale** : Première visite du patient (nom, prénom, âge requis).  
- **Séance de suivi** : Pour un patient déjà pris en charge (numéro de dossier, séance en présentiel ou en ligne).  
- **Atelier de groupe** : Session collective avec plusieurs patients (thématique et numéros de dossiers des participants).  

**Durée des rendez-vous :**  
- Consultation initiale : 1h30 pour un adulte, 2h30 pour un enfant  
- Séances suivantes : 1 heure  

### 3. Bilan orthophonique (BO)  
Le bilan orthophonique suit plusieurs étapes :  
1. **Anamnèse** : Questionnaire sur l’historique du patient (différencié pour adultes et enfants).  
2. **Épreuves cliniques** :  
   - Observations générales  
   - Tests standardisés avec notation de 1 à 10  
3. **Diagnostic** : Détection des troubles (déglutition, neuro-développementaux, cognitifs).  
4. **Projet thérapeutique** : Définition de la stratégie de prise en charge.  

### 4. Dossier patient  
Chaque patient possède un dossier unique contenant toutes ses informations : rendez-vous, bilans orthophoniques, fiches de suivi et documents annexes.  

### 5. Fiche de suivi  
- Définition d’objectifs à court, moyen et long terme.  
- Notation de 1 à 5 pour évaluer les progrès du patient.  
- Création de nouvelles fiches lorsque des objectifs sont atteints.  

### 6. Gestion des tests et anamnèses  
Possibilité de créer, modifier et sauvegarder des tests et des questionnaires d’anamnèse.  

### 7. Consultation des dossiers patients  
- Accès aux rendez-vous, observations, comptes-rendus et fiches de suivi.  
- Analyse de l’évolution du patient via des courbes de progression.  
- Classement des patients par type de trouble et statistiques associées.  

## Installation  

1. Clonez le dépôt :  
   ```bash
   git clone "https://github.com/anxxooo/Orthospace"
   ```  
2. Accédez au dossier du projet :  
   ```bash
   cd Orthospace
   ```  
3. Installez l'extension Java pour Visual Studio Code.  
4. Importez les fichiers JAR du dossier `lib` dans la section `Java Projects` de VS Code :  
   - Ouvrez le panneau **Java Projects**.  
   - Cliquez sur **Add JARs** et sélectionnez tous les fichiers du dossier `lib`.  

