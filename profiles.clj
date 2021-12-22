{:user {:plugins [[lein-try "0.4.3"]
                  [com.jakemccrary/lein-test-refresh "0.24.1"]
                  [lein-ancient "1.0.0-RC3"]]
        :dependencies [[pjstadig/humane-test-output "0.11.0"]]
        :injections [(require 'pjstadig.humane-test-output)
                     (pjstadig.humane-test-output/activate!)]
        :test-refresh {:notify-command ["tests-send-wrap"]
                       :notify-on-success false}
        :repl-options {:init (require ['clojure.repl :refer :all])}}}
