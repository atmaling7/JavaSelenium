package assignment;

import java.util.Random;

public class RandomText {
	
	private static final String[] TECH_TERMS = {
	        "Artificial Intelligence", "Machine Learning", "Blockchain", 
	        "Cloud Computing", "Internet of Things", "Cybersecurity", 
	        "Data Science", "Big Data", "Augmented Reality", "Virtual Reality"
	    };
	private static final String[] TECH_TERMS2 = {
			 
				    "Liliaceae"
				  ,
				    "Grossulariaceae"
				  ,
				    "Trapeliaceae"
				  ,
				    "Asteraceae"
				  ,
				    "Brassicaceae"
				  ,
				    "Scrophulariaceae"
				  ,
				    "Apocynaceae"
				  ,
				    "Capparaceae"
				  ,
				    "Poaceae"
				  ,
				    "Fabaceae"
				  ,
				    "Cornaceae"
				  ,
				    "Scrophulariaceae"
				  ,
				    "Brassicaceae"
				  ,
				    "Caryophyllaceae"
				  ,
				    "Salicaceae"
				  ,
				    "Poaceae"
				  ,
				    "Fabaceae"
				  ,
				    "Asteraceae"
				  ,
				    "Orchidaceae"
				  ,
				    "Fabaceae"
				  ,
				    "Campanulaceae"
				  ,
				    "Scrophulariaceae"
				  ,
				    "Dryopteridaceae"
				  ,
				    "Dennstaedtiaceae"
				  ,
				    "Fumariaceae"
				  ,
				    "Agavaceae"
				  ,
				    "Cyperaceae"
				  ,
				    "Cyperaceae"
				  ,
				    "Viscaceae"
				  ,
				    "Fabaceae"
				  ,
				    "Cyperaceae"
				  ,
				    "Verrucariaceae"
				  ,
				    "Collemataceae"
				  ,
				    "Saxifragaceae"
				  ,
				    "Asteraceae"
				 
	};

	    public static void main(String[] args) {
	        Random random = new Random();
	        int randomIndex = random.nextInt(TECH_TERMS2.length);
	        String randomTerm = TECH_TERMS2[randomIndex];
	        System.out.println(randomTerm);
	    }
	
}
