(ns show-date-app.core
  (:gen-class))

(import
 '(java.util Date)
 '(java.awt FlowLayout)
;;  '(java.awt Dimension)
 '(javax.swing JLabel JFrame JPanel JButton)
 '(java.text SimpleDateFormat))

(defn getTime []
  (Date.))

(defn editTime [x]
  (.format (SimpleDateFormat. "yyyy년 MM월 dd일") x))

(defn show-window []
  (let [window (JFrame. "날짜 띄우기")
        panel (JPanel.)
        btn1 (JButton. "Click Me")
        text (JLabel. (editTime (getTime)))]
    
    (doto window
      (.add
       (.add panel (JLabel. "Today is"))
       )
      (.setLayout (FlowLayout.))
      (.getContentPane)
      (.add text)
      (.add btn1)
      (.setDefaultCloseOperation (JFrame/EXIT_ON_CLOSE))
      (.pack)
      ;; (.setPreferredSize (Dimension. 400 400))
      (.setSize 400 300)
      (.setLocationRelativeTo nil)
      (.setResizable false)
      (.setVisible true))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (show-window))
  
  
