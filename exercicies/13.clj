;; 13. Verificação de senha segura em um sistema
;; Um sistema de cadastro de usuários precisa garantir que as senhas fornecidas sejam seguras. A senha deve ter no mínimo 8 caracteres, conter pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial.
;;Crie uma função que receba uma senha e retorne true se ela for válida e false caso contrário.

;; Exemplo:
;; Entrada:
;; (senha-valida? "Clojure@2024")
;; Saída esperada:
;; true

(defn is-valid-password?
  [password]
  (boolean (re-matches #"^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$" password)))