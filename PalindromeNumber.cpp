class Solution {
public:
    bool isPalindrome(int x) {
        //char *intToStr = itoa(x);
        //string str = string(intStr);
        stringstream ss;
        ss << x;
        string str = ss.str();
        int back = str.size()-1;
        if ( x < 0 ) 
            return false ;
        for ( int front = 0 ; front < str.size()/2;front++) {
            if ( str[front] != str[back] ) return false ;
            back -- ;
        }
        return true; 
        
    }
};
