//EasyPICv7 + PIC18F45K22
//Obsluha preruseni PIC

void interrupt() {
  if (INT0F_bit) {
    LATA = ~LATA;                   //invertovani RA0
    INT0F_bit = 0;                  // Nulovani flag bitu INT0
  }
}

void main() {

// Nastaveni konfiguracnich registru pro porty A,B
  ANSELB = 0;                   // PORTB nastaven jako digitalni
  ANSELA = 0;                   // PORTA nastaven jako digitalni

  TRISA = 0b00000000;           // PORTA nastaven jako vystupni (binarni zapis)
  TRISB = 0b11111111;           // PORTB nastaven jako vstupni

  LATA = 0b11111111;            // Initialize PORTA
  LATB = 0b11111111;            // Initialize PORTB

// Nastaveni preruseni

  INT0E_bit = 1;                    // Povoleni preruseni INT0
  INT0F_bit = 0;                    // Nulovani flag bitu INT0, indikace preruseni
  GIE_bit = 1;                      // Globalni povoleni preruseni
   
  while (1);
}
