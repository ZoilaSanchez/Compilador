// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/main/java/gt/edu/url/compiladores/loop/interprete/loop/interprete/Lexico.flex


package gt.edu.url.compiladores.loop.interprete.loop.interprete;
import static gt.edu.url.compiladores.loop.interprete.loop.interprete.Tokens.*;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexico {

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
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\4\1\5"+
    "\1\6\2\7\1\10\1\7\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\12\22\1\7\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\2\32\1\33"+
    "\11\32\1\34\1\35\2\32\1\36\10\32\1\7\1\11"+
    "\1\7\1\24\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\2\47\1\50\2\47\1\51\1\47\1\52"+
    "\1\53\2\47\1\54\1\55\1\56\1\47\1\57\4\47"+
    "\1\7\1\60\2\7\6\0\1\3\33\0\1\7\22\0"+
    "\1\61\12\0\1\61\1\0\1\62\1\27\6\0\1\62"+
    "\3\0\1\62\3\0\1\62\1\0\1\62\6\0\1\62"+
    "\1\0\1\62\4\0\1\63\7\0\1\63\3\0\1\63"+
    "\3\0\1\63\1\0\1\63\6\0\1\63\1\0\1\63"+
    "\303\0\1\40\2\0\1\40\365\0\1\64\12\0\1\40"+
    "\u0163\0\2\3\326\0\u0100\3";

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
    "\1\1\1\2\2\1\2\3\3\4\1\5\1\4\1\6"+
    "\1\4\1\7\1\10\1\4\4\6\11\11\1\1\3\3"+
    "\1\4\1\3\1\7\5\6\1\12\1\13\4\6\1\14"+
    "\1\6\16\11\2\3\1\6\3\0\1\15\1\16\16\11"+
    "\1\15\1\0\1\17\7\11\1\20\1\21\7\11\1\22"+
    "\1\6\2\11\1\21\1\6\3\11\1\0\1\11\1\6"+
    "\1\23\1\3\2\11\1\0\1\11\1\6\1\23\1\24"+
    "\1\11\1\25\1\26\5\0\1\27\1\6\1\30\4\0"+
    "\1\27\1\30\20\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[158];
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
    "\0\0\0\65\0\152\0\65\0\237\0\324\0\324\0\65"+
    "\0\u0109\0\65\0\u013e\0\u0173\0\u01a8\0\u01dd\0\65\0\237"+
    "\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6\0\u031b\0\u0350\0\u0385"+
    "\0\u03ba\0\u03ef\0\u0424\0\u0459\0\u048e\0\324\0\u04c3\0\u04f8"+
    "\0\u052d\0\u04f8\0\u0562\0\u0597\0\u05cc\0\u0601\0\u0636\0\u066b"+
    "\0\u06a0\0\u06d5\0\u070a\0\u073f\0\u0774\0\u07a9\0\u07de\0\u02b1"+
    "\0\u0813\0\u0848\0\u087d\0\u08b2\0\u08e7\0\u091c\0\u0951\0\u0986"+
    "\0\u09bb\0\u09f0\0\u0a25\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9\0\u0b2e"+
    "\0\u0b63\0\u0b98\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0ca1\0\u0cd6"+
    "\0\u0d0b\0\u0d40\0\u0d75\0\u0daa\0\u0ddf\0\u0e14\0\u0e49\0\u0e7e"+
    "\0\u0eb3\0\u0ee8\0\u0f1d\0\u0f52\0\u0f87\0\u0b63\0\u0fbc\0\u0ff1"+
    "\0\u1026\0\u105b\0\u1090\0\u10c5\0\u10fa\0\u112f\0\u1164\0\u02e6"+
    "\0\u1199\0\u11ce\0\u1203\0\u1238\0\u126d\0\u12a2\0\u12d7\0\u130c"+
    "\0\u02e6\0\u1341\0\u1376\0\u13ab\0\u13e0\0\u1415\0\u144a\0\u147f"+
    "\0\u14b4\0\u14e9\0\u151e\0\u1553\0\u1588\0\u15bd\0\u15f2\0\u1627"+
    "\0\u165c\0\u1691\0\u16c6\0\u16fb\0\u1730\0\u1765\0\u02e6\0\65"+
    "\0\u179a\0\u17cf\0\u1804\0\u1839\0\u186e\0\u05cc\0\u18a3\0\u0848"+
    "\0\u18d8\0\u190d\0\u1942\0\u1977\0\65\0\65\0\u19ac\0\u19e1"+
    "\0\u1a16\0\u1a4b\0\u1a80\0\u1ab5\0\u1aea\0\u1b1f\0\u1b54\0\u1b89"+
    "\0\u1bbe\0\u1bf3\0\u1c28\0\u1c5d\0\u1c92\0\u1cc7";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[158];
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
    "\1\2\1\3\1\4\1\0\1\4\1\5\2\6\1\7"+
    "\1\6\2\2\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\7\1\20\1\7\2\2\1\21\3\22"+
    "\1\23\1\22\1\24\1\6\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\2\25\1\33\2\25\1\34\2\25\1\35"+
    "\1\36\1\6\1\37\1\6\1\2\66\0\1\3\70\0"+
    "\5\40\3\0\1\40\1\0\2\40\1\41\1\40\1\0"+
    "\1\40\1\42\1\40\2\0\7\37\1\40\17\43\2\40"+
    "\1\37\1\40\6\0\5\40\3\0\1\40\1\0\2\40"+
    "\1\41\1\40\1\0\3\40\2\0\7\37\1\40\17\43"+
    "\2\40\1\37\1\40\6\0\5\40\3\0\1\42\1\0"+
    "\2\40\1\41\1\40\1\0\3\40\2\0\7\37\1\40"+
    "\17\43\2\40\1\37\1\40\6\0\5\40\3\0\1\40"+
    "\1\0\1\42\1\40\1\41\1\44\1\0\3\40\2\0"+
    "\7\37\1\40\17\43\2\40\1\37\1\40\5\0\1\45"+
    "\5\46\3\45\1\46\1\45\1\46\1\47\1\50\1\47"+
    "\1\45\1\46\2\40\1\0\1\45\7\24\1\40\17\51"+
    "\1\46\1\40\1\37\1\40\1\45\14\0\1\52\4\0"+
    "\1\53\47\0\1\45\5\54\3\45\1\54\1\45\1\54"+
    "\1\55\1\46\1\16\1\45\1\54\2\6\1\0\1\45"+
    "\6\22\1\24\1\6\17\51\1\54\1\6\1\37\1\6"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\47\1\50\1\47\1\45\1\46\2\40\1\0\1\45"+
    "\3\24\1\56\3\24\1\40\17\57\1\46\1\40\1\37"+
    "\1\40\1\45\4\0\1\45\5\46\3\45\1\46\1\45"+
    "\1\46\1\47\1\50\1\47\1\45\1\46\2\40\1\0"+
    "\1\45\7\24\1\40\17\57\1\46\1\40\1\37\1\40"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\47\1\50\1\47\1\45\1\46\2\40\1\0\1\45"+
    "\5\24\1\60\1\24\1\40\17\57\1\46\1\40\1\37"+
    "\1\40\1\45\4\0\1\45\5\46\3\45\1\46\1\45"+
    "\1\46\1\47\1\45\1\47\1\45\1\46\2\40\1\0"+
    "\1\45\7\24\1\40\17\57\1\46\1\40\1\37\1\40"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\61\1\45\1\62\1\45\1\46\2\40\1\0\1\45"+
    "\7\63\1\40\17\25\1\46\1\40\1\64\1\65\1\45"+
    "\4\0\1\45\5\46\3\45\1\46\1\45\1\46\1\61"+
    "\1\45\1\62\1\45\1\46\2\40\1\0\1\45\7\63"+
    "\1\40\12\25\1\66\4\25\1\46\1\40\1\64\1\65"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\61\1\45\1\62\1\45\1\46\2\40\1\0\1\45"+
    "\7\63\1\40\1\67\7\25\1\70\6\25\1\46\1\40"+
    "\1\64\1\65\1\45\4\0\1\45\5\46\3\45\1\46"+
    "\1\45\1\46\1\61\1\45\1\62\1\45\1\46\2\40"+
    "\1\0\1\45\7\63\1\40\4\25\1\71\12\25\1\46"+
    "\1\40\1\64\1\65\1\45\4\0\1\45\5\46\3\45"+
    "\1\46\1\45\1\46\1\61\1\45\1\62\1\45\1\46"+
    "\2\40\1\0\1\45\7\63\1\40\11\25\1\72\2\25"+
    "\1\73\2\25\1\46\1\40\1\64\1\65\1\45\4\0"+
    "\1\45\5\46\3\45\1\46\1\45\1\46\1\61\1\45"+
    "\1\62\1\45\1\46\2\40\1\0\1\45\7\63\1\40"+
    "\1\74\16\25\1\46\1\40\1\64\1\65\1\45\4\0"+
    "\1\45\5\46\3\45\1\46\1\45\1\46\1\61\1\45"+
    "\1\62\1\45\1\46\2\40\1\0\1\45\7\63\1\40"+
    "\4\25\1\75\12\25\1\46\1\40\1\64\1\65\1\45"+
    "\4\0\1\45\5\46\3\45\1\46\1\45\1\46\1\61"+
    "\1\45\1\62\1\45\1\46\2\40\1\0\1\45\7\63"+
    "\1\40\4\25\1\76\12\25\1\46\1\40\1\64\1\65"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\61\1\45\1\62\1\45\1\46\2\40\1\0\1\45"+
    "\7\63\1\40\4\25\1\77\12\25\1\46\1\40\1\64"+
    "\1\65\1\45\5\0\5\40\3\0\1\40\1\0\2\40"+
    "\1\100\1\40\1\0\3\40\2\0\7\37\1\40\17\0"+
    "\2\40\1\37\1\40\6\0\5\40\3\0\1\40\1\0"+
    "\4\40\1\0\3\40\2\0\7\37\1\40\17\43\2\40"+
    "\1\37\1\40\6\0\5\41\3\0\1\41\1\0\4\41"+
    "\1\0\3\41\2\0\33\41\6\0\5\40\3\0\1\40"+
    "\1\0\2\40\1\100\1\40\1\0\3\40\2\0\7\37"+
    "\1\40\17\43\2\40\1\37\1\40\6\0\5\40\3\0"+
    "\1\40\1\0\1\40\1\101\1\40\1\44\1\0\3\40"+
    "\2\0\7\37\1\40\17\43\2\40\1\37\1\40\5\0"+
    "\16\45\1\0\2\45\3\0\1\45\6\0\1\45\20\0"+
    "\1\45\3\0\1\45\4\0\1\45\5\46\3\45\1\46"+
    "\1\45\3\46\1\40\1\45\1\46\2\40\1\0\1\45"+
    "\6\37\1\102\1\40\17\43\1\46\1\40\1\37\1\40"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\47\1\46\1\47\1\45\1\46\2\40\1\0\1\45"+
    "\7\24\1\40\17\51\1\46\1\40\1\37\1\40\1\45"+
    "\4\0\1\45\5\50\3\45\1\50\1\45\3\50\1\41"+
    "\1\45\1\50\2\41\1\0\1\45\6\41\1\50\20\41"+
    "\1\50\3\41\1\45\4\0\1\45\5\46\3\45\1\46"+
    "\1\45\1\46\1\47\1\45\1\47\1\45\1\46\2\40"+
    "\1\0\1\45\7\24\1\40\17\51\1\46\1\40\1\37"+
    "\1\40\1\45\4\0\1\103\5\52\2\0\1\104\1\52"+
    "\1\0\2\52\1\105\1\52\1\0\3\52\2\0\33\52"+
    "\5\0\23\53\1\0\35\53\4\0\1\45\5\46\3\45"+
    "\1\46\1\45\2\46\1\50\1\40\1\45\1\46\2\40"+
    "\1\0\1\45\6\37\1\102\1\40\17\43\1\46\1\40"+
    "\1\37\1\40\1\45\4\0\1\45\5\46\3\45\1\46"+
    "\1\45\1\46\1\47\1\50\1\106\1\45\1\46\2\40"+
    "\1\0\1\45\7\24\1\40\17\51\1\46\1\40\1\37"+
    "\1\40\1\45\4\0\1\45\5\46\3\45\1\46\1\45"+
    "\1\46\1\47\1\45\1\47\1\45\1\46\2\40\1\0"+
    "\1\45\2\24\1\60\4\24\1\40\17\57\1\46\1\40"+
    "\1\37\1\40\1\45\4\0\14\45\1\57\1\45\1\57"+
    "\2\45\3\0\1\45\7\57\1\0\17\57\1\45\3\0"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\47\1\46\1\47\1\45\1\46\2\40\1\0\1\45"+
    "\7\24\1\40\17\107\1\46\1\40\1\37\1\40\1\45"+
    "\4\0\1\45\5\46\3\45\1\46\1\45\1\46\1\47"+
    "\1\46\1\62\1\45\1\46\2\40\1\0\1\45\7\63"+
    "\1\40\17\110\1\46\1\40\1\64\1\65\1\45\4\0"+
    "\1\45\5\46\3\45\1\46\1\45\1\46\1\47\1\45"+
    "\1\62\1\45\1\46\2\40\1\0\1\45\7\63\1\40"+
    "\17\111\1\46\1\40\1\64\1\65\1\45\5\0\5\40"+
    "\3\0\1\40\1\0\2\40\1\100\1\65\1\0\3\40"+
    "\2\0\7\64\1\40\17\112\2\40\1\64\1\65\6\0"+
    "\5\40\3\0\1\40\1\0\3\40\1\65\1\0\3\40"+
    "\2\0\7\64\1\40\17\113\2\40\1\64\1\65\5\0"+
    "\1\45\5\46\3\45\1\46\1\45\1\46\1\61\1\45"+
    "\1\62\1\45\1\46\2\40\1\0\1\45\7\63\1\40"+
    "\12\25\1\114\4\25\1\46\1\40\1\64\1\65\1\45"+
    "\4\0\1\45\5\46\3\45\1\46\1\45\1\46\1\61"+
    "\1\45\1\62\1\45\1\46\2\40\1\0\1\45\7\63"+
    "\1\40\3\25\1\115\13\25\1\46\1\40\1\64\1\65"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\61\1\45\1\62\1\45\1\46\2\40\1\0\1\45"+
    "\7\63\1\40\1\116\16\25\1\46\1\40\1\64\1\65"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\61\1\45\1\62\1\45\1\46\2\40\1\0\1\45"+
    "\7\63\1\40\16\25\1\117\1\46\1\40\1\64\1\65"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\61\1\45\1\62\1\45\1\46\2\40\1\0\1\45"+
    "\7\63\1\40\15\25\1\120\1\25\1\46\1\40\1\64"+
    "\1\65\1\45\4\0\1\45\5\46\3\45\1\46\1\45"+
    "\1\46\1\61\1\45\1\62\1\45\1\46\2\40\1\0"+
    "\1\45\7\63\1\40\2\25\1\121\14\25\1\46\1\40"+
    "\1\64\1\65\1\45\4\0\1\45\5\46\3\45\1\46"+
    "\1\45\1\46\1\61\1\45\1\62\1\45\1\46\2\40"+
    "\1\0\1\45\7\63\1\40\10\25\1\122\6\25\1\46"+
    "\1\40\1\64\1\65\1\45\4\0\1\45\5\46\3\45"+
    "\1\46\1\45\1\46\1\61\1\45\1\62\1\45\1\46"+
    "\2\40\1\0\1\45\7\63\1\40\4\25\1\123\12\25"+
    "\1\46\1\40\1\64\1\65\1\45\4\0\1\45\5\46"+
    "\3\45\1\46\1\45\1\46\1\61\1\45\1\62\1\45"+
    "\1\46\2\40\1\0\1\45\7\63\1\40\1\124\16\25"+
    "\1\46\1\40\1\64\1\65\1\45\4\0\1\45\5\46"+
    "\3\45\1\46\1\45\1\46\1\61\1\45\1\62\1\45"+
    "\1\46\2\40\1\0\1\45\7\63\1\40\13\25\1\125"+
    "\3\25\1\46\1\40\1\64\1\65\1\45\21\0\1\100"+
    "\50\0\5\40\3\0\1\40\1\0\3\40\1\126\1\0"+
    "\3\40\2\0\7\37\1\40\17\43\2\40\1\37\1\40"+
    "\5\0\1\45\5\46\3\45\1\46\1\45\2\46\1\45"+
    "\1\40\1\45\1\46\2\40\1\0\1\45\6\37\1\102"+
    "\1\40\17\0\1\46\1\40\1\37\1\40\1\45\4\0"+
    "\6\103\2\0\1\104\1\103\1\0\2\103\1\127\1\103"+
    "\1\0\3\103\2\0\33\103\22\0\1\130\47\0\16\52"+
    "\1\0\2\52\3\0\1\52\6\0\1\52\20\0\1\52"+
    "\3\0\1\52\4\0\1\45\5\46\3\45\1\46\1\45"+
    "\1\46\1\47\1\46\1\106\1\45\1\46\2\40\1\0"+
    "\1\45\7\24\1\40\17\51\1\46\1\40\1\37\1\40"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\47\1\45\1\47\1\45\1\46\2\40\1\0\1\45"+
    "\7\24\1\40\17\107\1\46\1\40\1\37\1\40\1\45"+
    "\4\0\1\45\5\46\3\45\1\46\1\45\1\46\1\47"+
    "\1\45\1\62\1\45\1\46\2\40\1\0\1\45\7\63"+
    "\1\40\17\110\1\46\1\40\1\64\1\65\1\45\4\0"+
    "\14\45\1\57\1\45\1\111\2\45\3\0\1\45\7\111"+
    "\1\0\17\111\1\45\1\0\2\112\1\45\22\0\1\112"+
    "\6\0\7\112\1\0\17\112\2\0\2\112\6\0\5\40"+
    "\3\0\1\40\1\0\2\40\1\100\1\65\1\0\3\40"+
    "\2\0\7\64\1\40\17\113\2\40\1\64\1\65\5\0"+
    "\1\45\5\46\3\45\1\46\1\45\1\46\1\61\1\45"+
    "\1\62\1\45\1\46\2\40\1\0\1\45\7\63\1\40"+
    "\10\25\1\131\6\25\1\46\1\40\1\64\1\65\1\45"+
    "\4\0\1\45\5\46\3\45\1\46\1\45\1\46\1\61"+
    "\1\45\1\62\1\45\1\46\2\40\1\0\1\45\7\63"+
    "\1\40\4\25\1\132\12\25\1\46\1\40\1\64\1\65"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\61\1\45\1\62\1\45\1\46\2\40\1\0\1\45"+
    "\7\63\1\40\14\25\1\133\2\25\1\46\1\40\1\64"+
    "\1\65\1\45\4\0\1\45\5\46\3\45\1\46\1\45"+
    "\1\46\1\61\1\45\1\62\1\45\1\46\2\40\1\0"+
    "\1\45\7\63\1\40\12\25\1\134\4\25\1\46\1\40"+
    "\1\64\1\65\1\45\4\0\1\45\5\46\3\45\1\46"+
    "\1\45\1\46\1\61\1\45\1\62\1\45\1\46\2\40"+
    "\1\0\1\45\7\63\1\40\4\25\1\135\12\25\1\46"+
    "\1\40\1\64\1\65\1\45\4\0\1\45\5\46\3\45"+
    "\1\46\1\45\1\46\1\61\1\45\1\62\1\45\1\46"+
    "\2\40\1\0\1\45\7\63\1\40\13\25\1\136\3\25"+
    "\1\46\1\40\1\64\1\65\1\45\4\0\1\45\5\46"+
    "\3\45\1\46\1\45\1\46\1\61\1\45\1\62\1\45"+
    "\1\46\2\40\1\0\1\45\7\63\1\40\14\25\1\137"+
    "\2\25\1\46\1\40\1\64\1\65\1\45\4\0\1\45"+
    "\5\46\3\45\1\46\1\45\1\46\1\61\1\45\1\62"+
    "\1\45\1\46\2\40\1\0\1\45\7\63\1\40\13\25"+
    "\1\140\3\25\1\46\1\40\1\64\1\65\1\45\4\0"+
    "\1\45\5\46\3\45\1\46\1\45\1\46\1\61\1\45"+
    "\1\62\1\45\1\46\2\40\1\0\1\45\7\63\1\40"+
    "\10\25\1\141\6\25\1\46\1\40\1\64\1\65\1\45"+
    "\4\0\1\45\5\46\3\45\1\46\1\45\1\46\1\61"+
    "\1\45\1\62\1\45\1\46\2\40\1\0\1\45\7\63"+
    "\1\40\3\25\1\142\13\25\1\46\1\40\1\64\1\65"+
    "\1\45\4\0\16\103\1\0\2\103\3\0\1\103\6\0"+
    "\1\103\20\0\1\103\3\0\1\103\14\0\1\104\54\0"+
    "\1\45\5\46\3\45\1\46\1\45\1\46\1\61\1\45"+
    "\1\62\1\45\1\46\2\40\1\0\1\45\7\63\1\40"+
    "\4\25\1\143\12\25\1\46\1\40\1\64\1\65\1\45"+
    "\4\0\1\45\5\46\3\45\1\46\1\45\1\46\1\61"+
    "\1\45\1\62\1\45\1\46\2\40\1\0\1\45\7\63"+
    "\1\40\11\25\1\144\5\25\1\46\1\40\1\64\1\65"+
    "\1\45\4\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\61\1\45\1\62\1\45\1\46\2\40\1\0\1\45"+
    "\7\63\1\40\4\25\1\145\12\25\1\46\1\40\1\64"+
    "\1\65\1\45\4\0\1\45\5\46\3\45\1\46\1\45"+
    "\1\46\1\61\1\45\1\62\1\45\1\46\2\40\1\0"+
    "\1\45\7\63\1\40\10\25\1\146\6\25\1\46\1\40"+
    "\1\64\1\65\1\45\4\0\1\45\5\46\3\45\1\46"+
    "\1\45\1\46\1\61\1\45\1\62\1\45\1\46\2\40"+
    "\1\0\1\45\7\63\1\40\13\25\1\147\3\25\1\46"+
    "\1\40\1\64\1\65\1\45\4\0\1\45\5\46\3\45"+
    "\1\46\1\45\1\46\1\61\1\45\1\62\1\45\1\46"+
    "\2\40\1\0\1\45\7\63\1\40\7\25\1\150\7\25"+
    "\1\46\1\40\1\64\1\65\1\45\4\0\1\45\5\46"+
    "\3\45\1\46\1\45\1\46\1\61\1\45\1\62\1\45"+
    "\1\46\2\40\1\0\1\45\7\63\1\40\12\25\1\151"+
    "\4\25\1\46\1\40\1\64\1\65\1\45\4\0\1\152"+
    "\5\46\3\45\1\46\1\45\1\46\1\61\1\45\1\62"+
    "\1\45\1\46\2\40\1\0\1\45\7\63\1\40\17\25"+
    "\1\46\1\40\1\64\1\65\1\45\4\0\1\45\5\46"+
    "\3\45\1\46\1\45\1\46\1\61\1\45\1\62\1\45"+
    "\1\46\2\40\1\0\1\45\7\63\1\40\1\153\16\25"+
    "\1\46\1\40\1\64\1\65\1\45\4\0\1\45\5\46"+
    "\3\45\1\46\1\45\1\46\1\61\1\45\1\62\1\45"+
    "\1\46\2\40\1\0\1\45\7\63\1\40\1\154\16\25"+
    "\1\46\1\40\1\64\1\65\1\45\4\0\1\45\5\46"+
    "\3\45\1\46\1\45\1\46\1\61\1\45\1\62\1\45"+
    "\1\46\2\40\1\0\1\45\7\63\1\40\1\155\16\25"+
    "\1\46\1\40\1\64\1\65\1\45\4\0\1\156\5\46"+
    "\3\45\1\46\1\45\1\46\1\61\1\45\1\62\1\45"+
    "\1\46\2\40\1\0\1\45\7\63\1\40\14\25\1\157"+
    "\2\25\1\46\1\40\1\64\1\65\1\45\4\0\1\45"+
    "\5\46\3\45\1\46\1\45\1\46\1\61\1\45\1\62"+
    "\1\45\1\46\2\40\1\0\1\45\7\63\1\40\16\25"+
    "\1\160\1\46\1\40\1\64\1\65\1\45\4\0\1\45"+
    "\5\46\3\45\1\46\1\45\1\46\1\61\1\45\1\62"+
    "\1\45\1\46\2\40\1\0\1\45\7\63\1\40\12\25"+
    "\1\141\4\25\1\46\1\40\1\64\1\65\1\45\4\0"+
    "\1\45\5\46\3\45\1\46\1\45\1\46\1\61\1\45"+
    "\1\62\1\45\1\46\2\40\1\0\1\45\7\63\1\40"+
    "\1\25\1\161\15\25\1\46\1\40\1\64\1\65\1\45"+
    "\4\0\1\152\15\45\1\0\2\45\3\0\1\45\6\0"+
    "\1\45\1\0\17\162\1\45\3\0\1\45\4\0\1\45"+
    "\5\46\3\45\1\46\1\45\1\46\1\61\1\45\1\62"+
    "\1\45\1\46\2\40\1\0\1\45\7\63\1\40\3\25"+
    "\1\163\13\25\1\46\1\40\1\64\1\65\1\45\4\0"+
    "\1\45\5\46\3\45\1\46\1\45\1\46\1\61\1\45"+
    "\1\62\1\45\1\46\2\40\1\0\1\45\7\63\1\40"+
    "\11\25\1\141\5\25\1\46\1\40\1\64\1\65\1\45"+
    "\4\0\1\164\5\46\3\45\1\46\1\45\1\46\1\61"+
    "\1\45\1\62\1\45\1\46\2\40\1\0\1\45\7\63"+
    "\1\40\17\25\1\46\1\40\1\64\1\65\1\45\4\0"+
    "\16\45\1\0\2\45\3\0\1\45\6\165\1\45\20\0"+
    "\1\45\3\0\1\45\4\0\1\45\5\46\3\45\1\46"+
    "\1\45\1\46\1\61\1\45\1\62\1\45\1\46\1\166"+
    "\1\40\1\0\1\45\7\63\1\40\17\25\1\46\1\40"+
    "\1\64\1\65\1\45\4\0\1\45\5\46\3\45\1\46"+
    "\1\45\1\46\1\61\1\45\1\62\1\45\1\46\2\40"+
    "\1\0\1\45\7\63\1\40\4\25\1\167\12\25\1\46"+
    "\1\40\1\64\1\65\1\45\4\0\1\45\5\46\3\45"+
    "\1\46\1\45\1\46\1\61\1\45\1\62\1\45\1\46"+
    "\2\40\1\0\1\45\7\63\1\40\7\25\1\170\7\25"+
    "\1\46\1\40\1\64\1\65\1\45\12\0\1\171\16\0"+
    "\6\162\2\0\17\162\11\0\1\45\5\46\3\45\1\46"+
    "\1\45\1\46\1\61\1\45\1\62\1\45\1\46\2\40"+
    "\1\0\1\45\7\63\1\40\4\25\1\172\12\25\1\46"+
    "\1\40\1\64\1\65\1\45\4\0\1\152\1\45\1\173"+
    "\13\45\1\0\2\45\3\0\1\45\6\0\1\45\1\0"+
    "\17\162\1\45\3\0\1\45\31\0\6\165\2\0\17\174"+
    "\12\0\5\40\3\0\1\40\1\0\3\40\1\166\1\0"+
    "\3\40\2\0\6\175\1\37\1\40\17\43\2\40\1\37"+
    "\1\40\5\0\1\45\5\46\3\45\1\46\1\45\1\46"+
    "\1\61\1\45\1\62\1\45\1\46\2\40\1\0\1\45"+
    "\7\63\1\40\13\25\1\176\3\25\1\46\1\40\1\64"+
    "\1\65\1\45\4\0\1\45\5\46\3\45\1\46\1\45"+
    "\1\46\1\61\1\45\1\62\1\45\1\46\2\40\1\0"+
    "\1\45\7\63\1\40\13\25\1\177\3\25\1\46\1\40"+
    "\1\64\1\65\1\45\13\0\1\200\26\0\1\201\1\202"+
    "\1\0\1\203\6\0\1\204\14\0\1\45\5\46\3\45"+
    "\1\46\1\45\1\46\1\61\1\45\1\62\1\45\1\46"+
    "\2\40\1\0\1\45\7\63\1\40\13\25\1\137\3\25"+
    "\1\46\1\40\1\64\1\65\1\45\1\0\1\205\2\0"+
    "\2\173\1\206\1\173\2\45\10\173\1\205\2\173\3\205"+
    "\1\173\6\205\1\173\1\0\17\205\1\173\1\205\2\0"+
    "\1\45\41\0\17\174\11\0\23\175\1\0\35\175\4\0"+
    "\1\207\5\46\3\45\1\46\1\45\1\46\1\61\1\45"+
    "\1\210\1\45\1\46\2\40\1\0\1\45\7\63\1\40"+
    "\17\25\1\46\1\40\1\64\1\65\1\45\53\0\1\211"+
    "\52\0\1\212\75\0\1\213\57\0\1\214\20\0\1\205"+
    "\2\0\2\205\1\215\1\205\2\0\26\205\1\0\21\205"+
    "\7\0\1\207\15\45\1\216\2\45\3\0\1\45\6\0"+
    "\1\45\20\0\1\45\3\0\1\45\53\0\1\217\55\0"+
    "\1\220\76\0\1\221\47\0\1\222\74\0\1\223\60\0"+
    "\1\224\64\0\1\225\70\0\1\226\60\0\1\227\71\0"+
    "\1\230\66\0\1\231\14\0\1\232\121\0\1\233\64\0"+
    "\1\226\76\0\1\226\15\0\1\232\34\0\17\234\57\0"+
    "\1\226\25\0\1\200\2\0\1\235\3\0\1\234\6\0"+
    "\7\234\1\0\17\234\2\0\2\234\5\0\1\236\64\0"+
    "\1\236\35\0\1\201\1\202\1\0\1\203\6\0\1\204"+
    "\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7420];
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
    "\1\1\1\11\1\1\1\11\3\1\1\11\1\1\1\11"+
    "\4\1\1\11\63\1\3\0\21\1\1\0\32\1\1\0"+
    "\6\1\1\0\6\1\1\11\5\0\3\1\4\0\2\11"+
    "\20\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[158];
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
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;
    public int linea;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
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
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Tokens yylex() throws java.io.IOException {
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
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { 
            }
            // fall through
          case 25: break;
          case 2:
            { System.out.println("Error verificar "+yytext());
                        return error;
            }
            // fall through
          case 26: break;
          case 3:
            { lexeme=yytext();
                        System.out.println("Error verificar "+yytext());
                        return No;
            }
            // fall through
          case 27: break;
          case 4:
            { lexeme=yytext(); 
                         return operadores;
            }
            // fall through
          case 28: break;
          case 5:
            { lexeme=yytext(); 
                        return opcional;
            }
            // fall through
          case 29: break;
          case 6:
            { lexeme=yytext();  
                        System.out.println("Error verificar "+yytext());
                        return nonu;
            }
            // fall through
          case 30: break;
          case 7:
            { lexeme=yytext();  return inte;
            }
            // fall through
          case 31: break;
          case 8:
            { lexeme=yytext(); 
                        return fin_de_linea;
            }
            // fall through
          case 32: break;
          case 9:
            { lexeme=yytext(); 
                        return identificador;
            }
            // fall through
          case 33: break;
          case 10:
            { lexeme=yytext();
                        System.out.println("Error verificar "+yytext());
                        return nocom;
            }
            // fall through
          case 34: break;
          case 11:
            { lexeme=yytext();  return comentario;
            }
            // fall through
          case 35: break;
          case 12:
            { lexeme=yytext(); 
                         return operador_Logico;
            }
            // fall through
          case 36: break;
          case 13:
            { lexeme=yytext();  return real;
            }
            // fall through
          case 37: break;
          case 14:
            { lexeme=yytext(); 
                        linea= yyline; 
                        return instancias;
            }
            // fall through
          case 38: break;
          case 15:
            { lexeme=yytext();  return comentarios;
            }
            // fall through
          case 39: break;
          case 16:
            { lexeme=yytext(); 
                        return salida;
            }
            // fall through
          case 40: break;
          case 17:
            { lexeme=yytext(); 
                        linea= yyline; 
                        return tipo;
            }
            // fall through
          case 41: break;
          case 18:
            { lexeme=yytext();  
                       return boleano;
            }
            // fall through
          case 42: break;
          case 19:
            { lexeme=yytext(); 
                         return clases;
            }
            // fall through
          case 43: break;
          case 20:
            { lexeme=yytext();  
                        System.out.println("Error verificar "+yytext());
                        return noclas;
            }
            // fall through
          case 44: break;
          case 21:
            { lexeme=yytext(); 
                        return entrada;
            }
            // fall through
          case 45: break;
          case 22:
            { lexeme=yytext(); 
                         return funcion;
            }
            // fall through
          case 46: break;
          case 23:
            { lexeme=yytext();  return cadena;
            }
            // fall through
          case 47: break;
          case 24:
            { lexeme=yytext(); 
                        linea= yyline; 
                        return retornar;
            }
            // fall through
          case 48: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
