
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package gt.edu.url.compiladores.loop.interprete.loop.interprete;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\063\000\002\002\003\000\002\002\004\000\002\002" +
    "\004\000\002\003\003\000\002\003\003\000\002\003\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\005\006\000\002\005\012\000\002" +
    "\006\006\000\002\006\012\000\002\007\006\000\002\007" +
    "\012\000\002\010\006\000\002\010\012\000\002\014\003" +
    "\000\002\014\003\000\002\015\006\000\002\017\006\000" +
    "\002\017\006\000\002\017\006\000\002\017\006\000\002" +
    "\017\003\000\002\017\003\000\002\017\003\000\002\017" +
    "\003\000\002\016\006\000\002\021\012\000\002\021\011" +
    "\000\002\021\012\000\002\021\012\000\002\023\007\000" +
    "\002\023\005\000\002\024\007\000\002\024\005\000\002" +
    "\025\007\000\002\025\005\000\002\026\007\000\002\026" +
    "\005\000\002\022\007\000\002\011\005\000\002\011\003" +
    "\000\002\012\004\000\002\012\003\000\002\013\004\000" +
    "\002\013\003\000\002\027\004\000\002\027\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\204\000\016\006\022\007\013\017\020\020\007\021" +
    "\017\022\005\001\002\000\020\002\001\006\022\007\013" +
    "\017\020\020\007\021\017\022\005\001\002\000\004\016" +
    "\164\001\002\000\020\002\ufffd\006\ufffd\007\ufffd\017\ufffd" +
    "\020\ufffd\021\ufffd\022\ufffd\001\002\000\004\016\141\001" +
    "\002\000\020\002\ufffe\006\ufffe\007\ufffe\017\ufffe\020\ufffe" +
    "\021\ufffe\022\ufffe\001\002\000\020\002\uffee\006\uffee\007" +
    "\uffee\017\uffee\020\uffee\021\uffee\022\uffee\001\002\000\004" +
    "\002\140\001\002\000\004\016\135\001\002\000\020\002" +
    "\ufffa\006\ufffa\007\ufffa\017\ufffa\020\ufffa\021\ufffa\022\ufffa" +
    "\001\002\000\020\002\ufffc\006\ufffc\007\ufffc\017\ufffc\020" +
    "\ufffc\021\ufffc\022\ufffc\001\002\000\020\002\ufff8\006\ufff8" +
    "\007\ufff8\017\ufff8\020\ufff8\021\ufff8\022\ufff8\001\002\000" +
    "\004\016\112\001\002\000\004\016\055\001\002\000\020" +
    "\002\ufffb\006\ufffb\007\ufffb\017\ufffb\020\ufffb\021\ufffb\022" +
    "\ufffb\001\002\000\004\016\025\001\002\000\020\002\ufff9" +
    "\006\ufff9\007\ufff9\017\ufff9\020\ufff9\021\ufff9\022\ufff9\001" +
    "\002\000\020\002\uffef\006\uffef\007\uffef\017\uffef\020\uffef" +
    "\021\uffef\022\uffef\001\002\000\012\004\026\005\032\011" +
    "\031\014\027\001\002\000\010\012\052\013\uffe7\023\uffe7" +
    "\001\002\000\010\012\047\013\uffe8\023\uffe8\001\002\000" +
    "\006\013\041\023\042\001\002\000\010\012\036\013\uffe5" +
    "\023\uffe5\001\002\000\010\012\033\013\uffe6\023\uffe6\001" +
    "\002\000\004\016\034\001\002\000\012\004\026\005\032" +
    "\011\031\014\027\001\002\000\006\013\uffea\023\uffea\001" +
    "\002\000\004\016\037\001\002\000\012\004\026\005\032" +
    "\011\031\014\027\001\002\000\006\013\uffe9\023\uffe9\001" +
    "\002\000\004\023\042\001\002\000\024\002\uffd1\006\uffd1" +
    "\007\uffd1\017\uffd1\020\uffd1\021\uffd1\022\uffd1\023\042\026" +
    "\uffd1\001\002\000\020\002\uffed\006\uffed\007\uffed\017\uffed" +
    "\020\uffed\021\uffed\022\uffed\001\002\000\020\002\uffd3\006" +
    "\uffd3\007\uffd3\017\uffd3\020\uffd3\021\uffd3\022\uffd3\001\002" +
    "\000\022\002\uffd2\006\uffd2\007\uffd2\017\uffd2\020\uffd2\021" +
    "\uffd2\022\uffd2\026\uffd2\001\002\000\020\002\uffd4\006\uffd4" +
    "\007\uffd4\017\uffd4\020\uffd4\021\uffd4\022\uffd4\001\002\000" +
    "\004\016\050\001\002\000\012\004\026\005\032\011\031" +
    "\014\027\001\002\000\006\013\uffec\023\uffec\001\002\000" +
    "\004\016\053\001\002\000\012\004\026\005\032\011\031" +
    "\014\027\001\002\000\006\013\uffeb\023\uffeb\001\002\000" +
    "\004\011\056\001\002\000\014\012\067\013\uffd5\016\uffd5" +
    "\023\uffd5\024\066\001\002\000\010\013\041\016\060\023" +
    "\042\001\002\000\004\015\062\001\002\000\020\002\ufff7" +
    "\006\ufff7\007\ufff7\017\ufff7\020\ufff7\021\ufff7\022\ufff7\001" +
    "\002\000\004\016\063\001\002\000\004\004\064\001\002" +
    "\000\006\013\041\023\042\001\002\000\020\002\ufff6\006" +
    "\ufff6\007\ufff6\017\ufff6\020\ufff6\021\ufff6\022\ufff6\001\002" +
    "\000\004\017\072\001\002\000\004\011\070\001\002\000" +
    "\012\012\067\013\uffd5\016\uffd5\023\uffd5\001\002\000\010" +
    "\013\uffd6\016\uffd6\023\uffd6\001\002\000\004\016\106\001" +
    "\002\000\004\025\074\001\002\000\004\023\042\001\002" +
    "\000\006\013\041\023\042\001\002\000\004\026\100\001" +
    "\002\000\004\033\102\001\002\000\006\026\100\033\uffcf" +
    "\001\002\000\004\033\uffd0\001\002\000\004\016\103\001" +
    "\002\000\004\011\104\001\002\000\006\013\uffd7\023\uffd7" +
    "\001\002\000\020\002\uffe3\006\uffe3\007\uffe3\017\uffe3\020" +
    "\uffe3\021\uffe3\022\uffe3\001\002\000\004\011\107\001\002" +
    "\000\006\012\110\025\uffde\001\002\000\004\017\072\001" +
    "\002\000\004\025\uffdf\001\002\000\004\011\113\001\002" +
    "\000\014\012\067\013\uffd5\016\uffd5\023\uffd5\024\123\001" +
    "\002\000\010\013\041\016\115\023\042\001\002\000\004" +
    "\015\117\001\002\000\020\002\ufff1\006\ufff1\007\ufff1\017" +
    "\ufff1\020\ufff1\021\ufff1\022\ufff1\001\002\000\004\016\120" +
    "\001\002\000\004\005\121\001\002\000\006\013\041\023" +
    "\042\001\002\000\020\002\ufff0\006\ufff0\007\ufff0\017\ufff0" +
    "\020\ufff0\021\ufff0\022\ufff0\001\002\000\004\021\125\001" +
    "\002\000\004\025\132\001\002\000\004\016\126\001\002" +
    "\000\004\011\127\001\002\000\006\012\130\025\uffd8\001" +
    "\002\000\004\021\125\001\002\000\004\025\uffd9\001\002" +
    "\000\004\023\042\001\002\000\006\013\041\023\042\001" +
    "\002\000\020\002\uffe0\006\uffe0\007\uffe0\017\uffe0\020\uffe0" +
    "\021\uffe0\022\uffe0\001\002\000\004\011\136\001\002\000" +
    "\006\013\041\023\042\001\002\000\020\002\uffe4\006\uffe4" +
    "\007\uffe4\017\uffe4\020\uffe4\021\uffe4\022\uffe4\001\002\000" +
    "\004\002\000\001\002\000\004\011\142\001\002\000\014" +
    "\012\067\013\uffd5\016\uffd5\023\uffd5\024\152\001\002\000" +
    "\010\013\041\016\144\023\042\001\002\000\004\015\146" +
    "\001\002\000\020\002\ufff3\006\ufff3\007\ufff3\017\ufff3\020" +
    "\ufff3\021\ufff3\022\ufff3\001\002\000\004\016\147\001\002" +
    "\000\004\010\150\001\002\000\006\013\041\023\042\001" +
    "\002\000\020\002\ufff2\006\ufff2\007\ufff2\017\ufff2\020\ufff2" +
    "\021\ufff2\022\ufff2\001\002\000\004\020\154\001\002\000" +
    "\004\025\161\001\002\000\004\016\155\001\002\000\004" +
    "\011\156\001\002\000\006\012\157\025\uffda\001\002\000" +
    "\004\020\154\001\002\000\004\025\uffdb\001\002\000\004" +
    "\023\042\001\002\000\006\013\041\023\042\001\002\000" +
    "\020\002\uffe1\006\uffe1\007\uffe1\017\uffe1\020\uffe1\021\uffe1" +
    "\022\uffe1\001\002\000\004\011\165\001\002\000\014\012" +
    "\067\013\uffd5\016\uffd5\023\uffd5\024\175\001\002\000\010" +
    "\013\041\016\167\023\042\001\002\000\004\015\171\001" +
    "\002\000\020\002\ufff5\006\ufff5\007\ufff5\017\ufff5\020\ufff5" +
    "\021\ufff5\022\ufff5\001\002\000\004\016\172\001\002\000" +
    "\004\014\173\001\002\000\006\013\041\023\042\001\002" +
    "\000\020\002\ufff4\006\ufff4\007\ufff4\017\ufff4\020\ufff4\021" +
    "\ufff4\022\ufff4\001\002\000\004\022\176\001\002\000\004" +
    "\016\202\001\002\000\004\023\042\001\002\000\006\013" +
    "\041\023\042\001\002\000\020\002\uffe2\006\uffe2\007\uffe2" +
    "\017\uffe2\020\uffe2\021\uffe2\022\uffe2\001\002\000\004\011" +
    "\203\001\002\000\006\012\204\023\uffdc\001\002\000\004" +
    "\022\176\001\002\000\004\023\uffdd\001\002\000\004\002" +
    "\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\204\000\030\002\011\003\003\004\007\005\020\006" +
    "\013\007\022\010\015\014\005\015\023\016\010\021\014" +
    "\001\001\000\030\002\205\003\003\004\007\005\020\006" +
    "\013\007\022\010\015\014\005\015\023\016\010\021\014" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\017\027\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\012\042\013\043\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\017\034" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\017" +
    "\037\001\001\000\002\001\001\000\004\013\045\001\001" +
    "\000\004\013\044\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\017\050\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\017\053\001\001\000\002\001\001\000\004" +
    "\011\056\001\001\000\002\001\001\000\006\012\060\013" +
    "\043\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\012\064\013\043\001" +
    "\001\000\002\001\001\000\004\023\072\001\001\000\004" +
    "\011\070\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\013\075\022\074" +
    "\001\001\000\006\012\104\013\043\001\001\000\004\027" +
    "\076\001\001\000\002\001\001\000\004\027\100\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\023\110\001\001\000\002\001\001\000" +
    "\004\011\113\001\001\000\002\001\001\000\006\012\115" +
    "\013\043\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\012\121\013\043" +
    "\001\001\000\002\001\001\000\004\026\123\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\026\130\001\001\000\002\001\001\000" +
    "\006\013\075\022\132\001\001\000\006\012\133\013\043" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\012" +
    "\136\013\043\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\011\142\001\001\000\002\001\001\000\006\012" +
    "\144\013\043\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\012\150\013" +
    "\043\001\001\000\002\001\001\000\004\025\152\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\025\157\001\001\000\002\001\001" +
    "\000\006\013\075\022\161\001\001\000\006\012\162\013" +
    "\043\001\001\000\002\001\001\000\004\011\165\001\001" +
    "\000\002\001\001\000\006\012\167\013\043\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\012\173\013\043\001\001\000\002\001" +
    "\001\000\004\024\176\001\001\000\002\001\001\000\006" +
    "\013\075\022\177\001\001\000\006\012\200\013\043\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\024\204\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico$actions {
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action_part00000000(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // S ::= codigoli 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // S ::= codigoli S 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // codigoli ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("codigoli",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // codigoli ::= MES 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("codigoli",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // codigoli ::= FUNCIONESS 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("codigoli",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // DECLARACION ::= DECENTERO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DECLARACION ::= DECCADENA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DECLARACION ::= DECBOLEAN 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DECLARACION ::= DECLAREAL 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DECENTERO ::= tipo_ent libre VARSECUE finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECENTERO",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // DECENTERO ::= tipo_ent libre VARSECUE libre asignacion libre entero finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECENTERO",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // DECCADENA ::= tipo_cadena libre VARSECUE finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECCADENA",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // DECCADENA ::= tipo_cadena libre VARSECUE libre asignacion libre cadena finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECCADENA",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // DECBOLEAN ::= tipo_bol libre VARSECUE finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECBOLEAN",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DECBOLEAN ::= tipo_bol libre VARSECUE libre asignacion libre boleano finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECBOLEAN",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLAREAL ::= tipo_real libre VARSECUE finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECLAREAL",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLAREAL ::= tipo_real libre VARSECUE libre asignacion libre real finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECLAREAL",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // MES ::= Mentrada 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("MES",10, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // MES ::= Msalida 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("MES",10, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Mentrada ::= entrada libre TIP finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("Mentrada",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // TIP ::= cadena coma libre TIP 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIP",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // TIP ::= entero coma libre TIP 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIP",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // TIP ::= real coma libre TIP 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIP",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // TIP ::= identificador coma libre TIP 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIP",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // TIP ::= cadena 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIP",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // TIP ::= entero 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIP",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // TIP ::= real 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIP",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // TIP ::= identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIP",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // Msalida ::= salida libre identificador finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("Msalida",12, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // FUNCIONESS ::= tipo_ent libre identificador para PARAMETROSE parb CUERPOF finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("FUNCIONESS",15, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // FUNCIONESS ::= tipo_cadena libre identificador para PARAMETROSC CUERPOF finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("FUNCIONESS",15, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // FUNCIONESS ::= tipo_bol libre identificador para PARAMETROSB parb CUERPOF finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("FUNCIONESS",15, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // FUNCIONESS ::= tipo_real libre identificador para PARAMETROSR parb CUERPOF finales 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("FUNCIONESS",15, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // PARAMETROSE ::= tipo_ent libre identificador coma PARAMETROSE 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PARAMETROSE",17, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // PARAMETROSE ::= tipo_ent libre identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PARAMETROSE",17, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // PARAMETROSC ::= tipo_cadena libre identificador coma PARAMETROSC 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PARAMETROSC",18, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // PARAMETROSC ::= tipo_cadena libre identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PARAMETROSC",18, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // PARAMETROSB ::= tipo_bol libre identificador coma PARAMETROSB 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PARAMETROSB",19, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // PARAMETROSB ::= tipo_bol libre identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PARAMETROSB",19, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // PARAMETROSR ::= tipo_real libre identificador coma PARAMETROSR 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PARAMETROSR",20, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // PARAMETROSR ::= tipo_real libre identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PARAMETROSR",20, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // CUERPOF ::= nuevaslineas TABULA retornar libre identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPOF",16, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // VARSECUE ::= identificador coma VARSECUE 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("VARSECUE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // VARSECUE ::= identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("VARSECUE",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // finales ::= fin_de_linea nuevaslineas 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("finales",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // finales ::= nuevaslineas 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("finales",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // nuevaslineas ::= newline nuevaslineas 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("nuevaslineas",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // nuevaslineas ::= newline 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("nuevaslineas",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // TABULA ::= salto TABULA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TABULA",21, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // TABULA ::= salto 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TABULA",21, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Sintactico$do_action_part00000000(
                               CUP$Sintactico$act_num,
                               CUP$Sintactico$parser,
                               CUP$Sintactico$stack,
                               CUP$Sintactico$top);
    }
}

}
