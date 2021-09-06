import java.util.HashMap;
public class Romanization implements RomanizationInterface //Наследуем интерфейс RomanizationInterface
{
        @Override
        public void CyrillicToLatin(String str)
        {
            char[] result = str.toCharArray(); //Разбивают строку на массив элементов(Символов)
            HashMap<Character, String> list = new HashMap<>();//Создаем массив ключ-значение
            list.put('а',"a");
            list.put('б',"b");
            list.put('в',"v");
            list.put('г',"g");
            list.put('д',"d");
            list.put('е',"e");
            list.put('ё',"yo");
            list.put('ж',"zh");
            list.put('з',"z");
            list.put('и',"i");
            list.put('й',"j");
            list.put('к',"k");
            list.put('л',"l");
            list.put('м',"m");
            list.put('н',"n");
            list.put('о',"o");
            list.put('п',"p");
            list.put('р',"r");
            list.put('с',"s");
            list.put('т',"t");
            list.put('у',"u");
            list.put('ф',"f");
            list.put('х',"x");
            list.put('ц',"cz");
            list.put('ч',"ch");
            list.put('ш',"sh");
            list.put('щ',"shh");
            list.put('ъ',"''");
            list.put('ы',"y'");
            list.put('ь',"'");
            list.put('э',"e'");
            list.put('ю',"yu");
            list.put('я',"ya");

            list.put('А',"A");
            list.put('Б',"B");
            list.put('В',"V");
            list.put('Г',"G");
            list.put('Д',"D");
            list.put('Е',"E");
            list.put('Ё',"YO");
            list.put('Ж',"ZH");
            list.put('З',"Z");
            list.put('И',"I");
            list.put('Й',"J");
            list.put('К',"K");
            list.put('Л',"L");
            list.put('М',"M");
            list.put('Н',"N");
            list.put('О',"O");
            list.put('П',"P");
            list.put('Р',"R");
            list.put('С',"S");
            list.put('Т',"T");
            list.put('У',"U");
            list.put('Ф',"F");
            list.put('Х',"X");
            list.put('Ц',"CZ");
            list.put('Ч',"CH");
            list.put('Ш',"SH");
            list.put('Щ',"SHH");
            list.put('Ъ',"''");
            list.put('Ы',"Y'");
            list.put('Ь',"'");
            list.put('Э',"E'");
            list.put('Ю',"YU");
            list.put('Я',"YA");

            list.put(' '," ");
            list.put(',',",");

            list.put('1',"1");
            list.put('2',"2");
            list.put('3',"3");
            list.put('4',"4");
            list.put('5',"5");
            list.put('6',"6");
            list.put('7',"7");
            list.put('8',"8");
            list.put('9',"9");
            for (int i = 0; i < str.length(); i++)
                System.out.print(list.get(result[i]));
        }
        @Override
        public void LatinToCyrillic()
        {

        }
    }


