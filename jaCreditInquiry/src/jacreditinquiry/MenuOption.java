/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jacreditinquiry;

/**
 *
 * @author Edgard Lamounier JR
 */
public enum MenuOption {
    // declare contents of enum type
   ZERO_BALANCE( 1 ),
   CREDIT_BALANCE( 2 ),
   DEBIT_BALANCE( 3 ),
   END( 4 );

   private final int value; // current menu option

   MenuOption( int valueOption )
   {
      value = valueOption;
   } // end MenuOptions enum constructor

   public int getValue()
   {
      return value;
   } // end method getValue
    
} // end enum MenuOption
