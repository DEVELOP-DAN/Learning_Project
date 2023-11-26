



; Case construct
 
;; (defn permission []
;;   (let [word_phrase (read-line)]
;;     (println ">> "
;;              (case word_phrase
;;                "/x" "execute"
;;                "/r" "read"
;;                "/w" "write"
;;                "command is not find"))))

;; (permission)



; Cond construct

;; (defn programmer-level [points]
;;   (cond
;;     (<= points 10) "junior"
;;     (and (<= points 20) (>= points 10)) "middle"
;;     (>= points 20) "senior"))

;; (programmer-level 21)






;Реализуйте функцию increment-numbers, которая берёт из 
;списка-аргумента значения, являющиеся числами (number?) 
;и возвращает список этих чисел, увеличив предварительно 
;каждое число на единицу (inc).

;; (defn increment-numbers [listf]
;;   (map inc (filter number? listf)))

;; (increment-numbers [1 3 "ds" 12 -10])



;; Test read-line

;; (defn numbers [] 
;;   (let [listEnt (println ">> " read-line)] 
;;     (println "Вы ввели: " listEnt)))

;; (numbers)





