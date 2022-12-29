package homework.exercise.homework4;

public class CharArrayExample {

    public static void main(String[] args) {

////        homework4 սարքեք, homework4 package-ի մեջ սարքում եք CharArrayExample կլասսը, և լուծում խնդիրները՝
////        1) Ունենք հետևյալ մասիվը՝
////        char[] chars = {'j','a','v','a','l','o','v', 'e'};
////                ունենք նաև մի սինվոլ՝ char c = 'o';
////        Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
//        char[] chars = {'j', 'a', 'v', 'o', 'l', 'o', 'v', 'e'};
//        char c = 'o';
//        int count = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == c) {
//                count++;
//            }
//        }
//        System.out.println("c: '" + c + "' count: " + count);
//
////        2) Ունենք հետևյալ մասիվը՝
////        char[] chars2 = {'j','a','v','a','l','o','v', 'e'};
////                պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
//        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
//        System.out.print(chars2[(chars2.length / 2) - 1]);
//        System.out.println(chars2[chars2.length / 2]);
//
////        3) Ունենք հետևյալ մասիվը՝՝
////        char[] chars3 = {'j','a','v','a','l','o','l', 'y'};
////                պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
//        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
//        boolean isResult = false;
//        if (chars3[chars3.length - 1] == 'y'
//                && chars3[chars3.length - 2] == 'l') {
//            isResult = true;
//        }
//        System.out.println(isResult);

//        4) Ունենք հետևյալ մասիվը՝
//        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
//        պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        int beginIndex = 0;
        int endIndex = text.length - 1;
        while (beginIndex < endIndex && text[beginIndex] == ' ') {
            beginIndex++;
        }
        while (beginIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex - beginIndex) + 1];
        int index = 0;
        for (int i = beginIndex; i <= endIndex; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }


//                Առայժմ այսքանը։
//        Հարցերի դեպքում գրեք չաթում, քննարկենք 🙂
//        Ինչպես նաև չենք մոռանում այս մի շաբաթը օգտագործել ի օգուտ ձեզ, ու կրկնել 2-րդ գլխից սկսած բոլոր անցածը, անել գործնականները։
    }
}
