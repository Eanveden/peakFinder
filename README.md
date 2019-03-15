# peakFinder
Finds a peak value of a raw integer array  
 
        ¯\_(ツ)_/¯      
 
Algorithm ologn 

[a,b,c,d,e,f,g]

<b> Definition of a peak: </b> 

  c is a peak if c >= b and c >= d

  a is a peak if a >= b

<b> Algorithm </b>

if(array[n/2] < array[n/2 + 1) then check right side for peak

else if (array [n/2] < array[n/2-1] then check left side for peak)

else return array[n/2] peak is found.
