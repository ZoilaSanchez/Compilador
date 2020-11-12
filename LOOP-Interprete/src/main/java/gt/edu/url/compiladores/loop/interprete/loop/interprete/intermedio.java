// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/main/java/gt/edu/url/compiladores/loop/interprete/loop/interprete/intermedio.flex



package gt.edu.url.compiladores.loop.interprete.loop.interprete;
import java_cup.runtime.Symbol; 

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class intermedio implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\35\u0300\1\u0400\267\u0300\10\u0500\u1020\u0300";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\5\1\6"+
    "\1\7\2\10\1\11\1\10\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\12\23\1\10\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\2\33\1\34"+
    "\11\33\1\35\1\36\1\37\1\33\1\40\10\33\1\10"+
    "\1\12\1\10\1\25\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\2\51\1\52\2\51\1\53\1\51"+
    "\1\54\1\55\1\56\1\51\1\57\1\60\1\61\1\51"+
    "\1\62\4\51\4\10\6\0\1\3\33\0\1\10\22\0"+
    "\1\63\12\0\1\63\1\0\1\64\1\30\1\65\5\0"+
    "\1\64\3\0\1\64\3\0\1\64\1\0\1\64\6\0"+
    "\1\64\1\0\1\64\4\0\1\66\7\0\1\66\3\0"+
    "\1\66\3\0\1\66\1\0\1\66\6\0\1\66\1\0"+
    "\1\66\303\0\1\42\2\0\1\42\365\0\1\65\12\0"+
    "\1\42\u0163\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1536];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\2\4\1\5\3\6\1\7\1\10"+
    "\1\11\2\7\1\12\1\7\1\13\1\7\1\14\1\15"+
    "\1\16\4\13\11\17\1\6\1\0\1\6\1\0\1\20"+
    "\2\6\1\14\1\13\1\21\1\22\1\6\2\13\1\6"+
    "\2\13\1\23\1\13\15\17\1\0\1\20\2\6\3\0"+
    "\1\6\1\13\1\24\2\13\14\17\1\25\1\24\1\26"+
    "\1\21\1\6\1\13\6\17\1\27\1\30\1\17\1\0"+
    "\1\26\1\13\5\17\1\31\1\17\1\0\1\13\1\17"+
    "\1\32\1\17\1\33\2\17\1\0\1\13\1\34\3\17"+
    "\1\1\1\13\1\17\1\35\1\36\1\37";

  private static int [] zzUnpackAction() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\67\0\67\0\67\0\156\0\245\0\334\0\u0113"+
    "\0\u014a\0\u014a\0\67\0\67\0\67\0\u0181\0\67\0\u01b8"+
    "\0\u01ef\0\u0226\0\u025d\0\67\0\334\0\u0294\0\u02cb\0\u0302"+
    "\0\u0339\0\u0370\0\u03a7\0\u03de\0\u0415\0\u044c\0\u0483\0\u04ba"+
    "\0\u04f1\0\u0528\0\u055f\0\u0596\0\u05cd\0\u0604\0\u014a\0\u063b"+
    "\0\u0672\0\u06a9\0\u06e0\0\u0717\0\u074e\0\u0785\0\u07bc\0\u07f3"+
    "\0\u082a\0\u0861\0\u0898\0\u02cb\0\u08cf\0\u0906\0\u093d\0\u0974"+
    "\0\u09ab\0\u09e2\0\u0a19\0\u0a50\0\u0a87\0\u0abe\0\u0af5\0\u0b2c"+
    "\0\u0b63\0\u0b9a\0\u0bd1\0\67\0\u0c08\0\u0c3f\0\u0c76\0\u0cad"+
    "\0\u0ce4\0\u0d1b\0\u0d52\0\u0d89\0\u0dc0\0\u0df7\0\u0e2e\0\u0e65"+
    "\0\u0e9c\0\u0ed3\0\u0f0a\0\u0f41\0\u0f78\0\u0faf\0\u0fe6\0\u101d"+
    "\0\u1054\0\u108b\0\u10c2\0\u0c3f\0\u0c76\0\u10f9\0\u1130\0\u1167"+
    "\0\u119e\0\u11d5\0\u120c\0\u1243\0\u127a\0\u12b1\0\u0370\0\u0370"+
    "\0\u12e8\0\u131f\0\u0ce4\0\u1356\0\u138d\0\u13c4\0\u13fb\0\u1432"+
    "\0\u1469\0\u0370\0\u14a0\0\u14d7\0\u150e\0\u1545\0\u0370\0\u157c"+
    "\0\u0370\0\u15b3\0\u15ea\0\u1621\0\u1658\0\u0370\0\u168f\0\u16c6"+
    "\0\u16fd\0\u10c2\0\u1734\0\u176b\0\u0370\0\u0898\0\67";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\0\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\11\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\12\1\25\1\12"+
    "\2\2\1\26\3\27\1\30\1\31\2\27\1\11\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\2\32\1\40\3\32"+
    "\1\41\2\32\1\42\1\11\1\43\1\2\1\11\71\0"+
    "\1\4\71\0\1\44\67\0\5\11\3\0\1\11\1\0"+
    "\4\11\1\0\1\11\1\12\1\11\2\0\10\43\1\11"+
    "\20\45\1\11\1\43\1\0\1\11\1\0\1\46\3\0"+
    "\1\46\1\10\1\47\1\10\2\11\3\46\1\10\1\46"+
    "\4\10\1\46\3\10\2\46\10\50\1\11\20\51\1\10"+
    "\1\43\1\0\1\11\6\0\5\11\3\0\1\11\1\0"+
    "\4\11\1\0\3\11\2\0\10\43\1\11\20\45\1\11"+
    "\1\43\1\0\1\11\6\0\5\11\3\0\1\12\1\0"+
    "\4\11\1\0\3\11\2\0\10\43\1\11\20\45\1\11"+
    "\1\43\1\0\1\11\6\0\5\11\3\0\1\11\1\0"+
    "\1\12\2\11\1\52\1\0\3\11\2\0\10\43\1\11"+
    "\20\45\1\11\1\43\1\0\1\11\6\0\5\11\3\0"+
    "\1\11\1\0\1\11\1\21\1\11\1\21\1\0\3\11"+
    "\2\0\10\27\1\11\20\53\1\11\1\43\1\0\1\11"+
    "\15\0\1\54\4\0\1\55\52\0\5\56\3\0\1\56"+
    "\1\0\1\56\1\57\1\11\1\23\1\0\3\56\2\0"+
    "\7\60\1\27\1\56\20\53\1\56\1\43\1\0\1\56"+
    "\6\0\5\11\3\0\1\11\1\0\1\11\1\21\1\61"+
    "\1\21\1\0\3\11\2\0\3\27\1\62\4\27\1\11"+
    "\20\63\1\11\1\43\1\0\1\11\6\0\5\11\3\0"+
    "\1\11\1\0\1\11\1\21\1\61\1\21\1\0\3\11"+
    "\2\0\10\27\1\11\20\63\1\11\1\43\1\0\1\11"+
    "\6\0\5\11\3\0\1\11\1\0\1\11\1\21\1\61"+
    "\1\21\1\0\3\11\2\0\6\27\1\64\1\27\1\11"+
    "\20\63\1\11\1\43\1\0\1\11\6\0\5\11\3\0"+
    "\1\11\1\0\1\11\1\21\1\61\1\21\1\0\3\11"+
    "\2\0\10\27\1\11\14\63\1\65\3\63\1\11\1\43"+
    "\1\0\1\11\6\0\5\11\3\0\1\11\1\0\1\11"+
    "\1\21\1\61\1\66\1\0\3\11\2\0\10\67\1\11"+
    "\20\32\1\11\1\70\1\0\1\71\6\0\5\11\3\0"+
    "\1\11\1\0\1\11\1\21\1\61\1\66\1\0\3\11"+
    "\2\0\10\67\1\11\12\32\1\72\5\32\1\11\1\70"+
    "\1\0\1\71\6\0\5\11\3\0\1\11\1\0\1\11"+
    "\1\21\1\61\1\66\1\0\3\11\2\0\10\67\1\11"+
    "\1\73\17\32\1\11\1\70\1\0\1\71\6\0\5\11"+
    "\3\0\1\11\1\0\1\11\1\21\1\61\1\66\1\0"+
    "\3\11\2\0\10\67\1\11\4\32\1\74\13\32\1\11"+
    "\1\70\1\0\1\71\6\0\5\11\3\0\1\11\1\0"+
    "\1\11\1\21\1\61\1\66\1\0\3\11\2\0\10\67"+
    "\1\11\11\32\1\75\3\32\1\76\2\32\1\11\1\70"+
    "\1\0\1\71\6\0\5\11\3\0\1\11\1\0\1\11"+
    "\1\21\1\61\1\66\1\0\3\11\2\0\10\67\1\11"+
    "\1\77\17\32\1\11\1\70\1\0\1\71\6\0\5\11"+
    "\3\0\1\11\1\0\1\11\1\21\1\61\1\66\1\0"+
    "\3\11\2\0\10\67\1\11\4\32\1\100\13\32\1\11"+
    "\1\70\1\0\1\71\6\0\5\11\3\0\1\11\1\0"+
    "\1\11\1\21\1\61\1\66\1\0\3\11\2\0\10\67"+
    "\1\11\4\32\1\101\13\32\1\11\1\70\1\0\1\71"+
    "\6\0\5\11\3\0\1\11\1\0\1\11\1\21\1\61"+
    "\1\66\1\0\3\11\2\0\10\67\1\11\4\32\1\102"+
    "\13\32\1\11\1\70\1\0\1\71\6\0\5\11\3\0"+
    "\1\11\1\0\2\11\1\61\1\11\1\0\3\11\2\0"+
    "\10\43\1\11\20\0\1\11\1\43\1\0\1\11\5\0"+
    "\1\103\67\0\5\11\3\0\1\11\1\0\2\11\1\61"+
    "\1\11\1\0\3\11\2\0\10\43\1\11\20\45\1\11"+
    "\1\43\1\0\1\11\1\0\1\46\3\0\2\46\1\104"+
    "\1\46\2\0\27\46\1\0\21\46\4\0\1\46\3\0"+
    "\1\46\1\10\1\47\1\10\2\11\3\46\1\10\1\46"+
    "\2\10\1\105\1\10\1\46\3\10\2\46\10\50\1\11"+
    "\20\46\1\10\1\43\1\0\1\11\1\0\1\46\3\0"+
    "\1\46\1\10\1\47\1\10\2\11\3\46\1\10\1\46"+
    "\2\10\1\105\1\10\1\46\3\10\2\46\10\50\1\11"+
    "\20\51\1\10\1\43\1\0\1\11\6\0\5\11\3\0"+
    "\1\11\1\0\1\11\1\106\1\11\1\52\1\0\3\11"+
    "\2\0\10\43\1\11\20\45\1\11\1\43\1\0\1\11"+
    "\6\0\5\11\3\0\1\11\1\0\1\11\1\21\1\61"+
    "\1\21\1\0\3\11\2\0\10\27\1\11\20\53\1\11"+
    "\1\43\1\0\1\11\5\0\1\107\5\54\2\107\1\110"+
    "\1\54\1\107\2\54\1\111\1\54\1\107\3\54\1\0"+
    "\1\107\33\54\1\107\1\54\5\0\23\55\1\0\36\55"+
    "\6\0\5\56\3\0\1\56\1\0\2\56\2\11\1\0"+
    "\3\56\2\0\7\112\1\43\1\56\20\45\1\56\1\43"+
    "\1\0\1\56\6\0\5\56\3\0\1\56\1\0\1\56"+
    "\1\113\1\11\1\114\1\0\3\56\2\0\7\115\1\27"+
    "\1\56\20\53\1\56\1\43\1\0\1\56\5\0\23\60"+
    "\1\0\36\60\22\0\1\61\52\0\5\11\3\0\1\11"+
    "\1\0\1\11\1\21\1\61\1\21\1\0\3\11\2\0"+
    "\2\27\1\64\5\27\1\11\20\63\1\11\1\43\1\0"+
    "\1\11\21\0\1\63\1\0\1\63\6\0\10\63\1\0"+
    "\20\63\25\0\1\63\1\0\1\63\6\0\10\63\1\0"+
    "\7\63\1\116\10\63\12\0\5\11\3\0\1\11\1\0"+
    "\1\11\1\21\1\11\1\66\1\0\3\11\2\0\10\67"+
    "\1\11\20\32\1\11\1\70\1\0\1\71\6\0\5\11"+
    "\3\0\1\11\1\0\1\11\1\21\1\61\1\66\1\0"+
    "\3\11\2\0\10\67\1\11\20\117\1\11\1\70\1\0"+
    "\1\71\6\0\5\11\3\0\1\11\1\0\2\11\1\61"+
    "\1\71\1\0\3\11\2\0\10\70\1\11\20\120\1\11"+
    "\1\70\1\0\1\71\6\0\5\11\3\0\1\11\1\0"+
    "\3\11\1\71\1\0\3\11\2\0\10\70\1\11\20\121"+
    "\1\11\1\70\1\0\1\71\6\0\5\11\3\0\1\11"+
    "\1\0\1\11\1\21\1\61\1\66\1\0\3\11\2\0"+
    "\10\67\1\11\12\32\1\122\5\32\1\11\1\70\1\0"+
    "\1\71\6\0\5\11\3\0\1\11\1\0\1\11\1\21"+
    "\1\61\1\66\1\0\3\11\2\0\10\67\1\11\3\32"+
    "\1\123\14\32\1\11\1\70\1\0\1\71\6\0\5\11"+
    "\3\0\1\11\1\0\1\11\1\21\1\61\1\66\1\0"+
    "\3\11\2\0\10\67\1\11\17\32\1\124\1\11\1\70"+
    "\1\0\1\71\6\0\5\11\3\0\1\11\1\0\1\11"+
    "\1\21\1\61\1\66\1\0\3\11\2\0\10\67\1\11"+
    "\16\32\1\125\1\32\1\11\1\70\1\0\1\71\6\0"+
    "\5\11\3\0\1\11\1\0\1\11\1\21\1\61\1\66"+
    "\1\0\3\11\2\0\10\67\1\11\2\32\1\126\15\32"+
    "\1\11\1\70\1\0\1\71\6\0\5\11\3\0\1\11"+
    "\1\0\1\11\1\21\1\61\1\66\1\0\3\11\2\0"+
    "\10\67\1\11\10\32\1\127\7\32\1\11\1\70\1\0"+
    "\1\71\6\0\5\11\3\0\1\11\1\0\1\11\1\21"+
    "\1\61\1\66\1\0\3\11\2\0\10\67\1\11\4\32"+
    "\1\130\13\32\1\11\1\70\1\0\1\71\6\0\5\11"+
    "\3\0\1\11\1\0\1\11\1\21\1\61\1\66\1\0"+
    "\3\11\2\0\10\67\1\11\1\131\17\32\1\11\1\70"+
    "\1\0\1\71\6\0\5\11\3\0\1\11\1\0\1\11"+
    "\1\21\1\61\1\66\1\0\3\11\2\0\10\67\1\11"+
    "\14\32\1\132\3\32\1\11\1\70\1\0\1\71\5\0"+
    "\1\133\62\0\1\46\3\0\2\46\1\104\1\46\2\0"+
    "\7\46\1\105\17\46\1\0\21\46\11\0\5\11\3\0"+
    "\1\11\1\0\3\11\1\134\1\0\3\11\2\0\10\43"+
    "\1\11\20\45\1\11\1\43\1\0\1\11\5\0\10\107"+
    "\1\110\12\107\1\0\36\107\5\0\10\107\1\110\4\107"+
    "\1\135\5\107\1\0\36\107\5\0\10\54\1\136\5\54"+
    "\1\107\2\54\2\107\1\0\1\54\7\107\1\54\23\107"+
    "\1\54\1\107\6\0\5\56\3\0\1\56\1\0\2\56"+
    "\1\137\1\11\1\0\3\56\2\0\7\112\1\43\1\56"+
    "\20\0\1\56\1\43\1\0\1\56\6\0\5\56\3\0"+
    "\1\56\1\0\1\56\1\113\1\11\1\21\1\0\3\56"+
    "\2\0\7\115\1\27\1\56\20\53\1\56\1\43\1\0"+
    "\1\56\6\0\5\11\3\0\1\11\1\0\1\11\1\21"+
    "\1\11\1\114\1\0\3\11\2\0\10\27\1\11\20\53"+
    "\1\11\1\43\1\0\1\11\6\0\5\56\3\0\1\56"+
    "\1\0\1\56\1\113\1\137\1\21\1\0\3\56\2\0"+
    "\7\115\1\27\1\56\20\63\1\56\1\43\1\0\1\56"+
    "\21\0\1\63\1\0\1\63\6\0\10\63\1\0\11\63"+
    "\1\140\6\63\25\0\1\63\1\0\1\117\6\0\10\117"+
    "\1\0\20\117\1\0\1\120\1\0\1\120\23\0\1\120"+
    "\6\0\10\120\1\0\20\120\1\0\1\120\1\0\1\120"+
    "\6\0\5\11\3\0\1\11\1\0\2\11\1\61\1\71"+
    "\1\0\3\11\2\0\10\70\1\11\20\121\1\11\1\70"+
    "\1\0\1\71\6\0\5\11\3\0\1\11\1\0\1\11"+
    "\1\21\1\61\1\66\1\0\3\11\2\0\10\67\1\11"+
    "\10\32\1\141\7\32\1\11\1\70\1\0\1\71\6\0"+
    "\5\11\3\0\1\11\1\0\1\11\1\21\1\61\1\66"+
    "\1\0\3\11\2\0\10\67\1\11\4\32\1\142\13\32"+
    "\1\11\1\70\1\0\1\71\6\0\5\11\3\0\1\11"+
    "\1\0\1\11\1\21\1\61\1\66\1\0\3\11\2\0"+
    "\10\67\1\11\12\32\1\143\5\32\1\11\1\70\1\0"+
    "\1\71\6\0\5\11\3\0\1\11\1\0\1\11\1\21"+
    "\1\61\1\66\1\0\3\11\2\0\10\67\1\11\4\32"+
    "\1\144\13\32\1\11\1\70\1\0\1\71\6\0\5\11"+
    "\3\0\1\11\1\0\1\11\1\21\1\61\1\66\1\0"+
    "\3\11\2\0\10\67\1\11\14\32\1\145\3\32\1\11"+
    "\1\70\1\0\1\71\6\0\5\11\3\0\1\11\1\0"+
    "\1\11\1\21\1\61\1\66\1\0\3\11\2\0\10\67"+
    "\1\11\15\32\1\146\2\32\1\11\1\70\1\0\1\71"+
    "\6\0\5\11\3\0\1\11\1\0\1\11\1\21\1\61"+
    "\1\66\1\0\3\11\2\0\10\67\1\11\14\32\1\147"+
    "\3\32\1\11\1\70\1\0\1\71\6\0\5\11\3\0"+
    "\1\11\1\0\1\11\1\21\1\61\1\66\1\0\3\11"+
    "\2\0\10\67\1\11\10\32\1\150\7\32\1\11\1\70"+
    "\1\0\1\71\6\0\5\11\3\0\1\11\1\0\1\11"+
    "\1\21\1\61\1\66\1\0\3\11\2\0\10\67\1\11"+
    "\3\32\1\151\14\32\1\11\1\70\1\0\1\71\5\0"+
    "\1\152\66\0\1\107\5\54\2\107\1\110\1\54\1\107"+
    "\2\54\1\153\1\54\1\107\3\54\1\0\1\107\33\54"+
    "\1\107\1\54\6\0\5\137\3\0\1\137\1\0\4\137"+
    "\1\0\3\137\12\0\1\137\20\0\1\137\2\0\1\137"+
    "\21\0\1\63\1\0\1\63\6\0\10\63\1\0\2\63"+
    "\1\154\15\63\12\0\5\11\3\0\1\11\1\0\1\11"+
    "\1\21\1\61\1\66\1\0\3\11\2\0\10\67\1\11"+
    "\4\32\1\155\13\32\1\11\1\70\1\0\1\71\6\0"+
    "\5\11\3\0\1\11\1\0\1\11\1\21\1\61\1\66"+
    "\1\0\3\11\2\0\10\67\1\11\11\32\1\156\6\32"+
    "\1\11\1\70\1\0\1\71\6\0\5\11\3\0\1\11"+
    "\1\0\1\11\1\21\1\61\1\66\1\0\3\11\2\0"+
    "\10\67\1\11\10\32\1\157\7\32\1\11\1\70\1\0"+
    "\1\71\6\0\5\11\3\0\1\11\1\0\1\11\1\21"+
    "\1\61\1\66\1\0\3\11\2\0\10\67\1\11\14\32"+
    "\1\160\3\32\1\11\1\70\1\0\1\71\6\0\5\11"+
    "\3\0\1\11\1\0\1\11\1\21\1\61\1\66\1\0"+
    "\3\11\2\0\10\67\1\11\7\32\1\161\10\32\1\11"+
    "\1\70\1\0\1\71\6\0\5\11\3\0\1\11\1\0"+
    "\1\11\1\21\1\61\1\66\1\0\3\11\2\0\10\67"+
    "\1\11\12\32\1\162\5\32\1\11\1\70\1\0\1\71"+
    "\6\0\5\11\3\0\1\11\1\0\1\11\1\21\1\61"+
    "\1\66\1\0\3\11\2\0\10\67\1\11\1\163\17\32"+
    "\1\11\1\70\1\0\1\71\5\0\1\164\102\0\1\63"+
    "\1\0\1\63\6\0\10\63\1\0\7\63\1\165\10\63"+
    "\12\0\5\11\3\0\1\11\1\0\1\11\1\21\1\61"+
    "\1\66\1\0\3\11\2\0\10\67\1\11\1\166\17\32"+
    "\1\11\1\70\1\0\1\71\6\0\5\11\3\0\1\11"+
    "\1\0\1\11\1\21\1\61\1\66\1\0\3\11\2\0"+
    "\10\67\1\11\1\167\17\32\1\11\1\70\1\0\1\71"+
    "\6\0\5\11\3\0\1\11\1\0\1\11\1\21\1\61"+
    "\1\66\1\0\3\11\2\0\10\67\1\11\17\32\1\170"+
    "\1\11\1\70\1\0\1\71\6\0\5\11\3\0\1\11"+
    "\1\0\1\11\1\21\1\61\1\66\1\0\3\11\2\0"+
    "\10\67\1\11\12\32\1\171\5\32\1\11\1\70\1\0"+
    "\1\71\6\0\5\11\3\0\1\11\1\0\1\11\1\21"+
    "\1\61\1\66\1\0\3\11\2\0\10\67\1\11\1\32"+
    "\1\172\16\32\1\11\1\70\1\0\1\71\6\0\5\11"+
    "\3\0\1\11\1\0\1\11\1\21\1\61\1\66\1\0"+
    "\3\11\2\0\10\67\1\11\3\32\1\173\14\32\1\11"+
    "\1\70\1\0\1\71\5\0\1\174\102\0\1\63\1\0"+
    "\1\63\6\0\10\63\1\0\13\63\1\175\4\63\12\0"+
    "\5\11\3\0\1\11\1\0\1\11\1\21\1\61\1\66"+
    "\1\0\3\11\2\0\10\67\1\11\11\32\1\176\6\32"+
    "\1\11\1\70\1\0\1\71\6\0\5\11\3\0\1\11"+
    "\1\0\1\11\1\21\1\61\1\66\1\0\3\11\2\0"+
    "\10\67\1\11\4\32\1\177\13\32\1\11\1\70\1\0"+
    "\1\71\6\0\5\11\3\0\1\11\1\0\1\11\1\21"+
    "\1\61\1\66\1\0\3\11\2\0\10\67\1\11\7\32"+
    "\1\200\10\32\1\11\1\70\1\0\1\71\6\0\5\11"+
    "\3\0\1\11\1\0\1\11\1\21\1\61\1\66\1\0"+
    "\3\11\2\0\10\67\1\11\4\32\1\201\13\32\1\11"+
    "\1\70\1\0\1\71\5\0\1\202\102\0\1\63\1\0"+
    "\1\63\6\0\10\63\1\0\1\203\17\63\12\0\5\11"+
    "\3\0\1\11\1\0\1\11\1\21\1\61\1\66\1\0"+
    "\3\11\2\0\10\67\1\11\14\32\1\204\3\32\1\11"+
    "\1\70\1\0\1\71\6\0\5\11\3\0\1\11\1\0"+
    "\1\11\1\21\1\61\1\66\1\0\3\11\2\0\10\67"+
    "\1\11\14\32\1\205\3\32\1\11\1\70\1\0\1\71"+
    "\6\0\5\11\3\0\1\11\1\0\1\11\1\21\1\61"+
    "\1\66\1\0\3\11\2\0\10\67\1\11\14\32\1\146"+
    "\3\32\1\11\1\70\1\0\1\71\21\0\1\63\1\0"+
    "\1\63\6\0\10\63\1\0\10\63\1\206\7\63\11\0"+
    "\1\207\5\11\3\0\1\11\1\0\1\11\1\21\1\61"+
    "\1\66\1\0\3\11\2\0\10\67\1\11\20\32\1\11"+
    "\1\70\1\0\1\71";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6050];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\3\11\6\1\3\11\1\1\1\11\4\1\1\11"+
    "\17\1\1\0\1\1\1\0\34\1\1\0\1\11\2\1"+
    "\3\0\40\1\1\0\11\1\1\0\7\1\1\0\12\1"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;
    public int linea;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  intermedio(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
              {
                return new Symbol(sym.EOF );
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { 
            }
            // fall through
          case 32: break;
          case 2:
            { System.out.println("Error verificar "+yytext());
                        return new Symbol(sym.error);
            }
            // fall through
          case 33: break;
          case 3:
            { return new Symbol(sym.salto,yytext());
            }
            // fall through
          case 34: break;
          case 4:
            { return new Symbol(sym.newline,yytext());
            }
            // fall through
          case 35: break;
          case 5:
            { return new Symbol(sym.libre,yytext());
            }
            // fall through
          case 36: break;
          case 6:
            { lexeme=yytext();
                        return new Symbol(sym.error);
            }
            // fall through
          case 37: break;
          case 7:
            { lexeme=yytext(); 
                          return new Symbol(sym.operadores,yytext());
            }
            // fall through
          case 38: break;
          case 8:
            { return new Symbol(sym.para,yytext());
            }
            // fall through
          case 39: break;
          case 9:
            { return new Symbol(sym.parb,yytext());
            }
            // fall through
          case 40: break;
          case 10:
            { lexeme=yytext(); 
                        return new Symbol(sym.coma,yytext());
            }
            // fall through
          case 41: break;
          case 11:
            { lexeme=yytext();  
                        System.out.println("Error verificar "+yytext());
                        return new Symbol(sym.error);
            }
            // fall through
          case 42: break;
          case 12:
            { lexeme=yytext();   return new Symbol(sym.entero,Integer.parseInt(yytext()));
            }
            // fall through
          case 43: break;
          case 13:
            { lexeme=yytext(); 
                         return  new Symbol(sym.fin_de_linea,yytext());
            }
            // fall through
          case 44: break;
          case 14:
            { lexeme=yytext(); 
                        return new Symbol(sym.asignacion,yytext());
            }
            // fall through
          case 45: break;
          case 15:
            { lexeme=yytext(); 
                         return new Symbol(sym.identificador,yytext());
            }
            // fall through
          case 46: break;
          case 16:
            { lexeme=yytext();  return new Symbol(sym.cadena,yytext());
            }
            // fall through
          case 47: break;
          case 17:
            { lexeme=yytext();
                        System.out.println("Error verificar "+yytext());
                        return new Symbol(sym.error);
            }
            // fall through
          case 48: break;
          case 18:
            { lexeme=yytext();  return new Symbol(sym.comentario,yytext());
            }
            // fall through
          case 49: break;
          case 19:
            { lexeme=yytext(); 
                         return new Symbol(sym.operador_Logico,yytext());
            }
            // fall through
          case 50: break;
          case 20:
            { lexeme=yytext();  return new Symbol(sym.real,Double.parseDouble(yytext()));
            }
            // fall through
          case 51: break;
          case 21:
            { return new Symbol(sym.tabu,yytext());
            }
            // fall through
          case 52: break;
          case 22:
            { lexeme=yytext();  return new Symbol(sym.comentarios,yytext());
            }
            // fall through
          case 53: break;
          case 23:
            { lexeme=yytext(); 
                        return new Symbol(sym.salida,yytext());
            }
            // fall through
          case 54: break;
          case 24:
            { lexeme=yytext(); return new Symbol(sym.tipo_real,yytext());
            }
            // fall through
          case 55: break;
          case 25:
            { lexeme=yytext();  
                        return new Symbol(sym.boleano,yytext());
            }
            // fall through
          case 56: break;
          case 26:
            { lexeme=yytext(); return new Symbol(sym.tipo_cadena,yytext());
            }
            // fall through
          case 57: break;
          case 27:
            { lexeme=yytext(); return new Symbol(sym.tipo_ent,yytext());
            }
            // fall through
          case 58: break;
          case 28:
            { lexeme=yytext(); return new Symbol(sym.tipo_bol,yytext());
            }
            // fall through
          case 59: break;
          case 29:
            { lexeme=yytext(); 
                        return new Symbol(sym.entrada,yytext());
            }
            // fall through
          case 60: break;
          case 30:
            { lexeme=yytext(); 
                        linea= yyline; 
                        return new Symbol(sym.principal,yytext());
            }
            // fall through
          case 61: break;
          case 31:
            { lexeme=yytext(); 
                        linea= yyline; 
                        return new Symbol(sym.retornar,yytext());
            }
            // fall through
          case 62: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
