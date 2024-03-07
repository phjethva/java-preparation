package quiz;

import java.util.HashMap;

/*
Problem Statement:
    You have received an encoded message from your friend to decrypt the message
    you need to follow a few steps as mentioned below:

    1. Spit the message in separate words using whitespace as a separator.

    2. Create a key value pair for each word where key is sum of all the digits
    present in that word and value is word after removing digits from encoded
    word, if there are no digits, assume key=0 for that word.

    3. Arrange the words based on ascending order of their keys.

    4. If there are multiple words with the same numeric key, keep later word in
    output and discard earlier words

Example 1:
    Input:
        t2e1st This i1s f1irs1t
    Output:
        This is first rest

Example 2:
    Input:
        t1e3s6t No1w s1e1c1o3nd w3e h2a2ve
    Output:
        Now we have second test
*/

public class DecodeMessage {

    public static void main(String[] args) {

        String encodedMessage1 = "t2e1st This i1s f1irs1t";
        String decodedMessage1 = decodedMessage(encodedMessage1);

        String encodedMessage2 = "t1e3s6t No1w s1e1c1o3nd w3e h2a2ve";
        String decodedMessage2 = decodedMessage(encodedMessage2);

        System.out.println(decodedMessage1);
        System.out.println(decodedMessage2);
    }

    public static String decodedMessage(String encodedMessage) {
        StringBuilder decodedMessage = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        for (String msg : encodedMessage.split(" ")) {
            int key = 0;
            StringBuilder value = new StringBuilder();
            for (int i = 0; i < msg.length(); i++) {
                if (Character.isDigit(msg.charAt(i))) {
                    key = key + msg.charAt(i);
                } else {
                    value.append(msg.charAt(i));
                }
            }
            map.put(key, value.toString());
        }
        for (String msg : map.values()) {
            decodedMessage.append(msg).append(" ");
        }
        return decodedMessage.toString().stripTrailing();
    }

}
