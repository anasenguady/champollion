package champollion;

public class Enseignant extends Personne {

    // TODO : rajouter les autres méthodes présentes dans le diagramme UML
    List<ServicePrevu> serviceprevu = new ArrayList<>();
    List<Intervention> interventions = new LinKedList<>();
    

    public Enseignant(String nom, String email) {
        super(nom, email);  
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        int equivalentTD =0;
        for (ServicePrevu s : serviceprevu) {
                equivalentTD += 1.5*s.getVolumeCM();
                equivalentTD +=s.getVolumeTD();
                equivalentTD +=0.75*s.getVolumeTP();
                
                round(equivalentTD);
        
                        
                        
                     
            
           
        }
        return equivalentTD;
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
        int heuresequivalentTD=0;
        for(ServicesPrevu s : servicesprevu) {
            if(s.getUe() == ue) {
                heuresequivalentTD += 1.5$s.getVolumeCM() ;
                heuresequivalentTD += s.getVolumeTD();
                heuresequivalentTD += s.getVolmeTP();
                round(heuresequivalentTD);
            }
        }
        return heuresequivalentTD ; 
    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        ServicePrevu nouveauService = new servicePrevu(this , ue , volumeCM, volumeTD, volumeTP);
        serviceprevu.add(nouveauservice);
    }

}
