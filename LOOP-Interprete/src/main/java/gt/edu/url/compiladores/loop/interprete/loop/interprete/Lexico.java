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
    "\1\6\2\5\1\7\1\5\1\7\2\10\1\11\1\5"+
    "\1\12\1\13\1\14\1\15\12\16\1\5\1\10\1\5"+
    "\1\17\1\20\1\21\1\10\32\22\1\5\1\7\2\5"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\3\32"+
    "\1\33\2\32\1\34\1\32\1\35\1\36\2\32\1\37"+
    "\1\40\1\41\6\32\1\5\1\42\2\5\6\0\1\3"+
    "\33\0\1\5\22\0\1\20\12\0\1\20\1\0\1\43"+
    "\1\21\6\0\1\43\3\0\1\43\3\0\1\43\1\0"+
    "\1\43\6\0\1\43\1\0\1\43\4\0\1\44\7\0"+
    "\1\44\3\0\1\44\3\0\1\44\1\0\1\44\6\0"+
    "\1\44\1\0\1\44\303\0\1\24\2\0\1\24\365\0"+
    "\1\45\12\0\1\24\u0163\0\2\3\326\0\u0100\3";

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
    "\1\1\1\2\2\1\2\3\1\4\1\3\1\5\1\3"+
    "\1\6\1\7\1\5\6\10\1\1\4\3\1\0\1\3"+
    "\1\11\3\3\1\6\2\5\1\0\1\12\1\5\1\3"+
    "\1\5\12\10\2\11\2\3\2\0\1\13\11\10\1\13"+
    "\1\14\4\10\1\15\1\16\7\10\1\17";

  private static int [] zzUnpackAction() {
    int [] result = new int[80];
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
    "\0\0\0\46\0\114\0\46\0\162\0\230\0\46\0\276"+
    "\0\344\0\u010a\0\u0130\0\162\0\u0156\0\u017c\0\u01a2\0\u01c8"+
    "\0\u01ee\0\u0214\0\u023a\0\162\0\u0260\0\u0286\0\u02ac\0\u02d2"+
    "\0\u02f8\0\u031e\0\u0286\0\u0344\0\u036a\0\u0390\0\u03b6\0\u03dc"+
    "\0\u0402\0\u0428\0\u044e\0\u0474\0\u049a\0\u04c0\0\u04e6\0\u050c"+
    "\0\u0532\0\u0558\0\u057e\0\u05a4\0\u05ca\0\u05f0\0\u0616\0\u063c"+
    "\0\46\0\u02ac\0\u0662\0\u0688\0\u06ae\0\u06d4\0\u06fa\0\u0720"+
    "\0\u0746\0\u076c\0\u0792\0\u07b8\0\u07de\0\u0804\0\u082a\0\u0850"+
    "\0\u0688\0\46\0\u0876\0\u089c\0\u08c2\0\u08e8\0\u017c\0\u017c"+
    "\0\u090e\0\u0934\0\u095a\0\u0980\0\u09a6\0\u09cc\0\u09f2\0\u017c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[80];
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
    "\1\2\1\3\1\4\1\0\1\4\1\5\1\6\1\5"+
    "\2\2\1\7\1\10\1\11\1\12\1\13\1\14\1\5"+
    "\1\2\1\11\1\15\1\5\1\16\1\17\1\20\1\16"+
    "\1\21\2\16\1\22\2\16\1\23\2\16\1\24\1\25"+
    "\1\5\1\2\47\0\1\3\51\0\3\26\3\0\2\26"+
    "\1\27\3\26\1\0\1\26\1\25\1\26\15\30\1\26"+
    "\1\25\1\26\2\0\1\31\2\0\1\31\1\32\1\33"+
    "\1\26\3\31\2\32\1\34\3\32\1\31\1\32\1\35"+
    "\1\26\15\36\1\32\1\25\1\26\6\0\3\26\3\0"+
    "\2\26\1\27\1\37\2\26\1\0\1\26\1\25\1\26"+
    "\15\30\1\26\1\25\1\26\6\0\3\26\3\0\1\26"+
    "\1\40\1\27\1\40\2\26\1\0\1\40\1\15\1\26"+
    "\15\41\1\26\1\25\1\26\12\0\1\42\3\0\1\43"+
    "\35\0\3\5\3\0\1\5\1\44\1\26\1\13\2\5"+
    "\1\0\1\11\1\15\1\5\15\41\1\5\1\25\1\5"+
    "\6\0\3\26\3\0\1\26\1\40\1\45\1\40\2\26"+
    "\1\0\1\40\1\15\1\26\15\46\1\26\1\25\1\26"+
    "\6\0\3\26\3\0\1\26\1\40\1\45\1\47\2\26"+
    "\1\0\1\47\1\50\1\26\15\16\1\26\1\51\1\52"+
    "\6\0\3\26\3\0\1\26\1\40\1\45\1\47\2\26"+
    "\1\0\1\47\1\50\1\26\11\16\1\53\3\16\1\26"+
    "\1\51\1\52\6\0\3\26\3\0\1\26\1\40\1\45"+
    "\1\47\2\26\1\0\1\47\1\50\1\26\1\54\14\16"+
    "\1\26\1\51\1\52\6\0\3\26\3\0\1\26\1\40"+
    "\1\45\1\47\2\26\1\0\1\47\1\50\1\26\10\16"+
    "\1\55\2\16\1\56\1\16\1\26\1\51\1\52\6\0"+
    "\3\26\3\0\1\26\1\40\1\45\1\47\2\26\1\0"+
    "\1\47\1\50\1\26\4\16\1\57\10\16\1\26\1\51"+
    "\1\52\6\0\3\26\3\0\1\26\1\40\1\45\1\47"+
    "\2\26\1\0\1\47\1\50\1\26\4\16\1\60\10\16"+
    "\1\26\1\51\1\52\6\0\3\26\3\0\2\26\1\45"+
    "\3\26\1\0\1\26\1\25\1\26\15\0\1\26\1\25"+
    "\1\26\6\0\3\26\3\0\6\26\1\0\1\26\1\25"+
    "\1\26\15\30\1\26\1\25\1\26\6\0\3\27\3\0"+
    "\6\27\1\0\23\27\6\0\3\26\3\0\2\26\1\45"+
    "\3\26\1\0\1\26\1\25\1\26\15\30\1\26\1\25"+
    "\1\26\2\0\1\31\2\0\2\31\1\61\1\0\14\31"+
    "\1\0\16\31\4\0\1\31\2\0\1\31\1\32\1\33"+
    "\1\26\3\31\6\32\1\31\1\32\1\35\1\26\15\36"+
    "\1\32\1\25\1\26\2\0\1\31\2\0\1\31\1\34"+
    "\1\62\1\27\3\31\6\34\1\31\2\34\1\27\16\34"+
    "\2\27\2\0\1\31\2\0\1\31\1\32\1\33\1\26"+
    "\3\31\2\32\1\63\3\32\1\31\1\32\1\35\1\26"+
    "\15\31\1\32\1\25\1\26\2\0\1\31\2\0\1\31"+
    "\1\32\1\33\1\26\3\31\2\32\1\63\3\32\1\31"+
    "\1\32\1\35\1\26\15\36\1\32\1\25\1\26\6\0"+
    "\3\26\3\0\1\26\1\64\1\26\1\37\2\26\1\0"+
    "\1\26\1\25\1\26\15\30\1\26\1\25\1\26\6\0"+
    "\3\26\3\0\1\26\1\40\1\26\1\40\2\26\1\0"+
    "\1\40\1\15\1\26\15\41\1\26\1\25\1\26\6\0"+
    "\3\26\3\0\1\26\1\40\1\45\1\40\2\26\1\0"+
    "\1\40\1\15\1\26\15\41\1\26\1\25\1\26\6\0"+
    "\3\42\1\0\1\65\1\0\2\42\1\66\3\42\1\0"+
    "\23\42\5\0\15\43\1\0\24\43\5\0\3\26\3\0"+
    "\1\26\1\40\1\27\1\67\2\26\1\0\1\40\1\15"+
    "\1\26\15\41\1\26\1\25\1\26\16\0\1\45\44\0"+
    "\1\46\1\0\1\46\3\0\2\46\1\0\15\46\11\0"+
    "\3\26\3\0\1\26\1\40\1\26\1\47\2\26\1\0"+
    "\1\47\1\50\1\26\15\16\1\26\1\51\1\52\6\0"+
    "\3\26\3\0\1\26\1\40\1\45\1\47\2\26\1\0"+
    "\1\47\1\50\1\26\15\70\1\26\1\51\1\52\6\0"+
    "\3\26\3\0\2\26\1\45\1\52\2\26\1\0\1\52"+
    "\1\51\1\26\15\71\1\26\1\51\1\52\6\0\3\26"+
    "\3\0\3\26\1\52\2\26\1\0\1\52\1\51\1\26"+
    "\15\72\1\26\1\51\1\52\6\0\3\26\3\0\1\26"+
    "\1\40\1\45\1\47\2\26\1\0\1\47\1\50\1\26"+
    "\11\16\1\73\3\16\1\26\1\51\1\52\6\0\3\26"+
    "\3\0\1\26\1\40\1\45\1\47\2\26\1\0\1\47"+
    "\1\50\1\26\3\16\1\74\11\16\1\26\1\51\1\52"+
    "\6\0\3\26\3\0\1\26\1\40\1\45\1\47\2\26"+
    "\1\0\1\47\1\50\1\26\14\16\1\75\1\26\1\51"+
    "\1\52\6\0\3\26\3\0\1\26\1\40\1\45\1\47"+
    "\2\26\1\0\1\47\1\50\1\26\2\16\1\76\12\16"+
    "\1\26\1\51\1\52\6\0\3\26\3\0\1\26\1\40"+
    "\1\45\1\47\2\26\1\0\1\47\1\50\1\26\4\16"+
    "\1\77\10\16\1\26\1\51\1\52\6\0\3\26\3\0"+
    "\1\26\1\40\1\45\1\47\2\26\1\0\1\47\1\50"+
    "\1\26\1\100\14\16\1\26\1\51\1\52\2\0\1\31"+
    "\2\0\2\31\1\61\1\0\5\31\1\63\6\31\1\0"+
    "\16\31\10\0\3\26\3\0\3\26\1\101\2\26\1\0"+
    "\1\26\1\25\1\26\15\30\1\26\1\25\1\26\16\0"+
    "\1\102\34\0\12\42\5\0\1\42\16\0\1\42\2\0"+
    "\1\42\5\0\3\26\3\0\1\26\1\40\1\26\1\67"+
    "\2\26\1\0\1\40\1\15\1\26\15\41\1\26\1\25"+
    "\1\26\15\0\1\46\1\0\1\70\3\0\2\70\1\0"+
    "\15\70\1\0\2\71\17\0\1\71\3\0\2\71\1\0"+
    "\15\71\1\0\2\71\6\0\3\26\3\0\2\26\1\45"+
    "\1\52\2\26\1\0\1\52\1\51\1\26\15\72\1\26"+
    "\1\51\1\52\6\0\3\26\3\0\1\26\1\40\1\45"+
    "\1\47\2\26\1\0\1\47\1\50\1\26\7\16\1\103"+
    "\5\16\1\26\1\51\1\52\6\0\3\26\3\0\1\26"+
    "\1\40\1\45\1\47\2\26\1\0\1\47\1\50\1\26"+
    "\4\16\1\104\10\16\1\26\1\51\1\52\6\0\3\26"+
    "\3\0\1\26\1\40\1\45\1\47\2\26\1\0\1\47"+
    "\1\50\1\26\4\16\1\105\10\16\1\26\1\51\1\52"+
    "\6\0\3\26\3\0\1\26\1\40\1\45\1\47\2\26"+
    "\1\0\1\47\1\50\1\26\12\16\1\106\2\16\1\26"+
    "\1\51\1\52\6\0\3\26\3\0\1\26\1\40\1\45"+
    "\1\47\2\26\1\0\1\47\1\50\1\26\12\16\1\107"+
    "\2\16\1\26\1\51\1\52\6\0\3\26\3\0\1\26"+
    "\1\40\1\45\1\47\2\26\1\0\1\47\1\50\1\26"+
    "\7\16\1\110\5\16\1\26\1\51\1\52\6\0\3\26"+
    "\3\0\1\26\1\40\1\45\1\47\2\26\1\0\1\47"+
    "\1\50\1\26\4\16\1\111\10\16\1\26\1\51\1\52"+
    "\6\0\3\26\3\0\1\26\1\40\1\45\1\47\2\26"+
    "\1\0\1\47\1\50\1\26\10\16\1\112\4\16\1\26"+
    "\1\51\1\52\6\0\3\26\3\0\1\26\1\40\1\45"+
    "\1\47\2\26\1\0\1\47\1\50\1\26\12\16\1\113"+
    "\2\16\1\26\1\51\1\52\6\0\3\26\3\0\1\26"+
    "\1\40\1\45\1\47\2\26\1\0\1\47\1\50\1\26"+
    "\6\16\1\114\6\16\1\26\1\51\1\52\6\0\3\26"+
    "\3\0\1\26\1\40\1\45\1\47\2\26\1\0\1\47"+
    "\1\50\1\26\1\115\14\16\1\26\1\51\1\52\6\0"+
    "\3\26\3\0\1\26\1\40\1\45\1\47\2\26\1\0"+
    "\1\47\1\50\1\26\1\110\14\16\1\26\1\51\1\52"+
    "\6\0\3\26\3\0\1\26\1\40\1\45\1\47\2\26"+
    "\1\0\1\47\1\50\1\26\11\16\1\110\3\16\1\26"+
    "\1\51\1\52\6\0\3\26\3\0\1\26\1\40\1\45"+
    "\1\47\2\26\1\0\1\47\1\50\1\26\1\16\1\116"+
    "\13\16\1\26\1\51\1\52\6\0\3\26\3\0\1\26"+
    "\1\40\1\45\1\47\2\26\1\0\1\47\1\50\1\26"+
    "\10\16\1\110\4\16\1\26\1\51\1\52\6\0\3\26"+
    "\3\0\1\26\1\40\1\45\1\47\2\26\1\0\1\47"+
    "\1\50\1\26\6\16\1\117\6\16\1\26\1\51\1\52"+
    "\6\0\3\26\3\0\1\26\1\40\1\45\1\47\2\26"+
    "\1\0\1\47\1\50\1\26\12\16\1\120\2\16\1\26"+
    "\1\51\1\52\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2584];
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
    "\1\1\1\11\1\1\1\11\2\1\1\11\21\1\1\0"+
    "\10\1\1\0\16\1\1\11\3\1\2\0\13\1\1\11"+
    "\16\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[80];
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
          case 16: break;
          case 2:
            { return error;
            }
            // fall through
          case 17: break;
          case 3:
            { lexeme=yytext();return No;
            }
            // fall through
          case 18: break;
          case 4:
            { lexeme=yytext(); 
                        System.out.println("LEX:Opcional " + yytext());
                        return opcional;
            }
            // fall through
          case 19: break;
          case 5:
            { System.out.println("No Num " + yytext());lexeme=yytext();  return nonu;
            }
            // fall through
          case 20: break;
          case 6:
            { System.out.println("Num " + yytext());lexeme=yytext();  return entero;
            }
            // fall through
          case 21: break;
          case 7:
            { lexeme=yytext(); 
                        System.out.println("LEX:Asignacion " + yytext());
                        return Asignacion;
            }
            // fall through
          case 22: break;
          case 8:
            { lexeme=yytext(); 
                        System.out.println("LEX:Identificador " + yytext());
                        return Identificador;
            }
            // fall through
          case 23: break;
          case 9:
            { System.out.println("Cadena " + yytext());lexeme=yytext();  return cadena;
            }
            // fall through
          case 24: break;
          case 10:
            { System.out.println("comentario " + yytext());lexeme=yytext();  return comentario;
            }
            // fall through
          case 25: break;
          case 11:
            { System.out.println("Flotante " + yytext());lexeme=yytext();  return real;
            }
            // fall through
          case 26: break;
          case 12:
            { System.out.println("comentarios  " + yytext());lexeme=yytext();  return comentarios;
            }
            // fall through
          case 27: break;
          case 13:
            { lexeme=yytext(); 
                        System.out.println("LEX:salida " + yytext());
                        return salida;
            }
            // fall through
          case 28: break;
          case 14:
            { lexeme=yytext(); 
                        linea= yyline; 
                        System.out.println("LEX:Tipo " + yytext());
                        return tipo;
            }
            // fall through
          case 29: break;
          case 15:
            { lexeme=yytext(); 
                        System.out.println("LEX:entrada " + yytext());
                        return entrada;
            }
            // fall through
          case 30: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
