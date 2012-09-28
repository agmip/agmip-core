package org.agmip.util;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Helpers {
	private static final Logger LOG = LoggerFactory.getLogger(Helpers.class);
	
	/**
	 * A more universal way or parsing from String to double.
     * <pre>parseDouble</pre> uses a character transformation to check and
     * see if a character inline is a number or not. It also will build a list
     * of separators. If the number of separators is 0, this is MOST LIKELY
     * an integer and will be returned with <pre>.0</pre> appended to make it
     * a double. If the number of separators is 1 or 2, this is MOST LIKELY a
     * decimal, and will be represented as such. Finally, if there are more than
     * 2 separators, this is MOST LIKELY an invalid number and we must throw an
     * exception.
     *
     * @throws InvalidNumberException
     * @param String the original string to convert
     * @return a Double representing the string.
	 */
	public static Double parseDouble(String source) {
        ArrayList<Character> separators = new ArrayList<Character>();
        ArrayList<StringBuilder> pieces = new ArrayList<StringBuilder>();
	    char[] cSource = source.toCharArray();
        int l = cSource.length;
        StringBuilder finalVal = new StringBuilder();
        StringBuilder piece;
        int pieceIndex = 0;

        pieces.add(new StringBuilder());
        piece = pieces.get(pieceIndex);
        LOG.debug("Starting converstion String -> double");
        for (int i=0; i<l; i++) {
            if (! Character.isDigit(cSource[i])) {
                if (! separators.contains(cSource[i])) {
                    separators.add(cSource[i]);
                }
                pieceIndex++;
                pieces.add(new StringBuilder());
                piece = pieces.get(pieceIndex);
            } else {
                piece.append(cSource[i]);
            }
        }
        if (separators.size() > 2) {
            throw new NumberFormatException();
        } 
        LOG.debug("separators: "+separators.toString());
        LOG.debug("pieces: "+pieces.toString());
        if (separators.size() == 0) {
            // There should only be one entry anyways.
            finalVal.append(pieces.get(0).toString());
            finalVal.append(".0");
        } else {
            // Handle thousands only separators (no decimal piece)
            if (separators.size() == 1 && ((pieces.size() > 2) || pieces.size() == 1)) {
                for (StringBuilder integerPiece: pieces) {
                    finalVal.append(integerPiece.toString());
                }
                finalVal.append(".0");
            } else {
                String decimalPiece = (pieces.remove(pieces.size()-1)).toString();
                for (StringBuilder integerPiece: pieces) {
                    finalVal.append(integerPiece.toString());
                }
                finalVal.append(".");
                finalVal.append(decimalPiece);
            }
        }
        LOG.debug("Final value: "+finalVal.toString());
        return Double.parseDouble(finalVal.toString());
	}
}
