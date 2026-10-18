
import streamlit as st
from datetime import datetime

st.set_page_config(
    page_title="Radar Global AI",
    page_icon="📡",
    layout="wide"
)

st.markdown("""
<style>
.stApp {
    background-color: #080b10;
    color: #00ff9c;
}
h1, h2, h3, p, label {
    color: #00ff9c !important;
}
div[data-testid="stMetric"] {
    background: #111923;
    border: 1px solid #00ff9c;
    padding: 15px;
    border-radius: 10px;
}
</style>
""", unsafe_allow_html=True)

st.title("📡 RADAR GLOBAL AI")
st.caption("GLOBAL MARKETS • NEWS • INTELLIGENCE")
st.divider()

st.warning(
    "Modo demonstração: dados reais ainda não conectados."
)

col1, col2 = st.columns(2)

with col1:
    st.subheader("🌎 Mercados globais")
    mercado = st.selectbox(
        "Selecione um mercado",
        ["S&P 500", "NASDAQ", "Bitcoin", "Dólar", "Ouro"]
    )
    st.info(f"{mercado}: aguardando conexão com fonte de dados.")

with col2:
    st.subheader("🧠 Radar de notícias")
    st.write("Monitoramento de notícias será integrado nesta área.")
    st.write("Análise de sentimento: aguardando dados.")

st.divider()
st.caption(
    f"RADAR GLOBAL AI • {datetime.now().strftime('%d/%m/%Y %H:%M')}"
)
st.caption("Ferramenta informativa. Não garante lucros.")
