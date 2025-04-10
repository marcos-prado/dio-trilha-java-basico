    public class Banco{
        private String nomeBanco;
        private String enderecoBanco;
        private String telefoneBanco;
        private String emailBanco;
        private String cnpjBanco;

        public Banco(String nomeBanco, String enderecoBanco, String telefoneBanco, String emailBanco, String cnpjBanco) {
            this.nomeBanco = nomeBanco;
            this.enderecoBanco = enderecoBanco;
            this.telefoneBanco = telefoneBanco;
            this.emailBanco = emailBanco;
            this.cnpjBanco = cnpjBanco;
        }

        public String getNomeBanco() {
            return nomeBanco;
        }

        public String getEnderecoBanco() {
            return enderecoBanco;
        }

        public String getTelefoneBanco() {
            return telefoneBanco;
        }

        public String getEmailBanco() {
            return emailBanco;
        }

        public String getCnpjBanco() {
            return cnpjBanco;
        }        
    }
