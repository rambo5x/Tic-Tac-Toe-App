package com.mcpegamer.ttt;

import android.view.View.OnClickListener;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.*; 
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
	TextView turnView;
	int playerTurn = 1;
	Button R1C1,R1C2,R1C3;
	Button R2C1,R2C2,R2C3;
	Button R3C1,R3C2,R3C3;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		turnView = (TextView)findViewById(R.id.Turn);
		turnView.setText("Turn: X");
		
		R1C1 = (Button)findViewById(R.id.R1C1);
		R1C2 = (Button)findViewById(R.id.R1C2);
		R1C3 = (Button)findViewById(R.id.R1C3);
		
		R2C1 = (Button)findViewById(R.id.R2C1);
		R2C2 = (Button)findViewById(R.id.R2C2);
		R2C3 = (Button)findViewById(R.id.R2C3);
		
		R3C1 = (Button)findViewById(R.id.R3C1);
		R3C2 = (Button)findViewById(R.id.R3C2);
		R3C3 = (Button)findViewById(R.id.R3C3);	
    }
	
	//Row 1
		
	public void R1C1Click(View v){
		if(playerTurn == 1){
		R1C1.setText("X");
		checker();
		playerTurn = 2;
		turnView.setText("Turn: O");
		}
		else if(playerTurn ==2){
			R1C1.setText("O");
			checker();
			playerTurn = 1;
			turnView.setText("Turn: X");
		}
	}
	
	public void R1C2Click(View v){
		if(playerTurn == 1){
			R1C2.setText("X");
			checker();
			playerTurn = 2;
			turnView.setText("Turn: O");
		}
		else if(playerTurn ==2){
			R1C2.setText("O");
			checker();
			playerTurn = 1;
			turnView.setText("Turn: X");
		}
	}
	
	public void R1C3Click(View v){
		if(playerTurn == 1){
			R1C3.setText("X");
			checker();
			playerTurn = 2;
			turnView.setText("Turn: O");
		}
		else if(playerTurn ==2){
			R1C3.setText("O");
			checker();
			playerTurn = 1;
			turnView.setText("Turn: X");
		}
	}
	
	//Row 2
	public void R2C1Click(View v){
		if(playerTurn == 1){
			R2C1.setText("X");
			checker();
			playerTurn = 2;
			turnView.setText("Turn: O");
		}
		else if(playerTurn ==2){
			R2C1.setText("O");
			checker();
			playerTurn = 1;
			turnView.setText("Turn: X");
		}
	}
	public void R2C2Click(View v){
		if(playerTurn == 1){
			R2C2.setText("X");
			checker();
			playerTurn = 2;
			turnView.setText("Turn: O");
		}
		else if(playerTurn ==2){
			R2C2.setText("O");
			checker();
			playerTurn = 1;
			turnView.setText("Turn: X");
		}
	}
	public void R2C3Click(View v){
		if(playerTurn == 1){
			R2C3.setText("X");
			checker();
			playerTurn = 2;
			turnView.setText("Turn: O");
		}
		else if(playerTurn ==2){
			R2C3.setText("O");
			checker();
			playerTurn = 1;
			turnView.setText("Turn: X");
		}
	}
	
	//Row 3
	public void R3C1Click(View v){
		if(playerTurn == 1){
			R3C1.setText("X");
			checker();
			playerTurn = 2;
			turnView.setText("Turn: O");
		}
		else if(playerTurn ==2){
			R3C1.setText("O");
			playerTurn = 1;
			turnView.setText("Turn: X");
		}
	}
	public void R3C2Click(View v){
		if(playerTurn == 1){
			R3C2.setText("X");
			checker();
			playerTurn = 2;
			turnView.setText("Turn: O");
		}
		else if(playerTurn ==2){
			R3C2.setText("O");
			checker();
			playerTurn = 1;
			turnView.setText("Turn: X");
		}
	}
	public void R3C3Click(View v){
		if(playerTurn == 1){
			R3C3.setText("X");
			checker();
			playerTurn = 2;
			turnView.setText("Turn: O");
		}
		else if(playerTurn ==2){
			R3C3.setText("O");
			checker();
			playerTurn = 1;
			turnView.setText("Turn: X");
		}
	}
	
	public void checker(){
		
		//row 1 win for X
 if(R1C1.getText().toString() == "X"){
	 if(R1C2.getText().toString()=="X"){
		 if(R1C3.getText().toString()=="X"){
			 AlertDialog alertDialog = new AlertDialog.Builder(this).create();
			 alertDialog.setTitle("Game over");
			 alertDialog.setMessage("Player X Wins!");
			 alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
					 public void onClick(DialogInterface dialog, int which) {
						 reset();
					 }
				 });
			 alertDialog.show();
		 }
		 
	 }  
 }
 
 	//row 1 win for O
		if(R1C1.getText().toString() == "O"){
			if(R1C2.getText().toString()=="O"){
				if(R1C3.getText().toString()=="O"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player O Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
		//row 2 win for X
		if(R2C1.getText().toString() == "X"){
			if(R2C2.getText().toString()=="X"){
				if(R2C3.getText().toString()=="X"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player X Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
		//row 2 win for O
		if(R2C1.getText().toString() == "O"){
			if(R2C2.getText().toString()=="O"){
				if(R2C3.getText().toString()=="O"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player O Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
		
		//row 3 win for X
		if(R3C1.getText().toString() == "X"){
			if(R3C2.getText().toString()=="X"){
				if(R3C3.getText().toString()=="X"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player X Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
		//Column 1 win for X
		if(R1C1.getText().toString() == "X"){
			if(R2C1.getText().toString()=="X"){
				if(R3C1.getText().toString()=="X"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player X Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
		//Column 1 win for O
		if(R1C1.getText().toString() == "O"){
			if(R2C1.getText().toString()=="O"){
				if(R3C1.getText().toString()=="O"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player O Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
		//Column  2 win for X
		if(R1C2.getText().toString() == "X"){
			if(R2C2.getText().toString()=="X"){
				if(R3C2.getText().toString()=="X"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player X Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		//Column 2 win for O
		if(R1C2.getText().toString() == "O"){
			if(R2C2.getText().toString()=="O"){
				if(R3C2.getText().toString()=="O"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player O Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
		//Column 3 win for X
		if(R1C3.getText().toString() == "X"){
			if(R2C3.getText().toString()=="X"){
				if(R3C3.getText().toString()=="X"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player X Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
		//Column 3 win for O
		if(R1C3.getText().toString() == "O"){
			if(R2C3.getText().toString()=="O"){
				if(R2C3.getText().toString()=="O"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player O Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
		/*
		{R1C1,R1C2,R1C3}
		{R2C1,R2C2,R2C3}
		{R3C1,R3C2,R3C3}
		*/
		
		
		
		//Diagnol Bottom left to Top Right win for X
		if(R3C1.getText().toString() == "X"){
			if(R2C2.getText().toString()=="X"){
				if(R1C3.getText().toString()=="X"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player X Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
		//Diagnol Bottom left to Top Right win for O
		if(R3C1.getText().toString() == "O"){
			if(R2C2.getText().toString()=="O"){
				if(R1C3.getText().toString()=="O"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player O Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
		//Diagnol Bottom right to Top Left win for X
		if(R3C3.getText().toString() == "X"){
			if(R2C2.getText().toString()=="X"){
				if(R1C1.getText().toString()=="X"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player X Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
		//Diagnol Bottom right to Top Left win for X
		if(R3C3.getText().toString() == "O"){
			if(R2C2.getText().toString()=="O"){
				if(R1C1.getText().toString()=="O"){
					AlertDialog alertDialog = new AlertDialog.Builder(this).create();
					alertDialog.setTitle("Game over");
					alertDialog.setMessage("Player O Wins!");
					alertDialog.setButton("RESTART", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								reset();
							}
						});
					alertDialog.show();
				}

			}  
		}
		
	}
	
	public void reset(){
		R1C1.setText("");
		R1C2.setText("");
		R1C3.setText("");
		
		R2C1.setText("");
		R2C2.setText("");
		R2C3.setText("");
		
		R3C1.setText("");
		R3C2.setText("");
		R3C3.setText("");
	}
	
	public void GiveUp(View v){
		reset();
	}
}
