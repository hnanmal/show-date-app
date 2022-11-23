(ns show-date-app.core
  (:gen-class))

(import
  '(java.util Date)
  '(java.awt FlowLayout)
  '(javax.swing JLabel JFrame)
  '(java.text SimpleDateFormat))

(defn getTime []
  (Date.))

(defn editTime [x]
  (.format (SimpleDateFormat. "yyyy년 MM월 dd일") (getTime)))

(defn show-window []
  (let [window (JFrame. "날짜 띄우기")
        text (JLabel. (editTime (getTime)))]
      (doto window
          (.setLayout (FlowLayout.))
          (.getContentPane)
          (.add text)
          (.setDefaultCloseOperation (JFrame/EXIT_ON_CLOSE))
          (.pack)
          (.setSize 300 200)
          (.setVisible true))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (show-window)
  
  )
