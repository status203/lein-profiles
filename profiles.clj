{:user {:plugins [[lein-try "0.4.3"]
                  [com.jakemccrary/lein-test-refresh "0.24.1"]]
        :dependencies [[pjstadig/humane-test-output "0.11.0"]]
        :injections [(require 'pjstadig.humane-test-output)
                     (pjstadig.humane-test-output/activate!)]}}
