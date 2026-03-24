package Day4.MorningDrill;

public class AmountWords {

    public static String getAmountWords(int amount) {

        String[] BELOW_TWENTY = {
                "zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] TENS = {
                "", "", "twenty", "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        String[] THOUSANDS = {
                "", "thousand", "million", "billion", "trillion"
        };

        if (amount == 0) {
            return BELOW_TWENTY[0];
        }

        if (amount < 0) {
            return "minus " + getAmountWords(-amount);
        }

        String words = "";
        int thousandIndex = 0;

        while (amount > 0) {
            int chunk = amount % 1000;

            if (chunk != 0) {
                String chunkWords = "";

                int hundreds = chunk / 100;
                int remainder = chunk % 100;

                if (hundreds > 0) {
                    chunkWords += BELOW_TWENTY[hundreds] + " hundred";
                    if (remainder > 0) {
                        chunkWords += " and ";
                    }
                }

                if (remainder > 0) {
                    if (remainder < 20) {
                        chunkWords += BELOW_TWENTY[remainder];
                    } else {
                        chunkWords += TENS[remainder / 10];
                        if (remainder % 10 != 0) {
                            chunkWords += "-" + BELOW_TWENTY[remainder % 10];
                        }
                    }
                }

                if (!THOUSANDS[thousandIndex].isEmpty()) {
                    chunkWords += " " + THOUSANDS[thousandIndex];
                }

                if (words.isEmpty()) {
                    words = chunkWords;
                } else {
                    words = chunkWords + " " + words;
                }
            }

            amount = amount / 1000;
            thousandIndex = thousandIndex + 1;
        }

        return words;
    }

    public static void main(String[] args) {
        System.out.println(getAmountWords(1000));
        System.out.println(getAmountWords(1001));
        System.out.println(getAmountWords(1010));
        System.out.println(getAmountWords(1105));
    }
}