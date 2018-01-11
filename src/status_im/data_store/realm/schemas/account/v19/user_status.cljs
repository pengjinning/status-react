(ns status-im.data-store.realm.schemas.account.v19.user-status)

(def schema {:name       :user-status
             :primaryKey :status-id
             :properties {;; Unfortunately, realm doesn't support composite primary keys,
                          ;; so we have to keep separate `:status-id` property, which is just
                          ;; `:message-id`-`:whisper-identity` concatenated
                          :status-id        :string
                          :message-id       :string
                          :chat-id          :string
                          :whisper-identity :string
                          :status           :string}})
