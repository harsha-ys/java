

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if ( a.length() != b.length() ) return false;
        if ( a.isEmpty() ) return true;
        int check = b.toUpperCase().indexOf( a.toUpperCase().charAt(0) );
        if ( check == -1 )  return false;
        return isAnagram(a.substring(1), b.substring( 0, check) + b.substring( check+1) );
    }

