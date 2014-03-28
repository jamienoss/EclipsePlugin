/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.eclide.text;

public class ECLKeywords {

	private static final String[] eclReserved1 = { //Types
		"ascii",
		"big_endian",
		"bitfield",
		"boolean",
		"data",
		"decimal",
		"enum",
		"integer",
		"little_endian",
		"qstring",
		"real",
		"size_t",
		"string",
		"typeof",
		"udecimal",
		"unsigned",
		"utf8",
		"varstring",
		"varunicode",
		
		"any",
		"const",
		"out",
		"sizeof",
		
		"transfer"
	};
	
	private static final String[] eclReserved2 = { //Types - dataset/recodset
		"_empty_",
		"dataset",
		"dictionary",
		"index",
		"record",
		"recordof",
		"recordset",
		"row",
		"set",
		"set of"
	};
	
	private static final String[] eclReserved3 = { //Grouped by syntax structure
		"beginc++",
		"embed",
		"endembed",
		"end",
		"endc++",
		"endmacro",
		"function",
		"functionmacro",
		"ifblock",
		"interface",
		"macro",
		"module",
		"service",
		"transform",
		"type",

		//flags/options
		"__nostreaming__",
		"return"
	};
	
	private static final String[] eclReserved4 = { //Dataset math
		"correlation",
		"covariance",
		"distribution",
		"variance",
		
		"exists",
		"within"
	};
	
	private static final String[] eclReserved5 = { //Dataset/recordset functions
		"aggregate",
		"choosen",
		"choosn:all",
		"choosesets",
		"combine",
		"dedup",
		"denormalize",
		"distribute",
		"enth",
		"fetch",
		"group",
		"groupby",
		"having",
		"iterate",
		"join",
		"merge",
		"mergejoin",
		"nonempty", //???
		"normalize",
		"process",
		"project",
		"range",
		"rank",
		"ranked",
		"regroup",
		"rollup",
		"sample",
		"sort",
		"subsort",
		"topn",
		"ungroup"
	};
	
	private static final String[] eclReserved6 = { //Dataset/recordset flags/options
		"all",
		"atmost",
		"bitmap",
		"cogroup",
		"counter",
		"desc", //short hand for descend
		"descend",
		"except",
		"exclusive",
		"few",
		"full",
		"grouped",
		"inner",
		"joined",
		"keep",
		"keyed",
		"last",
		"left",
		"limit",
		"local",
		"lookup",
		"many",
		"mofn",
		"nosort",
		"only",
		"opt",
		"outer",	
		"partition",
		"pulled",
		"right",
		"rowdiff",
		"rows",
		"rowset",
		"self",
		"skew",
		"skip",
		"smart",
		"stable",
		"thor",
		"threshold",
		"unordered",
		"unsorted",
		"unstable",
		"wild"
	};
	
	private static final String[] eclReserved7 = { //Dataset/recordset  action list stuff
		"apply",
		"parallel",
		"sequential"
	};
	
	private static final String[] eclReserved8 = { //Dataset/recordset  action list stuff flags/options
		"after",
		"before"
	};
	
	private static final String[] eclReserved9 = {
		"_array_",
		"_linkcounted_",
		"embedded",
		"linkcounted",
		"streamed"
	};
	
	private static final String[] eclReserved10 = { //field modifiers
		"blob",
		"cardinality",
		"default",
		"maxcount",
		"maxlength",
		"packed",
		"xmldefault",
		"xpath",
		"virtual",
		
		//flags/options
		"fileposition",
		"localfileposition",
		"logicalfilename"
	};
	
	private static final String[] eclReserved11 = { //ROXIE only - perhaps incomplete
		"allnodes",
		"dynamic",
		"library",
		"nolocal",
		"stepped",
		"thosnode",
		
		//flags/options
		"filtered",
		"internal",
		"prefetch"
	};
	
	private static final String[] eclReserved12 = { //compiler directive/hints
		"__common__",
		"distributed",
		"evaluate",
		"forward",
		"hint",
		"noboundcheck",
		"nofold",
		"nohoist",
		"nothor",
		"pull", //????
		"sorted"
	};
	
	private static final String[] eclReserved13 = {
		"eclcrc",
		"hash",
		"hash32",
		"hash64",
		"hashcrc",
		"hashmd5"
	};
	
	private static final String[] eclReserved14 = {
		"as",
		"from",
		
		"__alias__",
		"__nameof__",
		"build",
		"buildindex",
		"export",	
		"import",
		"isnull",
		"keydiff",
		"keypatch",
		"map",
		"ordered",	
		"output",
		"shared",
		"table",
		"update",
		
		//flags/options
		"__compressed__",
		"__grouped__",
		"backup",
		"cluster",
		"compressed",
		"csv",
		"encrypt",
		"escape",
		"expire",
		"extend",	
		"fixed",
		"flat",
		"format",
		"heading",
		"lsw",
		"maxsize",
		"multiple",
		"named",
		"nooverwrite",
		"noroot",
		"notrim",
		"noxpath",
		"overwrite",
		"preload",
		"quote",
		"remote",
		"separator",
		"single",
		"sql",
		"terminator",
		"width",
		"workunit"
	};
	
	private static final String[] eclReserved15 = { //HTTP stuff
		"httpcall",
		"onfail",
		"proxaddress",
		"response",
		"retry",
		"timelimit",
		"timeout"
	};
	
	private static final String[] eclReserved16 = { //SOAP stuff
		"soapcall",
		"soapaction",
		
		//flags/options
		"httpheader",
		"literal",
		"namespace",
	};
	
	private static final String[] eclReserved17 = { //Dataset iterators/filters
		"case",
		"choose",
		"else",
		"elseif",
		"graph",
		"if",
		"iff",
		"loop",
		"rejected",
		"then",
		"which"
	};
	
	private static final String[] eclReserved18 = { //workflow services
		"__compound__",
		"__owned__",
		"checkpoint",
		"cron",
		"event",
		"eventextra",
		"eventname",
		"deprecated",
		"global",
		"independent",
		"labeled",
		"labelled",
		"notify",
		"once",
		"onwarning",
		"persist",
		"pipe",
		"priority",
		"private",
		"recovery",
		"section",
		"stored",
		"success",
		"wait",
		"when"
	};

	private static final String[] eclReserved19 = {
		"assert",
		"catch",
		"encrypted",
		"error",
		"fail",
		"failcode",
		"failmessage",
		"failure",
		"ignore",
		"isvalid",
		"onfail",
		"warning"
	};
	
	private static final String[] eclReserved20 = { //template language
		"__set_debug_option__",
		"#append",
		"#apply",
		"#break",
		"#constant",
		"#debug",
		"#declare",
		"#demangle",
		"#else",
		"#elseif",
		"#end",		
		"#endregion",
		"#error",
		"#expand",
		"#export",
		"#exportxml",
		"#for",
		"#forall",
		"#getdatatype",
		"#if",
		"#ifdefined",
		"#inmodule",
		"#isdefined",
		"#isvalid",
		"#line",
		"#link",
		"#loop",
		"#mangle",
		"#onwarning",
		"#option",
		"#region",
		"#set",
		"#stored",
		"#text",
		"#trace",	
		"#uniquename",
		"#warning",
		"#workunit",
	};
	
	private static final String[] eclReserved21 = {
		"__debug__",
		"__ecl_legacy_mode__",
		"__ecl_version__",
		"__ecl_version_major__",
		"__ecl_version_minor__",
		"__ecl_version_subminor__",
		"__line__",
		"__os__",
		"__platform__",
		"__stand_alone__",
		
		"clustersize",
		"getenv"
	};
		
	private static final String[] eclReserved22 = {
		"fromxml",
		"loadxml",
		"toxml",
		"xml",	
		"xmldecode",
		"xmlencode",
		"xmlproject",
		"xmltext",
		"xmlunicode"
	};
	
	private static final String[] eclReserved23 = {
		"define",
		"parse",
		
		//flags / options
		"best",
		"first", //ambiguous group - also flag to build, perhaps others
		"guard",
		"matched",
		"matchlength",
		"matchposition",
		"matchrow",
		"matchtext",
		"matchunicode",
		"matchutf8",
		"nocase",
		"noscan",
		"penalty",
		"repeat",
		"rule",
		"scan",
		"token",
		"use",
		"validate",
		"whole"
	};
	
	private static final String[] eclReserved24 = {
		"asstring",
		"ebcdic",
		"encoding",
		"fromunicode",
		"intformat",
		"keyunicode",
		"length",
		"locale",
		"realformat",
		"regexfind",
		"regexreplace",
		"tounicode",
		"trim",
		"unicodeorder"
	};

	private static final String[] eclReserved25 = { //Math
		"abs",
		"acos",
		"asin",
		"atan",
		"atan2",
		"cos",
		"cosh",
		"div",
		"exp",
		"log",
		"ln",
		"power",
		"sin",
		"sinh",
		"sqrt",
		"tan",
		"tanh"
	};
	
	private static final String[] eclReserved26 = { //Math functions
		"ave",
		"count",
		"max",
		"min",
		"random",
		"round",
		"roundup",
		"sum",
		"truncate"
	};
	
	private static final String[] eclReserved27 = {
		"&",
		"|",
		//"^", ambiguous group location
		"bnot",
		"<<",
		">>"
	};
	
	private static final String[] eclReserved28 = {
		"=",
		"<",
		"<=",
		">",
		//">=",     //x.<y>= n  really wants to be processed as x.<y> = n, not x.<y >= 
		"!=",
		"<>",
		"in",
		"between"
	};
	
	private static final String[] eclReserved29 = {
		"true",
		"false",
		
		"and",
		"or",
		"not",
		"&&",
	};
	
	private static final String[] eclReserved30 = { //Probably not used and/or correctly implemented
		"__sequence__",
		"feature",
		"omitted"
	};

	public static final String[] getKeywords(int i) {
		switch (i) {
		case 0:
			return eclReserved1;
		case 1:
			return eclReserved2;
		case 2:
			return eclReserved3;
		case 3:
			return eclReserved4;
		case 4:
			return eclReserved5;
		case 5:
			return eclReserved6;
		case 6:
			return eclReserved7;
		case 7:
			return eclReserved8;
		case 8:
			return eclReserved9;
		case 9:
			return eclReserved10;
		case 10:
			return eclReserved11;
		case 11:
			return eclReserved12;
		case 12:
			return eclReserved13;
		case 13:
			return eclReserved14;
		case 14:
			return eclReserved15;
		case 15:
			return eclReserved16;
		case 16:
			return eclReserved17;
		case 17:
			return eclReserved18;
		case 18:
			return eclReserved19;
		case 19:
			return eclReserved20;
		case 20:
			return eclReserved21;
		case 21:
			return eclReserved22;
		case 22:
			return eclReserved23;
		case 23:
			return eclReserved24;
		case 24:
			return eclReserved25;
		case 25:
			return eclReserved26;
		case 26:
			return eclReserved27;
		case 27:
			return eclReserved28;
		case 28:
			return eclReserved29;
		case 29:
			return eclReserved30;	
		}
		String[] emptyList = {};
		return emptyList;
	}
}
