{\rtf1\ansi\ansicpg1252\deff0\nouicompat\deflang1033{\fonttbl{\f0\fnil Microsoft YaHei UI;}{\f1\fnil\fcharset0 Microsoft YaHei UI;}{\f2\fnil\fcharset0 Calibri;}}
{\colortbl ;\red127\green0\blue85;\red0\green0\blue0;\red0\green0\blue192;\red106\green62\blue62;\red42\green0\blue255;\red212\green212\blue212;}
{\*\generator Riched20 10.0.22000}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\cf1\b\f0\fs24\lang9 package\cf2\b0  github.assignment;\cf0\par
\cf1\b import\cf2\b0  java.util.Scanner;\cf0\par
\par
\cf1\b public\cf2\b0  \cf1\b class\cf2\b0  Calculator \{\cf0\par
\cf2\tab\cf1\b static\cf2\b0  Scanner \cf3\i sc\cf2\i0 =\cf1\b new\cf2\b0  Scanner(System.\cf3\b\i in\cf2\b0\i0 );\tab\cf0\par
\cf2\tab\cf1\b static\cf2\b0  \cf1\b int\cf2\b0  \cf3\i num1\cf2\i0 ,\cf3\i num2\cf2\i0 ;\cf0\par
\cf2\tab\cf1\b static\cf2\b0  \cf1\b int\cf2\b0  \cf3\i choice\cf2\i0 ;\cf0\par
\cf2\tab\cf0\par
\par
\cf2\tab\cf1\b public\cf2\b0  \cf1\b static\cf2\b0  \cf1\b void\cf2\b0  main(String[] \cf4 args\cf2 ) \{\cf0\par
\cf2\tab\tab\tab\cf1\b while\cf2\b0 (\cf3\i choice\cf2\i0  < 6) \{\cf0\par
\cf2\tab\tab\cf0\par
\cf2\tab\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf5 "Enter the choice..."\cf2 );\cf0\par
\cf2\tab\tab\tab\tab\cf3\i choice\cf2\i0 =\cf3\i sc\cf2\i0 .nextInt();\tab    \cf0\par
\cf2\tab\tab\cf0\par
\cf2\tab\tab\cf1\highlight6\b switch\cf2\highlight0\b0 (\cf3\i choice\cf2\i0 ) \{\cf0\par
\cf2\tab\tab\cf1\b case\cf2\b0  1:\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf5 "Enter num1"\cf2 );\cf0\par
\cf2\tab\tab\tab\cf3\i num1\cf2\i0 =\cf3\i sc\cf2\i0 .nextInt();\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf5 "Enter num2"\cf2 );\cf0\par
\cf2\tab\tab\tab\cf3\i num2\cf2\i0 =\cf3\i sc\cf2\i0 .nextInt();\cf0\par
\cf2\tab\tab\tab\cf1\b int\cf2\b0  \cf4 add\cf2 =\cf3\i num1\cf2\i0 +\cf3\i num2\cf2\i0 ;\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf4 add\cf2 );\cf0\par
\cf2\tab\tab\tab\cf1\b break\cf2\b0 ;\cf0\par
\cf2\tab\tab\tab\cf0\par
\cf2\tab\tab\cf1\b case\cf2\b0  2:\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf5 "Enter num1"\cf2 );\cf0\par
\cf2\tab\tab\tab\cf3\i num1\cf2\i0 =\cf3\i sc\cf2\i0 .nextInt();\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf5 "Enter num2"\cf2 );\cf0\par
\cf2\tab\tab\tab\cf3\i num2\cf2\i0 =\cf3\i sc\cf2\i0 .nextInt();\cf0\par
\cf2\tab\tab\tab\cf1\b int\cf2\b0  \cf4 sub\cf2 =\cf3\i num1\cf2\i0 -\cf3\i num2\cf2\i0 ;\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf4 sub\cf2 );\cf0\par
\cf2\tab\tab\tab\cf1\b break\cf2\b0 ;\cf0\par
\cf2\tab\tab\tab\cf0\par
\cf2\tab\tab\cf1\b case\cf2\b0  3:\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf5 "Enter num1"\cf2 );\cf0\par
\cf2\tab\tab\tab\cf3\i num1\cf2\i0 =\cf3\i sc\cf2\i0 .nextInt();\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf5 "Enter num2"\cf2 );\cf0\par
\cf2\tab\tab\tab\cf3\i num2\cf2\i0 =\cf3\i sc\cf2\i0 .nextInt();\cf0\par
\cf2\tab\tab\tab\cf1\b int\cf2\b0  \cf4 mult\cf2 =\cf3\i num1\cf2\i0 *\cf3\i num2\cf2\i0 ;\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf4 mult\cf2 );\cf0\par
\cf2\tab\tab\tab\cf1\b break\cf2\b0 ;\cf0\par
\cf2\tab\tab\tab\cf0\par
\cf2\tab\tab\cf1\b case\cf2\b0  4:\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf5 "Enter num1"\cf2 );\cf0\par
\cf2\tab\tab\tab\cf3\i num1\cf2\i0 =\cf3\i sc\cf2\i0 .nextInt();\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf5 "Enter num2"\cf2 );\cf0\par
\cf2\tab\tab\tab\cf3\i num2\cf2\i0 =\cf3\i sc\cf2\i0 .nextInt();\cf0\par
\cf2\tab\tab\tab\cf1\b float\cf2\b0  \cf4 div\cf2 =\cf3\i num1\cf2\i0 /\cf3\i num2\cf2\i0 ;\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf4 div\cf2 );\cf0\par
\cf2\tab\tab\tab\cf1\b break\cf2\b0 ;\tab\tab\tab\cf0\f1\lang16393\par
\cf2\tab\tab\tab\lang9\par
\tab\cf1\b default\cf2\b0  :\cf0\par
\cf2\tab\tab\tab System.\cf3\b\i out\cf2\b0\i0 .println(\cf5 "Enter the correct choice..."\cf2 );\cf0\par
\cf2\tab\tab\tab\cf1\b break\cf2\b0 ;\cf0\par
\cf2\tab\tab\highlight6\}\par
00000\cf0\highlight0\par
\cf2\tab\}\cf0\par
\cf2\tab\}\cf0\par
\cf2\tab\cf0\par
\cf2\}\cf0\par
\f2\fs22\par
}
 