/**
 * Glazed Lists
 * http://glazedlists.dev.java.net/
 *
 * COPYRIGHT 2003 O'DELL ENGINEERING LTD.
 */
package ca.odell.glazedlists.matchers;

import java.util.*;
import ca.odell.glazedlists.*;
// for access to volatile classes
import ca.odell.glazedlists.impl.matchers.*;


/**
 * A factory for creating Matchers.
 *
 * @author <a href="mailto:jesse@odel.on.ca">Jesse Wilson</a>
 */
public final class Matchers {

    /**
     * A dummy constructor to prevent instantiation of this class
     */
    private Matchers() {
        throw new UnsupportedOperationException();
    }
    
    // Matchers // // // // // // // // // // // // // // // // // // // // //
    
    /**
     * Get a {@link Matcher} that always returns true, therefore matching everything.
     */
    public static Matcher trueMatcher() {
         return TrueMatcher.getInstance();
    }
    
    /**
     * Get a {@link Matcher} that always returns false, therefore matching nothing..
     */
    public static Matcher falseMatcher() {
         return FalseMatcher.getInstance();
    }
    
    /**
     * Get a {@link Matcher} that returns the opposite of the specified {@link Matcher}.
     */
    public static Matcher invert(Matcher original) {
         return new NotMatcher(original);
    }
}