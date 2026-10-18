
package com.radarglobalai;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ScrollView;

public class MainActivity extends Activity {

    private int verde = Color.rgb(0, 255, 156);
    private int fundo = Color.rgb(8, 11, 16);

    private TextView texto(String valor, int tamanho) {
        TextView t = new TextView(this);
        t.setText(valor);
        t.setTextColor(verde);
        t.setTextSize(tamanho);
        t.setPadding(0, 12, 0, 12);
        return t;
    }

    private void secao(LinearLayout layout, String titulo,
                       String descricao) {
        TextView t = texto(titulo + "\n" + descricao, 16);
        t.setBackgroundColor(Color.rgb(17, 25, 35));
        t.setPadding(18, 22, 18, 22);

        LinearLayout.LayoutParams p =
            new LinearLayout.LayoutParams(
                -1, -2
            );
        p.setMargins(0, 10, 0, 10);
        layout.addView(t, p);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setStatusBarColor(fundo);
        getWindow().setNavigationBarColor(fundo);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(20, 24, 20, 24);
        layout.setBackgroundColor(fundo);

        TextView cabecalho = texto(
            "RADAR GLOBAL AI\n"
            + "GLOBAL MARKETS • INTELLIGENCE",
            23
        );
        cabecalho.setTypeface(null, Typeface.BOLD);
        layout.addView(cabecalho);

        secao(layout, "🌎 MERCADOS GLOBAIS",
            "Ações • Índices • Criptoativos");

        secao(layout, "📡 RADAR DE NOTÍCIAS",
            "Monitoramento de notícias financeiras");

        secao(layout, "🧠 ANÁLISE INTELIGENTE",
            "Análise de sentimento em preparação");

        secao(layout, "⚠ STATUS DO SISTEMA",
            "Interface inicial • Dados reais ainda não conectados");

        TextView aviso = texto(
            "Informativo. Não garante lucros nem "
            + "constitui recomendação financeira.",
            12
        );
        layout.addView(aviso);

        ScrollView scroll = new ScrollView(this);
        scroll.addView(layout);
        setContentView(scroll);
    }
}
