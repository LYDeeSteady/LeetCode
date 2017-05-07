Soluction_1 使用暴力解法，在其他環境下測試成功，但leetcode中用submit會跑出Time Limit Exceeded。看來解法雖然成功，但複雜度太高、速度太慢，無法成功提交此方法。

Soluction_2 使用Manacher's ALGORITHM，能將複雜度降至O(n)。一開始用了特別得方式將字串都轉為奇數長度，還算滿複雜的解法，個人也研究了一陣子才了解，建議各位可以慢慢trace程式碼，才能了解其中的奧妙。