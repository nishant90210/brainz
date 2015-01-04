#include <iostream>
#include <algorithm>

/*
Input: "Hello how are you"
Output: "olleH woh era uoy"
*/
using namespace std;

void printReverse(string str){
	for (string::reverse_iterator i = str.rbegin(); i != str.rend(); ++i) {
		cout << *i ;
	}
	cout << " ";

}

int main(){
	string str = "Hello how are you";
	string buf;
	for (int i = 0; i <= str.size(); ++i){

		if ( str[i] == ' ' | str[i] == '\0'){
			printReverse(buf);
			buf.clear();
		}else{
			buf += str[i];
		}
	}
	return 0;
}