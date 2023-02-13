
    public static String getSmallest(String s, int k)
    {
        if (s.length()==k ) return s;
        String a = getSmallest(s.substring(1), k) ;
        return (s.substring(0,k).compareTo(a))<0 ? s.substring(0,k) : a;
    }
    public static String getLargest(String s, int k)
    {
        if (s.length()==k ) return s;
        String a=getLargest(s.substring(1), k);
        return (s.substring(0,k).compareTo(a))>0 ? s.substring(0,k) : a;
    }

    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return getSmallest( s,  k) + "\n" + getLargest( s,  k);

        
    }


