package com.example.contadordepessoas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int totalh = 0, totalm = 0, totalpessoas = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView campoTexto = (TextView) findViewById(R.id.textoPessoas);
        Button botaoHomem = (Button) findViewById(R.id.botaoHomem);
        Button botaoMulher = (Button) findViewById(R.id.botaoMulher);
        Button botaoReset = (Button) findViewById(R.id.botaoReset);
        Button botaoResetHomem = (Button) findViewById(R.id.botaoResetHomem);
        Button botaoResetMulher = (Button) findViewById(R.id.botaoResetMulher);



        botaoHomem.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                totalh++;
                totalpessoas++;
                String mensagem = Integer.toString(totalpessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");
                campoTexto.setText("Total: " + mensagem + " pessoas");
                botaoHomem.setText(Integer.toString(totalh));
            }
        }
        );

        botaoMulher.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                totalm++;
                totalpessoas++;
                String mensagem = Integer.toString(totalpessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");
                campoTexto.setText("Total: " + mensagem + " pessoas");
                botaoMulher.setText(Integer.toString(totalm));
            }
        }
        );

        botaoReset.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                totalm = 0;
                totalh = 0;
                totalpessoas = 0;
                String mensagem = Integer.toString(totalpessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");
                campoTexto.setText("Total: " + mensagem + " pessoas");
                botaoMulher.setText(Integer.toString(totalm));
                botaoHomem.setText(Integer.toString(totalh));
            }
        }
        );

        botaoResetHomem.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                totalpessoas = totalpessoas-totalh;
                totalh = 0;
                String mensagem = Integer.toString(totalpessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");
                campoTexto.setText("Total: " + mensagem + " pessoas");
                botaoMulher.setText(Integer.toString(totalm));
                botaoHomem.setText(Integer.toString(totalh));
            }
        }
        );

        botaoResetMulher.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                totalpessoas = totalpessoas-totalm;
                totalm = 0;
                String mensagem = Integer.toString(totalpessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");
                botaoMulher.setText(Integer.toString(totalm));
                botaoHomem.setText(Integer.toString(totalh));
            }
        }
        );

    }
}