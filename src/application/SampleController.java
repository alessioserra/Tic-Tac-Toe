package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class SampleController {
	
	String s = "";
	int contatore = 0;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button b11;

    @FXML
    private Button b12;

    @FXML
    private Button b13;

    @FXML
    private Button b22;

    @FXML
    private Button b23;

    @FXML
    private Button b31;

    @FXML
    private Button b32;

    @FXML
    private Button b33;

    @FXML
    private Button b21;

    @FXML
    private Button bottoneAvvia;

    @FXML
    private TextArea messaggi;
    
    @FXML
    private TextArea txt11;

    @FXML
    private TextArea txt12;

    @FXML
    private TextArea txt13;

    @FXML
    private TextArea txt21;

    @FXML
    private TextArea txt22;

    @FXML
    private TextArea txt23;

    @FXML
    private TextArea txt31;

    @FXML
    private TextArea txt32;

    @FXML
    private TextArea txt33;

    @FXML
    void avviaPartita(ActionEvent event) {
    	
    	contatore=0;
    	bottoneAvvia.setDisable(true);
    	s="ics";
    	
    	b11.setDisable(false);
    	b12.setDisable(false);
    	b13.setDisable(false);
    	b21.setDisable(false);
    	b22.setDisable(false);
    	b23.setDisable(false);
    	b31.setDisable(false);
    	b32.setDisable(false);
    	b33.setDisable(false);
    	
    	messaggi.setText("Comincia a giocare il giocatore X");
    	
    	txt11.clear();
    	txt12.clear();
    	txt13.clear();
    	txt21.clear();
    	txt22.clear();
    	txt23.clear();
    	txt31.clear();
    	txt32.clear();
    	txt33.clear();

    }

    //OK!
    @FXML
    void b11(ActionEvent event) {
    	
    	contatore++;
    	
    	if (s.compareTo("ics")==0) {
    		s="ooo";
    		txt11.setText("X");
    		messaggi.setText("Turno del giocatore O");
    		b11.setDisable(true);
    	
    		if ( (txt22.getText().compareTo("X")==0 && txt33.getText().compareTo("X")==0)
    		  || (txt21.getText().compareTo("X")==0 && txt31.getText().compareTo("X")==0)
    		  || (txt12.getText().compareTo("X")==0 && txt13.getText().compareTo("X")==0) ) {
    			messaggi.setText("Giocatore X ha vinto la partita!!!");
    			
    			bottoneAvvia.setDisable(false);
    			b11.setDisable(true);
    	    	b12.setDisable(true);
    	    	b13.setDisable(true);
    	    	b21.setDisable(true);
    	    	b22.setDisable(true);
    	    	b23.setDisable(true);
    	    	b31.setDisable(true);
    	    	b32.setDisable(true);
    	    	b33.setDisable(true);
    		}
    	
    	}

    	else {
    		s="ics";
    		txt11.setText("O");
    		messaggi.setText("Turno del giocatore X");
    		b11.setDisable(true);
    		
    		if ( (txt22.getText().compareTo("O")==0 && txt33.getText().compareTo("O")==0)
    		  || (txt21.getText().compareTo("O")==0 && txt31.getText().compareTo("O")==0)
    	      || (txt12.getText().compareTo("O")==0 && txt13.getText().compareTo("O")==0) ) {
    			messaggi.setText("Giocatore O ha vinto la partita!!!");
    			
    			bottoneAvvia.setDisable(false);
    			b11.setDisable(true);
    	    	b12.setDisable(true);
    	    	b13.setDisable(true);
    	    	b21.setDisable(true);
    	    	b22.setDisable(true);
    	    	b23.setDisable(true);
    	    	b31.setDisable(true);
    	    	b32.setDisable(true);
    	    	b33.setDisable(true);
    		}
    	}
    	
    	if (contatore == 9) {
    		messaggi.setText("PAREGGIO! Premere 'Avvia Partita' per cominciare una nuova partita.");
    		bottoneAvvia.setDisable(false);
    	}
    	
    }

    //OK!
    @FXML
    void b12(ActionEvent event) {
    	
    	contatore++;
    	
    	if (s.compareTo("ics")==0) {
    		s="ooo";
    		txt12.setText("X");
    		messaggi.setText("Turno del giocatore O");
    		b12.setDisable(true);
    		
    		if ( (txt11.getText().compareTo("X")==0 && txt13.getText().compareTo("X")==0)
    	    || (txt22.getText().compareTo("X")==0 && txt32.getText().compareTo("X")==0) ) {
    	    			
    			messaggi.setText("Giocatore X ha vinto la partita!!!");
    	        
    			bottoneAvvia.setDisable(false);  			
    			b11.setDisable(true);
    			b12.setDisable(true);
    	    	b13.setDisable(true);
    			b21.setDisable(true);
    			b22.setDisable(true);
     			b23.setDisable(true);
     			b31.setDisable(true);
      			b32.setDisable(true);
    	    	b33.setDisable(true);
    			}
    		
    	}

    	else {
    		s="ics";
    		txt12.setText("O");
    		messaggi.setText("Turno del giocatore X");
    		b12.setDisable(true);
    		
    		if ( (txt11.getText().compareTo("O")==0 && txt13.getText().compareTo("O")==0)
    	      || (txt22.getText().compareTo("O")==0 && txt32.getText().compareTo("O")==0) ) {
    	    	    			
    			messaggi.setText("Giocatore O ha vinto la partita!!!");
    	    	    			
    	    	bottoneAvvia.setDisable(false);
      			b11.setDisable(true);
      			b12.setDisable(true);
    	    	b13.setDisable(true);
      	    	b21.setDisable(true);
      	    	b22.setDisable(true);
      	    	b23.setDisable(true);
      	    	b31.setDisable(true);
       	    	b32.setDisable(true);
       	    	b33.setDisable(true);
        		}
    	}
    	
    	if (contatore == 9) {
    		messaggi.setText("PAREGGIO! Premere 'Avvia Partita' per cominciare una nuova partita.");
    		bottoneAvvia.setDisable(false);
    	}

    }

    
    //OK!
    @FXML
    void b13(ActionEvent event) {
    	
    	contatore++;

    	if (s.compareTo("ics")==0) {
    		s="ooo";
    		txt13.setText("X");
    		messaggi.setText("Turno del giocatore O");
    		b13.setDisable(true);
    		
    		if ( (txt11.getText().compareTo("X")==0 && txt12.getText().compareTo("X")==0)
    	      || (txt23.getText().compareTo("X")==0 && txt33.getText().compareTo("X")==0)
         	  || (txt31.getText().compareTo("X")==0 && txt22.getText().compareTo("X")==0) ) {
    	    	    			
    	   		messaggi.setText("Giocatore X ha vinto la partita!!!");
    	    	        
     			bottoneAvvia.setDisable(false);  			
     			b11.setDisable(true);
    	    	b12.setDisable(true);
    	      	b13.setDisable(true);
    	    	b21.setDisable(true);
    	    	b22.setDisable(true);
    	     	b23.setDisable(true);
    	     	b31.setDisable(true);
    	      	b32.setDisable(true);
    	    	b33.setDisable(true);
    	    	}
    		
    	}

    	else {
    		s="ics";
    		txt13.setText("O");
    		messaggi.setText("Turno del giocatore X");
    		b13.setDisable(true);
    		
    		if ( (txt11.getText().compareTo("O")==0 && txt12.getText().compareTo("O")==0)
    	      || (txt23.getText().compareTo("O")==0 && txt33.getText().compareTo("O")==0)
    	      || (txt31.getText().compareTo("O")==0 && txt22.getText().compareTo("O")==0) ) {
    	    	    	    			
        	  messaggi.setText("Giocatore X ha vinto la partita!!!");
    	    	   	        
    	      bottoneAvvia.setDisable(false);  			
    	     b11.setDisable(true);
    	     b12.setDisable(true);
    	     b13.setDisable(true);
    	     b21.setDisable(true);
    	     b22.setDisable(true);
    	     b23.setDisable(true);
    	     b31.setDisable(true);
    	     b32.setDisable(true);
    	     b33.setDisable(true);
    	     }
    		
    	}
    	
    	if (contatore == 9) {
    		messaggi.setText("PAREGGIO! Premere 'Avvia Partita' per cominciare una nuova partita.");
    		bottoneAvvia.setDisable(false);
    	}
    }

    //OK!
    @FXML
    void b21(ActionEvent event) {
    	
    	contatore++;
    	
    	if (s.compareTo("ics")==0) {
    		s="ooo";
    		txt21.setText("X");
    		messaggi.setText("Turno del giocatore O");
    		b21.setDisable(true);
    		
    		if ( (txt11.getText().compareTo("X")==0 && txt31.getText().compareTo("X")==0)
    	      || (txt22.getText().compareTo("X")==0 && txt23.getText().compareTo("X")==0) ) {
    	    			messaggi.setText("Giocatore X ha vinto la partita!!!");
    	    			
    	    			bottoneAvvia.setDisable(false);
    	    			b11.setDisable(true);
    	    	    	b12.setDisable(true);
    	    	    	b13.setDisable(true);
    	    	    	b21.setDisable(true);
    	    	    	b22.setDisable(true);
    	    	    	b23.setDisable(true);
    	    	    	b31.setDisable(true);
    	    	    	b32.setDisable(true);
    	    	    	b33.setDisable(true);
    	    		}
    	}

    	else {
    		s="ics";
    		txt21.setText("O");
    		messaggi.setText("Turno del giocatore X");
    		b21.setDisable(true);
    		
    		if ( (txt11.getText().compareTo("O")==0 && txt31.getText().compareTo("O")==0)
    	      || (txt22.getText().compareTo("O")==0 && txt23.getText().compareTo("O")==0) ) {
    	    	    			
    			messaggi.setText("Giocatore O ha vinto la partita!!!");
    	    	    			
    	    	    			
    			bottoneAvvia.setDisable(false);
    	    	    			
    			b11.setDisable(true);
    	    	b12.setDisable(true);
    	    	b13.setDisable(true);
    	    	b21.setDisable(true);
    	    	b22.setDisable(true);
    	    	b23.setDisable(true);
    	    	b31.setDisable(true);
    	        b32.setDisable(true);
    	    	b33.setDisable(true);
    	    	}
    	}
    	
    	if (contatore == 9) {
    		messaggi.setText("PAREGGIO! Premere 'Avvia Partita' per cominciare una nuova partita.");
    		bottoneAvvia.setDisable(false);
    	}

    }

    //OK!
    @FXML
    void b22(ActionEvent event) {
    	
    	contatore++;

    	if (s.compareTo("ics")==0) {
    		s="ooo";
    		txt22.setText("X");
    		messaggi.setText("Turno del giocatore O");
    		b22.setDisable(true);
    		
    		if ( (txt21.getText().compareTo("X")==0 && txt23.getText().compareTo("X")==0)
    	      || (txt12.getText().compareTo("X")==0 && txt32.getText().compareTo("X")==0)
    	      || (txt11.getText().compareTo("X")==0 && txt33.getText().compareTo("X")==0)
    	      || (txt31.getText().compareTo("X")==0 && txt13.getText().compareTo("X")==0) ) {
    	    	    			
    			messaggi.setText("Giocatore X ha vinto la partita!!!");
    	    	    			
    	    	bottoneAvvia.setDisable(false);
    	    	b11.setDisable(true);
    	    	b12.setDisable(true);
    	    	b13.setDisable(true);
    	    	b21.setDisable(true);
    	    	b22.setDisable(true);
    	    	b23.setDisable(true);
    	    	b31.setDisable(true);
    	    	b32.setDisable(true);
    	    	b33.setDisable(true);
    	    	}
    	}

    	else {
    		s="ics";
    		txt22.setText("O");
    		messaggi.setText("Turno del giocatore X");
    		b22.setDisable(true);
    		
    		if ( (txt21.getText().compareTo("O")==0 && txt23.getText().compareTo("O")==0)
    	    	      || (txt12.getText().compareTo("O")==0 && txt32.getText().compareTo("O")==0)
    	    	      || (txt11.getText().compareTo("O")==0 && txt33.getText().compareTo("O")==0)
    	    	      || (txt31.getText().compareTo("O")==0 && txt13.getText().compareTo("O")==0) ) {
    	    	    	    			
    	    			messaggi.setText("Giocatore O ha vinto la partita!!!");
    	    	    	    			
    	    	    	bottoneAvvia.setDisable(false);
    	    	    	b11.setDisable(true);
    	    	    	b12.setDisable(true);
    	    	    	b13.setDisable(true);
    	    	    	b21.setDisable(true);
    	    	    	b22.setDisable(true);
    	    	    	b23.setDisable(true);
    	    	    	b31.setDisable(true);
    	    	    	b32.setDisable(true);
    	    	    	b33.setDisable(true);
    	    	    	}
    	}
    	
    	if (contatore == 9) {
    		messaggi.setText("PAREGGIO! Premere 'Avvia Partita' per cominciare una nuova partita.");
    		bottoneAvvia.setDisable(false);
    	}
    }

    //OK!
    @FXML
    void b23(ActionEvent event) {
    	
    	contatore++;
    	
    	if (s.compareTo("ics")==0) {
    		s="ooo";
    		txt23.setText("X");
    		messaggi.setText("Turno del giocatore O");
    		b23.setDisable(true);
    		
    		if ( (txt21.getText().compareTo("X")==0 && txt22.getText().compareTo("X")==0)
    	      || (txt13.getText().compareTo("X")==0 && txt33.getText().compareTo("X")==0) ) {
    	    	    	    			
    	    	messaggi.setText("Giocatore X ha vinto la partita!!!");
    	    	    	    			
    	    	bottoneAvvia.setDisable(false);
    	       	b11.setDisable(true);
     	    	b12.setDisable(true);
	    	   	b13.setDisable(true);
    	    	b21.setDisable(true);
    	    	b22.setDisable(true);
    	       	b23.setDisable(true);
    	     	b31.setDisable(true);
    	       	b32.setDisable(true);
    	       	b33.setDisable(true);
    	    	}
    	}

    	else {
    		s="ics";
    		txt23.setText("O");
    		messaggi.setText("Turno del giocatore X");
    		b23.setDisable(true);
    		
    		if ( (txt21.getText().compareTo("O")==0 && txt22.getText().compareTo("O")==0)
    	      || (txt13.getText().compareTo("O")==0 && txt33.getText().compareTo("O")==0) ) {
    	    	    	    	    			
    	       messaggi.setText("Giocatore O ha vinto la partita!!!");
    	    	    	    	    			
    	       bottoneAvvia.setDisable(false);
    	       b11.setDisable(true);
    	       b12.setDisable(true);
    		   b13.setDisable(true);
    	       b21.setDisable(true);
    	       b22.setDisable(true);
               b23.setDisable(true);
    	       b31.setDisable(true);
    	       b32.setDisable(true);
    	       b33.setDisable(true);
    	       }
    	}
    	
    	if (contatore == 9) {
    		messaggi.setText("PAREGGIO! Premere 'Avvia Partita' per cominciare una nuova partita.");
    		bottoneAvvia.setDisable(false);
    	}

    }

    //OK!
    @FXML
    void b31(ActionEvent event) {
    	
    	contatore++;
    	
    	if (s.compareTo("ics")==0) {
    		s="ooo";
    		txt31.setText("X");
    		messaggi.setText("Turno del giocatore O");
    		b31.setDisable(true);
    		
    		if ( (txt11.getText().compareTo("X")==0 && txt21.getText().compareTo("X")==0)
    	      || (txt32.getText().compareTo("X")==0 && txt33.getText().compareTo("X")==0) 
    	      || (txt22.getText().compareTo("X")==0 && txt13.getText().compareTo("X")==0)) {
    	    	    	    	    			
    	                messaggi.setText("Giocatore X ha vinto la partita!!!");
    	    	    	    	    			
    	                bottoneAvvia.setDisable(false);
    	    	       	b11.setDisable(true);
    	     	    	b12.setDisable(true);
    		    	   	b13.setDisable(true);
    	    	    	b21.setDisable(true);
    	    	    	b22.setDisable(true);
    	    	       	b23.setDisable(true);
    	    	     	b31.setDisable(true);
    	    	       	b32.setDisable(true);
    	    	       	b33.setDisable(true);
    	    	    	}
    	}

    	else {
    		s="ics";
    		txt31.setText("O");
    		messaggi.setText("Turno del giocatore X");
    		b31.setDisable(true);
    		
    		if ( (txt11.getText().compareTo("O")==0 && txt21.getText().compareTo("O")==0)
    	      || (txt32.getText().compareTo("O")==0 && txt33.getText().compareTo("O")==0) 
    	      || (txt22.getText().compareTo("O")==0 && txt13.getText().compareTo("O")==0)) {
    	    	    	    	    	    			
    	    	        messaggi.setText("Giocatore O ha vinto la partita!!!");
    	    	    	    	    	    			
    	    	        bottoneAvvia.setDisable(false);
    	    	    	b11.setDisable(true);
    	    	    	b12.setDisable(true);
    	    		  	b13.setDisable(true);
    	    	    	b21.setDisable(true);
    	    	     	b22.setDisable(true);
    	    	      	b23.setDisable(true);
    	    	      	b31.setDisable(true);
    	    	       	b32.setDisable(true);
    	    	       	b33.setDisable(true);
    	    	      	}
    	}
    	
    	if (contatore == 9) {
    		messaggi.setText("PAREGGIO! Premere 'Avvia Partita' per cominciare una nuova partita.");
    		bottoneAvvia.setDisable(false);
    	}

    }

    //OK!
    @FXML
    void b32(ActionEvent event) {
    	
    	contatore++;
    	
    	if (s.compareTo("ics")==0) {
    		s="ooo";
    		txt32.setText("X");
    		messaggi.setText("Turno del giocatore O");
    		b32.setDisable(true);
    		
    		if ( (txt31.getText().compareTo("X")==0 && txt33.getText().compareTo("X")==0)
     	      || (txt22.getText().compareTo("X")==0 && txt12.getText().compareTo("X")==0) ) {
    	    	    	    	    	    			
    	    	    messaggi.setText("Giocatore X ha vinto la partita!!!");
    	    	    	    	    	    			
    	    	    bottoneAvvia.setDisable(false);
    	          	b11.setDisable(true);
    	    	  	b12.setDisable(true);
    	     	   	b13.setDisable(true);
    	        	b21.setDisable(true);
    	        	b22.setDisable(true);
    	          	b23.setDisable(true);
    	        	b31.setDisable(true);
    	          	b32.setDisable(true);
    	           	b33.setDisable(true);
    	        	}
    	}

    	else {
    		s="ics";
    		txt32.setText("O");
    		messaggi.setText("Turno del giocatore X");
    		b32.setDisable(true);
    		
    		if ( (txt31.getText().compareTo("O")==0 && txt33.getText().compareTo("O")==0)
    	      || (txt22.getText().compareTo("O")==0 && txt12.getText().compareTo("O")==0) ) {
    	       	    	    	    	    			
    	    	    messaggi.setText("Giocatore O ha vinto la partita!!!");
   	    	    	    	    	    	    			
   	         	    bottoneAvvia.setDisable(false);
    	        	b11.setDisable(true);
    	    	  	b12.setDisable(true);
    	    	   	b13.setDisable(true);
    	         	b21.setDisable(true);
    	    	   	b22.setDisable(true);
    	          	b23.setDisable(true);
    	    	   	b31.setDisable(true);
    	        	b32.setDisable(true);
    	        	b33.setDisable(true);
    	    	        	}
    	}
    	
    	if (contatore == 9) {
    		messaggi.setText("PAREGGIO! Premere 'Avvia Partita' per cominciare una nuova partita.");
    		bottoneAvvia.setDisable(false);
    	}

    }

    //OK!
    @FXML
    void b33(ActionEvent event) {
    	
    	contatore++;
    	
    	if (s.compareTo("ics")==0) {
    		s="ooo";
    		txt33.setText("X");
    		messaggi.setText("Turno del giocatore O");
    		b33.setDisable(true);
    		
    		if ( (txt31.getText().compareTo("X")==0 && txt32.getText().compareTo("X")==0)
    	      || (txt13.getText().compareTo("X")==0 && txt23.getText().compareTo("X")==0)
    	      || (txt22.getText().compareTo("X")==0 && txt11.getText().compareTo("X")==0) ) {
    	    	    	    	    	    	    			
    	        messaggi.setText("Giocatore X ha vinto la partita!!!");
    	    	    	    	    	    	    			
    	        bottoneAvvia.setDisable(false);
    	       	b11.setDisable(true);
    	   	  	b12.setDisable(true);
    	   	   	b13.setDisable(true);
    	       	b21.setDisable(true);
    	       	b22.setDisable(true);
    	       	b23.setDisable(true);
    	       	b31.setDisable(true);
    	       	b32.setDisable(true);
    	       	b33.setDisable(true);
    		    }
    	}

    	else {
    		s="ics";
    		txt33.setText("O");
    		messaggi.setText("Turno del giocatore X");
    		b33.setDisable(true);
    		
    		if ( (txt31.getText().compareTo("O")==0 && txt32.getText().compareTo("O")==0)
    	      || (txt13.getText().compareTo("O")==0 && txt23.getText().compareTo("O")==0)
    	      || (txt22.getText().compareTo("O")==0 && txt11.getText().compareTo("O")==0) ) {
    	    	    	    	    	    	    	    			
    	        messaggi.setText("Giocatore O ha vinto la partita!!!");
    	    	    	    	    	    	    	    			
    	        bottoneAvvia.setDisable(false);
    	        b11.setDisable(true);
    	  	  	b12.setDisable(true);
    	       	b13.setDisable(true);
    	       	b21.setDisable(true);
    	       	b22.setDisable(true);
    	       	b23.setDisable(true);
    	       	b31.setDisable(true);
    	       	b32.setDisable(true);
    	       	b33.setDisable(true);
    	        }
    	}
    	
    	if (contatore == 9) {
    		messaggi.setText("PAREGGIO! Premere 'Avvia Partita' per cominciare una nuova partita.");
    		bottoneAvvia.setDisable(false);
    	}

    }

    @FXML
    void initialize() {
        assert b11 != null : "fx:id=\"b11\" was not injected: check your FXML file 'Sample.fxml'.";
        assert b12 != null : "fx:id=\"b12\" was not injected: check your FXML file 'Sample.fxml'.";
        assert b13 != null : "fx:id=\"b13\" was not injected: check your FXML file 'Sample.fxml'.";
        assert b22 != null : "fx:id=\"b22\" was not injected: check your FXML file 'Sample.fxml'.";
        assert b23 != null : "fx:id=\"b23\" was not injected: check your FXML file 'Sample.fxml'.";
        assert b31 != null : "fx:id=\"b31\" was not injected: check your FXML file 'Sample.fxml'.";
        assert b32 != null : "fx:id=\"b32\" was not injected: check your FXML file 'Sample.fxml'.";
        assert b33 != null : "fx:id=\"b33\" was not injected: check your FXML file 'Sample.fxml'.";
        assert b21 != null : "fx:id=\"b21\" was not injected: check your FXML file 'Sample.fxml'.";
        assert bottoneAvvia != null : "fx:id=\"bottoneAvvia\" was not injected: check your FXML file 'Sample.fxml'.";
        assert messaggi != null : "fx:id=\"messaggi\" was not injected: check your FXML file 'Sample.fxml'.";

    }
}
