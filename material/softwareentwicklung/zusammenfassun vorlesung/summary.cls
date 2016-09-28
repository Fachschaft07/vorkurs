\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{summary}[2016/09/27]
\ProcessOptions \relax
\LoadClass{scrartcl}
\RequirePackage[left=3cm,right=4cm,top=3cm,bottom=3cm,includeheadfoot]{geometry}
\RequirePackage{german}
\RequirePackage{tikz}
\usetikzlibrary{calc,shadows,chains,decorations,trees,positioning,arrows,fit,shapes,calc,plotmarks}
\RequirePackage{pifont, mdframed}

\RequirePackage{fancyhdr}

\pagestyle{fancy}
\renewcommand{\footrulewidth}{0.5 pt}
\newcommand{\psection}[1]{\pagebreak\section{#1}}
\definecolor{DarkGrey}{RGB}{128,128,128}

\RequirePackage{blindtext}
\newenvironment{warning}
{\par\begin{mdframed}[linewidth=2pt,linecolor=red]%
		\begin{list}{}{\leftmargin=1cm
				\labelwidth=\leftmargin}\item[\Large\ding{43}]}
		{\end{list}\end{mdframed}\par}
