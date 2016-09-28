\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{vorkurs}[2016/09/20 Latex Class for the Precourse-Scripts]
\ProcessOptions \relax
\LoadClass{scrartcl}
\RequirePackage[left=3cm,right=4cm,top=3cm,bottom=3cm,includeheadfoot]{geometry}
\RequirePackage{german}
\RequirePackage{graphicx}

\RequirePackage{color}
\RequirePackage{amsmath}
\RequirePackage{amssymb}
\RequirePackage{polynom}
\RequirePackage{array}
\RequirePackage[table]{xcolor}
\RequirePackage[colorlinks,pdfpagelabels,pdfstartview = FitH,bookmarksopen = true,bookmarksnumbered = true,linkcolor = black,plainpages = false,hypertexnames = false,citecolor = black]{hyperref}
\RequirePackage{fancyhdr}

%Serifenschrift in Überschrift
%\usepackage{sectsty}
%\allsectionsfont{\rmfamily}
%\usepackage{tocloft}
%\renewcommand{\cftsecfont}{\rmfamily}
%\renewcommand{\cftsecfont}{\bfseries}

%Plots
\RequirePackage{tkz-euclide}
\RequirePackage{calc}
\RequirePackage{pgfplots}
\RequirePackage{tikz}
\usetikzlibrary{calc,trees,positioning,arrows,fit,shapes,calc,plotmarks}
\newcounter{angle}
\setcounter{angle}{220}
\RequirePackage{pifont, mdframed}

%Polynomdivision
\RequirePackage{polynom}
\polyset{style=C, div=:,vars=x}

\pagestyle{fancy}
\renewcommand{\footrulewidth}{0.5 pt}
\newcommand{\psection}[1]{\pagebreak\section{#1}}
\definecolor{DarkGrey}{RGB}{128,128,128}

\newtheorem{remark}{Bemerkung}[section]
\newtheorem{axiom}{Satz}[section]
\newtheorem{definition}{Definition}[section]
\newtheorem{example}{Beispiel}[section]
\newtheorem{important}{Merke}[section]
\newtheorem{theorem}{Theorem}[section]

\definecolor{agreen}{rgb}{0.5,1.0,0.5}
\definecolor{ared}{rgb}{1.0,0.5,0.5}
\definecolor{blue}{rgb}{0.5,0.5,1.0}

\RequirePackage{blindtext}
\newenvironment{warning}
{\par\begin{mdframed}[linewidth=2pt,linecolor=red]%
		\begin{list}{}{\leftmargin=1cm
				\labelwidth=\leftmargin}\item[\Large\ding{43}]}
		{\end{list}\end{mdframed}\par}
