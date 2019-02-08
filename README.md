# peakFinder
Finds a peak value of a raw integer array, just for fun. 

Algorithm ologn 

[a,b,c,d,e,f,g]

definition of a peak:
c is a peak if c >= b and c >= b
a is a peak if a >= b


if(array[n/2] < array[n/2 + 1) then check right side for peak
else if (array [n/2] < array[n/2-1] then check left side for peak)
else return array[n/2] peak is found.
