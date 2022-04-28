;; use set-fill-column=42 and prepare script as regularly spaced paragraphs
;; run this file using Babashka
;; run the python script from this repo
;; import into Kdenlive and adjust the times manually
;; be mindful of ^M characters in the output (possibly just a Kdenlive issue? TODO)
(->> (-> (slurp "subtitles-src.txt")
         (clojure.string/split #"\n{1,}[\r]?"))
     (partition-all 2)
     (map (partial clojure.string/join "\n"))
     (clojure.string/join "\n\n")
     (spit "subtitles.txt"))
(prn (+ 1 1))
