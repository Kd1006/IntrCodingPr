public class ZigZagPattern {
        public String convert(String s, int numRows) {
            if (numRows == 1) {
                return s;
            }

            StringBuilder answer = new StringBuilder();
            int n = s.length();
            int charsInSection = 2 * (numRows - 1);

            for (int currRow = 0; currRow < numRows; ++currRow) {
                int index = currRow;

                while (index < n) {
                    answer.append(s.charAt(index));

                    // If currRow is not the first or last row
                    // then we have to add one more character of current section.
                    if (currRow != 0 && currRow != numRows - 1) {
                        int charsInBetween = charsInSection - 2 * currRow;
                        int secondIndex = index + charsInBetween;

                        if (secondIndex < n) {
                            answer.append(s.charAt(secondIndex));
                        }
                    }
                    // Jump to same row's first character of next section.
                    index += charsInSection;
                }
            }

            return answer.toString();
        }

    public static void main(String[] args) {
            ZigZagPattern zigZagPattern = new ZigZagPattern();
            String s  = "PAYPALISHIRING";
            int numRows = 4;
            String result =zigZagPattern.convert(s, numRows);
        System.out.println(result);

    }
    }

