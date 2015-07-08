; Qlikview LET to Debug output

(def msg "Default values for selectors:")

(def s "LET vCycleRunYearDefaultVal=2015;
LET vCycleRunWeekDefaultVal=5;

LET vJobRunYearDefaultVal=2015;
LET vJobRunWeekDefaultVal=5;

LET vCmpAnalysisJob1RunYearDefaultVal=2015;
LET vCmpAnalysisJob1RunWeekDefaultVal=5;

LET vCmpAnalysisJob2RunYearDefaultVal=2015;
LET vCmpAnalysisJob2RunWeekDefaultVal=5;")

(println (str "= '" msg "'\r\n & '\\n' & " (reduce #(str %1 "\r\n & '\\n' & " %2) (map #(str "'" % "=' & $(" % ")") (map #(get % 1) (re-seq #"LET (.*?)=\d+;" s))))))

