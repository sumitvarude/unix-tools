unix-tools
==========
##Steps to assemble unix-tools
1.Download folder SV on your device
2.Create a Path in enivironment veriable with name "SHELL_SCRIPTS"
3.Set path value as absolute path to SV folder
4.Add that environment veriable in system veriable PATH


## WC

* svWc.sh  file-name           

           It will be display word count,character count and lines count presented in this given file.
           
Example ->    `svWc one.txt`


## Head

* svHead -[No of lines]  file-name

           It will be display first 5 lines from given file.
           
Example ->  `svHead -5 one.txt`


* svHead file-name 
           
           It will be display default first 10 lines from given file
           
Example -> `svHead one.txt`


## Tail

* svTail -[No of lines]  file-name

           It will be display last 5 lines from given file.
           
Example ->  `svTail -5 one.txt`


* svTail file-name 
           
           It will be display default last 10 lines from given file.
           
Example -> `svTail one.txt`


## Uniq

svUniq file-name

           It will be display uniq lines among the entire file
           
Example -> `svUniq one.txt`


## Sort

* svSort file-name

           It will be display all content of the file by sorting ascending order.
           It will also display all data in reversed order.(have to add -r option)
           
Example -> `svSort one.txt`
s

## Cut

* svCut -f[number of fields] file-name

           It will be display all record in given file
           
Example -> `svCut -f1 one.txt`


* svCut -f[number of fields] -d[delimeter] file-name


           It will be display the first field of every line from given file.
           
Example -> `svCut -f1 -d" " one.txt`


## reduce space

svReducer file-name

           It will be remove all extra spaces from the given file.
           
Example -> `svReducer one.txt`