//  Контрольний приклад рішення задачі 
//  згідно алгоритму на рис. 4.3
//
import static javax.swing.JOptionPane.*;

class CovidFinance {
  public static void main(String[] args) {
    String recviziti, sreclama, sjk, spopit;
    int ireclama, ijk, ipopit;

    recviziti = showInputDialog(null, "Введіть реквізити проекту", 
        "Визначаємо реквізити проекту", 
        QUESTION_MESSAGE);
    showMessageDialog(null, "Реквізити проекту: " + recviziti);

    sreclama = showInputDialog(null, "Результати проведення рекламної кампанії успішні (ні - 0, так - 1) ?", 
        "Результати проведення рекламної кампанії", 
        QUESTION_MESSAGE);

    ireclama = Integer.parseInt(sreclama);
    if (ireclama == 0) {
    // Рекламна кампанія відсутня, спостерігаються збитки
      lossesDefine(1);
      System.exit(0);
    } 

    // Визначення розміру ЖК
    sjk = showInputDialog(null, "Розмір ЖК великий (ні - 0, так - 1) ?", 
        "Розмір ЖК", 
        QUESTION_MESSAGE);
    ijk = Integer.parseInt(sjk);

    // Визначення попиту на продукцію
    spopit = showInputDialog(null, "Попит знизився (ні - 1, так - 0) ?", 
        "Попит на продукцію", 
        QUESTION_MESSAGE);
    ipopit = Integer.parseInt(spopit);

    // Невеликий ЖК
    if (ijk == 0) {
      if (ipopit == 1) 
        // Якщо попит знизився
        lossesDefine(2);
        // Якщо попит не змінився
      else 
        profitDefine(2);
    } 
    // Великий ЖК
    else {
      if (ipopit == 1) 
        // Якщо попит знизився
        lossesDefine(3);
        // Якщо попит не змінився
      else 
        profitDefine(3);
    }

  }

  public static void lossesDefine(int param1) {
  // Використання "заплаток"
    if (param1 == 1)
      showMessageDialog(null, "Закінчення проекту. Збитки складають: 500'000 грн.");
      else 
        if (param1 == 2)
          showMessageDialog(null, "Закінчення проекту. Збитки складають: 500'000 грн.");
        else 
          if (param1 == 3)
            showMessageDialog(null, "Закінчення проекту. Збитки складають: 115'000'000 грн.");
  }

  public static void profitDefine(int param1) {
  // Використання "заплаток"
    if (param1 == 2)
      showMessageDialog(null, "Закінчення проекту. Прибутки складають: 20'000'000 грн.");
      else 
        if (param1 == 3)
          showMessageDialog(null, "Закінчення проекту. Прибутки складають: 65'000'000 грн.");
  }    

}
