# Zoho-Interview-Questions

1. N = 13 

1           1
10         10
101       101
1010     1010
10101   10101
101010 101010
1010101010101
101010 010101
10101   10101
1010     0101
101       101
10         01
1           1


2. Reverse of a character without interchanging number

z9o8h7o8
o9h8o7z8

3. Given a string, replace all duplicates witht the next character.
java114 --> javb124
BusRoute112 --> BusRovte123
aBuzZ9900 --> aBuzC9012
Rules
Replace uppercase characters with next uppercase character, replace lowercase with lowercase
Replace z --> a, Z --> A, 9 --> 0
If the next character already exists, replace the next character
aBuzZ9900 -- replace Z with A
As 'a' exists, replace with next character -- B
As 'B' exists, replace with next character -- C
aBuzC9900 --- replace 9 with 0
aBuzC9000 --- replace 0 with 1
aBuzC9010 --- replace 0 with 2, as 1 already exists.
O/P --> aBuzC9012
