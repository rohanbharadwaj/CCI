#include<stdio.h>
#include<string.h>
void reverse(char* str)
{
	char tmp;
	char *end = str;
	if(str)
	{
		while(*end) ++end;
	
	--end;
	while(str<end)
	{
		tmp = *str;
		*str = *end;
		str++;
		*end = tmp;
		end--;
	}
}

}
int main()
{
	char *str="rohan";
	reverse(str);
	printf("%s\n",str);
	return 0;
}